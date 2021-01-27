package com.mytests.spring.simple.feignclientapp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * *
 * <p>Created by irina on 14.10.2020.</p>
 * <p>Project: feignSimple</p>
 * *
 */
@FeignClient(name = "test1", url = "http://localhost:8081/simple/server")
public interface MyClient1 {
    
    @GetMapping("/test1")
    String test1();
}
