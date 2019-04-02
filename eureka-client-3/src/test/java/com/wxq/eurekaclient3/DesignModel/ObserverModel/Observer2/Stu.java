package com.wxq.eurekaclient3.DesignModel.ObserverModel.Observer2;

import org.apache.commons.lang.StringUtils;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wenxuqiao on 2019/4/2 9:29
 *
 * @Description
 */
public class Stu implements Observer {
    private Observable observable;

    private String name;
    public Stu(String name,Observable observable){
        this.name=name;
        this.observable=observable;
        this.observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        Teach teach=(Teach)o;
        System.out.println(name+"收到作业(学生拉取):"+teach.getInfo());
        System.out.println(name+"收到作业(教师推送):"+ (arg==null?"空":arg.toString()));
    }
}
