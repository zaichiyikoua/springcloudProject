package com.zaichiyikou.starter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zaichiyikou.starter.pojo.CommonResult;
import com.zaichiyikou.starter.pojo.Payment;

@RestController
public class OrderController {
    public static final String URL = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/payment/add", method = RequestMethod.POST)
    public CommonResult addPayment(Payment payment) {
        return restTemplate.postForObject(URL + "/payment/add", payment, CommonResult.class);
    }

    @RequestMapping(value = "consumer/payment/get/{id}", method = RequestMethod.GET)
    public CommonResult getById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(URL + "/payment/get/" + id, CommonResult.class);
    }
}
