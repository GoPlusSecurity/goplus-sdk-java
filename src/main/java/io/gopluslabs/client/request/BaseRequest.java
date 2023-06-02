package io.gopluslabs.client.request;

public abstract class BaseRequest {

    protected String authorization;

    /**
     * timeout (MILLISECONDS)
     */
    protected Integer timeout;

    public String getAuthorization() {
        return authorization;
    }

    public Integer getTimeout() {
        return timeout;
    }
}
