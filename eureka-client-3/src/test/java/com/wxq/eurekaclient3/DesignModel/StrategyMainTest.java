package com.wxq.eurekaclient3.DesignModel;

import com.wxq.eurekaclient3.DesignModel.StrategyModel.*;

/**
 * Created by wenxuqiao on 2019/3/19 11:41
 *
 * @Description 策略模式测试
 */
public class StrategyMainTest {

    public static void main(String[] args) {
        float a=15;
        float b=3;
        System.out.println("加法运算开始");
        Context add=new Context(new AddOperation());
        add.executeStrategy(a,b);
        System.out.println("加法运算结束");

        System.out.println("减法运算开始");
        Context subtract=new Context(new SubtractOperation());
        subtract.executeStrategy(a,b);
        System.out.println("减法运算结束");

        System.out.println("乘法运算开始");
        Context multiply=new Context(new MultiplyOperation());
        multiply.executeStrategy(a,b);
        System.out.println("乘法运算结束");

        System.out.println("除法运算开始");
        Context divide=new Context(new DivideOperation());
        divide.executeStrategy(a,b);
        System.out.println("除法运算结束");
    }
}
