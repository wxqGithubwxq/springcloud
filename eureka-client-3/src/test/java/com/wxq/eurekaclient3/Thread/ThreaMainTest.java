package com.wxq.eurekaclient3.Thread;

import com.wxq.eurekaclient3.Thread.Callable.MyCallable;
import com.wxq.eurekaclient3.Thread.Runnable.MyRunnable;
import com.wxq.eurekaclient3.Thread.Thread.MyThread;

import java.util.concurrent.*;

/**
 * Created by wenxuqiao on 2019/3/15 14:07
 *
 * @Description
 */
public class ThreaMainTest {

    public static void main(String[] args) {
        //模拟多线程
        /*System.out.println(Thread.currentThread().getName()+"开始");
        Thread thread1=new MyThread();
        thread1.start();
        Thread thread2=new Thread(new MyRunnable());
        thread2.start();
        MyCallable thread3 = new MyCallable();
        // 1.执行Callable方式，需要FutureTask实现类的支持，用于接收运算结果
         FutureTask result = new FutureTask(thread3);
         new Thread(result).start();
         System.out.println(Thread.currentThread().getName()+"结束");*/

        //synscriched同步实现共享变量的线程安全
        /*MyThread thread=new MyThread();
        Thread t1 = new Thread(thread,"windows 1");
        Thread t2 = new Thread(thread,"windows 2");
        t1.start();
        t2.start();*/

        //创建线程池执行线程
        ThreadPoolExecutor executor=new ThreadPoolExecutor(5,10,60, TimeUnit.MILLISECONDS,
                new LinkedBlockingDeque<>(5));
        for(int i=0;i<15;i++){
            MyRunnable thread=new MyRunnable();
            executor.execute(thread);
            System.out.println(Thread.currentThread().getName()+"线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+
                    executor.getQueue().size()+"，已执行玩别的任务数目："+executor.getCompletedTaskCount());
        }
    }
}
