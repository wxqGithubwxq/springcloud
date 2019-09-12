package com.wxq.eurekaclient3.NetWork.TCP;

import com.wxq.eurekaclient3.NetWork.TCP.Client.NetworkService;
import org.jvnet.substance.skin.SubstanceBusinessBlueSteelLookAndFeel;

import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by wenxuqiao on 2019/9/9 11:41
 *
 * @Description 聊天室界面(客户端)
 */
public class ClientView extends JFrame implements ActionListener, KeyListener, Runnable {

    private JTextArea taChatList;//聊天内容区
    private JTextField tfMessage;//聊天输入框
    private JTextField tfName;//用户名输入框
    private JButton btnSend;//发送按钮
    private JLabel labelNick;
    private JPanel jp1, jp2;

    private JScrollPane scrollPane;
    private JLabel labelHost;
    private JLabel labelPort;
    private JTextField tfHost;//服务器地址输入框
    private JTextField tfPort;//服务器端口输入框
    private JButton btnConnect;//连接/断开服务器按钮

    private NetworkService networkService;

    public ClientView() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new SubstanceBusinessBlueSteelLookAndFeel());
                    initView();
                    createTrayIcon();// 创建托盘对象
                    //Image image = this.getToolkit().getImage(getRes("com/img/f32.gif"));
                    Image image = getToolkit().getImage(getRes("20190911112319.png"));
                    setIconImage(image);
                    init();
                    initNetworkService();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        ClientView view = new ClientView();
    }

    private void initNetworkService() {
        networkService = new NetworkService();
        networkService.setCallback(new NetworkService.Callback() {
            @Override
            public void onConnected(String host, int port) {
                // 连接成功时，弹对话框提示，并将按钮文字改为“断开”
                alert("连接", "成功连接到[" + host + ":" + port + "]");
                btnConnect.setText("断开");
            }

            @Override
            public void onConnectFailed(String host, int port) {
                // 连接失败时，弹对话框提示，并将按钮文字设为“连接”
                alert("连接", "无法连接到[" + host + ":" + port + "]");
                btnConnect.setText("连接");
            }

            @Override
            public void onDisconnected() {
                // 断开连接时，弹对话框提示，并将按钮文字设为“连接”
                alert("连接", "连接已断开");
                btnConnect.setText("连接");
            }

            @Override
            public void onMessageSent(String name, String msg) {
                // 发出消息时，清空消息输入框，并将消息显示在消息区
                tfMessage.setText("");
                taChatList.append("我(" + name + "):\r\n" + msg + "\r\n");
            }

            @Override
            public void onMessageReceived(String name, String msg) {
                // 收到消息时，将消息显示在消息区
                taChatList.append(name + ":\r\n" + msg + "\r\n");
            }
        });
    }

    // 显示标题为title，内容为message的对话框
    private void alert(String title, String message) {
        JOptionPane.showMessageDialog(this, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    //用户界面初始化
    private void initView() {
        taChatList = new JTextArea(20, 20);
        taChatList.setEditable(false);

        scrollPane = new JScrollPane(taChatList);
        tfMessage = new JTextField(15);
        btnSend = new JButton("发送");

        jp1 = new JPanel();
        labelHost = new JLabel("主机地址");
        tfHost = new JTextField(15);
        tfHost.setText("192.168.2.39");
        labelPort = new JLabel("端口号");
        tfPort = new JTextField(4);
        tfPort.setText("9050");
        btnConnect = new JButton("连接");

        jp1.add(labelHost);
        jp1.add(tfHost);
        jp1.add(labelPort);
        jp1.add(tfPort);
        jp1.add(btnConnect);

        labelNick = new JLabel("昵称");
        tfName = new JTextField(8);
        jp2 = new JPanel();
        jp2.add(labelNick);
        jp2.add(tfName);
        tfName.setName("用户0");
        jp1.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp2.add(tfMessage);
        jp2.add(btnSend);
        jp2.setLayout(new FlowLayout((FlowLayout.CENTER)));

        /*add(jp1, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(jp2, BorderLayout.SOUTH);
        setTitle("聊天室");
        setSize(500, 500);
        setLocation(450, 150);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);*/

        //当光标定位在聊天输入框是监听回车键按下事件
        tfMessage.addKeyListener(this);
        //为发送按钮增加鼠标点击事件监听
        btnSend.addActionListener(this);
        //为连接按钮增加鼠标点击事件监听
        btnConnect.addActionListener(this);
        //当窗口关闭时触发
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                networkService.disconnect();
            }
        });
    }

    //鼠标点击事件
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSend) {
            //响应发送按钮
            sendMessage();
        } else if (e.getSource() == btnConnect) {
            // 响应连接/断开按钮
            if (!networkService.isConnected()) {
                // 未连接状态下，执行连接服务器操作
                String host = tfHost.getText();
                int port = Integer.valueOf(tfPort.getText());
                networkService.connect(host, port);
            } else {
                // 已连接状态下，执行断开连接操作
                networkService.disconnect();
            }
        }
    }

    private void sendMessage() {
        // 响应发送按钮
        String name = tfName.getText();
        String msg = tfMessage.getText();
        // 检查参数合法性
        if (name == null || msg == null || "".equals(name) || "".equals(msg)) {
            return;
        }
        // 发送消息
        networkService.sendMessage(name, msg);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //键盘按下事件
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            //发送聊天消息
            sendMessage();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


    private static final long serialVersionUID = -3115128552716619277L;

    private SystemTray sysTray;// 当前操作系统的托盘对象
    private TrayIcon trayIcon;// 当前对象的托盘

    private ImageIcon icon = null;
    private TextArea ta = null;

    private static int count = 1; //记录消息闪动的次数
    public static boolean flag = false; //是否有新消息
    private static int times = 1; //接收消息次数

    /*public BickerTray() {
        this.createTrayIcon();// 创建托盘对象
        //Image image = this.getToolkit().getImage(getRes("com/img/f32.gif"));
        Image image = this.getToolkit().getImage(getRes("20190911112319.png"));
        this.setIconImage(image);
        init();
    }*/

    public URL getRes(String str) {
        //System.out.println("------1---" + ClassLoader.getSystemResource(""));
        //System.out.println("-----2----" + ClassLoader.getSystemResource("com/resource/" + str));
        //return this.getClass().getClassLoader().getResource(str);
        return ClassLoader.getSystemResource("com/resource/" + str);
    }

    /**
     * 63.     * 初始化窗体的方法
     * 64.
     */
    public void init() {
        //ClientView clientView = new ClientView();
        //this.setTitle("消息盒子");
        //ta = new TextArea("");
        //ta.setEditable(false);

        this.add(jp1, BorderLayout.NORTH);
        this.add(scrollPane, BorderLayout.CENTER);
        this.add(jp2, BorderLayout.SOUTH);
        this.setTitle("聊天室");
        this.setSize(500, 500);
        this.setLocation(450, 150);
        //this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //this.setSize(400, 400);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        // 添加窗口最小化事件,将托盘添加到操作系统的托盘
                /*this.addWindowListener(new WindowAdapter() {
75.            public void windowIconified(WindowEvent e) {
76.                addTrayIcon();
77.            }
78.        });*/
        addTrayIcon();
        this.setVisible(true);
    }

    /**
     * 84.     * 添加托盘的方法
     * 85.
     */
    public void addTrayIcon() {
        try {
            sysTray.add(trayIcon);// 将托盘添加到操作系统的托盘
            setVisible(false);    // 使得当前的窗口隐藏
            new Thread(this).start();
        } catch (AWTException e1) {
            e1.printStackTrace();
        }
    }

    /**
     * 97.     * 创建系统托盘的对象 步骤:
     * 98.     * 1,获得当前操作系统的托盘对象
     * 99.     * 2,创建弹出菜单popupMenu
     * 100.     * 3,创建托盘图标icon
     * 101.     * 4,创建系统的托盘对象trayIcon
     * 102.
     */
    public void createTrayIcon() {
        sysTray = SystemTray.getSystemTray();// 获得当前操作系统的托盘对象
        //icon = new ImageIcon(getRes("com/img/f17.gif"));// 托盘图标
        icon = new ImageIcon(getRes("20190911112319.png"));// 托盘图标
        PopupMenu popupMenu = new PopupMenu();// 弹出菜单
        MenuItem mi = new MenuItem("open");
        MenuItem exit = new MenuItem("exit");
        popupMenu.add(mi);
        popupMenu.add(exit);
        // 为弹出菜单项添加事件
        mi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //ta.setText(ta.getText() + "\n==============================================\n 《通知》 今天下午4:00到大礼堂开会。 \n 第" + times + "次接收时间：" + new Date().toLocaleString()); // 设置通知消息内容
                ClientView.this.setExtendedState(JFrame.NORMAL);
                ClientView.this.setVisible(true); // 显示窗口
                ClientView.this.toFront(); //显示窗口到最前端
                flag = false;  //消息打开了
                count = 0;
                times++;
            }
        });
        exit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        trayIcon = new TrayIcon(icon.getImage(), "消息盒子", popupMenu);
        /** 添加鼠标监听器，当鼠标在托盘图标上双击时，默认显示窗口 */
        trayIcon.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { // 鼠标双击
                    //ta.setText(ta.getText() + "\n==============================================\n 《通知》 今天下午4:00到大礼堂开会。 \n 第" + times + "次接收时间：" + new Date().toLocaleString()); // 设置通知消息内容
                    ClientView.this.setExtendedState(JFrame.NORMAL);
                    ClientView.this.setVisible(true); // 显示窗口
                    ClientView.this.toFront();
                    flag = false;  //消息打开了
                    count = 0;
                    times++;
                }
            }
        });
    }

    /**
     * 144.     * 线程控制闪动
     * 145.
     */
    public void run() {
        while (true) {
            if (flag) { // 有新消息
                try {
                    if (count == 1) {
                        // 播放消息提示音
                        //AudioPlayer p = new AudioPlayer(getRes("file:com/sound/Msg.wav"));
                        //p.play(); p.stop();
                        try {
                            AudioClip p = Applet.newAudioClip(new URL("file:sound/msg.wav"));
                            p.play();
                        } catch (MalformedURLException e) {
                            e.printStackTrace();
                        }
                    }
                    // 闪动消息的空白时间
                    this.trayIcon.setImage(new ImageIcon("").getImage());
                    Thread.sleep(500);
                    // 闪动消息的提示图片
                    this.trayIcon.setImage(icon.getImage());
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                count++;
            } /*else { // 无消息或是消息已经打开过
                this.trayIcon.setImage(icon.getImage());
                try {
                    Thread.sleep(20000);
                    flag = true;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }*/ else {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 184.     * @param args
     * 185.
     */
    /*public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new SubstanceBusinessBlueSteelLookAndFeel());
                    new BickerTray();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
            }
        });
    }*/
}
