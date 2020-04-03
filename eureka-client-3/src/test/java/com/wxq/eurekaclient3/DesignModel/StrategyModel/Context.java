package com.wxq.eurekaclient3.DesignModel.StrategyModel;

/**
 * Created by wenxuqiao on 2019/3/19 11:32
 *
 * @Description
 */
public class Context {

    //操作对象
    private Operation operation;

    public Context(Operation operation){
        this.operation=operation;
    }

    //执行策略
    public void executeStrategy(float a,float b){
        operation.operationResult(a,b);
    }
}
