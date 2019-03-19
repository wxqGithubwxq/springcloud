package com.wxq.eurekaclient3.DesignModel.FactoryModel;

import com.wxq.eurekaclient3.DesignModel.FactoryModel.Factory1.HumanFactory;
import com.wxq.eurekaclient3.DesignModel.FactoryModel.Factory1.Man;
import com.wxq.eurekaclient3.DesignModel.FactoryModel.Factory1.Woman;
import com.wxq.eurekaclient3.DesignModel.FactoryModel.Factory2.Factory;
import com.wxq.eurekaclient3.DesignModel.FactoryModel.Factory2.ManFactory;
import com.wxq.eurekaclient3.DesignModel.FactoryModel.Factory2.WomanFactory;

/**
 * Created by wenxuqiao on 2019/3/18 18:00
 *
 * @Description 设计模式---工厂模式测试
 */
public class FactoryMainTest {

    public static void main(String[] args) throws Exception{

        //简单工厂模式(静态工厂模式)测试
        System.out.println("简单工厂模式开始");
        HumanFactory.createHumanFactory(HumanFactory.MAN).say();
        HumanFactory.createHumanFactory(HumanFactory.WOMAN).say();
        HumanFactory.createHumanFactory1(Man.class).say();
        HumanFactory.createHumanFactory1(Woman.class).say();
        HumanFactory.createManFactory().say();
        HumanFactory.createWomanFactory().say();
        System.out.println("简单工厂模式结束");

        //工厂模式测试
        System.out.println("工厂模式开始");
        Factory manFactory=new ManFactory();
        manFactory.createHuman().say();
        Factory womanFactory=new WomanFactory();
        womanFactory.createHuman().say();
        System.out.println("工厂模式结束");

        //抽象工厂模式测试
        System.out.println("抽象工厂模式开始");
        com.wxq.eurekaclient3.DesignModel.FactoryModel.Factory3.Factory manFactory1=new com.wxq.eurekaclient3.DesignModel.FactoryModel.Factory3.ManFactory();
        manFactory1.createHuman().say();
        manFactory1.createDog().bark();
        com.wxq.eurekaclient3.DesignModel.FactoryModel.Factory3.Factory womanFactory1=new com.wxq.eurekaclient3.DesignModel.FactoryModel.Factory3.WomanFactory();
        womanFactory1.createHuman().say();
        womanFactory1.createDog().bark();
        System.out.println("抽象工厂模式结束");
    }
}
