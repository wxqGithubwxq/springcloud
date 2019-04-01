package com.wxq.eurekaclient3.DesignModel.ProxyModel.Proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by wenxuqiao on 2019/4/1 10:26
 *
 * @Description jdk动态代理(目标类必须实现接口)
 */
public class StudentProxy {
    private StudentDao target;

    public StudentProxy(StudentDao target){
        this.target=target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("----开启学生代理----");
                        Object returnValue=method.invoke(target,args);
                        System.out.println("----结束学生代理----");
                        return returnValue;
                    }
                });
    }
}
