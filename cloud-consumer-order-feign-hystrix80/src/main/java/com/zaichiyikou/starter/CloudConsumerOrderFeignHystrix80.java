package com.zaichiyikou.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class CloudConsumerOrderFeignHystrix80 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(CloudConsumerOrderFeignHystrix80.class, args);
    }

}
