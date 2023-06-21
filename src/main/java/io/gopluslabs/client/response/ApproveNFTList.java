package io.gopluslabs.client.response;

import io.gopluslabs.client.model.ResponseWrapperListApproveNFTListResponse;
import net.kemitix.mon.TypeAlias;

public class ApproveNFTList extends TypeAlias<ResponseWrapperListApproveNFTListResponse> {
    protected ApproveNFTList(final ResponseWrapperListApproveNFTListResponse value) {
        super(value);
    }

    public static ApproveNFTList of(final ResponseWrapperListApproveNFTListResponse response){
        return new ApproveNFTList(response);
    }
}
