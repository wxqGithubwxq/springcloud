package com.wxq.eurekaclient3.DesignModel.PrototypeModel;

import java.util.Date;

/**
 * Created by wenxuqiao on 2019/3/18 11:02
 *
 * @Description 通过clone实现深复制
 */
public class Prototype2 implements Cloneable{
    private String name;//引用类型 但内存中会为每一个不同的字符串创建地址 相同字符串共用一个地址
    private Integer age;//引用类型
    private int num;//值类型
    private Date birthday;//引用类型
    public Prototype2(String name,Integer age,int num,Date birthday){
        this.name=name;
        this.age=age;
        this.num=num;
        this.birthday=birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    //克隆改实例
    @Override
    public Prototype2 clone(){
        Prototype2 newInstance=null;
        try {
            newInstance=(Prototype2)super.clone();
            newInstance.birthday=(Date) this.birthday.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return newInstance;
    }
}
