package io.gopluslabs.client.response;

import io.gopluslabs.client.model.ResponseWrapperContractApproveResponse;
import net.kemitix.mon.TypeAlias;

public class ContractApprove extends TypeAlias<ResponseWrapperContractApproveResponse> {

    protected ContractApprove(final ResponseWrapperContractApproveResponse value) {
        super(value);
    }

    public static ContractApprove of(final  ResponseWrapperContractApproveResponse response){
        return new ContractApprove(response);
    }
}
