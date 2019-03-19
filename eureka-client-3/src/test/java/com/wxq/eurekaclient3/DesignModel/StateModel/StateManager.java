package com.wxq.eurekaclient3.DesignModel.StateModel;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by wenxuqiao on 2019/3/19 15:11
 *
 * @Description
 */
public class StateManager {

    private State state;

    private static Map<String,Integer> voteInfo=new ConcurrentHashMap<>();

    public void vote(String user,String voteItem){
        Integer voteNum=voteInfo.get(user);
        Integer newVoteNum=0;
        if(voteNum==null){
            newVoteNum=1;
            state=new NormalVoting();
        }else if(voteNum<5){
            state=new RepeatedVoting();
            newVoteNum=++voteNum;
        }else if(voteNum<8){
            state=new MaliciousVote();
            newVoteNum=++voteNum;
        }else {
            state=new BlacklistVote();
            newVoteNum=++voteNum;
        }
        voteInfo.put(user,newVoteNum);
        state.handleState();
    }
}
