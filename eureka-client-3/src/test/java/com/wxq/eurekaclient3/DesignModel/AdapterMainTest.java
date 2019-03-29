package com.wxq.eurekaclient3.DesignModel;

import com.wxq.eurekaclient3.DesignModel.AdapterModel.Adapter1.Adapter1;
import com.wxq.eurekaclient3.DesignModel.AdapterModel.Adapter1.Ps1;
import com.wxq.eurekaclient3.DesignModel.AdapterModel.Adapter2.Adapter2;
import com.wxq.eurekaclient3.DesignModel.AdapterModel.Adapter2.Ps2;
import com.wxq.eurekaclient3.DesignModel.AdapterModel.Adapter2.Usber2;
import com.wxq.eurekaclient3.DesignModel.AdapterModel.Adapter3.Adapter3;
import com.wxq.eurekaclient3.DesignModel.AdapterModel.Adapter3.B;

/**
 * Created by wenxuqiao on 2019/3/28 17:04
 *
 * @Description 适配器模式测试
 */
public class AdapterMainTest {
    public static void main(String[] args) {
        System.out.println("类适配器模式开始");
        Adapter1 adapter1=new Adapter1();
        adapter1.isPs1();
        Ps1 ps1=new Adapter1();
        ps1.isPs1();
        System.out.println("类适配器模式结束");
        System.out.println("对象适配器模式开始");
        Ps2 ps2=new Adapter2(new Usber2());
        ps2.isPs2();
        System.out.println("对象适配器模式结束");
        System.out.println("接口适配器模式开始");
        Adapter3 adapter3=new B();
        adapter3.a();
        System.out.println("接口适配器模式结束");
    }
}
