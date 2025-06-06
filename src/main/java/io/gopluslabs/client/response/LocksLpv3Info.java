package io.gopluslabs.client.response;

import io.gopluslabs.client.model.ResponseWrapperNftLockerResponse;
import net.kemitix.mon.TypeAlias;

public class LocksLpv3Info extends TypeAlias<ResponseWrapperNftLockerResponse> {
    protected LocksLpv3Info(final ResponseWrapperNftLockerResponse value) {
        super(value);
    }

    public static LocksLpv3Info of(final ResponseWrapperNftLockerResponse response) {
        return new LocksLpv3Info(response);
    }
}
