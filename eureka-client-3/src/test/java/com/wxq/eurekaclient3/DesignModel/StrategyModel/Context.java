package com.wxq.eurekaclient3.DesignModel.StrategyModel;

/**
 * Created by wenxuqiao on 2019/3/19 11:32
 *
 * @Description
 */
public class Context {

    private Operation operation;

    public Context(Operation operation){
        this.operation=operation;
    }

    public void executeStrategy(float a,float b){
        operation.operationResult(a,b);
    }
}
