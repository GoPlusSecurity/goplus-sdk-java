/*
 * GoPlus Security API Document
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.gopluslabs.client.api;

import io.gopluslabs.client.ApiCallback;
import io.gopluslabs.client.ApiClient;
import io.gopluslabs.client.ApiException;
import io.gopluslabs.client.ApiResponse;
import io.gopluslabs.client.Configuration;
import io.gopluslabs.client.Pair;
import io.gopluslabs.client.ProgressRequestBody;
import io.gopluslabs.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.gopluslabs.client.model.ParseAbiDataRequest;
import io.gopluslabs.client.model.ResponseWrapperParseAbiDataResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContractAbiControllerApi {
    private ApiClient apiClient;

    public ContractAbiControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContractAbiControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAbiDataInfoUsingPOST
     * @param body abiDataRequest (required)
     * @param authorization Authorization (test: Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW...) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAbiDataInfoUsingPOSTCall(ParseAbiDataRequest body, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/v1/abi/input_decode";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAbiDataInfoUsingPOSTValidateBeforeCall(ParseAbiDataRequest body, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling getAbiDataInfoUsingPOST(Async)");
        }
        
        com.squareup.okhttp.Call call = getAbiDataInfoUsingPOSTCall(body, authorization, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get abi decode info
     * 
     * @param body abiDataRequest (required)
     * @param authorization Authorization (test: Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW...) (optional)
     * @return ResponseWrapperParseAbiDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseWrapperParseAbiDataResponse getAbiDataInfoUsingPOST(ParseAbiDataRequest body, String authorization) throws ApiException {
        ApiResponse<ResponseWrapperParseAbiDataResponse> resp = getAbiDataInfoUsingPOSTWithHttpInfo(body, authorization);
        return resp.getData();
    }

    /**
     * Get abi decode info
     * 
     * @param body abiDataRequest (required)
     * @param authorization Authorization (test: Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW...) (optional)
     * @return ApiResponse&lt;ResponseWrapperParseAbiDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseWrapperParseAbiDataResponse> getAbiDataInfoUsingPOSTWithHttpInfo(ParseAbiDataRequest body, String authorization) throws ApiException {
        com.squareup.okhttp.Call call = getAbiDataInfoUsingPOSTValidateBeforeCall(body, authorization, null, null);
        Type localVarReturnType = new TypeToken<ResponseWrapperParseAbiDataResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get abi decode info (asynchronously)
     * 
     * @param body abiDataRequest (required)
     * @param authorization Authorization (test: Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW...) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAbiDataInfoUsingPOSTAsync(ParseAbiDataRequest body, String authorization, final ApiCallback<ResponseWrapperParseAbiDataResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAbiDataInfoUsingPOSTValidateBeforeCall(body, authorization, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseWrapperParseAbiDataResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
