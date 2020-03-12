package com.zaichiyikou.starter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zaichiyikou.starter.dao.PaymentDao;
import com.zaichiyikou.starter.pojo.Payment;
import com.zaichiyikou.starter.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentdao;

    @Override
    public int addPayment(Payment payment) {
        // TODO Auto-generated method stub
        return paymentdao.addPayment(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        // TODO Auto-generated method stub
        return paymentdao.getPaymentById(id);
    }

}
