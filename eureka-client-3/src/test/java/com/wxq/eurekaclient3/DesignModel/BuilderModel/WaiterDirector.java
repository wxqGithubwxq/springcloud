package com.wxq.eurekaclient3.DesignModel.BuilderModel;

/**
 * Created by wenxuqiao on 2019/4/4 9:29
 *
 * @Description
 */
public class WaiterDirector {
    private RestaurantBuilder builder;

    public WaiterDirector(RestaurantBuilder builder){
        this.builder=builder;
    }

    public Restaurant buildMeal(){
        builder.buildDrink();
        builder.buildFood();
        return builder.getMeal();
    }
}
