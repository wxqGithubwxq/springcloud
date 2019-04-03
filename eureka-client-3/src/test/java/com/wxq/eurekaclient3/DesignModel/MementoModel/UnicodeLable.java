package com.wxq.eurekaclient3.DesignModel.MementoModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by wenxuqiao on 2019/4/3 14:05
 *
 * @Description
 */
public class UnicodeLable extends JLabel {

    private Integer m;

    public UnicodeLable(){
        setFont(new Font("宋体", Font.BOLD,100));
        setHorizontalAlignment(SwingConstants.CENTER);
        m = new Integer(19968);
        setText(""+(char)m.intValue());
        addMouseListener(new MouseAdapter(){
            public void mouseReleased(MouseEvent e){
                if(e.getModifiers() == InputEvent.BUTTON1_MASK){  //释放左键
                    m = (int)(Math.random()*1000+19968);
                    setText(""+(char)m.intValue());
                }

            }
        });
    }

    public Memento createMemento(){
        Memento mem = new Memento();
        mem.setState(m);
        return mem;
    }

    public void restoreFromMemento(Memento mem){
        m = mem.getState();
        if(m != null)
            setText(""+(char)m.intValue());
    }
}
