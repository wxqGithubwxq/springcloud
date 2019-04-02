package com.wxq.eurekaclient3.DesignModel;

import com.wxq.eurekaclient3.DesignModel.MediatorModel.ConcreteMediator;
import com.wxq.eurekaclient3.DesignModel.MediatorModel.Mediator;
import com.wxq.eurekaclient3.DesignModel.MediatorModel.Xiaohong;
import com.wxq.eurekaclient3.DesignModel.MediatorModel.Xiaoming;

/**
 * Created by wenxuqiao on 2019/4/2 14:56
 *
 * @Description 中介者模式测试
 */
public class MediatorMainTest {

    public static void main(String[] args) {
        Mediator mediator=new ConcreteMediator();
        Xiaoming xiaoming=new Xiaoming(mediator);
        Xiaohong xiaohong=new Xiaohong(mediator);
        xiaoming.notifyMediator("hi,我是小明");
        xiaohong.notifyMediator("hi,我是小红");
        xiaoming.notifyMediator("你来自哪里");
        xiaohong.notifyMediator("我来自四川,你呢?");
        xiaoming.notifyMediator("噢,原来我们是老乡咯,我也是四川的");
    }
}
