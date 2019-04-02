package com.wxq.eurekaclient3.DesignModel.MediatorModel;

/**
 * Created by wenxuqiao on 2019/4/2 11:37
 *
 * @Description
 */
public abstract class Person {
    private Mediator mediator;
    public Person(Mediator mediator){
        this.mediator=mediator;
    }

    public void notifyMediator(String message){
        mediator.notifyPerson(this,message);
    }

    public abstract void chat(String message);
}
