package com.zaichiyikou.starter.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zaichiyikou.starter.pojo.CommonResult;

@Service
@FeignClient(value = "cloud-provider-payment8001", fallback = PaymentServiceHystrixImpl.class)
public interface PaymentServiceHystrix {
    @RequestMapping(value = "/payment/get/{id}", method = RequestMethod.GET)
    public CommonResult getPaymentById(@PathVariable("id") Long id);
}

@Component
class PaymentServiceHystrixImpl implements PaymentServiceHystrix {

    @Override
    public CommonResult getPaymentById(Long id) {
        // TODO Auto-generated method stub
        return new CommonResult(400, "熔断", null);
    }

}