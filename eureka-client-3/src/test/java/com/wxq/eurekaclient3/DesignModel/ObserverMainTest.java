package com.wxq.eurekaclient3.DesignModel;

import com.wxq.eurekaclient3.DesignModel.ObserverModel.Observer1.Observer;
import com.wxq.eurekaclient3.DesignModel.ObserverModel.Observer1.Student;
import com.wxq.eurekaclient3.DesignModel.ObserverModel.Observer1.Subject;
import com.wxq.eurekaclient3.DesignModel.ObserverModel.Observer1.Teacher;
import com.wxq.eurekaclient3.DesignModel.ObserverModel.Observer2.Stu;
import com.wxq.eurekaclient3.DesignModel.ObserverModel.Observer2.Teach;

/**
 * Created by wenxuqiao on 2019/4/2 9:12
 *
 * @Description 观察者模式测试
 */
public class ObserverMainTest {

    public static void main(String[] args) {
        //手写观察者模式
        System.out.println("----手写观察者模式----");
        Teacher subject=new Teacher();
        Observer student1=new Student("文许桥",subject);
        Observer student2=new Student("张昌鹏",subject);
        Observer student3=new Student("兰超",subject);
        subject.setHomeWork("完成23种设计模式的demo");
        subject.setHomeWork("了解线程安全");
        subject.setHomeWork("spring和spring mvc底层原理");

        //观察者模式(拉取)
        System.out.println("----观察者模式(拉取)----");
        Teach teach=new Teach();
        java.util.Observer teach1=new Stu("文许桥",teach);
        java.util.Observer teach2=new Stu("张昌鹏",teach);
        java.util.Observer teach3=new Stu("兰超",teach);
        teach.setPullHomeWork("完成23种设计模式的demo");
        teach.setPullHomeWork("了解线程安全");
        teach.setPullHomeWork("spring和spring mvc底层原理");

        //观察者模式(推送)
        System.out.println("----观察者模式(推送)----");
        Teach teach111=new Teach();
        java.util.Observer teach11=new Stu("文许桥",teach111);
        java.util.Observer teach21=new Stu("张昌鹏",teach111);
        java.util.Observer teach31=new Stu("兰超",teach111);
        teach111.setPushHomeWork("完成23种设计模式的demo");
        teach111.setPushHomeWork("了解线程安全");
        teach111.setPushHomeWork("spring和spring mvc底层原理");
    }
}
