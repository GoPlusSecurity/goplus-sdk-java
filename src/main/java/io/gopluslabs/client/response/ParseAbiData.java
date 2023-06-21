package io.gopluslabs.client.response;

import io.gopluslabs.client.model.ResponseWrapperParseAbiDataResponse;
import net.kemitix.mon.TypeAlias;

public class ParseAbiData extends TypeAlias<ResponseWrapperParseAbiDataResponse> {
    protected ParseAbiData(final ResponseWrapperParseAbiDataResponse value) {
        super(value);
    }

    public static ParseAbiData of(final ResponseWrapperParseAbiDataResponse response){
        return new ParseAbiData(response);
    }
}
