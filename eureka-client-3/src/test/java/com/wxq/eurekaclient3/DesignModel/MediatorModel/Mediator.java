package com.wxq.eurekaclient3.DesignModel.MediatorModel;

/**
 * Created by wenxuqiao on 2019/4/2 11:35
 *
 * @Description 中介者模式
 */
public abstract class Mediator {

    private Xiaoming xiaoming;

    private Xiaohong xiaohong;

    public Mediator(){

    }

    public Mediator(Xiaoming xiaoming,Xiaohong xiaohong){
        this.xiaoming=xiaoming;
        this.xiaohong=xiaohong;
    }

    public abstract void notifyPerson(Person person,String message);
}
