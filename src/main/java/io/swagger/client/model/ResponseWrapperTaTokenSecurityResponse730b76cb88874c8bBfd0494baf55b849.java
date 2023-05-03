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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bbfd0494baf55b849Result;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bBfd0494baf55b849
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-03T14:50:35.366778228Z[Etc/UTC]")
public class ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bBfd0494baf55b849 {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("result")
  private ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bbfd0494baf55b849Result result = null;

  public ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bBfd0494baf55b849 code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Code 1：Success
   * @return code
  **/
  @Schema(description = "Code 1：Success")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bBfd0494baf55b849 message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Response message
   * @return message
  **/
  @Schema(description = "Response message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bBfd0494baf55b849 result(ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bbfd0494baf55b849Result result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @Schema(description = "")
  public ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bbfd0494baf55b849Result getResult() {
    return result;
  }

  public void setResult(ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bbfd0494baf55b849Result result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bBfd0494baf55b849 responseWrapperTaTokenSecurityResponse730b76cb88874c8bBfd0494baf55b849 = (ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bBfd0494baf55b849) o;
    return Objects.equals(this.code, responseWrapperTaTokenSecurityResponse730b76cb88874c8bBfd0494baf55b849.code) &&
        Objects.equals(this.message, responseWrapperTaTokenSecurityResponse730b76cb88874c8bBfd0494baf55b849.message) &&
        Objects.equals(this.result, responseWrapperTaTokenSecurityResponse730b76cb88874c8bBfd0494baf55b849.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWrapperTaTokenSecurityResponse730b76cb88874c8bBfd0494baf55b849 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
