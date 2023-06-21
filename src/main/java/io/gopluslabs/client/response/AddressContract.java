package io.gopluslabs.client.response;

import io.gopluslabs.client.model.ResponseWrapperAddressContract;
import net.kemitix.mon.TypeAlias;

public class AddressContract extends TypeAlias<ResponseWrapperAddressContract> {
    protected AddressContract(final ResponseWrapperAddressContract value) {
        super(value);
    }

    public static AddressContract of(final ResponseWrapperAddressContract response){
        return new AddressContract(response);
    }
}
