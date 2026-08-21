package io.gopluslabs.client.response;

import io.gopluslabs.client.model.ResponseWrapperTransactionSecurityResponse;
import net.kemitix.mon.TypeAlias;

public class TransactionSimulation extends TypeAlias<ResponseWrapperTransactionSecurityResponse> {
    protected TransactionSimulation(final ResponseWrapperTransactionSecurityResponse value) {
        super(value);
    }

    public static TransactionSimulation of(final ResponseWrapperTransactionSecurityResponse response) {
        return new TransactionSimulation(response);
    }
}
