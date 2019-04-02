package com.wxq.eurekaclient3.DesignModel.MediatorModel;

/**
 * Created by wenxuqiao on 2019/4/2 11:48
 *
 * @Description
 */
public class ConcreteMediator extends Mediator{
    public ConcreteMediator(){
        super();
    }
    public ConcreteMediator(Xiaoming xiaoming,Xiaohong xiaohong){
        super(xiaoming,xiaohong);
    }
    @Override
    public void notifyPerson(Person person,String message) {
        person.chat(message);
    }
}
