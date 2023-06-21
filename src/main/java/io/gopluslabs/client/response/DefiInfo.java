package io.gopluslabs.client.response;

import io.gopluslabs.client.model.GetDefiInfoResponse;
import net.kemitix.mon.TypeAlias;

public class DefiInfo extends TypeAlias<GetDefiInfoResponse> {
    protected DefiInfo(final GetDefiInfoResponse value) {
        super(value);
    }
    public static DefiInfo of(final GetDefiInfoResponse response){
        return new DefiInfo(response);
    }
}
