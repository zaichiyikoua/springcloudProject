package com.zaichiyikou.starter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zaichiyikou.starter.pojo.CommonResult;
import com.zaichiyikou.starter.pojo.Payment;
import com.zaichiyikou.starter.service.impl.PaymentServiceImpl;

@RestController
public class PaymentController {
    @Autowired
    private PaymentServiceImpl service;

    @RequestMapping(value = "/payment/add", method = RequestMethod.POST)
    public CommonResult addPayment(Payment payment) {
        int result = service.addPayment(payment);
        System.out.println("******插入结果******" + result);
        if (result > 0) {
            return new CommonResult(200, "数据插入成功", payment);
        } else {
            return new CommonResult(400, "数据插入失败", null);
        }
    };

    @RequestMapping(value = "/payment/get/{id}", method = RequestMethod.GET)
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment paymentById = service.getPaymentById(id);
        if (paymentById != null) {
            return new CommonResult(200, "查询成功", paymentById);
        } else {
            return new CommonResult(400, "查询失败" + id, null);
        }

    };
}
