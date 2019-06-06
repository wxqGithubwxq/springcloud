package com.wxq.eurekaclient3.DesignModel;

import com.wxq.eurekaclient3.DesignModel.ChainModel.*;

/**
 * Created by wenxuqiao on 2019/4/8 14:05
 *
 * @Description 责任链模式测试
 */
public class ChainMainTest {

    public static void main(String[] args) {
        FilterChain filterChain=new FilterChain();
        filterChain.addChain(new HtmlChain()).addChain(new TextChain());
        Request request=new Request();
        request.setRequest("<script>我是文许桥!</script>");
        Response response=new Response();
        response.setResponse("Response:");
        filterChain.doFilter(request,response,filterChain);
        System.out.println(request.getRequest());
        System.out.println(response.getResponse());
    }
}
