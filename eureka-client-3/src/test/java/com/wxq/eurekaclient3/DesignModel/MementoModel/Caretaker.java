package com.wxq.eurekaclient3.DesignModel.MementoModel;

import java.util.Stack;

/**
 * Created by wenxuqiao on 2019/4/3 14:11
 *
 * @Description
 */
public class Caretaker {
    Stack<Memento> stack;

    Caretaker(){
        stack = new Stack<Memento>();
    }

    public Memento getMemento(){
        if(!(stack.isEmpty())){
            Memento memento = stack.pop();
            return memento;
        }
        else
            return null;
    }

    public void saveMemento(Memento memento){
        stack.push(memento);
    }
}
