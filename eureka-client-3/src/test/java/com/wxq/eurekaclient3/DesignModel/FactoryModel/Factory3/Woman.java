package com.wxq.eurekaclient3.DesignModel.FactoryModel.Factory3;

/**
 * Created by wenxuqiao on 2019/3/18 17:22
 *
 * @Description
 */
public class Woman implements Human {
    @Override
    public String say() {
        String s="抽象工厂模式:我是女人!";
        System.out.println(s);
        return s;
    }
}
