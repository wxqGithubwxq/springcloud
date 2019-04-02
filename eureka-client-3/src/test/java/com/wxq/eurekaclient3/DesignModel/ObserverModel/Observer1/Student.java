package com.wxq.eurekaclient3.DesignModel.ObserverModel.Observer1;

/**
 * Created by wenxuqiao on 2019/4/2 9:01
 *
 * @Description
 */
public class Student implements Observer{
    private String name;

    private Teacher subject;

    public Student(String name,Teacher subject){
        this.name=name;
        this.subject=subject;
        this.subject.registObserver(this);
    }
    @Override
    public void update() {
        System.out.println(name+"收到作业:"+subject.getInfo());
    }
}
