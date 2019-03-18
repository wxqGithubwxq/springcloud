package com.wxq.eurekaclient3.Thread.Thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by wenxuqiao on 2019/3/15 13:47
 *
 * @Description 一、继承Thread
 * 1、定义一个类MyThread继承Thread，并重写run方法。
 * 2、将要执行的代码写在run方法中。
 * 3、创建该类的实例，并调用start()方法开启线程。
 */
public class MyThread extends Thread{
    private volatile AtomicInteger num=new AtomicInteger(6);
    @Override
    public void run(){
        /*for(int i=0;i<5;i++){
            try{
                Thread.sleep(1000);
                System.out.println("Thread Name:"+Thread.currentThread().getName()+" 计数:"+i);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }*/
        while (true) {
            synchronized (MyThread.class) {
                if (num.get() == 0) {
                    break;
                }
                try {
                    Thread.sleep(1000);
                    System.out.println("Thread Name:" + Thread.currentThread().getName() + " 计数:" + num.decrementAndGet());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
