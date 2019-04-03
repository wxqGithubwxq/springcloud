package com.wxq.eurekaclient3.DesignModel.MementoModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by wenxuqiao on 2019/4/3 14:12
 *
 * @Description
 */
public class Twenty_twoApplication extends JFrame implements MouseListener {
    UnicodeLable label;
    Caretaker caretaker;           //负责人

    public Twenty_twoApplication() {
        label = new UnicodeLable();
        label.addMouseListener(this);
        add(new JLabel("单击左键显示一个汉字，单击右键撤销单击左键的操作效果"), BorderLayout.NORTH);
        add(label, BorderLayout.CENTER);
        caretaker = new Caretaker();   //创建负责人
    }

    public void mousePressed(MouseEvent e) {
        if (e.getModifiers() == InputEvent.BUTTON1_MASK) {   //按下左键
            caretaker.saveMemento(label.createMemento());   //保存备忘录
        }
        if (e.getModifiers() == InputEvent.BUTTON3_MASK) {    //按下右键
            Memento memento = caretaker.getMemento();   //得到备忘录

            if (memento != null) {
                label.restoreFromMemento(memento);    //使用备忘录恢复状态
            }
        }
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }
}
