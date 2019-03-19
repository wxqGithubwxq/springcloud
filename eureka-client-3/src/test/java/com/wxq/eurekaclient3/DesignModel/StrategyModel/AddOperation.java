package com.wxq.eurekaclient3.DesignModel.StrategyModel;

/**
 * Created by wenxuqiao on 2019/3/19 11:19
 *
 * @Description 加法运算
 */
public class AddOperation implements Operation{
    @Override
    public void operationResult(float a, float b) {
        float result=a+b;
        System.out.println(a+"+"+b+"="+result);
    }
}
