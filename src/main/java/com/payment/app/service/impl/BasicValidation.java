package com.payment.app.service.impl;

import com.payment.app.common.model.ProcessContent;
import org.springframework.stereotype.Service;

@Service
public class BasicValidation {

    public void validationCheck (ProcessContent content){

        duplicateCheck((String) content.getFlowParams().get("transrefNo"));
    }

    private void duplicateCheck(String transrefNo) {
        System.out.println("transRefNo ::"+transrefNo);
    }
}
