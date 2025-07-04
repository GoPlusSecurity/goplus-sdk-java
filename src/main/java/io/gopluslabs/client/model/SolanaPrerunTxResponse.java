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
import io.gopluslabs.client.model.SolanaAllowanceUpgrade;
import io.gopluslabs.client.model.SolanaOwnershipChange;
import io.gopluslabs.client.model.SolanaTxAssetChanges;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SolanaPrerunTxResponse
 */



public class SolanaPrerunTxResponse {
  @SerializedName("input")
  private String input = null;

  @SerializedName("asset_changes")
  private SolanaTxAssetChanges assetChanges = null;

  @SerializedName("risk_type")
  private List<Integer> riskType = null;

  @SerializedName("allowance_upgrades")
  private List<SolanaAllowanceUpgrade> allowanceUpgrades = null;

  @SerializedName("ownership_changes")
  private List<SolanaOwnershipChange> ownershipChanges = null;

  @SerializedName("sender")
  private String sender = null;

  @SerializedName("transaction_fee")
  private String transactionFee = null;

  @SerializedName("risky_txn")
  private String riskyTxn = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("logs")
  private List<String> logs = null;

  @SerializedName("risk_detail")
  private List<String> riskDetail = null;

  @SerializedName("slot_height")
  private Long slotHeight = null;

