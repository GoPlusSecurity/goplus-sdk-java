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
import io.gopluslabs.client.model.Contracts;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ContractsSecurity
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-06T09:52:32.634171989Z[Etc/UTC]")

public class ContractsSecurity {
  @SerializedName("chain_id")
  private String chainId = null;

  @SerializedName("contracts")
  private List<Contracts> contracts = null;

  public ContractsSecurity chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

   /**
   * It describes the chains that contracts are deployed on;\&quot;1\&quot; means Ethereum; \&quot;25\&quot; means Cronos; \&quot;56\&quot; means BSC; \&quot;128\&quot; means HECO; \&quot;137\&quot; means Polygon; \&quot;250\&quot; means Fantom; \&quot;42161\&quot; means Arbitrum; \&quot;43114\&quot; means Avalanche.
   * @return chainId
  **/
  @Schema(description = "It describes the chains that contracts are deployed on;\"1\" means Ethereum; \"25\" means Cronos; \"56\" means BSC; \"128\" means HECO; \"137\" means Polygon; \"250\" means Fantom; \"42161\" means Arbitrum; \"43114\" means Avalanche.")
  public String getChainId() {
    return chainId;
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }

  public ContractsSecurity contracts(List<Contracts> contracts) {
    this.contracts = contracts;
    return this;
  }

  public ContractsSecurity addContractsItem(Contracts contractsItem) {
    if (this.contracts == null) {
      this.contracts = new ArrayList<Contracts>();
    }
    this.contracts.add(contractsItem);
    return this;
  }

   /**
   * contract info
   * @return contracts
  **/
  @Schema(description = "contract info")
  public List<Contracts> getContracts() {
    return contracts;
  }

  public void setContracts(List<Contracts> contracts) {
    this.contracts = contracts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractsSecurity contractsSecurity = (ContractsSecurity) o;
    return Objects.equals(this.chainId, contractsSecurity.chainId) &&
        Objects.equals(this.contracts, contractsSecurity.contracts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chainId, contracts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractsSecurity {\n");
    
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    contracts: ").append(toIndentedString(contracts)).append("\n");
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
