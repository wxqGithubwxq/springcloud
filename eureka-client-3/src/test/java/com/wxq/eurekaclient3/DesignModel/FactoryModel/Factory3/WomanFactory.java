package com.wxq.eurekaclient3.DesignModel.FactoryModel.Factory3;

/**
 * Created by wenxuqiao on 2019/3/18 17:44
 *
 * @Description
 */
public class WomanFactory implements Factory {

    @Override
    public Human createHuman() {
        return new Woman();
    }

    @Override
    public Dog createDog() {
        return new FemaleDog();
    }
}
