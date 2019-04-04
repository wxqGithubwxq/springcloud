package com.wxq.eurekaclient3.DesignModel.BuilderModel;

/**
 * Created by wenxuqiao on 2019/4/4 9:26
 *
 * @Description
 */
public class MealB extends RestaurantBuilder{
    @Override
    public void buildFood() {
        restaurant.setFood("鱼香肉丝");
    }

    @Override
    public void buildDrink() {
        restaurant.setDrink("西瓜汁");
    }
}
