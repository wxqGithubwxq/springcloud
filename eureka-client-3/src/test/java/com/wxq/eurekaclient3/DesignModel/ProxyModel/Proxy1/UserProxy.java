package com.wxq.eurekaclient3.DesignModel.ProxyModel.Proxy1;

/**
 * Created by wenxuqiao on 2019/4/1 10:21
 *
 * @Description 静态代理
 */
public class UserProxy implements UserDao{
    private UserDao userDao;
    public UserProxy(UserDao userDao){
        this.userDao=userDao;
    }
    @Override
    public void save() {
        System.out.println("-----开始用户代理------");
        userDao.save();
        System.out.println("-----结束用户代理-----");
    }
}
