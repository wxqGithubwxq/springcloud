package com.wxq.eurekaclient2.Service;

import com.wxq.eurekaclient2.Service.impl.RouteServiceFailure;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by wenxuqiao on 2019/3/11 10:41
 *
 * @Description
 */
@FeignClient(value = "eureka-client-3",fallback = RouteServiceFailure.class)
public interface RouteService {

    @GetMapping(value = "/index")
    String toClient3();
}
