package com.wxq.eurekaclient3.DesignModel.FactoryModel.Factory2;

/**
 * Created by wenxuqiao on 2019/3/18 17:21
 *
 * @Description
 */
public class Man implements Human {
    @Override
    public String say() {
        String s="工厂模式:我是男人!";
        System.out.println(s);
        return s;
    }
}
