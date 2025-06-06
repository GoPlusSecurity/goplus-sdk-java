package io.gopluslabs.client.response;

import io.gopluslabs.client.model.ResponseWrapperSuiTokenSecurity;
import net.kemitix.mon.TypeAlias;

public class SuiTokenSecurity extends TypeAlias<ResponseWrapperSuiTokenSecurity> {
    protected SuiTokenSecurity(final ResponseWrapperSuiTokenSecurity value) {
        super(value);
    }

    public static SuiTokenSecurity of(final ResponseWrapperSuiTokenSecurity response) {
        return new SuiTokenSecurity(response);
    }
}
