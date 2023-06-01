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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * GetAccessTokenRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-01T03:47:02.843655311Z[Etc/UTC]")
public class GetAccessTokenRequest {
  @SerializedName("app_key")
  private String appKey = null;

  @SerializedName("sign")
  private String sign = null;

  @SerializedName("time")
  private Long time = null;

  public GetAccessTokenRequest appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * app_key
   * @return appKey
  **/
  @Schema(required = true, description = "app_key")
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public GetAccessTokenRequest sign(String sign) {
    this.sign = sign;
    return this;
  }

   /**
   * Concatenate app_key, time, app_secret in turn, and do sha1().app_key &#x3D; mBOMg20QW11BbtyH4Zh0 \\n\&quot; +             \&quot;time &#x3D; 1647847498 \\n\&quot; +             \&quot;app_secret &#x3D; V6aRfxlPJwN3ViJSIFSCdxPvneajuJsh \\n\&quot; +             \&quot;sign &#x3D; sha1(mBOMg20QW11BbtyH4Zh01647847498V6aRfxlPJwN3ViJSIFSCdxPvneajuJsh)\\n\&quot; +             \&quot;        &#x3D; 7293d385b9225b3c3f232b76ba97255d0e21063e
   * @return sign
  **/
  @Schema(required = true, description = "Concatenate app_key, time, app_secret in turn, and do sha1().app_key = mBOMg20QW11BbtyH4Zh0 \\n\" +             \"time = 1647847498 \\n\" +             \"app_secret = V6aRfxlPJwN3ViJSIFSCdxPvneajuJsh \\n\" +             \"sign = sha1(mBOMg20QW11BbtyH4Zh01647847498V6aRfxlPJwN3ViJSIFSCdxPvneajuJsh)\\n\" +             \"        = 7293d385b9225b3c3f232b76ba97255d0e21063e")
  public String getSign() {
    return sign;
  }

  public void setSign(String sign) {
    this.sign = sign;
  }

  public GetAccessTokenRequest time(Long time) {
    this.time = time;
    return this;
  }

   /**
   * Quest timestamp (Second)
   * @return time
  **/
  @Schema(required = true, description = "Quest timestamp (Second)")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccessTokenRequest getAccessTokenRequest = (GetAccessTokenRequest) o;
    return Objects.equals(this.appKey, getAccessTokenRequest.appKey) &&
        Objects.equals(this.sign, getAccessTokenRequest.sign) &&
        Objects.equals(this.time, getAccessTokenRequest.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appKey, sign, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccessTokenRequest {\n");
    
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    sign: ").append(toIndentedString(sign)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
