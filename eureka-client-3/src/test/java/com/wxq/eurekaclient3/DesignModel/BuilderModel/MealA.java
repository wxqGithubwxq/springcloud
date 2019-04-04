package com.wxq.eurekaclient3.DesignModel.BuilderModel;

/**
 * Created by wenxuqiao on 2019/4/4 9:24
 *
 * @Description
 */
public class MealA extends RestaurantBuilder{
    @Override
    public void buildFood() {
        restaurant.setFood("宫保鸡丁");
    }

    @Override
    public void buildDrink() {
        restaurant.setDrink("柠檬汁");
    }
}
