package com.example.consumerdemo.controller;

import com.example.consumerdemo.feign.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fy
 * @create 2020/04/26 11:24
 */
@RestController
public class ConsumerController {
    @Autowired
    private ProviderFeign providerFeign;
    @GetMapping("/consumer")
    public String consumer(){
        return "hello , I am consumer \n"+providerFeign.provider();
    }
}
