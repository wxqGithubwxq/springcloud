package com.wxq.eurekaclient3.DesignModel.ObserverModel.Observer1;

/**
 * Created by wenxuqiao on 2019/4/2 8:58
 *
 * @Description
 */
public interface Subject {
    void registObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
