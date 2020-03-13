package com.zaichiyikou.starter.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zaichiyikou.starter.pojo.CommonResult;

@Component
//微服务的name
@FeignClient(value = "cloud-provider-payment8001")
public interface PaymentFeignService {
    @RequestMapping(value = "/payment/get/{id}", method = RequestMethod.GET)
    public CommonResult getPaymentById(@PathVariable("id") Long id);
}
