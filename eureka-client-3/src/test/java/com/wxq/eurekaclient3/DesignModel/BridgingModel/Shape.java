package com.wxq.eurekaclient3.DesignModel.BridgingModel;

/**
 * Created by wenxuqiao on 2019/3/25 10:31
 *
 * @Description 桥接模式 --抽象类
 */
public abstract class Shape {
    private Color color;

    public String name;

    public Shape(Color color){
        this.color=color;
    }

    public void draw(){
        color.paint(this);
    }
}