  public SolanaPrerunTxResponse input(String input) {
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @Schema(description = "")
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public SolanaPrerunTxResponse assetChanges(SolanaTxAssetChanges assetChanges) {
    this.assetChanges = assetChanges;
    return this;
  }

   /**
   * Get assetChanges
   * @return assetChanges
  **/
  @Schema(description = "")
  public SolanaTxAssetChanges getAssetChanges() {
    return assetChanges;
  }

  public void setAssetChanges(SolanaTxAssetChanges assetChanges) {
    this.assetChanges = assetChanges;
  }

  public SolanaPrerunTxResponse riskType(List<Integer> riskType) {
    this.riskType = riskType;
    return this;
  }

  public SolanaPrerunTxResponse addRiskTypeItem(Integer riskTypeItem) {
    if (this.riskType == null) {
      this.riskType = new ArrayList<Integer>();
    }
    this.riskType.add(riskTypeItem);
    return this;
  }

   /**
   * Get riskType
   * @return riskType
  **/
  @Schema(description = "")
  public List<Integer> getRiskType() {
    return riskType;
  }

  public void setRiskType(List<Integer> riskType) {
    this.riskType = riskType;
  }

  public SolanaPrerunTxResponse allowanceUpgrades(List<SolanaAllowanceUpgrade> allowanceUpgrades) {
    this.allowanceUpgrades = allowanceUpgrades;
    return this;
  }

  public SolanaPrerunTxResponse addAllowanceUpgradesItem(SolanaAllowanceUpgrade allowanceUpgradesItem) {
    if (this.allowanceUpgrades == null) {
      this.allowanceUpgrades = new ArrayList<SolanaAllowanceUpgrade>();
    }
    this.allowanceUpgrades.add(allowanceUpgradesItem);
    return this;
  }

   /**
   * Get allowanceUpgrades
   * @return allowanceUpgrades
  **/
  @Schema(description = "")
  public List<SolanaAllowanceUpgrade> getAllowanceUpgrades() {
    return allowanceUpgrades;
  }

  public void setAllowanceUpgrades(List<SolanaAllowanceUpgrade> allowanceUpgrades) {
    this.allowanceUpgrades = allowanceUpgrades;
  }

  public SolanaPrerunTxResponse ownershipChanges(List<SolanaOwnershipChange> ownershipChanges) {
    this.ownershipChanges = ownershipChanges;
    return this;
  }

  public SolanaPrerunTxResponse addOwnershipChangesItem(SolanaOwnershipChange ownershipChangesItem) {
    if (this.ownershipChanges == null) {
      this.ownershipChanges = new ArrayList<SolanaOwnershipChange>();
    }
    this.ownershipChanges.add(ownershipChangesItem);
    return this;
  }

   /**
   * Get ownershipChanges
   * @return ownershipChanges
  **/
  @Schema(description = "")
  public List<SolanaOwnershipChange> getOwnershipChanges() {
    return ownershipChanges;
  }

  public void setOwnershipChanges(List<SolanaOwnershipChange> ownershipChanges) {
    this.ownershipChanges = ownershipChanges;
  }

  public SolanaPrerunTxResponse sender(String sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @Schema(description = "")
  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public SolanaPrerunTxResponse transactionFee(String transactionFee) {
    this.transactionFee = transactionFee;
    return this;
  }

   /**
   * Get transactionFee
   * @return transactionFee
  **/
  @Schema(description = "")
  public String getTransactionFee() {
    return transactionFee;
  }

  public void setTransactionFee(String transactionFee) {
    this.transactionFee = transactionFee;
  }

  public SolanaPrerunTxResponse riskyTxn(String riskyTxn) {
    this.riskyTxn = riskyTxn;
    return this;
  }

   /**
   * Get riskyTxn
   * @return riskyTxn
  **/
  @Schema(description = "")
  public String getRiskyTxn() {
    return riskyTxn;
  }

  public void setRiskyTxn(String riskyTxn) {
    this.riskyTxn = riskyTxn;
  }

  public SolanaPrerunTxResponse error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @Schema(description = "")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public SolanaPrerunTxResponse logs(List<String> logs) {
    this.logs = logs;
    return this;
  }

  public SolanaPrerunTxResponse addLogsItem(String logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<String>();
    }
    this.logs.add(logsItem);
    return this;
  }

   /**
   * Get logs
   * @return logs
  **/
  @Schema(description = "")
  public List<String> getLogs() {
    return logs;
  }

  public void setLogs(List<String> logs) {
    this.logs = logs;
  }

  public SolanaPrerunTxResponse riskDetail(List<String> riskDetail) {
    this.riskDetail = riskDetail;
    return this;
  }

  public SolanaPrerunTxResponse addRiskDetailItem(String riskDetailItem) {
    if (this.riskDetail == null) {
      this.riskDetail = new ArrayList<String>();
    }
    this.riskDetail.add(riskDetailItem);
    return this;
  }

   /**
   * Get riskDetail
   * @return riskDetail
  **/
  @Schema(description = "")
  public List<String> getRiskDetail() {
    return riskDetail;
  }

  public void setRiskDetail(List<String> riskDetail) {
    this.riskDetail = riskDetail;
  }

  public SolanaPrerunTxResponse slotHeight(Long slotHeight) {
    this.slotHeight = slotHeight;
    return this;
  }

   /**
   * Get slotHeight
   * @return slotHeight
  **/
  @Schema(description = "")
  public Long getSlotHeight() {
    return slotHeight;
  }

  public void setSlotHeight(Long slotHeight) {
    this.slotHeight = slotHeight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolanaPrerunTxResponse solanaPrerunTxResponse = (SolanaPrerunTxResponse) o;
    return Objects.equals(this.input, solanaPrerunTxResponse.input) &&
        Objects.equals(this.assetChanges, solanaPrerunTxResponse.assetChanges) &&
        Objects.equals(this.riskType, solanaPrerunTxResponse.riskType) &&
        Objects.equals(this.allowanceUpgrades, solanaPrerunTxResponse.allowanceUpgrades) &&
        Objects.equals(this.ownershipChanges, solanaPrerunTxResponse.ownershipChanges) &&
        Objects.equals(this.sender, solanaPrerunTxResponse.sender) &&
        Objects.equals(this.transactionFee, solanaPrerunTxResponse.transactionFee) &&
        Objects.equals(this.riskyTxn, solanaPrerunTxResponse.riskyTxn) &&
        Objects.equals(this.error, solanaPrerunTxResponse.error) &&
        Objects.equals(this.logs, solanaPrerunTxResponse.logs) &&
        Objects.equals(this.riskDetail, solanaPrerunTxResponse.riskDetail) &&
        Objects.equals(this.slotHeight, solanaPrerunTxResponse.slotHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, assetChanges, riskType, allowanceUpgrades, ownershipChanges, sender, transactionFee, riskyTxn, error, logs, riskDetail, slotHeight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolanaPrerunTxResponse {\n");
    
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    assetChanges: ").append(toIndentedString(assetChanges)).append("\n");
    sb.append("    riskType: ").append(toIndentedString(riskType)).append("\n");
    sb.append("    allowanceUpgrades: ").append(toIndentedString(allowanceUpgrades)).append("\n");
    sb.append("    ownershipChanges: ").append(toIndentedString(ownershipChanges)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    transactionFee: ").append(toIndentedString(transactionFee)).append("\n");
    sb.append("    riskyTxn: ").append(toIndentedString(riskyTxn)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    riskDetail: ").append(toIndentedString(riskDetail)).append("\n");
    sb.append("    slotHeight: ").append(toIndentedString(slotHeight)).append("\n");
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
