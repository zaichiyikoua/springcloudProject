package com.zaichiyikou.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
// nacos  不再使用eureka了
@EnableDiscoveryClient
public class CloudNacosProviderPayment9001 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(CloudNacosProviderPayment9001.class, args);
    }

}
