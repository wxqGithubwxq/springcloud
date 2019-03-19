package com.wxq.eurekaclient3.DesignModel.FactoryModel.Factory3;

/**
 * Created by wenxuqiao on 2019/3/18 17:53
 *
 * @Description
 */
public class FemaleDog implements Dog{
    @Override
    public String bark() {
        String s="抽象工厂模式:我是母狗!";
        System.out.println(s);
        return s;
    }
}
