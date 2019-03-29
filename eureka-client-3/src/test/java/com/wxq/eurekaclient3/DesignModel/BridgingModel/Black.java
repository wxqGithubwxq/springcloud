package com.wxq.eurekaclient3.DesignModel.BridgingModel;

/**
 * Created by wenxuqiao on 2019/3/25 10:51
 *
 * @Description 黑色
 */
public class Black implements Color{
    @Override
    public void paint(Shape shape) {
        System.out.println("黑色的"+shape.name);
    }
}
