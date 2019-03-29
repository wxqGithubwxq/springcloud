package com.wxq.eurekaclient3.DesignModel.BridgingModel;

/**
 * Created by wenxuqiao on 2019/3/25 10:52
 *
 * @Description 红色
 */
public class Red implements Color{
    @Override
    public void paint(Shape shape) {
        System.out.println("红色的"+shape.name);
    }
}
