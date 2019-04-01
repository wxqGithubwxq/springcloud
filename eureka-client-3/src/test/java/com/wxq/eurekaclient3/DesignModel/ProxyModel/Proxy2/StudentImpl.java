package com.wxq.eurekaclient3.DesignModel.ProxyModel.Proxy2;

/**
 * Created by wenxuqiao on 2019/4/1 10:24
 *
 * @Description
 */
public class StudentImpl implements StudentDao{

    @Override
    public void save() {
        System.out.println("------学生数据已保存------");
    }
}
