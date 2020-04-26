package com.example.providerdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fy
 * @create 2020/04/26 11:19
 */
@RestController
@RefreshScope
public class ProviderController {
    @Value("${myName}")
    private String name;
    @Value("${jdbcUrl}")
    private String jdbcUrl;
    @Value("${redisName}")
    private String redisName;
    @GetMapping("/provider")
    public String provider(){
        return "hello ," + name+"  jdbcUrl:"+jdbcUrl+"  redisName:"+redisName;
    }
}
