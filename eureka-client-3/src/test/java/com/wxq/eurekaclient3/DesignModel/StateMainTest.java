package com.wxq.eurekaclient3.DesignModel;

import com.wxq.eurekaclient3.DesignModel.StateModel.StateManager;

/**
 * Created by wenxuqiao on 2019/3/19 16:13
 *
 * @Description 状态模式测试
 */
public class StateMainTest {

    public static void main(String[] args) {
        StateManager stateManager=new StateManager();
        for(int i=0;i<10;i++){
            stateManager.vote("文许桥","1234");
        }
    }
}
