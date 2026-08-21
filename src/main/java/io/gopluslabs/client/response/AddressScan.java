package io.gopluslabs.client.response;

import io.gopluslabs.client.model.ResponseWrapperOpenScanAddressResp;
import net.kemitix.mon.TypeAlias;

public class AddressScan extends TypeAlias<ResponseWrapperOpenScanAddressResp> {
    protected AddressScan(final ResponseWrapperOpenScanAddressResp value) {
        super(value);
    }

    public static AddressScan of(final ResponseWrapperOpenScanAddressResp response) {
        return new AddressScan(response);
    }
}
