package com.zaichiyikou.starter.service;

import org.apache.ibatis.annotations.Param;

import com.zaichiyikou.starter.pojo.Payment;

public interface PaymentService {
    public int addPayment(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
