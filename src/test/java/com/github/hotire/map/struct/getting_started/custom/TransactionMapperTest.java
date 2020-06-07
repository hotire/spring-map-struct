package com.github.hotire.map.struct.getting_started.custom;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class TransactionMapperTest {

    private final TransactionMapper mapper = Mappers.getMapper(TransactionMapper.class);

    @Test
    void toV1() {
        // given
        final Transaction transaction = new Transaction().setTotal(new BigDecimal(100));
        final List<Transaction> transactions = List.of(transaction);

        // when
        final List<V1Transaction> result = mapper.toV1(transactions);

        // then
        assertThat(result.size()).isEqualTo(1);
        assertThat(result.get(0).getUuid()).isEqualTo(transaction.getUuid());
        assertThat(result.get(0).getTotalInCents()).isEqualTo(10000L);
    }
}