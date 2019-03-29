package com.wxq.eurekaclient3.DesignModel.DecoratorModel;

/**
 * Created by wenxuqiao on 2019/3/28 10:06
 *
 * @Description 手抓饼
 */
public class HandCake extends Cake{

    public HandCake(){
        desc="手抓饼";
    }
    @Override
    public double price() {
        return 4;
    }
}
