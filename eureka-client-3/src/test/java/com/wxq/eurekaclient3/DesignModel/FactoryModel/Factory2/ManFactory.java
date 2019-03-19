package com.wxq.eurekaclient3.DesignModel.FactoryModel.Factory2;

/**
 * Created by wenxuqiao on 2019/3/18 17:43
 *
 * @Description
 */
public class ManFactory implements Factory{
    @Override
    public Human createHuman() {
        return new Man();
    }
}
