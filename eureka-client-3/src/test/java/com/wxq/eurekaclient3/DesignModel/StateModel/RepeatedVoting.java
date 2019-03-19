package com.wxq.eurekaclient3.DesignModel.StateModel;

/**
 * Created by wenxuqiao on 2019/3/19 15:06
 *
 * @Description
 */
public class RepeatedVoting implements State{
    @Override
    public void handleState() {
        System.out.println("反复投票!");
    }
}
