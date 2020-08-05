package com.zjj.springcloud.service.impl;

import com.zjj.springcloud.dao.PaymentDao;
import com.zjj.springcloud.entities.Payment;
import com.zjj.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class PaymentServiceimpl implements PaymentService {
    @Resource
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
