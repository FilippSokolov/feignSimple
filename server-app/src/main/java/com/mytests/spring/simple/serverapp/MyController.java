package com.mytests.spring.simple.serverapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * *
 * <p>Created by irina on 14.10.2020.</p>
 * <p>Project: feignSimple</p>
 * *
 */

@RestController
public class MyController {

    @GetMapping("/test1")
    public String test1( ) {
        return "test1";
    }
}
