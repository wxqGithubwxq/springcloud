package com.wxq.eurekaclient3.Controller;

import com.wxq.eurekaclient3.Service.IndexService;
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
    private IndexService indexService;

    @GetMapping(value = "/index")
    public String index(){
        return indexService.index();
        //return "index";
    }
}
