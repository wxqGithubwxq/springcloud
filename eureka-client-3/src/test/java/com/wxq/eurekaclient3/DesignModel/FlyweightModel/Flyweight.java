package com.wxq.eurekaclient3.DesignModel.FlyweightModel;

/**
 * Created by wenxuqiao on 2019/4/4 11:51
 *
 * @Description 享元模式
 */
public abstract class Flyweight {
    private String key;

    public Flyweight(String key){
        this.key=key;
    }

    public abstract void operate(String parm);

}
