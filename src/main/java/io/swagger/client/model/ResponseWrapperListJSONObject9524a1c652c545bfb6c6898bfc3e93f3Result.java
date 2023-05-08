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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ResponseWrapperListJSONObject9524a1c652c545bfb6c6898bfc3e93f3Result
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-08T09:37:56.615797436Z[Etc/UTC]")
public class ResponseWrapperListJSONObject9524a1c652c545bfb6c6898bfc3e93f3Result {
  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  public ResponseWrapperListJSONObject9524a1c652c545bfb6c6898bfc3e93f3Result name(String name) {
    this.name = name;
    return this;
  }

   /**
   * chain name
   * @return name
  **/
  @Schema(description = "chain name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResponseWrapperListJSONObject9524a1c652c545bfb6c6898bfc3e93f3Result id(String id) {
    this.id = id;
    return this;
  }

   /**
   * chain id
   * @return id
  **/
  @Schema(description = "chain id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseWrapperListJSONObject9524a1c652c545bfb6c6898bfc3e93f3Result responseWrapperListJSONObject9524a1c652c545bfb6c6898bfc3e93f3Result = (ResponseWrapperListJSONObject9524a1c652c545bfb6c6898bfc3e93f3Result) o;
    return Objects.equals(this.name, responseWrapperListJSONObject9524a1c652c545bfb6c6898bfc3e93f3Result.name) &&
        Objects.equals(this.id, responseWrapperListJSONObject9524a1c652c545bfb6c6898bfc3e93f3Result.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWrapperListJSONObject9524a1c652c545bfb6c6898bfc3e93f3Result {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
