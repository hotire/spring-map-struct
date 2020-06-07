package com.github.hotire.map.struct.getting_started.custom;

import org.mapstruct.Mapper;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
public abstract class TransactionMapper {

    public V1Transaction toV1(final Transaction transaction) {
        V1Transaction v1Transaction = new V1Transaction();
        v1Transaction.setUuid(transaction.getUuid());
        v1Transaction.setTotalInCents(transaction.getTotal()
                                                 .multiply(new BigDecimal("100")).longValue());
        return v1Transaction;
    }

    public abstract List<V1Transaction> toV1(final Collection<Transaction> transactions);
}
