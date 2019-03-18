package com.wxq.eurekaclient3.Thread.Callable;

import java.util.concurrent.Callable;

/**
 * Created by wenxuqiao on 2019/3/15 13:53
 *
 * @Description三、实现 Callable 接口
 * Callable 是类似于 Runnable 的接口，实现 Callable 接口的类和实现 Runnable 的类都是可被其它线程执行的任务。
 *
 * 1、自定义一个类 MyCallable 实现 Callable 接口，并重写call()方法
 * 2、将要执行的代码写在call()方法中
 * 3、创建线程池对象，调用submit()方法执行MyCallable任务，并返回Future对象
 * 4、调用Future对象的get()方法获取call()方法执行完后的值
 * ---------------------
 * 作者：code小生_
 * 来源：CSDN
 * 原文：https://blog.csdn.net/h176nhx7/article/details/78589949
 * 版权声明：本文为博主原创文章，转载请附上博文链接！
 */
public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        for(int i=0;i<5;i++){
            Thread.sleep(1000);
            System.out.println("Callable Name:"+Thread.currentThread().getName()+" 计数:"+i);
        }
        return null;
    }
}
