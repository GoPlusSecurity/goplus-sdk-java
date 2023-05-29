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
 * { value: owner_address: owner_type }It describes whether this NFT contract can self destruct. (Notice:When the self-destruct function is triggered, this contract will be destroyed, all functions will be unavailable, and all related assets will be erased.)
 */
@Schema(description = "{ value: owner_address: owner_type }It describes whether this NFT contract can self destruct. (Notice:When the self-destruct function is triggered, this contract will be destroyed, all functions will be unavailable, and all related assets will be erased.)")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-29T10:07:43.604473306Z[Etc/UTC]")
public class ResponseWrapperGetNftInfoResultSelfDestruct {
  @SerializedName("owner_address")
  private String ownerAddress = null;

  @SerializedName("value")
  private Integer value = null;

  @SerializedName("owner_type")
  private String ownerType = null;

  public ResponseWrapperGetNftInfoResultSelfDestruct ownerAddress(String ownerAddress) {
    this.ownerAddress = ownerAddress;
    return this;
  }

   /**
   * Owner_address describes the owner address.  null: the owner address cannot be fetched.
   * @return ownerAddress
  **/
  @Schema(description = "Owner_address describes the owner address.  null: the owner address cannot be fetched.")
  public String getOwnerAddress() {
    return ownerAddress;
  }

  public void setOwnerAddress(String ownerAddress) {
    this.ownerAddress = ownerAddress;
  }

  public ResponseWrapperGetNftInfoResultSelfDestruct value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * The \&quot;value\&quot; describes the status of the risk. null: the contract is not open source or there is a proxy, it is not possible to detect whether the risk exists. -1: the risk is detected but the ownership give up. If the detection of a code vulnerability, it can also be considered risk-free.  0: the risk is not detected.  1: the risk is detected, and the owner address is a common address (EOA), then it can be said that there is a clear risk.  2: The risk is detected, but the owner address is a contract address, the risk is not significant.  3: The risk is detected, but the owner address is not detectable / or an array. 
   * @return value
  **/
  @Schema(description = "The \"value\" describes the status of the risk. null: the contract is not open source or there is a proxy, it is not possible to detect whether the risk exists. -1: the risk is detected but the ownership give up. If the detection of a code vulnerability, it can also be considered risk-free.  0: the risk is not detected.  1: the risk is detected, and the owner address is a common address (EOA), then it can be said that there is a clear risk.  2: The risk is detected, but the owner address is a contract address, the risk is not significant.  3: The risk is detected, but the owner address is not detectable / or an array. ")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public ResponseWrapperGetNftInfoResultSelfDestruct ownerType(String ownerType) {
    this.ownerType = ownerType;
    return this;
  }

   /**
   * \&quot;blackhole\&quot; : the owner is a blackhole address. \&quot;contract\&quot; : the owner is a contract. \&quot;eoa\&quot; : the owner is a common address (eoa). \&quot;multi-address\&quot;: the owner is an array/list. null: the address is not detected.
   * @return ownerType
  **/
  @Schema(description = "\"blackhole\" : the owner is a blackhole address. \"contract\" : the owner is a contract. \"eoa\" : the owner is a common address (eoa). \"multi-address\": the owner is an array/list. null: the address is not detected.")
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
    ResponseWrapperGetNftInfoResultSelfDestruct responseWrapperGetNftInfoResultSelfDestruct = (ResponseWrapperGetNftInfoResultSelfDestruct) o;
    return Objects.equals(this.ownerAddress, responseWrapperGetNftInfoResultSelfDestruct.ownerAddress) &&
        Objects.equals(this.value, responseWrapperGetNftInfoResultSelfDestruct.value) &&
        Objects.equals(this.ownerType, responseWrapperGetNftInfoResultSelfDestruct.ownerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerAddress, value, ownerType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWrapperGetNftInfoResultSelfDestruct {\n");
    
    sb.append("    ownerAddress: ").append(toIndentedString(ownerAddress)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
