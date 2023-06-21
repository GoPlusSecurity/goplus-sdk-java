package io.gopluslabs.client.response;

import io.gopluslabs.client.model.ResponseWrapperListGetChainsList;
import net.kemitix.mon.TypeAlias;

public class ChainsList extends TypeAlias<ResponseWrapperListGetChainsList> {
    protected ChainsList(final ResponseWrapperListGetChainsList value) {
        super(value);
    }

    public static ChainsList of(final ResponseWrapperListGetChainsList response){
        return new ChainsList(response);
    }
}
