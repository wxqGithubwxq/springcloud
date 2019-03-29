package com.wxq.eurekaclient3.DesignModel.DecoratorModel;

/**
 * Created by wenxuqiao on 2019/3/28 9:58
 *
 * @Description 饼 装饰者模式
 */
public abstract class Cake {
    public String desc;

    public abstract double price();

    public String getDesc(){
        return desc;
    }
}
