package com.wxq.eurekaclient3.Service;

//import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wenxuqiao on 2019/3/8 17:55
 *
 * @Description
 */
@FeignClient(value = "EUREKA-CLIENT-1")
public interface IndexService {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
     String index();
}
