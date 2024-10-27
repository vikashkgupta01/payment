package com.payment.app.service;

import com.payment.app.common.model.ProcessContent;
import com.payment.app.service.impl.BillPaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillPaymentService {

    @Autowired
    BillPaymentServiceImpl billPaymentServiceImpl;
    public String processPayment(ProcessContent content){
        billPaymentServiceImpl.paymentService(content);
        return "";
    }

}
