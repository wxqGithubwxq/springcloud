package com.wxq.eurekaclient3.DesignModel.MementoModel;

/**
 * Created by wenxuqiao on 2019/4/3 14:08
 *
 * @Description
 */
public class Memento {

    private Integer m;
    public void setState(Integer m){
        this.m = m;
    }
    public Integer getState(){
        return m;
    }
}
