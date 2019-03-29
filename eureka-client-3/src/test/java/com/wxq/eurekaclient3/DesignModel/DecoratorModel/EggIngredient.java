package com.wxq.eurekaclient3.DesignModel.DecoratorModel;

/**
 * Created by wenxuqiao on 2019/3/28 10:18
 *
 * @Description 鸡蛋
 */
public class EggIngredient extends Ingredient{

    public EggIngredient(Cake cake){
        this.cake=cake;
    }
    @Override
    public String getDesc() {
        return cake.getDesc()+",鸡蛋";
    }

    @Override
    public double price() {
        return cake.price()+1.5;
    }
}
