package com.wxq.eurekaclient2.Controller;

import com.wxq.eurekaclient2.Service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wenxuqiao on 2019/3/8 17:43
 *
 * @Description
 */
@RestController
public class IndexController {

    @Autowired
    RouteService routeService;
    @GetMapping(value = "/index")
    public String index(){
        return "welcome to client2 8763";
    }

    @GetMapping(value = "/toClient3")
    public String toClient3(){
       return routeService.toClient3();
    }
}
