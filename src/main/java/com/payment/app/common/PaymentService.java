package com.payment.app.common;

import com.payment.app.common.model.ProcessContent;

public interface PaymentService {

    void execute (ProcessContent content, Object... args);
}
