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
 * When there is no owner function, or the ownership is unreadable or private, it would return empty. \&quot;owner\&quot;: {  }
 */
@Schema(description = "When there is no owner function, or the ownership is unreadable or private, it would return empty. \"owner\": {  }")


public class GetDefiInfoResponseResultOwner {
  @SerializedName("owner_name")
  private String ownerName = null;

  @SerializedName("owner_address")
  private String ownerAddress = null;

  @SerializedName("owner_type")
  private String ownerType = null;

  public GetDefiInfoResponseResultOwner ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

   /**
   * the function name of ownership.  If there is no return, means unknown.
   * @return ownerName
  **/
  @Schema(description = "the function name of ownership.  If there is no return, means unknown.")
  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public GetDefiInfoResponseResultOwner ownerAddress(String ownerAddress) {
    this.ownerAddress = ownerAddress;
    return this;
  }

   /**
   * owner address of the contract.  No return means unknown.
   * @return ownerAddress
  **/
  @Schema(description = "owner address of the contract.  No return means unknown.")
  public String getOwnerAddress() {
    return ownerAddress;
  }

  public void setOwnerAddress(String ownerAddress) {
    this.ownerAddress = ownerAddress;
  }

  public GetDefiInfoResponseResultOwner ownerType(String ownerType) {
    this.ownerType = ownerType;
    return this;
  }

   /**
   * blackhole\&quot; : the owner is a blackhole address. \&quot;contract\&quot; : the owner is a contract. \&quot;eoa\&quot; : the owner is a common address (eoa). \&quot;multi-address\&quot;: the owner is an array/list. null: the address is not detected. No return means unknown.
   * @return ownerType
  **/
  @Schema(description = "blackhole\" : the owner is a blackhole address. \"contract\" : the owner is a contract. \"eoa\" : the owner is a common address (eoa). \"multi-address\": the owner is an array/list. null: the address is not detected. No return means unknown.")
  public String getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(String ownerType) {
    this.ownerType = ownerType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDefiInfoResponseResultOwner getDefiInfoResponseResultOwner = (GetDefiInfoResponseResultOwner) o;
    return Objects.equals(this.ownerName, getDefiInfoResponseResultOwner.ownerName) &&
        Objects.equals(this.ownerAddress, getDefiInfoResponseResultOwner.ownerAddress) &&
        Objects.equals(this.ownerType, getDefiInfoResponseResultOwner.ownerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerName, ownerAddress, ownerType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDefiInfoResponseResultOwner {\n");
    
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    ownerAddress: ").append(toIndentedString(ownerAddress)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
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
