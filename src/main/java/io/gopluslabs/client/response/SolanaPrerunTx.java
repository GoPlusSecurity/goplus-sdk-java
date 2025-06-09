package io.gopluslabs.client.response;

import io.gopluslabs.client.model.ResponseWrapperSolanaPrerunTxResponse;
import net.kemitix.mon.TypeAlias;

public class SolanaPrerunTx extends TypeAlias<ResponseWrapperSolanaPrerunTxResponse> {
    protected SolanaPrerunTx(final ResponseWrapperSolanaPrerunTxResponse value) {
        super(value);
    }

    public static SolanaPrerunTx of(final ResponseWrapperSolanaPrerunTxResponse response) {
        return new SolanaPrerunTx(response);
    }
}
