package com.wxq.eurekaclient3.DesignModel.ChainModel;

/**
 * Created by wenxuqiao on 2019/4/8 13:42
 *
 * @Description
 */
public class TextChain implements Chain{
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        String requestStr=request.getRequest().replace('文','?').replace('桥','X')+"---TextChain";
        request.setRequest(requestStr);
        response.setResponse(response.getResponse()+"----TextChain");
        chain.doFilter(request,response,chain);
    }
}
