package com.wxq.eurekaclient3.DesignModel.ObserverModel.Observer1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenxuqiao on 2019/4/2 9:00
 *
 * @Description
 */
public class Teacher implements Subject{

    private List<Observer> observers=new ArrayList<>();

    private String info;
    @Override
    public void registObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.indexOf(o)>=0){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer o:observers){
            o.update();
        }
    }

    public void setHomeWork(String info){
        this.info=info;
        System.out.println("老师发布作业:"+info);
        this.notifyObserver();
    }

    public String getInfo(){
        return info;
    }
}
