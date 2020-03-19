package com.zaichiyikou.starter.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // 这个注解支持nacos的动态刷新功能
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;
    
    @RequestMapping(value = "/config/info",method = RequestMethod.GET)
    public String getConfigInfo() {
        return configInfo;
        
    }
}
