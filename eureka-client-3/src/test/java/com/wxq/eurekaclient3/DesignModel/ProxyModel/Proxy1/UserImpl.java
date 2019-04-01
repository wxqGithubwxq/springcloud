package com.wxq.eurekaclient3.DesignModel.ProxyModel.Proxy1;

/**
 * Created by wenxuqiao on 2019/4/1 10:20
 *
 * @Description
 */
public class UserImpl implements UserDao{

    @Override
    public void save() {
        System.out.println("---------用户数据已保存--------");
    }
}
