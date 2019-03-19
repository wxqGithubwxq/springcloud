package com.wxq.eurekaclient3.DesignModel.StateModel;

/**
 * Created by wenxuqiao on 2019/3/19 15:03
 *
 * @Description
 */
public class NormalVoting implements State{
    @Override
    public void handleState() {
        System.out.println("投票成功!");
    }
}
