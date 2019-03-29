package com.wxq.eurekaclient3.DesignModel.BridgingModel;

/**
 * Created by wenxuqiao on 2019/3/25 10:50
 *
 * @Description 白色
 */
public class White implements Color{
    @Override
    public void paint(Shape shape) {
        System.out.println("白色的"+shape.name);
    }
}
