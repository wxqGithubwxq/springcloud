package com.wxq.eurekaclient3.DesignModel.FacadeModel;

/**
 * Created by wenxuqiao on 2019/4/8 9:49
 *
 * @Description 外观模式
 */
public class Facade {
    private SystemA systemA=new SystemA();
    private SystemB systemB=new SystemB();

    public void systemAa(){
        systemA.a();
    }

    public void systemBb(){
        systemB.b();
    }
}
