package com.caogen.eurekaproducer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    Environment environment;

    @GetMapping("/hello")
    public String sayHello(String name) {
        logger.info("sayHello, {}", name);
        return "Hello,"+ name +"! port:" + environment.getProperty("local.server.port");
    }

}
