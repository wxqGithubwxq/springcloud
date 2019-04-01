package com.wxq.eurekaclient3.DesignModel.ProxyModel.Proxy3;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by wenxuqiao on 2019/4/1 11:35
 *
 * @Description cglib动态代理(目标类不需要实现接口)
 */
public class TeacherProxy implements MethodInterceptor {
    private TeacherDao target;

    public TeacherProxy(TeacherDao target){
        this.target=target;
    }

    //给目标对象创建一个代理对象
    public Object getProxyInstance(){
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(target.getClass());
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类(代理对象)
        return en.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("----开启老师代理----");
        Object returnValue=method.invoke(target,objects);
        System.out.println("----结束老师代理----");
        return returnValue;
    }
}
