package com.caogen.feignconsumer.controller;

import com.caogen.feignconsumer.feign.ConsumerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ConsumerFeign consumerFeign;

    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return consumerFeign.hello(name);
    }

}
