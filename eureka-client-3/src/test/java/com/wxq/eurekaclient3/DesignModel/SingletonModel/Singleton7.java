package com.wxq.eurekaclient3.DesignModel.SingletonModel;

/**
 * Created by wenxuqiao on 2019/3/15 10:58
 *
 * @Description
 */
public class Singleton7 {

    private Singleton7(){

    }

    private static class Singleton{
        private static Singleton7 singleton=new Singleton7();
    }

    public static Singleton7 getInstance(){
        return Singleton.singleton;
    }
}
