package com.zaichiyikou.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//启用注解
@EnableFeignClients
public class CloudConsumerOrderFeign80 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(CloudConsumerOrderFeign80.class, args);
    }

}
