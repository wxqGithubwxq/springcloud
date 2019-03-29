package com.wxq.eurekaclient3.DesignModel.DecoratorModel;

/**
 * Created by wenxuqiao on 2019/3/28 10:11
 *
 * @Description 肉夹馍
 */
public class RouCake extends Cake{
    public RouCake(){
        desc="肉夹馍";
    }
    @Override
    public double price() {
        return 5;
    }
}
