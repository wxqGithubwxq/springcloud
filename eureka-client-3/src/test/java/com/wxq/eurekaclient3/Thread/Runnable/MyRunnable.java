package com.wxq.eurekaclient3.Thread.Runnable;

/**
 * Created by wenxuqiao on 2019/3/15 13:53
 *
 * @Description 二、实现Runnable接口
 * 1、定义一个类MyRunnable实现Runnable接口，并重写run方法。
 * 2、将要执行的代码写在run方法中。
 * 3、创建Thread对象, 传入MyRunnable的实例，并调用start()方法开启线程。
 */
public class MyRunnable implements Runnable{
    private int num;
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(1000);
                System.out.println("Runnable Name:"+Thread.currentThread().getName()+" 计数:"+i);
                System.out.println(++num);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
