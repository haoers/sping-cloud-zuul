package com.neo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController1 {
    private final Logger logger = LoggerFactory.getLogger(HelloController1.class);

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        logger.info("request1 one  name is "+name);
        try{
            Thread.sleep(1000000);
        }catch ( Exception e){
            logger.error(" hello two error",e);
        }
        return "hello1 "+name+"，this is first messge";
    }
}