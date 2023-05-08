/*
 * GoPlus Security API Documentation
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
 * AbiAddressInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-08T10:45:01.075301543Z[Etc/UTC]")
public class AbiAddressInfo {
  @SerializedName("contract_name")
  private String contractName = null;

  @SerializedName("is_contract")
  private Integer isContract = null;

  @SerializedName("malicious_address")
  private Integer maliciousAddress = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("standard")
  private String standard = null;

  @SerializedName("symbol")
  private String symbol = null;

  public AbiAddressInfo contractName(String contractName) {
    this.contractName = contractName;
    return this;
  }

   /**
   * It describes the contract name if the address is a contract.
   * @return contractName
  **/
  @Schema(description = "It describes the contract name if the address is a contract.")
  public String getContractName() {
    return contractName;
  }

  public void setContractName(String contractName) {
    this.contractName = contractName;
  }

  public AbiAddressInfo isContract(Integer isContract) {
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

  public AbiAddressInfo maliciousAddress(Integer maliciousAddress) {
    this.maliciousAddress = maliciousAddress;
    return this;
  }

   /**
   * It describes whether the address is a suspected malicious contract.\&quot;1\&quot; means true; \&quot;0\&quot; means that we have not found malicious behavior of this address.
   * @return maliciousAddress
  **/
  @Schema(description = "It describes whether the address is a suspected malicious contract.\"1\" means true; \"0\" means that we have not found malicious behavior of this address.")
  public Integer getMaliciousAddress() {
    return maliciousAddress;
  }

  public void setMaliciousAddress(Integer maliciousAddress) {
    this.maliciousAddress = maliciousAddress;
  }

  public AbiAddressInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * It describes the token name if the address is an ERC20 contract.
   * @return name
  **/
  @Schema(description = "It describes the token name if the address is an ERC20 contract.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AbiAddressInfo standard(String standard) {
    this.standard = standard;
    return this;
  }

   /**
   * It describes the standard type of the contract.Example:\&quot;erc20\&quot;.
   * @return standard
  **/
  @Schema(description = "It describes the standard type of the contract.Example:\"erc20\".")
  public String getStandard() {
    return standard;
  }

  public void setStandard(String standard) {
    this.standard = standard;
  }

  public AbiAddressInfo symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * It describes the token symbol if the address is an ERC20 contract.
   * @return symbol
  **/
  @Schema(description = "It describes the token symbol if the address is an ERC20 contract.")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbiAddressInfo abiAddressInfo = (AbiAddressInfo) o;
    return Objects.equals(this.contractName, abiAddressInfo.contractName) &&
        Objects.equals(this.isContract, abiAddressInfo.isContract) &&
        Objects.equals(this.maliciousAddress, abiAddressInfo.maliciousAddress) &&
        Objects.equals(this.name, abiAddressInfo.name) &&
        Objects.equals(this.standard, abiAddressInfo.standard) &&
        Objects.equals(this.symbol, abiAddressInfo.symbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractName, isContract, maliciousAddress, name, standard, symbol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbiAddressInfo {\n");
    
    sb.append("    contractName: ").append(toIndentedString(contractName)).append("\n");
    sb.append("    isContract: ").append(toIndentedString(isContract)).append("\n");
    sb.append("    maliciousAddress: ").append(toIndentedString(maliciousAddress)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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
