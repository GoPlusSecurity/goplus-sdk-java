package io.gopluslabs.client.response;

import io.gopluslabs.client.model.ResponseWrapperPhishingSite;
import net.kemitix.mon.TypeAlias;

public class PhishingSite extends TypeAlias<ResponseWrapperPhishingSite> {
    protected PhishingSite(final ResponseWrapperPhishingSite value) {
        super(value);
    }

    public static PhishingSite of(final ResponseWrapperPhishingSite response){
        return new PhishingSite(response);
    }
}
