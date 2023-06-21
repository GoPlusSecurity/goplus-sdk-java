package io.gopluslabs.client.response;

import io.gopluslabs.client.model.ResponseWrapperListApproveTokenOutListResponse;
import net.kemitix.mon.TypeAlias;

public class ApproveTokenOutList extends TypeAlias<ResponseWrapperListApproveTokenOutListResponse> {
    protected ApproveTokenOutList(final ResponseWrapperListApproveTokenOutListResponse value) {
        super(value);
    }

    public static ApproveTokenOutList of(final ResponseWrapperListApproveTokenOutListResponse response){
        return new ApproveTokenOutList(response);
    }
}
