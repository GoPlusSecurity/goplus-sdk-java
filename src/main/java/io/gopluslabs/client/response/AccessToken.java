package io.gopluslabs.client.response;

import io.gopluslabs.client.model.ResponseWrapperGetAccessTokenResponse;
import net.kemitix.mon.TypeAlias;

public class AccessToken extends TypeAlias<ResponseWrapperGetAccessTokenResponse> {
    protected AccessToken(final ResponseWrapperGetAccessTokenResponse value) {
        super(value);
    }
    public static AccessToken of(final ResponseWrapperGetAccessTokenResponse response){
        return new AccessToken(response);
    }
}
