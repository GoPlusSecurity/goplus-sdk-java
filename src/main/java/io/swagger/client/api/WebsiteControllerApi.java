/*
 * GoPlus Security API Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.ResponseWrapperMapstringstring2a740de0Be5a4eb3B6e4A2cf0a2d8bf8;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebsiteControllerApi {
    private ApiClient apiClient;

    public WebsiteControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WebsiteControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for phishingSiteUsingGET
     * @param url Url (required)
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW...) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call phishingSiteUsingGETCall(String url, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/phishing_site";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (url != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("url", url));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call phishingSiteUsingGETValidateBeforeCall(String url, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'url' is set
        if (url == null) {
            throw new ApiException("Missing the required parameter 'url' when calling phishingSiteUsingGET(Async)");
        }
        
        com.squareup.okhttp.Call call = phishingSiteUsingGETCall(url, authorization, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Check if the the url is a phishing site
     * 
     * @param url Url (required)
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW...) (optional)
     * @return ResponseWrapperMapstringstring2a740de0Be5a4eb3B6e4A2cf0a2d8bf8
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseWrapperMapstringstring2a740de0Be5a4eb3B6e4A2cf0a2d8bf8 phishingSiteUsingGET(String url, String authorization) throws ApiException {
        ApiResponse<ResponseWrapperMapstringstring2a740de0Be5a4eb3B6e4A2cf0a2d8bf8> resp = phishingSiteUsingGETWithHttpInfo(url, authorization);
        return resp.getData();
    }

    /**
     * Check if the the url is a phishing site
     * 
     * @param url Url (required)
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW...) (optional)
     * @return ApiResponse&lt;ResponseWrapperMapstringstring2a740de0Be5a4eb3B6e4A2cf0a2d8bf8&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseWrapperMapstringstring2a740de0Be5a4eb3B6e4A2cf0a2d8bf8> phishingSiteUsingGETWithHttpInfo(String url, String authorization) throws ApiException {
        com.squareup.okhttp.Call call = phishingSiteUsingGETValidateBeforeCall(url, authorization, null, null);
        Type localVarReturnType = new TypeToken<ResponseWrapperMapstringstring2a740de0Be5a4eb3B6e4A2cf0a2d8bf8>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Check if the the url is a phishing site (asynchronously)
     * 
     * @param url Url (required)
     * @param authorization Authorization (test：Bearer 81|9ihH8JzEuFu4MQ9DjWmH5WrNCPW...) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call phishingSiteUsingGETAsync(String url, String authorization, final ApiCallback<ResponseWrapperMapstringstring2a740de0Be5a4eb3B6e4A2cf0a2d8bf8> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = phishingSiteUsingGETValidateBeforeCall(url, authorization, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseWrapperMapstringstring2a740de0Be5a4eb3B6e4A2cf0a2d8bf8>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
