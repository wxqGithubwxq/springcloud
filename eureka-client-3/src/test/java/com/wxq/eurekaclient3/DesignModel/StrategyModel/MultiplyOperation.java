package com.wxq.eurekaclient3.DesignModel.StrategyModel;

/**
 * Created by wenxuqiao on 2019/3/19 11:24
 *
 * @Description 乘法运算
 */
 public class MultiplyOperation implements Operation{
    @Override
    public void operationResult(float a, float b) {
        float result=a*b;
        System.out.println(a+"*"+b+"="+result);

    }
}
