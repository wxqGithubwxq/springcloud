package com.wxq.eurekaclient3.DesignModel;

import com.wxq.eurekaclient3.DesignModel.BridgingModel.*;

/**
 * Created by wenxuqiao on 2019/3/25 10:54
 *
 * @Description 桥接模式测试
 */
public class BridgingMainTest {

    public static void main(String[] args) {
        Color color=new White();
        Shape shape=new Circular(color);
        shape.draw();

        Color color1=new White();
        Shape shape1=new Rectangle(color1);
        shape1.draw();

        Color color2=new White();
        Shape shape2=new Square(color2);
        shape2.draw();

        Color color3=new Black();
        Shape shape3=new Square(color3);
        shape3.draw();

        Color color4=new Black();
        Shape shape4=new Rectangle(color4);
        shape4.draw();

        Color color5=new Black();
        Shape shape5=new Circular(color5);
        shape5.draw();

        Color color6=new Red();
        Shape shape6=new Rectangle(color6);
        shape6.draw();

        Color color7=new Red();
        Shape shape7=new Circular(color7);
        shape7.draw();

        Color color8=new Red();
        Shape shape8=new Square(color8);
        shape8.draw();
    }
}
