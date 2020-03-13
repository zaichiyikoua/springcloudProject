package com.zaichiyikou.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//要注意，网关的微服务是没有业务类的。。
public class CloudGateway9527 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(CloudGateway9527.class, args);
    }
}
