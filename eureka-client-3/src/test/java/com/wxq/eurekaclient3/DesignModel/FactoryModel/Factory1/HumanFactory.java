package com.wxq.eurekaclient3.DesignModel.FactoryModel.Factory1;

/**
 * Created by wenxuqiao on 2019/3/18 17:24
 *
 * @Description
 */
public class HumanFactory {
    public static final String MAN="man";
    public static final String WOMAN="woman";

    //创建工厂 方法一
    public static Human createHumanFactory(String type){
        Human human=null;
        switch (type){
            case "man":
                human=new Man();
                break;
            case "woman":
                human=new Woman();
                break;
        }
        return human;
    }

    //利用反射 方法二
    public static Human createHumanFactory1(Class c) throws Exception{
        Human human=(Human)Class.forName(c.getName()).newInstance();
        return human;
    }

    //方法三
    public static Man createManFactory(){
        return new Man();
    }
    public static Woman createWomanFactory(){
        return new Woman();
    }
}
