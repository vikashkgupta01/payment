package com.payment.app.common.model;

import com.payment.app.entity.ConsumerDetails;
import com.payment.app.entity.TxnDetails;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProcessContent extends BaseContent{

    private ConsumerDetails consumerDetails;
    private TxnDetails txnDetails;

    public ProcessContent(ConsumerDetails consumerDetails, TxnDetails txnDetails) {
        this.consumerDetails = consumerDetails;
        this.txnDetails = txnDetails;
    }
    public ProcessContent(){

    }

    List<ConsumerDetails> consumerDetailsList=new ArrayList<>();

    List<TxnDetails> txnDetailsList=new ArrayList<>();
}
