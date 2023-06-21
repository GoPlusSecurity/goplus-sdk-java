package io.gopluslabs.client.response;

import io.gopluslabs.client.model.ResponseWrapperGetNftInfo;
import net.kemitix.mon.TypeAlias;

public class NftInfo extends TypeAlias<ResponseWrapperGetNftInfo> {
    protected NftInfo(final ResponseWrapperGetNftInfo value) {
        super(value);
    }

    public static NftInfo of(final ResponseWrapperGetNftInfo response){
        return new NftInfo(response);
    }
}
