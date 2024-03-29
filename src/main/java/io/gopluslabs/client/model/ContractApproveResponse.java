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
import java.util.ArrayList;
import java.util.List;
/**
 * ContractApproveResponse
 */



public class ContractApproveResponse {
  @SerializedName("contract_name")
  private String contractName = null;

  @SerializedName("creator_address")
  private String creatorAddress = null;

  @SerializedName("deployed_time")
  private Long deployedTime = null;

  @SerializedName("doubt_list")
  private Integer doubtList = null;

  @SerializedName("is_contract")
  private Integer isContract = null;

  @SerializedName("is_open_source")
  private Integer isOpenSource = null;

  @SerializedName("is_proxy")
  private Integer isProxy = null;

  @SerializedName("malicious_behavior")
  private List<String> maliciousBehavior = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("trust_list")
  private Integer trustList = null;

  public ContractApproveResponse contractName(String contractName) {
    this.contractName = contractName;
    return this;
  }

   /**
   * It describes the approved contract name.
   * @return contractName
  **/
  @Schema(description = "It describes the approved contract name.")
  public String getContractName() {
    return contractName;
  }

  public void setContractName(String contractName) {
    this.contractName = contractName;
  }

  public ContractApproveResponse creatorAddress(String creatorAddress) {
    this.creatorAddress = creatorAddress;
    return this;
  }

   /**
   * It describes the creator address of the contract.(Notice:When the address is not a contract (\&quot;is_contract\&quot;&#x3D;0), it will return \&quot;null\&quot;.)
   * @return creatorAddress
  **/
  @Schema(description = "It describes the creator address of the contract.(Notice:When the address is not a contract (\"is_contract\"=0), it will return \"null\".)")
  public String getCreatorAddress() {
    return creatorAddress;
  }

  public void setCreatorAddress(String creatorAddress) {
    this.creatorAddress = creatorAddress;
  }

  public ContractApproveResponse deployedTime(Long deployedTime) {
    this.deployedTime = deployedTime;
    return this;
  }

   /**
   * It describes the deployed time of the contract. The value is presented as a timestamp. Example: \&quot;deployed_time\&quot;: 1626578345(Notice:When the address is not a contract (\&quot;is_contract\&quot;&#x3D;0), it will return \&quot;null\&quot;.)
   * @return deployedTime
  **/
  @Schema(description = "It describes the deployed time of the contract. The value is presented as a timestamp. Example: \"deployed_time\": 1626578345(Notice:When the address is not a contract (\"is_contract\"=0), it will return \"null\".)")
  public Long getDeployedTime() {
    return deployedTime;
  }

  public void setDeployedTime(Long deployedTime) {
    this.deployedTime = deployedTime;
  }

  public ContractApproveResponse doubtList(Integer doubtList) {
    this.doubtList = doubtList;
    return this;
  }

   /**
   * It describes whether the address is a suspected malicious contract. \&quot;1\&quot; means true; \&quot;0\&quot; means that we have not found malicious behavior of this address.(Notice:Return \&quot;0\&quot; does not mean it is safe. Maybe we just haven&#x27;t found its malicious behavior.)
   * @return doubtList
  **/
  @Schema(description = "It describes whether the address is a suspected malicious contract. \"1\" means true; \"0\" means that we have not found malicious behavior of this address.(Notice:Return \"0\" does not mean it is safe. Maybe we just haven't found its malicious behavior.)")
  public Integer getDoubtList() {
    return doubtList;
  }

  public void setDoubtList(Integer doubtList) {
    this.doubtList = doubtList;
  }

  public ContractApproveResponse isContract(Integer isContract) {
    this.isContract = isContract;
    return this;
  }

   /**
   * It describes whether the address is a contract. \&quot;1\&quot; means true; \&quot;0\&quot; means false.
   * @return isContract
  **/
  @Schema(description = "It describes whether the address is a contract. \"1\" means true; \"0\" means false.")
  public Integer getIsContract() {
    return isContract;
  }

  public void setIsContract(Integer isContract) {
    this.isContract = isContract;
  }

  public ContractApproveResponse isOpenSource(Integer isOpenSource) {
    this.isOpenSource = isOpenSource;
    return this;
  }

   /**
   * It describes whether this contract is open source. \&quot;1\&quot; means true; \&quot;0\&quot; means false.(Notice:When the address is not a contract (\&quot;is_contract\&quot;&#x3D;0), it will return \&quot;null\&quot;.)
   * @return isOpenSource
  **/
  @Schema(description = "It describes whether this contract is open source. \"1\" means true; \"0\" means false.(Notice:When the address is not a contract (\"is_contract\"=0), it will return \"null\".)")
  public Integer getIsOpenSource() {
    return isOpenSource;
  }

  public void setIsOpenSource(Integer isOpenSource) {
    this.isOpenSource = isOpenSource;
  }

  public ContractApproveResponse isProxy(Integer isProxy) {
    this.isProxy = isProxy;
    return this;
  }

   /**
   * Whether the spender is a proxy contract.
   * @return isProxy
  **/
  @Schema(description = "Whether the spender is a proxy contract.")
  public Integer getIsProxy() {
    return isProxy;
  }

  public void setIsProxy(Integer isProxy) {
    this.isProxy = isProxy;
  }

  public ContractApproveResponse maliciousBehavior(List<String> maliciousBehavior) {
    this.maliciousBehavior = maliciousBehavior;
    return this;
  }

