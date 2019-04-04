package com.wxq.eurekaclient3.DesignModel.FlyweightModel;

/**
 * Created by wenxuqiao on 2019/4/4 13:35
 *
 * @Description
 */
public class ConcreteFlyweight extends Flyweight{
    public ConcreteFlyweight(String key){
        super(key);
    }
    @Override
    public void operate(String parm) {
        System.out.println("具体Flyweight:"+parm);
    }
}
