package com.zaichiyikou.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//启动类
@SpringBootApplication
@EnableDiscoveryClient
public class CloudSentinelService8401 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(CloudSentinelService8401.class, args);
    }

}
