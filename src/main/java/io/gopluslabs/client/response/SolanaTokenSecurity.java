package io.gopluslabs.client.response;

import io.gopluslabs.client.model.ResponseWrapperSolanaTokenSecurity;
import net.kemitix.mon.TypeAlias;

public class SolanaTokenSecurity extends TypeAlias<ResponseWrapperSolanaTokenSecurity> {
    protected SolanaTokenSecurity(final ResponseWrapperSolanaTokenSecurity value) {
        super(value);
    }

    public static SolanaTokenSecurity of(final ResponseWrapperSolanaTokenSecurity response) {
        return new SolanaTokenSecurity(response);
    }
}
