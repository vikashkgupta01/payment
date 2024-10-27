package com.payment.app.service.impl;

import com.payment.app.common.model.ProcessContent;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TxnRefGen {

    public void generateNo(ProcessContent content){
        int randomSixDigits = (int)(Math.random() * 1_000_000);
        String transRefNo = "ABC" + String.format("%06d", randomSixDigits);
        content.getFlowParams().put("transRefNo",transRefNo);

        for (Map.Entry<String, Object> entry : content.getFlowParams().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
