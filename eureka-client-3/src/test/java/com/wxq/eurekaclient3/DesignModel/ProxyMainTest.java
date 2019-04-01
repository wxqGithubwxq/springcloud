package com.wxq.eurekaclient3.DesignModel;

import com.wxq.eurekaclient3.DesignModel.ProxyModel.Proxy1.UserImpl;
import com.wxq.eurekaclient3.DesignModel.ProxyModel.Proxy1.UserProxy;
import com.wxq.eurekaclient3.DesignModel.ProxyModel.Proxy2.StudentDao;
import com.wxq.eurekaclient3.DesignModel.ProxyModel.Proxy2.StudentImpl;
import com.wxq.eurekaclient3.DesignModel.ProxyModel.Proxy2.StudentProxy;
import com.wxq.eurekaclient3.DesignModel.ProxyModel.Proxy3.TeacherDao;
import com.wxq.eurekaclient3.DesignModel.ProxyModel.Proxy3.TeacherProxy;

/**
 * Created by wenxuqiao on 2019/4/1 10:16
 *
 * @Description 代理模式测试
 */
public class ProxyMainTest {

    public static void main(String[] args) {
        //静态代理模式
        UserImpl user=new UserImpl();
        UserProxy userProxy=new UserProxy(user);
        userProxy.save();

        //jdk动态代理模式
        StudentDao student=new StudentImpl();
        StudentDao studentProxy=(StudentDao)new StudentProxy(student).getProxyInstance();
        studentProxy.save();

        //cglib动态代理模式
        TeacherDao teacherProxy=(TeacherDao)new TeacherProxy(new TeacherDao()).getProxyInstance();
        teacherProxy.save();

    }
}
