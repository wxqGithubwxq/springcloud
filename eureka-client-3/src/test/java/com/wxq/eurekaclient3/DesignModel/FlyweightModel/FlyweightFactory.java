package com.wxq.eurekaclient3.DesignModel.FlyweightModel;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wenxuqiao on 2019/4/4 13:37
 *
 * @Description
 */
public class FlyweightFactory {
    private static Map<String,Flyweight> instances=new HashMap<>();

    public static Flyweight getFlyweight(String key){
        Flyweight instance=null;
        if(instances.containsKey(key)){
            instance=instances.get(key);
            System.out.println("已从池中获取:"+key);
        }else {
            instance=new ConcreteFlyweight(key);
            instances.put(key,instance);
            System.out.println("已从池中创建:"+key);
        }
        return instance;
    }
}
