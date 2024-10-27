package com.payment.app.controller;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.payment.app.common.model.ProcessContent;
import com.payment.app.dto.PaymentRequestDto;
import com.payment.app.service.BillPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billPay")
public class PaymentController {

    @Autowired
    BillPaymentService billPaymentService;
    @GetMapping("/payment")
    public ResponseEntity<String> doBillPayment(@RequestBody PaymentRequestDto paymentRequestDto){

        String channelRequest=toJson(paymentRequestDto);

        ProcessContent content=new ProcessContent();
        content.getFlowParams().put("ChannelReqPO",channelRequest);
        content.getFlowParams().put("channelPO",paymentRequestDto);
        billPaymentService.processPayment(content);
       return ResponseEntity.ok("success");
    }

    private static final ObjectMapper objectMapper=new ObjectMapper();
    private String toJson(PaymentRequestDto paymentRequestDto) {
        try{
            return objectMapper.writeValueAsString(paymentRequestDto);
        }catch (JsonProcessingException jsonParseException){
            throw new RuntimeException();
        }
    }

}
