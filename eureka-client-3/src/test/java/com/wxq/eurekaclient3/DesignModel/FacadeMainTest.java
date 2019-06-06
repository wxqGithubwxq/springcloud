package com.wxq.eurekaclient3.DesignModel;

import com.wxq.eurekaclient3.DesignModel.FacadeModel.Facade;

/**
 * Created by wenxuqiao on 2019/4/8 9:52
 *
 * @Description 外观模式测试
 */
public class FacadeMainTest {

    public static void main(String[] args) {
        Facade facade=new Facade();
        facade.systemAa();
        facade.systemBb();
    }
}
