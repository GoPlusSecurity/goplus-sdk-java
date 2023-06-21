package io.gopluslabs.client.response;

import io.gopluslabs.client.model.ResponseWrapperDappContractSecurityResponse;
import net.kemitix.mon.TypeAlias;

public class DappContractSecurity extends TypeAlias<ResponseWrapperDappContractSecurityResponse> {
    protected DappContractSecurity(final ResponseWrapperDappContractSecurityResponse value) {
        super(value);
    }
    public static DappContractSecurity of(final ResponseWrapperDappContractSecurityResponse response){
        return new DappContractSecurity(response);
    }
}
