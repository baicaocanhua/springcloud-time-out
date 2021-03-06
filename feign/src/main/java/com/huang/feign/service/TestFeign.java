package com.huang.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-client")
@Repository
public interface TestFeign {

    @RequestMapping("/test")
    String test();
}
