package com.zaichiyikou.starter.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.zaichiyikou.starter.pojo.Payment;

@Mapper
public interface PaymentDao {
    public int addPayment(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
