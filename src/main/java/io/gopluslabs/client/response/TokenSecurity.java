package io.gopluslabs.client.response;

import io.gopluslabs.client.model.ResponseWrapperTokenSecurity;
import net.kemitix.mon.TypeAlias;

public class TokenSecurity extends TypeAlias<ResponseWrapperTokenSecurity> {
    protected TokenSecurity(final ResponseWrapperTokenSecurity value) {
        super(value);
    }

    public static TokenSecurity of(final ResponseWrapperTokenSecurity response){
        return new TokenSecurity(response);
    }
}