  public ContractApproveResponse addMaliciousBehaviorItem(String maliciousBehaviorItem) {
    if (this.maliciousBehavior == null) {
      this.maliciousBehavior = new ArrayList<String>();
    }
    this.maliciousBehavior.add(maliciousBehaviorItem);
    return this;
  }

   /**
   * It describes specific malicious behaviors. \&quot;honeypot_related_address\&quot; means that the address is related to honeypot tokens or has created scam tokens. \&quot;phishing_activities\&quot; means that this address has implemented phishing activities. \&quot;blackmail_activities\&quot; means that this address has implemented blackmail activities. \&quot;stealing_attack\&quot; means that this address has implemented stealing attacks. \&quot;fake_kyc\&quot; means that this address is involved in fake KYC. \&quot;malicious_mining_activities\&quot; means that this address is involved in malicious mining activities. \&quot;darkweb_transactions\&quot; means that this address is involved in darkweb transactions. \&quot;cybercrime\&quot; means that this address is involved in cybercrime. \&quot;money_laundering\&quot; means that this address is involved in money laundering. \&quot;financial_crime\&quot; means that this address is involved in financial crime. \&quot;blacklist_doubt\&quot; means that the address is suspected of malicious behavior and is therefore blacklisted.(Notice:Returning an empty array means that no malicious behavior was found at that address.)
   * @return maliciousBehavior
  **/
  @Schema(description = "It describes specific malicious behaviors. \"honeypot_related_address\" means that the address is related to honeypot tokens or has created scam tokens. \"phishing_activities\" means that this address has implemented phishing activities. \"blackmail_activities\" means that this address has implemented blackmail activities. \"stealing_attack\" means that this address has implemented stealing attacks. \"fake_kyc\" means that this address is involved in fake KYC. \"malicious_mining_activities\" means that this address is involved in malicious mining activities. \"darkweb_transactions\" means that this address is involved in darkweb transactions. \"cybercrime\" means that this address is involved in cybercrime. \"money_laundering\" means that this address is involved in money laundering. \"financial_crime\" means that this address is involved in financial crime. \"blacklist_doubt\" means that the address is suspected of malicious behavior and is therefore blacklisted.(Notice:Returning an empty array means that no malicious behavior was found at that address.)")
  public List<String> getMaliciousBehavior() {
    return maliciousBehavior;
  }

  public void setMaliciousBehavior(List<String> maliciousBehavior) {
    this.maliciousBehavior = maliciousBehavior;
  }

  public ContractApproveResponse tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * It describes which dapp uses the contract. Example:\&quot;tag\&quot;: \&quot;Compound\&quot;
   * @return tag
  **/
  @Schema(description = "It describes which dapp uses the contract. Example:\"tag\": \"Compound\"")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public ContractApproveResponse trustList(Integer trustList) {
    this.trustList = trustList;
    return this;
  }

   /**
   * It describes whether the address is a famous and trustworthy one. \&quot;1\&quot; means true; \&quot;0\&quot; means that we have not included this address in the trusted list;(Notice:Return \&quot;0\&quot; does not mean the address is not trustworthy. Maybe we just haven&#x27;t included it yet.)
   * @return trustList
  **/
  @Schema(description = "It describes whether the address is a famous and trustworthy one. \"1\" means true; \"0\" means that we have not included this address in the trusted list;(Notice:Return \"0\" does not mean the address is not trustworthy. Maybe we just haven't included it yet.)")
  public Integer getTrustList() {
    return trustList;
  }

  public void setTrustList(Integer trustList) {
    this.trustList = trustList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractApproveResponse contractApproveResponse = (ContractApproveResponse) o;
    return Objects.equals(this.contractName, contractApproveResponse.contractName) &&
        Objects.equals(this.creatorAddress, contractApproveResponse.creatorAddress) &&
        Objects.equals(this.deployedTime, contractApproveResponse.deployedTime) &&
        Objects.equals(this.doubtList, contractApproveResponse.doubtList) &&
        Objects.equals(this.isContract, contractApproveResponse.isContract) &&
        Objects.equals(this.isOpenSource, contractApproveResponse.isOpenSource) &&
        Objects.equals(this.isProxy, contractApproveResponse.isProxy) &&
        Objects.equals(this.maliciousBehavior, contractApproveResponse.maliciousBehavior) &&
        Objects.equals(this.tag, contractApproveResponse.tag) &&
        Objects.equals(this.trustList, contractApproveResponse.trustList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractName, creatorAddress, deployedTime, doubtList, isContract, isOpenSource, isProxy, maliciousBehavior, tag, trustList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractApproveResponse {\n");
    
    sb.append("    contractName: ").append(toIndentedString(contractName)).append("\n");
    sb.append("    creatorAddress: ").append(toIndentedString(creatorAddress)).append("\n");
    sb.append("    deployedTime: ").append(toIndentedString(deployedTime)).append("\n");
    sb.append("    doubtList: ").append(toIndentedString(doubtList)).append("\n");
    sb.append("    isContract: ").append(toIndentedString(isContract)).append("\n");
    sb.append("    isOpenSource: ").append(toIndentedString(isOpenSource)).append("\n");
    sb.append("    isProxy: ").append(toIndentedString(isProxy)).append("\n");
    sb.append("    maliciousBehavior: ").append(toIndentedString(maliciousBehavior)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    trustList: ").append(toIndentedString(trustList)).append("\n");
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
