package com.wxq.eurekaclient2.Service.impl;

import com.wxq.eurekaclient2.Service.RouteService;
import org.springframework.stereotype.Service;

/**
 * Created by wenxuqiao on 2019/3/11 13:28
 *
 * @Description
 */
@Service
public class RouteServiceFailure implements RouteService {
    @Override
    public String toClient3() {
        return "client is not available!";
    }
}
