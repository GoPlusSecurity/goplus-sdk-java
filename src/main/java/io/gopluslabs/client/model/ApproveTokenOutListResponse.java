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
import io.gopluslabs.client.model.ApproveTokenResult;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ApproveTokenOutListResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-27T08:37:03.140494914Z[Etc/UTC]")

public class ApproveTokenOutListResponse {
  @SerializedName("approved_list")
  private List<ApproveTokenResult> approvedList = null;

  @SerializedName("balance")
  private String balance = null;

  @SerializedName("chain_id")
  private String chainId = null;

  @SerializedName("decimals")
  private Integer decimals = null;

  @SerializedName("is_open_source")
  private Integer isOpenSource = null;

  @SerializedName("malicious_address")
  private Integer maliciousAddress = null;

  @SerializedName("malicious_behavior")
  private List<String> maliciousBehavior = null;

  @SerializedName("token_address")
  private String tokenAddress = null;

  @SerializedName("token_name")
  private String tokenName = null;

  @SerializedName("token_symbol")
  private String tokenSymbol = null;

  public ApproveTokenOutListResponse approvedList(List<ApproveTokenResult> approvedList) {
    this.approvedList = approvedList;
    return this;
  }

  public ApproveTokenOutListResponse addApprovedListItem(ApproveTokenResult approvedListItem) {
    if (this.approvedList == null) {
      this.approvedList = new ArrayList<ApproveTokenResult>();
    }
    this.approvedList.add(approvedListItem);
    return this;
  }

   /**
   * Get approvedList
   * @return approvedList
  **/
  @Schema(description = "")
  public List<ApproveTokenResult> getApprovedList() {
    return approvedList;
  }

  public void setApprovedList(List<ApproveTokenResult> approvedList) {
    this.approvedList = approvedList;
  }

  public ApproveTokenOutListResponse balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * balance
   * @return balance
  **/
  @Schema(description = "balance")
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public ApproveTokenOutListResponse chainId(String chainId) {
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

  public ApproveTokenOutListResponse decimals(Integer decimals) {
    this.decimals = decimals;
    return this;
  }

   /**
   * decimals
   * @return decimals
  **/
  @Schema(description = "decimals")
  public Integer getDecimals() {
    return decimals;
  }

  public void setDecimals(Integer decimals) {
    this.decimals = decimals;
  }

  public ApproveTokenOutListResponse isOpenSource(Integer isOpenSource) {
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

  public ApproveTokenOutListResponse maliciousAddress(Integer maliciousAddress) {
    this.maliciousAddress = maliciousAddress;
    return this;
  }

   /**
   * Whether the token is malicious or contains high risk.
   * @return maliciousAddress
  **/
  @Schema(description = "Whether the token is malicious or contains high risk.")
  public Integer getMaliciousAddress() {
    return maliciousAddress;
  }

  public void setMaliciousAddress(Integer maliciousAddress) {
    this.maliciousAddress = maliciousAddress;
  }

  public ApproveTokenOutListResponse maliciousBehavior(List<String> maliciousBehavior) {
    this.maliciousBehavior = maliciousBehavior;
    return this;
  }

  public ApproveTokenOutListResponse addMaliciousBehaviorItem(String maliciousBehaviorItem) {
    if (this.maliciousBehavior == null) {
      this.maliciousBehavior = new ArrayList<String>();
    }
    this.maliciousBehavior.add(maliciousBehaviorItem);
    return this;
  }

   /**
   * Specific malicious behaviors or risks of this token.
   * @return maliciousBehavior
  **/
  @Schema(description = "Specific malicious behaviors or risks of this token.")
  public List<String> getMaliciousBehavior() {
    return maliciousBehavior;
  }

  public void setMaliciousBehavior(List<String> maliciousBehavior) {
    this.maliciousBehavior = maliciousBehavior;
  }

  public ApproveTokenOutListResponse tokenAddress(String tokenAddress) {
    this.tokenAddress = tokenAddress;
    return this;
  }

   /**
   * Token address
   * @return tokenAddress
  **/
  @Schema(description = "Token address")
  public String getTokenAddress() {
    return tokenAddress;
  }

  public void setTokenAddress(String tokenAddress) {
    this.tokenAddress = tokenAddress;
  }

  public ApproveTokenOutListResponse tokenName(String tokenName) {
    this.tokenName = tokenName;
    return this;
  }

   /**
   * Token name
   * @return tokenName
  **/
  @Schema(description = "Token name")
  public String getTokenName() {
    return tokenName;
  }

  public void setTokenName(String tokenName) {
    this.tokenName = tokenName;
  }

  public ApproveTokenOutListResponse tokenSymbol(String tokenSymbol) {
    this.tokenSymbol = tokenSymbol;
    return this;
  }

   /**
   * Token symbol
   * @return tokenSymbol
  **/
  @Schema(description = "Token symbol")
  public String getTokenSymbol() {
    return tokenSymbol;
  }

  public void setTokenSymbol(String tokenSymbol) {
    this.tokenSymbol = tokenSymbol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApproveTokenOutListResponse approveTokenOutListResponse = (ApproveTokenOutListResponse) o;
    return Objects.equals(this.approvedList, approveTokenOutListResponse.approvedList) &&
        Objects.equals(this.balance, approveTokenOutListResponse.balance) &&
        Objects.equals(this.chainId, approveTokenOutListResponse.chainId) &&
        Objects.equals(this.decimals, approveTokenOutListResponse.decimals) &&
        Objects.equals(this.isOpenSource, approveTokenOutListResponse.isOpenSource) &&
        Objects.equals(this.maliciousAddress, approveTokenOutListResponse.maliciousAddress) &&
        Objects.equals(this.maliciousBehavior, approveTokenOutListResponse.maliciousBehavior) &&
        Objects.equals(this.tokenAddress, approveTokenOutListResponse.tokenAddress) &&
        Objects.equals(this.tokenName, approveTokenOutListResponse.tokenName) &&
        Objects.equals(this.tokenSymbol, approveTokenOutListResponse.tokenSymbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvedList, balance, chainId, decimals, isOpenSource, maliciousAddress, maliciousBehavior, tokenAddress, tokenName, tokenSymbol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApproveTokenOutListResponse {\n");
    
    sb.append("    approvedList: ").append(toIndentedString(approvedList)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    isOpenSource: ").append(toIndentedString(isOpenSource)).append("\n");
    sb.append("    maliciousAddress: ").append(toIndentedString(maliciousAddress)).append("\n");
    sb.append("    maliciousBehavior: ").append(toIndentedString(maliciousBehavior)).append("\n");
    sb.append("    tokenAddress: ").append(toIndentedString(tokenAddress)).append("\n");
    sb.append("    tokenName: ").append(toIndentedString(tokenName)).append("\n");
    sb.append("    tokenSymbol: ").append(toIndentedString(tokenSymbol)).append("\n");
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
