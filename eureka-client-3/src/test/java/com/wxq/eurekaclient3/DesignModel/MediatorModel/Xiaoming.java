package com.wxq.eurekaclient3.DesignModel.MediatorModel;

/**
 * Created by wenxuqiao on 2019/4/2 11:41
 *
 * @Description
 */
public class Xiaoming extends Person{

    public Xiaoming(Mediator mediator){
        super(mediator);
    }
    @Override
    public void chat(String message) {
        System.out.println("小明:"+message);
    }
}
