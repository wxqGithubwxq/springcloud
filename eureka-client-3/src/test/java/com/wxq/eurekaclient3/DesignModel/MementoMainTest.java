package com.wxq.eurekaclient3.DesignModel;

import com.wxq.eurekaclient3.DesignModel.MementoModel.Twenty_twoApplication;

import javax.swing.*;

/**
 * Created by wenxuqiao on 2019/4/3 14:13
 *
 * @Description 备忘录模式测试
 */
public class MementoMainTest {

    public static void main(String[] args) {
        Twenty_twoApplication win = new Twenty_twoApplication();
        win.setBounds(600,200,500,500);
        win.setVisible(true);
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
