package com.caogen.feignconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-producer", fallback = ConsumerFeignHystrix.class)
public interface ConsumerFeign {

    @GetMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);

}
