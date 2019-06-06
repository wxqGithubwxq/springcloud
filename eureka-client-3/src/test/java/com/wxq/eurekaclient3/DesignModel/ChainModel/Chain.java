package com.wxq.eurekaclient3.DesignModel.ChainModel;

/**
 * Created by wenxuqiao on 2019/4/8 13:23
 *
 * @Description
 */
public interface Chain {

    void doFilter(Request request,Response response,FilterChain chain);
}
