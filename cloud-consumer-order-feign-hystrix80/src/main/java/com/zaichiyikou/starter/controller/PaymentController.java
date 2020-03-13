package com.zaichiyikou.starter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zaichiyikou.starter.pojo.CommonResult;
import com.zaichiyikou.starter.service.PaymentServiceHystrix;

@RestController
public class PaymentController {
    @Autowired
    private PaymentServiceHystrix paymentServiceHystrix;

    @RequestMapping(value = "/consumerHystrix/payment/get/{id}", method = RequestMethod.GET)
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        return paymentServiceHystrix.getPaymentById(id);
    };
}
