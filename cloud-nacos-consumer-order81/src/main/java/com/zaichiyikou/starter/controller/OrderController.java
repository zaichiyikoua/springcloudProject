package com.zaichiyikou.starter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zaichiyikou.starter.pojo.CommonResult;
import com.zaichiyikou.starter.pojo.Payment;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;
   
    @Value("${service-url.nacos-user-service}")
    private String serviceUrl;
    @RequestMapping(value = "/nacos/consumer/payment/add", method = RequestMethod.POST)
    public CommonResult addPayment(Payment payment) {
        return restTemplate.postForObject(serviceUrl + "/nacos/payment/add", payment, CommonResult.class);
    }

    @RequestMapping(value = "/nacos/consumer/payment/get/{id}", method = RequestMethod.GET)
    public CommonResult getById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(serviceUrl + "/nacos/payment/get/" + id, CommonResult.class);
    }
}
