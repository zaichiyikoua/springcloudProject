package com.zaichiyikou.starter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowLimitController {
    @RequestMapping(value = "/sentinel/testA",method = RequestMethod.GET)
    public String testA() {
        return "--hello testA";
    }
    @RequestMapping(value = "/sentinel/testB",method = RequestMethod.GET)
    public String testB() {
        return "--hello testB";
    }
}
