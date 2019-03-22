package com.wxq.eurekaclient3.DesignModel;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * Created by wenxuqiao on 2019/3/20 13:18
 *
 * @Description 反射测试
 */
public class ReflectingMainTest {

    public static void main(String[] args) throws Exception{
        Class clazz=Class.forName("com.wxq.eurekaclient3.DesignModel.Reflection.Student");
        //获取构造函数
        Constructor[] constructors=clazz.getConstructors();
        System.out.println("获取公有构造函数开始");
        for(Constructor constructor:constructors){
            System.out.println(constructor);
        }
        System.out.println("获取公有构造函数结束");

        System.out.println("获取所有构造函数开始");
        Constructor[] allConstructors=clazz.getDeclaredConstructors();
        for(Constructor constructor:allConstructors){
            System.out.println(constructor);
        }
        System.out.println("获取所有构造函数结束");

        //获取字段属性
        System.out.println("获取共有字段属性开始");
        Field[] fields=clazz.getFields();
        for(Field field:fields){
            System.out.println(field);
        }
        System.out.println("获取公有字段属性结束");

        System.out.println("获取所有字段属性开始");
        Field[] allFields=clazz.getDeclaredFields();
        for(Field field:allFields){
            System.out.println(field);
        }
        System.out.println("获取所有字段属性结束");

        //获取方法
        System.out.println("获取共有方法开始");
        Method[] methods=clazz.getMethods();
        for(Method method:methods){
            System.out.println(method);
        }
        System.out.println("获取共有方法结束");

        System.out.println("获取所有方法开始");
        Method[] allMethods=clazz.getDeclaredMethods();
        for(Method method:allMethods){
            System.out.println(method);
        }
        System.out.println("获取所有方法结束");

        /*Date date=new Date();
        Thread.sleep(4000);
        Date date1=new Date();
        Long time=(date1.getTime()-date.getTime())/1000;
        System.out.println(time);*/
    }
}
