package io.gopluslabs.client.response;

import io.gopluslabs.client.model.ResponseWrapperGetScanResult;
import net.kemitix.mon.TypeAlias;

public class AddressScanResult extends TypeAlias<ResponseWrapperGetScanResult> {
    protected AddressScanResult(final ResponseWrapperGetScanResult value) {
        super(value);
    }

    public static AddressScanResult of(final ResponseWrapperGetScanResult response) {
        return new AddressScanResult(response);
    }
}
