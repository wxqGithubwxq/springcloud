package com.wxq.eurekaclient3.DesignModel.ChainModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenxuqiao on 2019/4/8 13:46
 *
 * @Description
 */
public class FilterChain implements Chain{
    private List<Chain> chains=new ArrayList<>();
    private int index=0;

    public FilterChain addChain(Chain chain){
        chains.add(chain);
        return this;
    }

    public void doFilter(Request request,Response reponse,FilterChain filterChain){
        if(index==chains.size())
            return;
        Chain chain=chains.get(index);
        index++;
        chain.doFilter(request,reponse,filterChain);
    }
}
