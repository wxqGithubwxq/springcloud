package com.wxq.eurekaclient3.DesignModel.StateModel;

/**
 * Created by wenxuqiao on 2019/3/19 15:09
 *
 * @Description
 */
public class MaliciousVote implements State{
    @Override
    public void handleState() {
        System.out.println("恶意投票!");
    }
}
