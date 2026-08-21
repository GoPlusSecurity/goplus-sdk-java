package io.gopluslabs.client.response;

import io.gopluslabs.client.model.ResponseWrapperDustAttackDetection;
import net.kemitix.mon.TypeAlias;

public class DustAttackDetection extends TypeAlias<ResponseWrapperDustAttackDetection> {
    protected DustAttackDetection(final ResponseWrapperDustAttackDetection value) {
        super(value);
    }

    public static DustAttackDetection of(final ResponseWrapperDustAttackDetection response) {
        return new DustAttackDetection(response);
    }
}
