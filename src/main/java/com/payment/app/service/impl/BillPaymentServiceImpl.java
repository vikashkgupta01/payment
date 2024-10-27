package com.payment.app.service.impl;

import com.payment.app.common.model.ProcessContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillPaymentServiceImpl {

    @Autowired
    TxnRefGen txnRefGen;

    @Autowired
    PrepareAck1 prepareAck1;

    @Autowired
    SendToAmq sendToAmq;

    @Autowired
    BasicValidation basicValidation;
    public void paymentService(ProcessContent content){
        txnRefGen.generateNo(content);


    }
}
