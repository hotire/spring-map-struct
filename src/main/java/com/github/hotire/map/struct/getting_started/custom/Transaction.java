package com.github.hotire.map.struct.getting_started.custom;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class Transaction {
    private String uuid = UUID.randomUUID().toString();
    private Long id;
    private BigDecimal total;
}
