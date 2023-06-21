package io.gopluslabs.client.response;

import io.gopluslabs.client.model.ResponseWrapperListApproveNFT1155ListResponse;
import net.kemitix.mon.TypeAlias;

public class ApproveNFT1155List extends TypeAlias<ResponseWrapperListApproveNFT1155ListResponse> {
    protected ApproveNFT1155List(final ResponseWrapperListApproveNFT1155ListResponse value) {
        super(value);
    }

    public static ApproveNFT1155List of(final ResponseWrapperListApproveNFT1155ListResponse response){
        return new ApproveNFT1155List(response);
    }
}
