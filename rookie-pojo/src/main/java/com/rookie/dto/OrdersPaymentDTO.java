package com.rookie.dto;

import java.io.Serializable;
import lombok.Data;

@Data
public class OrdersPaymentDTO implements Serializable {

    //订单号
    private String orderNumber;

    //付款方式
    private Integer payMethod;
}
