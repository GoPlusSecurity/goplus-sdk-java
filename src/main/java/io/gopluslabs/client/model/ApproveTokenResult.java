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
import io.gopluslabs.client.model.ApproveAddressInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ApproveTokenResult
 */



public class ApproveTokenResult {
  @SerializedName("address_info")
  private ApproveAddressInfo addressInfo = null;

  @SerializedName("approved_amount")
  private String approvedAmount = null;

  @SerializedName("approved_contract")
  private String approvedContract = null;

  @SerializedName("approved_time")
  private Long approvedTime = null;

  @SerializedName("hash")
  private String hash = null;

  @SerializedName("initial_approval_hash")
  private String initialApprovalHash = null;

  @SerializedName("initial_approval_time")
  private Long initialApprovalTime = null;

  public ApproveTokenResult addressInfo(ApproveAddressInfo addressInfo) {
    this.addressInfo = addressInfo;
    return this;
  }

   /**
   * Get addressInfo
   * @return addressInfo
  **/
  @Schema(description = "")
  public ApproveAddressInfo getAddressInfo() {
    return addressInfo;
  }

  public void setAddressInfo(ApproveAddressInfo addressInfo) {
    this.addressInfo = addressInfo;
  }

  public ApproveTokenResult approvedAmount(String approvedAmount) {
    this.approvedAmount = approvedAmount;
    return this;
  }

   /**
   * Allowance of the spender
   * @return approvedAmount
  **/
  @Schema(description = "Allowance of the spender")
  public String getApprovedAmount() {
    return approvedAmount;
  }

  public void setApprovedAmount(String approvedAmount) {
    this.approvedAmount = approvedAmount;
  }

  public ApproveTokenResult approvedContract(String approvedContract) {
    this.approvedContract = approvedContract;
    return this;
  }

   /**
   * Spender Address
   * @return approvedContract
  **/
  @Schema(description = "Spender Address")
  public String getApprovedContract() {
    return approvedContract;
  }

  public void setApprovedContract(String approvedContract) {
    this.approvedContract = approvedContract;
  }

  public ApproveTokenResult approvedTime(Long approvedTime) {
    this.approvedTime = approvedTime;
    return this;
  }

   /**
   * Latest approval time
   * @return approvedTime
  **/
  @Schema(description = "Latest approval time")
  public Long getApprovedTime() {
    return approvedTime;
  }

  public void setApprovedTime(Long approvedTime) {
    this.approvedTime = approvedTime;
  }

  public ApproveTokenResult hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * Latest approval hash
   * @return hash
  **/
  @Schema(description = "Latest approval hash")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public ApproveTokenResult initialApprovalHash(String initialApprovalHash) {
    this.initialApprovalHash = initialApprovalHash;
    return this;
  }

   /**
   * Initial approval hash
   * @return initialApprovalHash
  **/
  @Schema(description = "Initial approval hash")
  public String getInitialApprovalHash() {
    return initialApprovalHash;
  }

  public void setInitialApprovalHash(String initialApprovalHash) {
    this.initialApprovalHash = initialApprovalHash;
  }

  public ApproveTokenResult initialApprovalTime(Long initialApprovalTime) {
    this.initialApprovalTime = initialApprovalTime;
    return this;
  }

   /**
   * Initial approval time
   * @return initialApprovalTime
  **/
  @Schema(description = "Initial approval time")
  public Long getInitialApprovalTime() {
    return initialApprovalTime;
  }

  public void setInitialApprovalTime(Long initialApprovalTime) {
    this.initialApprovalTime = initialApprovalTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApproveTokenResult approveTokenResult = (ApproveTokenResult) o;
    return Objects.equals(this.addressInfo, approveTokenResult.addressInfo) &&
        Objects.equals(this.approvedAmount, approveTokenResult.approvedAmount) &&
        Objects.equals(this.approvedContract, approveTokenResult.approvedContract) &&
        Objects.equals(this.approvedTime, approveTokenResult.approvedTime) &&
        Objects.equals(this.hash, approveTokenResult.hash) &&
        Objects.equals(this.initialApprovalHash, approveTokenResult.initialApprovalHash) &&
        Objects.equals(this.initialApprovalTime, approveTokenResult.initialApprovalTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressInfo, approvedAmount, approvedContract, approvedTime, hash, initialApprovalHash, initialApprovalTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApproveTokenResult {\n");
    
    sb.append("    addressInfo: ").append(toIndentedString(addressInfo)).append("\n");
    sb.append("    approvedAmount: ").append(toIndentedString(approvedAmount)).append("\n");
    sb.append("    approvedContract: ").append(toIndentedString(approvedContract)).append("\n");
    sb.append("    approvedTime: ").append(toIndentedString(approvedTime)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    initialApprovalHash: ").append(toIndentedString(initialApprovalHash)).append("\n");
    sb.append("    initialApprovalTime: ").append(toIndentedString(initialApprovalTime)).append("\n");
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
