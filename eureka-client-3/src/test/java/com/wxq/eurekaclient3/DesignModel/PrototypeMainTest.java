package com.wxq.eurekaclient3.DesignModel;

import com.wxq.eurekaclient3.DesignModel.PrototypeModel.Prototype2;
import com.wxq.eurekaclient3.DesignModel.PrototypeModel.Prototype3;
import com.wxq.eurekaclient3.DesignModel.PrototypeModel.Protptype1;

import java.util.Date;

/**
 * Created by wenxuqiao on 2019/3/18 11:46
 *
 * @Description 原型模式测试 (包括浅复制和深复制校验)
 */
public class PrototypeMainTest {

    public static void main(String[] args) throws Exception{
        //浅复制 int Integer String表现出来的都是按值传递的结果 实际上原理有些许差异
        Date date=new Date();
        Protptype1 test1=new Protptype1("文许桥",12,10,date);
        Protptype1 test2=test1.clone();
        System.out.println(test2==test1);
        System.out.println(test1.getClass()==test2.getClass());
        test1.setName("2312");
        test1.setAge(14);
        test1.setNum(15);
        date.setTime(234234234L);
        System.out.println("name:"+test1.getName()+" age:"+test1.getAge()+" num:"+test1.getNum()+" birthday:"+test1.getBirthday());
        System.out.println("name:"+test2.getName()+" age:"+test2.getAge()+" num:"+test2.getNum()+" birthday:"+test2.getBirthday());

        Date date1=new Date();
        Prototype2 test3=new Prototype2("文许桥",12,10,date1);
        Prototype2 test4=test3.clone();
        System.out.println(test3==test4);
        System.out.println(test3.getClass()==test4.getClass());
        test3.setName("2312");
        test3.setAge(14);
        test3.setNum(15);
        date1.setTime(234234234L);
        System.out.println("name:"+test3.getName()+" age:"+test3.getAge()+" num:"+test3.getNum()+" birthday:"+test3.getBirthday());
        System.out.println("name:"+test4.getName()+" age:"+test4.getAge()+" num:"+test4.getNum()+" birthday:"+test4.getBirthday());

        Date date3=new Date();
        Prototype3 test5=new Prototype3("文许桥",12,10,date3);
        Prototype3 tet6=test5.deepCopy(test5,date3);
        System.out.println(test5==tet6);
        System.out.println(test5.getClass()==tet6.getClass());
        test5.setName("2312");
        test5.setAge(14);
        test5.setNum(15);
        date1.setTime(234234234L);
        System.out.println("name:"+test5.getName()+" age:"+test5.getAge()+" num:"+test5.getNum()+" birthday:"+test5.getBirthday());
        System.out.println("name:"+tet6.getName()+" age:"+tet6.getAge()+" num:"+tet6.getNum()+" birthday:"+tet6.getBirthday());
    }
}
