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
 * Contracts
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-12T10:15:49.495196307Z[Etc/UTC]")

public class Contracts {
  @SerializedName("contract_address")
  private String contractAddress = null;

  @SerializedName("creator_address")
  private String creatorAddress = null;

  @SerializedName("deployment_time")
  private Long deploymentTime = null;

  @SerializedName("is_open_source")
  private Integer isOpenSource = null;

  @SerializedName("malicious_behavior")
  private List<Object> maliciousBehavior = null;

  @SerializedName("malicious_contract")
  private Integer maliciousContract = null;

  @SerializedName("malicious_creator")
  private Integer maliciousCreator = null;

  @SerializedName("malicious_creator_behavior")
  private List<Object> maliciousCreatorBehavior = null;

  public Contracts contractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * It describes the dAap&#x27;s contract address.
   * @return contractAddress
  **/
  @Schema(description = "It describes the dAap's contract address.")
  public String getContractAddress() {
    return contractAddress;
  }

  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }

  public Contracts creatorAddress(String creatorAddress) {
    this.creatorAddress = creatorAddress;
    return this;
  }

   /**
   * It describes the creator address of the contract.
   * @return creatorAddress
  **/
  @Schema(description = "It describes the creator address of the contract.")
  public String getCreatorAddress() {
    return creatorAddress;
  }

  public void setCreatorAddress(String creatorAddress) {
    this.creatorAddress = creatorAddress;
  }

  public Contracts deploymentTime(Long deploymentTime) {
    this.deploymentTime = deploymentTime;
    return this;
  }

   /**
   * It describes the deployed time of the contract.The value is presented as a timestamp. Example: \&quot;deployed_time\&quot;: 1626578345
   * @return deploymentTime
  **/
  @Schema(description = "It describes the deployed time of the contract.The value is presented as a timestamp. Example: \"deployed_time\": 1626578345")
  public Long getDeploymentTime() {
    return deploymentTime;
  }

  public void setDeploymentTime(Long deploymentTime) {
    this.deploymentTime = deploymentTime;
  }

  public Contracts isOpenSource(Integer isOpenSource) {
    this.isOpenSource = isOpenSource;
    return this;
  }

   /**
   * It describes whether this contract is open source. \&quot;1\&quot; means true; \&quot;0\&quot; means false.
   * @return isOpenSource
  **/
  @Schema(description = "It describes whether this contract is open source. \"1\" means true; \"0\" means false.")
  public Integer getIsOpenSource() {
    return isOpenSource;
  }

  public void setIsOpenSource(Integer isOpenSource) {
    this.isOpenSource = isOpenSource;
  }

  public Contracts maliciousBehavior(List<Object> maliciousBehavior) {
    this.maliciousBehavior = maliciousBehavior;
    return this;
  }

  public Contracts addMaliciousBehaviorItem(Object maliciousBehaviorItem) {
    if (this.maliciousBehavior == null) {
      this.maliciousBehavior = new ArrayList<Object>();
    }
    this.maliciousBehavior.add(maliciousBehaviorItem);
    return this;
  }

   /**
   * It describes specific malicious behaviors of the contract.
   * @return maliciousBehavior
  **/
  @Schema(description = "It describes specific malicious behaviors of the contract.")
  public List<Object> getMaliciousBehavior() {
    return maliciousBehavior;
  }

  public void setMaliciousBehavior(List<Object> maliciousBehavior) {
    this.maliciousBehavior = maliciousBehavior;
  }

  public Contracts maliciousContract(Integer maliciousContract) {
    this.maliciousContract = maliciousContract;
    return this;
  }

   /**
   * It describes whether the address is a suspected malicious contract. \&quot;1\&quot; means true; \&quot;0\&quot; means that we have not found malicious behavior of this contract.(Notice:\&quot;malicious_contract\&quot; return \&quot;0\&quot; does not mean the address is completely safe. Maybe we just haven&#x27;t found its malicious behavior.)
   * @return maliciousContract
  **/
  @Schema(description = "It describes whether the address is a suspected malicious contract. \"1\" means true; \"0\" means that we have not found malicious behavior of this contract.(Notice:\"malicious_contract\" return \"0\" does not mean the address is completely safe. Maybe we just haven't found its malicious behavior.)")
  public Integer getMaliciousContract() {
    return maliciousContract;
  }

  public void setMaliciousContract(Integer maliciousContract) {
    this.maliciousContract = maliciousContract;
  }

  public Contracts maliciousCreator(Integer maliciousCreator) {
    this.maliciousCreator = maliciousCreator;
    return this;
  }

   /**
   * It describes whether the creator is a suspected malicious address. \&quot;1\&quot; means true; \&quot;0\&quot; means that we have not found malicious behavior of this address.(Notice:\&quot;malicious_creator\&quot; return \&quot;0\&quot; does not mean the address is completely safe. Maybe we just haven&#x27;t found its malicious behavior.)
   * @return maliciousCreator
  **/
  @Schema(description = "It describes whether the creator is a suspected malicious address. \"1\" means true; \"0\" means that we have not found malicious behavior of this address.(Notice:\"malicious_creator\" return \"0\" does not mean the address is completely safe. Maybe we just haven't found its malicious behavior.)")
  public Integer getMaliciousCreator() {
    return maliciousCreator;
  }

  public void setMaliciousCreator(Integer maliciousCreator) {
    this.maliciousCreator = maliciousCreator;
  }

  public Contracts maliciousCreatorBehavior(List<Object> maliciousCreatorBehavior) {
    this.maliciousCreatorBehavior = maliciousCreatorBehavior;
    return this;
  }

  public Contracts addMaliciousCreatorBehaviorItem(Object maliciousCreatorBehaviorItem) {
    if (this.maliciousCreatorBehavior == null) {
      this.maliciousCreatorBehavior = new ArrayList<Object>();
    }
    this.maliciousCreatorBehavior.add(maliciousCreatorBehaviorItem);
    return this;
  }

   /**
   * It describes specific malicious behaviors of the contract creator.
   * @return maliciousCreatorBehavior
  **/
  @Schema(description = "It describes specific malicious behaviors of the contract creator.")
  public List<Object> getMaliciousCreatorBehavior() {
    return maliciousCreatorBehavior;
  }

  public void setMaliciousCreatorBehavior(List<Object> maliciousCreatorBehavior) {
    this.maliciousCreatorBehavior = maliciousCreatorBehavior;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contracts contracts = (Contracts) o;
    return Objects.equals(this.contractAddress, contracts.contractAddress) &&
        Objects.equals(this.creatorAddress, contracts.creatorAddress) &&
        Objects.equals(this.deploymentTime, contracts.deploymentTime) &&
        Objects.equals(this.isOpenSource, contracts.isOpenSource) &&
        Objects.equals(this.maliciousBehavior, contracts.maliciousBehavior) &&
        Objects.equals(this.maliciousContract, contracts.maliciousContract) &&
        Objects.equals(this.maliciousCreator, contracts.maliciousCreator) &&
        Objects.equals(this.maliciousCreatorBehavior, contracts.maliciousCreatorBehavior);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractAddress, creatorAddress, deploymentTime, isOpenSource, maliciousBehavior, maliciousContract, maliciousCreator, maliciousCreatorBehavior);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contracts {\n");
    
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
    sb.append("    creatorAddress: ").append(toIndentedString(creatorAddress)).append("\n");
    sb.append("    deploymentTime: ").append(toIndentedString(deploymentTime)).append("\n");
    sb.append("    isOpenSource: ").append(toIndentedString(isOpenSource)).append("\n");
    sb.append("    maliciousBehavior: ").append(toIndentedString(maliciousBehavior)).append("\n");
    sb.append("    maliciousContract: ").append(toIndentedString(maliciousContract)).append("\n");
    sb.append("    maliciousCreator: ").append(toIndentedString(maliciousCreator)).append("\n");
    sb.append("    maliciousCreatorBehavior: ").append(toIndentedString(maliciousCreatorBehavior)).append("\n");
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
