package com.wxq.eurekaclient3.DesignModel.BuilderModel;

/**
 * Created by wenxuqiao on 2019/4/4 9:17
 *
 * @Description
 */
public abstract class RestaurantBuilder {
    public Restaurant restaurant=new Restaurant();

    public abstract void buildFood();
    public abstract void buildDrink();

    public Restaurant getMeal(){
        return restaurant;
    }
}
