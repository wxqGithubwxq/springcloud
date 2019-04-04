package com.wxq.eurekaclient3.DesignModel;

import com.wxq.eurekaclient3.DesignModel.FlyweightModel.Flyweight;
import com.wxq.eurekaclient3.DesignModel.FlyweightModel.FlyweightFactory;

/**
 * Created by wenxuqiao on 2019/4/4 13:46
 *
 * @Description 享元模式测试
 */
public class FlyweightMainTest {

    public static void main(String[] args) {
        FlyweightFactory.getFlyweight("北京");
        FlyweightFactory.getFlyweight("上海");
        FlyweightFactory.getFlyweight("广州");
        FlyweightFactory.getFlyweight("深圳");
        FlyweightFactory.getFlyweight("成都");
        FlyweightFactory.getFlyweight("成都");
    }
}
