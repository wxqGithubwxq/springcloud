package com.wxq.eurekaclient3.DesignModel.PrototypeModel;

import java.io.*;
import java.util.Date;

/**
 * Created by wenxuqiao on 2019/3/18 11:26
 *
 * @Description 使用序列化和反序列化的方式实现对象的深复制()
 * java.io.ObjectOutputStream代表对象输出流，它的writeObject(Object obj)方法可对参数指定的obj对象进行序列化，把得到的字节序列写到一个目标输出流中。
 * 　　java.io.ObjectInputStream代表对象输入流，它的readObject()方法从一个源输入流中读取字节序列，再把它们反序列化为一个对象，并将其返回。
 * 　　只有实现了Serializable和Externalizable接口的类的对象才能被序列化。Externalizable接口继承自 Serializable接口，实现Externalizable接口的类完全由自身来控制序列化的行为，而仅实现Serializable接口的类可以 采用默认的序列化方式 。
 * 　　对象序列化包括如下步骤：
 * 　　1） 创建一个对象输出流，它可以包装一个其他类型的目标输出流，如文件输出流；
 * 　　2） 通过对象输出流的writeObject()方法写对象。
 * <p>
 * 　　对象反序列化的步骤如下：
 * 　　1） 创建一个对象输入流，它可以包装一个其他类型的源输入流，如文件输入流；
 * 　　2） 通过对象输入流的readObject()方法读取对象。
 */
public class Prototype3 implements Serializable {
    private static final long serialVersionUID = -5809782578272943999L;//序列化id 保证序列化一致性
    private String name;//引用类型 但内存中会为每一个不同的字符串创建地址 相同字符串共用一个地址
    private Integer age;//引用类型
    private int num;//值类型
    private Date birthday;//引用类型

    public Prototype3(String name, Integer age, int num,Date birthday) {
        this.name = name;
        this.age = age;
        this.num = num;
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
    public Prototype3 deepCopy(Prototype3 source,Date date) throws IOException,ClassNotFoundException{
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(source);
        oos.close();

        byte[] bytes = bos.toByteArray();
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Prototype3 target = (Prototype3) ois.readObject();  //克隆好的对象
        ois.close();

        date.setTime(231312341234123L);
        source.setBirthday(date);
        return target;
    }
}
