package com.wxq.eurekaclient3.DesignModel;

import com.wxq.eurekaclient3.DesignModel.DecoratorModel.*;

/**
 * Created by wenxuqiao on 2019/3/28 10:25
 *
 * @Description  装饰者模式测试
 */
public class DecoratorMainTest {

    public static void main(String[] args) {
        Cake cake=new HandCake();
        System.out.println(cake.getDesc()+cake.price());
        cake=new EggIngredient(cake);
        System.out.println(cake.getDesc()+cake.price());
        cake=new HamIngredient(cake);
        System.out.println(cake.getDesc()+cake.price());

        Cake cake1=new RouCake();
        System.out.println(cake1.getDesc()+cake1.price());
        cake1=new EggIngredient(cake1);
        System.out.println(cake1.getDesc()+cake1.price());
        cake1=new HamIngredient(cake1);
        System.out.println(cake1.getDesc()+cake1.price());
    }
}
