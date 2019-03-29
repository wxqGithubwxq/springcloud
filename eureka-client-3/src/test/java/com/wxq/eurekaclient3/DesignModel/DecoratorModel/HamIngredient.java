package com.wxq.eurekaclient3.DesignModel.DecoratorModel;

/**
 * Created by wenxuqiao on 2019/3/28 10:21
 *
 * @Description 火腿
 */
public class HamIngredient extends Ingredient{
    public HamIngredient(Cake cake){
        this.cake=cake;
    }
    @Override
    public double price() {
        return cake.price()+2;
    }

    @Override
    public String getDesc() {
        return cake.getDesc()+",火腿";
    }
}
