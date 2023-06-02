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
 * ApproveResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-02T06:35:16.334290770Z[Etc/UTC]")
public class ApproveResult {
  @SerializedName("address_info")
  private ApproveAddressInfo addressInfo = null;

  @SerializedName("approved_contract")
  private String approvedContract = null;

  @SerializedName("approved_for_all")
  private Integer approvedForAll = null;

  @SerializedName("approved_time")
  private Long approvedTime = null;

  @SerializedName("approved_token_id")
  private String approvedTokenId = null;

  @SerializedName("hash")
  private String hash = null;

  @SerializedName("initial_approval_hash")
  private String initialApprovalHash = null;

  @SerializedName("initial_approval_time")
  private Long initialApprovalTime = null;

  public ApproveResult addressInfo(ApproveAddressInfo addressInfo) {
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

  public ApproveResult approvedContract(String approvedContract) {
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

  public ApproveResult approvedForAll(Integer approvedForAll) {
    this.approvedForAll = approvedForAll;
    return this;
  }

   /**
   * Approval type: \&quot;1\&quot; means \&quot;approved for all\&quot;; \&quot;0\&quot; means \&quot;approved for single NFT\&quot;
   * @return approvedForAll
  **/
  @Schema(description = "Approval type: \"1\" means \"approved for all\"; \"0\" means \"approved for single NFT\"")
  public Integer getApprovedForAll() {
    return approvedForAll;
  }

  public void setApprovedForAll(Integer approvedForAll) {
    this.approvedForAll = approvedForAll;
  }

  public ApproveResult approvedTime(Long approvedTime) {
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

  public ApproveResult approvedTokenId(String approvedTokenId) {
    this.approvedTokenId = approvedTokenId;
    return this;
  }

   /**
   * NFT token_id
   * @return approvedTokenId
  **/
  @Schema(description = "NFT token_id")
  public String getApprovedTokenId() {
    return approvedTokenId;
  }

  public void setApprovedTokenId(String approvedTokenId) {
    this.approvedTokenId = approvedTokenId;
  }

  public ApproveResult hash(String hash) {
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

  public ApproveResult initialApprovalHash(String initialApprovalHash) {
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

  public ApproveResult initialApprovalTime(Long initialApprovalTime) {
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
    ApproveResult approveResult = (ApproveResult) o;
    return Objects.equals(this.addressInfo, approveResult.addressInfo) &&
        Objects.equals(this.approvedContract, approveResult.approvedContract) &&
        Objects.equals(this.approvedForAll, approveResult.approvedForAll) &&
        Objects.equals(this.approvedTime, approveResult.approvedTime) &&
        Objects.equals(this.approvedTokenId, approveResult.approvedTokenId) &&
        Objects.equals(this.hash, approveResult.hash) &&
        Objects.equals(this.initialApprovalHash, approveResult.initialApprovalHash) &&
        Objects.equals(this.initialApprovalTime, approveResult.initialApprovalTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressInfo, approvedContract, approvedForAll, approvedTime, approvedTokenId, hash, initialApprovalHash, initialApprovalTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApproveResult {\n");
    
    sb.append("    addressInfo: ").append(toIndentedString(addressInfo)).append("\n");
    sb.append("    approvedContract: ").append(toIndentedString(approvedContract)).append("\n");
    sb.append("    approvedForAll: ").append(toIndentedString(approvedForAll)).append("\n");
    sb.append("    approvedTime: ").append(toIndentedString(approvedTime)).append("\n");
    sb.append("    approvedTokenId: ").append(toIndentedString(approvedTokenId)).append("\n");
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
