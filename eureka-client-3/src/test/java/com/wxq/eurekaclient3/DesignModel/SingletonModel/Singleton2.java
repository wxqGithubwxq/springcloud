package com.wxq.eurekaclient3.DesignModel.SingletonModel;

/**
 * Created by wenxuqiao on 2019/3/15 10:29
 *
 * @Description 这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优缺点和上面是一样的。
 */
public class Singleton2 {
    private Singleton2(){

    }

    private static Singleton2 singleton;

    static{
        singleton=new Singleton2();
    }

    public static Singleton2 getInstance(){
        return singleton;
    }
}
