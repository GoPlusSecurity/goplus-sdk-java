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

package io.gopluslabs.client.model;

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
 * It indicates whether the token is a counterfeit of a mainstream asset. (If there is no evidence indicating that it is a counterfeit asset, there will be no return.)
 */
@Schema(description = "It indicates whether the token is a counterfeit of a mainstream asset. (If there is no evidence indicating that it is a counterfeit asset, there will be no return.)")


public class ResponseWrapperTokenSecurityFakeToken {
  @SerializedName("true_token_address")
  private String trueTokenAddress = null;

  @SerializedName("value")
  private Integer value = null;

  public ResponseWrapperTokenSecurityFakeToken trueTokenAddress(String trueTokenAddress) {
    this.trueTokenAddress = trueTokenAddress;
    return this;
  }

   /**
   * If the value is set to 1, and true_token_address is the address of the authentic mainstream asset that the token is imitating on this public chain. If there are multiple mainstream assets with the same name, they will be separated by commas.
   * @return trueTokenAddress
  **/
  @Schema(description = "If the value is set to 1, and true_token_address is the address of the authentic mainstream asset that the token is imitating on this public chain. If there are multiple mainstream assets with the same name, they will be separated by commas.")
  public String getTrueTokenAddress() {
    return trueTokenAddress;
  }

  public void setTrueTokenAddress(String trueTokenAddress) {
    this.trueTokenAddress = trueTokenAddress;
  }

  public ResponseWrapperTokenSecurityFakeToken value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * If the value is set to 1, and true_token_address is the address of the authentic mainstream asset that the token is imitating on this public chain. If there are multiple mainstream assets with the same name, they will be separated by commas.
   * @return value
  **/
  @Schema(description = "If the value is set to 1, and true_token_address is the address of the authentic mainstream asset that the token is imitating on this public chain. If there are multiple mainstream assets with the same name, they will be separated by commas.")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseWrapperTokenSecurityFakeToken responseWrapperTokenSecurityFakeToken = (ResponseWrapperTokenSecurityFakeToken) o;
    return Objects.equals(this.trueTokenAddress, responseWrapperTokenSecurityFakeToken.trueTokenAddress) &&
        Objects.equals(this.value, responseWrapperTokenSecurityFakeToken.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trueTokenAddress, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWrapperTokenSecurityFakeToken {\n");
    
    sb.append("    trueTokenAddress: ").append(toIndentedString(trueTokenAddress)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
