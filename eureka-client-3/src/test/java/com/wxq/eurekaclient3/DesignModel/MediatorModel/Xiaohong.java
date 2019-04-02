package com.wxq.eurekaclient3.DesignModel.MediatorModel;

/**
 * Created by wenxuqiao on 2019/4/2 11:42
 *
 * @Description
 */
public class Xiaohong extends Person{

    public Xiaohong(Mediator mediator){
        super(mediator);
    }
    @Override
    public void chat(String message) {
        System.out.println("小红:"+message);
    }
}
