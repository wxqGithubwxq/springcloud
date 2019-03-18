package com.wxq.euekaclient1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wenxuqiao on 2019/3/8 17:43
 *
 * @Description
 */
@RestController
public class IndexController {

    @GetMapping(value = "/index")
    public String index(){
        return "welcome to client1 8762";
    }
}
