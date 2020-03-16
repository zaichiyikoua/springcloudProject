package com.zaichiyikou.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudNacosProviderPayment9002 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(CloudNacosProviderPayment9002.class, args);
    }

}
