package com.wxq.eurekaclient3.DesignModel.ObserverModel.Observer2;

import java.util.Observable;

/**
 * Created by wenxuqiao on 2019/4/2 9:25
 *
 * @Description
 */
public class Teach extends Observable {

    private String info;

    public void setPullHomeWork(String message){
        this.info=message;
        System.out.println("教师发布作业(学生拉取):"+message);
        setChanged();
        notifyObservers();
    }

    public void setPushHomeWork(String message){
        System.out.println("教师发布作业(教师推送):"+message);
        setChanged();
        notifyObservers(message);
    }

    public String getInfo(){
        return info;
    }
}
