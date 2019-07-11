package com.caogen.feignconsumer.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ConsumerFeignHystrix implements ConsumerFeign {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello," + name + "! this messge send failed ";
    }

}
