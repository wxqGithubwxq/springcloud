package com.wxq.eurekaclient3.DesignModel.StrategyModel;

/**
 * Created by wenxuqiao on 2019/3/19 11:25
 *
 * @Description  除法运算
 */
public class DivideOperation implements Operation{
    @Override
    public void operationResult(float a, float b) {
        float result=a/b;
        System.out.println(a+"/"+b+"="+result);
    }
}
