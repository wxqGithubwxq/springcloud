package com.wxq.euekaclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EuekaClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(EuekaClient1Application.class, args);
    }

}
