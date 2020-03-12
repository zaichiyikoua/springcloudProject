package com.zaichiyikou.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@MapperScan(basePackages = "com.zaichiyikou.starter.dao")
@EnableEurekaClient
public class CloudProviderPayment8001 {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8001.class, args);
    }
}
