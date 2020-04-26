package com.example.consumerdemo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author fy
 * @create 2020/04/26 12:03
 */
@FeignClient("service-provider")
public interface ProviderFeign {
    @GetMapping("/provider")
    public String provider();
}
