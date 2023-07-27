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
 * It describes whether the NFT owner can transfer NFT without approval.(Notice:Transfer_without_approval generally means the scammer does not need to get approvals to transfer another address&#x27;s NFT. One typical example is sleep_minting. Sleep_minting means that the scammer will first add the NFT to a well-known wallet address and then retrieve the NFT. After the value of the NFT has appreciated , it will be put back on the market.)
 */
@Schema(description = "It describes whether the NFT owner can transfer NFT without approval.(Notice:Transfer_without_approval generally means the scammer does not need to get approvals to transfer another address's NFT. One typical example is sleep_minting. Sleep_minting means that the scammer will first add the NFT to a well-known wallet address and then retrieve the NFT. After the value of the NFT has appreciated , it will be put back on the market.)")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-27T08:37:03.140494914Z[Etc/UTC]")

public class ResponseWrapperGetNftInfoResultTransferWithoutApproval {
  @SerializedName("owner_address")
  private String ownerAddress = null;

  @SerializedName("value")
  private Integer value = null;

  @SerializedName("owner_type")
  private String ownerType = null;

  public ResponseWrapperGetNftInfoResultTransferWithoutApproval ownerAddress(String ownerAddress) {
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

  public ResponseWrapperGetNftInfoResultTransferWithoutApproval value(Integer value) {
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

  public ResponseWrapperGetNftInfoResultTransferWithoutApproval ownerType(String ownerType) {
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
    ResponseWrapperGetNftInfoResultTransferWithoutApproval responseWrapperGetNftInfoResultTransferWithoutApproval = (ResponseWrapperGetNftInfoResultTransferWithoutApproval) o;
    return Objects.equals(this.ownerAddress, responseWrapperGetNftInfoResultTransferWithoutApproval.ownerAddress) &&
        Objects.equals(this.value, responseWrapperGetNftInfoResultTransferWithoutApproval.value) &&
        Objects.equals(this.ownerType, responseWrapperGetNftInfoResultTransferWithoutApproval.ownerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerAddress, value, ownerType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWrapperGetNftInfoResultTransferWithoutApproval {\n");
    
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
