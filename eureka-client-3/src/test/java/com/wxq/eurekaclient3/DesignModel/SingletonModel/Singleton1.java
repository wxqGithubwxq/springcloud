package com.wxq.eurekaclient3.DesignModel.SingletonModel;

/**
 * Created by wenxuqiao on 2019/3/15 10:23
 *
 * @Description 饿汉模式(类加载时就实例化一个类)
 * 饿汉式单例在类加载初始化时就创建好一个静态的对象供外部使用，除非系统重启，这个对象不会改变，所以本身就是线程安全的。
 *
 * Singleton通过将构造方法限定为private避免了类在外部被实例化，在同一个虚拟机范围内，Singleton的唯一实例只能通过getInstance()方法访问。（事实上，通过Java反射机制是能够实例化构造方法为private的类的，那基本上会使所有的Java单例实现失效。此问题在此处不做讨论，姑且闭着眼就认为反射机制不存在。）
 */
public class Singleton1 {

    private Singleton1(){

    }

    private static Singleton1 singleton=new Singleton1();

    public static Singleton1 getInstance(){
        return singleton;
    }
}
