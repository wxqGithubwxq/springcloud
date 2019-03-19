package com.wxq.eurekaclient3.DesignModel.StateModel;

/**
 * Created by wenxuqiao on 2019/3/19 15:10
 *
 * @Description
 */
public class BlacklistVote implements State{
    @Override
    public void handleState() {
        System.out.println("黑名单投票!");
    }
}
