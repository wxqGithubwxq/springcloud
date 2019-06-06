package com.wxq.eurekaclient3.DesignModel.ChainModel;

/**
 * Created by wenxuqiao on 2019/4/8 13:34
 *
 * @Description
 */
public class HtmlChain implements Chain{
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        String requestStr=request.getRequest().replace('<','(').replace('>',')')+"---HtmlChain";
        request.setRequest(requestStr);
        response.setResponse(response.getResponse()+"----HtmlChain");
        chain.doFilter(request,response,chain);
    }
}
