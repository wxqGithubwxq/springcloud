package com.wxq.eurekaclient3.DesignModel.Reflection;

/**
 * Created by wenxuqiao on 2019/3/20 11:47
 *
 * @Description 反射机制
 */
public class Student {

    private String name;
    private String number;
    public String address;
    public static String email;
    private static String birthday;

    public Student(){
        System.out.println("默认无参公有构造方法");
    }

    private Student(String message){
        System.out.println("私有构造方法:"+message);
    }

    public Student(String message,String name){
        System.out.println("公有构造方法:"+message+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void printStatic(){
        System.out.println("共有静态方法打印");
    }

    private static void printStaticPrivate(){
        System.out.println("共有静态私有方法打印");
    }

    public void print(String message){
        System.out.println("公有方法打印:"+message);
    }

    private void print(String message,String name){
        System.out.println("私有方法打印:"+message+name);
    }

    public void print(){
        System.out.println("无参公有方法打印");
    }
}
