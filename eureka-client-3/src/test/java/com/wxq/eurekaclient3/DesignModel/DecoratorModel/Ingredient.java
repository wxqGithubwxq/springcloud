package com.wxq.eurekaclient3.DesignModel.DecoratorModel;

/**
 * Created by wenxuqiao on 2019/3/28 10:16
 *
 * @Description 配料
 */
public abstract class Ingredient extends Cake{
    public Cake cake;

    public abstract String getDesc();
}
