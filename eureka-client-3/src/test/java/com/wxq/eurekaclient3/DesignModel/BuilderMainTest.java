package com.wxq.eurekaclient3.DesignModel;

import com.wxq.eurekaclient3.DesignModel.BuilderModel.MealA;
import com.wxq.eurekaclient3.DesignModel.BuilderModel.MealB;
import com.wxq.eurekaclient3.DesignModel.BuilderModel.Restaurant;
import com.wxq.eurekaclient3.DesignModel.BuilderModel.WaiterDirector;

/**
 * Created by wenxuqiao on 2019/4/4 9:32
 *
 * @Description 建造者模式测试
 */
public class BuilderMainTest {

    public static void main(String[] args) {
        MealA a=new MealA();
        WaiterDirector director=new WaiterDirector(a);
        Restaurant restaurant=director.buildMeal();
        System.out.println("菜单A:午餐:"+restaurant.getFood()+" 饮料:"+restaurant.getDrink());
        MealB b=new MealB();
        WaiterDirector director1=new WaiterDirector(b);
        Restaurant restaurant1=director1.buildMeal();
        System.out.println("菜单B:午餐:"+restaurant1.getFood()+" 饮料:"+restaurant1.getDrink());

    }
}
