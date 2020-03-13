package com.zaichiyikou.starter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zaichiyikou.starter.pojo.CommonResult;
import com.zaichiyikou.starter.service.PaymentFeignService;

@RestController
public class OrderFeignController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    @RequestMapping(value = "/consumer/payment/get/{id}", method = RequestMethod.GET)
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }
}
