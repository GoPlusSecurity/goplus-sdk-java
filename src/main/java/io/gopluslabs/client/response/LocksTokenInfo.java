package io.gopluslabs.client.response;

import io.gopluslabs.client.model.ResponseWrapperTokenLockerResponse;
import net.kemitix.mon.TypeAlias;

public class LocksTokenInfo extends TypeAlias<ResponseWrapperTokenLockerResponse> {
    protected LocksTokenInfo(final ResponseWrapperTokenLockerResponse value) {
        super(value);
    }

    public static LocksTokenInfo of(final ResponseWrapperTokenLockerResponse response) {
        return new LocksTokenInfo(response);
    }
}
