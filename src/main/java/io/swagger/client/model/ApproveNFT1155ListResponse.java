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
import io.swagger.client.model.ApproveErc1155Result;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ApproveNFT1155ListResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-01T03:47:02.843655311Z[Etc/UTC]")
public class ApproveNFT1155ListResponse {
  @SerializedName("approved_list")
  private List<ApproveErc1155Result> approvedList = null;

  @SerializedName("chain_id")
  private String chainId = null;

  @SerializedName("is_open_source")
  private Integer isOpenSource = null;

  @SerializedName("is_verified")
  private Integer isVerified = null;

  @SerializedName("malicious_address")
  private Integer maliciousAddress = null;

  @SerializedName("malicious_behavior")
  private List<String> maliciousBehavior = null;

  @SerializedName("nft_address")
  private String nftAddress = null;

  @SerializedName("nft_name")
  private String nftName = null;

  @SerializedName("nft_symbol")
  private String nftSymbol = null;

  public ApproveNFT1155ListResponse approvedList(List<ApproveErc1155Result> approvedList) {
    this.approvedList = approvedList;
    return this;
  }

  public ApproveNFT1155ListResponse addApprovedListItem(ApproveErc1155Result approvedListItem) {
    if (this.approvedList == null) {
      this.approvedList = new ArrayList<ApproveErc1155Result>();
    }
    this.approvedList.add(approvedListItem);
    return this;
  }

   /**
   * Get approvedList
   * @return approvedList
  **/
  @Schema(description = "")
  public List<ApproveErc1155Result> getApprovedList() {
    return approvedList;
  }

  public void setApprovedList(List<ApproveErc1155Result> approvedList) {
    this.approvedList = approvedList;
  }

  public ApproveNFT1155ListResponse chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

   /**
   * ChainID
   * @return chainId
  **/
  @Schema(description = "ChainID")
  public String getChainId() {
    return chainId;
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }

  public ApproveNFT1155ListResponse isOpenSource(Integer isOpenSource) {
    this.isOpenSource = isOpenSource;
    return this;
  }

   /**
   * Whether the contract is verified on blockchain explorer.
   * @return isOpenSource
  **/
  @Schema(description = "Whether the contract is verified on blockchain explorer.")
  public Integer getIsOpenSource() {
    return isOpenSource;
  }

  public void setIsOpenSource(Integer isOpenSource) {
    this.isOpenSource = isOpenSource;
  }

  public ApproveNFT1155ListResponse isVerified(Integer isVerified) {
    this.isVerified = isVerified;
    return this;
  }

   /**
   * Whether NFT is certified on a reputable trading platform.
   * @return isVerified
  **/
  @Schema(description = "Whether NFT is certified on a reputable trading platform.")
  public Integer getIsVerified() {
    return isVerified;
  }

  public void setIsVerified(Integer isVerified) {
    this.isVerified = isVerified;
  }

  public ApproveNFT1155ListResponse maliciousAddress(Integer maliciousAddress) {
    this.maliciousAddress = maliciousAddress;
    return this;
  }

   /**
   * Whether the NFT is malicious or contains high risk.
   * @return maliciousAddress
  **/
  @Schema(description = "Whether the NFT is malicious or contains high risk.")
  public Integer getMaliciousAddress() {
    return maliciousAddress;
  }

  public void setMaliciousAddress(Integer maliciousAddress) {
    this.maliciousAddress = maliciousAddress;
  }

  public ApproveNFT1155ListResponse maliciousBehavior(List<String> maliciousBehavior) {
    this.maliciousBehavior = maliciousBehavior;
    return this;
  }

  public ApproveNFT1155ListResponse addMaliciousBehaviorItem(String maliciousBehaviorItem) {
    if (this.maliciousBehavior == null) {
      this.maliciousBehavior = new ArrayList<String>();
    }
    this.maliciousBehavior.add(maliciousBehaviorItem);
    return this;
  }

   /**
   * Specific malicious behaviors or risks of this NFT.
   * @return maliciousBehavior
  **/
  @Schema(description = "Specific malicious behaviors or risks of this NFT.")
  public List<String> getMaliciousBehavior() {
    return maliciousBehavior;
  }

  public void setMaliciousBehavior(List<String> maliciousBehavior) {
    this.maliciousBehavior = maliciousBehavior;
  }

  public ApproveNFT1155ListResponse nftAddress(String nftAddress) {
    this.nftAddress = nftAddress;
    return this;
  }

   /**
   * NFT address
   * @return nftAddress
  **/
  @Schema(description = "NFT address")
  public String getNftAddress() {
    return nftAddress;
  }

  public void setNftAddress(String nftAddress) {
    this.nftAddress = nftAddress;
  }

  public ApproveNFT1155ListResponse nftName(String nftName) {
    this.nftName = nftName;
    return this;
  }

   /**
   * NFT name
   * @return nftName
  **/
  @Schema(description = "NFT name")
  public String getNftName() {
    return nftName;
  }

  public void setNftName(String nftName) {
    this.nftName = nftName;
  }

  public ApproveNFT1155ListResponse nftSymbol(String nftSymbol) {
    this.nftSymbol = nftSymbol;
    return this;
  }

   /**
   * NFT symbol
   * @return nftSymbol
  **/
  @Schema(description = "NFT symbol")
  public String getNftSymbol() {
    return nftSymbol;
  }

  public void setNftSymbol(String nftSymbol) {
    this.nftSymbol = nftSymbol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApproveNFT1155ListResponse approveNFT1155ListResponse = (ApproveNFT1155ListResponse) o;
    return Objects.equals(this.approvedList, approveNFT1155ListResponse.approvedList) &&
        Objects.equals(this.chainId, approveNFT1155ListResponse.chainId) &&
        Objects.equals(this.isOpenSource, approveNFT1155ListResponse.isOpenSource) &&
        Objects.equals(this.isVerified, approveNFT1155ListResponse.isVerified) &&
        Objects.equals(this.maliciousAddress, approveNFT1155ListResponse.maliciousAddress) &&
        Objects.equals(this.maliciousBehavior, approveNFT1155ListResponse.maliciousBehavior) &&
        Objects.equals(this.nftAddress, approveNFT1155ListResponse.nftAddress) &&
        Objects.equals(this.nftName, approveNFT1155ListResponse.nftName) &&
        Objects.equals(this.nftSymbol, approveNFT1155ListResponse.nftSymbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvedList, chainId, isOpenSource, isVerified, maliciousAddress, maliciousBehavior, nftAddress, nftName, nftSymbol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApproveNFT1155ListResponse {\n");
    
    sb.append("    approvedList: ").append(toIndentedString(approvedList)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    isOpenSource: ").append(toIndentedString(isOpenSource)).append("\n");
    sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
    sb.append("    maliciousAddress: ").append(toIndentedString(maliciousAddress)).append("\n");
    sb.append("    maliciousBehavior: ").append(toIndentedString(maliciousBehavior)).append("\n");
    sb.append("    nftAddress: ").append(toIndentedString(nftAddress)).append("\n");
    sb.append("    nftName: ").append(toIndentedString(nftName)).append("\n");
    sb.append("    nftSymbol: ").append(toIndentedString(nftSymbol)).append("\n");
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
