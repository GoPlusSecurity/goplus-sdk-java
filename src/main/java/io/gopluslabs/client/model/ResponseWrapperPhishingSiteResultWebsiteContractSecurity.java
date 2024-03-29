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
import io.gopluslabs.client.model.ResponseWrapperPhishingSiteResultNftRisk;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ResponseWrapperPhishingSiteResultWebsiteContractSecurity
 */



public class ResponseWrapperPhishingSiteResultWebsiteContractSecurity {
  @SerializedName("standard")
  private String standard = null;

  @SerializedName("is_contract")
  private Integer isContract = null;

  @SerializedName("address_risk")
  private List<String> addressRisk = null;

  @SerializedName("contract")
  private String contract = null;

  @SerializedName("is_open_source")
  private Integer isOpenSource = null;

  @SerializedName("nft_risk")
  private ResponseWrapperPhishingSiteResultNftRisk nftRisk = null;

  public ResponseWrapperPhishingSiteResultWebsiteContractSecurity standard(String standard) {
    this.standard = standard;
    return this;
  }

   /**
   * contract type(erc20, erc721, erc1155)
   * @return standard
  **/
  @Schema(description = "contract type(erc20, erc721, erc1155)")
  public String getStandard() {
    return standard;
  }

  public void setStandard(String standard) {
    this.standard = standard;
  }

  public ResponseWrapperPhishingSiteResultWebsiteContractSecurity isContract(Integer isContract) {
    this.isContract = isContract;
    return this;
  }

   /**
   * It describes whether the holder is a contract \&quot;1\&quot; means true; \&quot;0\&quot; means false.
   * @return isContract
  **/
  @Schema(description = "It describes whether the holder is a contract \"1\" means true; \"0\" means false.")
  public Integer getIsContract() {
    return isContract;
  }

  public void setIsContract(Integer isContract) {
    this.isContract = isContract;
  }

  public ResponseWrapperPhishingSiteResultWebsiteContractSecurity addressRisk(List<String> addressRisk) {
    this.addressRisk = addressRisk;
    return this;
  }

  public ResponseWrapperPhishingSiteResultWebsiteContractSecurity addAddressRiskItem(String addressRiskItem) {
    if (this.addressRisk == null) {
      this.addressRisk = new ArrayList<String>();
    }
    this.addressRisk.add(addressRiskItem);
    return this;
  }

   /**
   * address risk
   * @return addressRisk
  **/
  @Schema(description = "address risk")
  public List<String> getAddressRisk() {
    return addressRisk;
  }

  public void setAddressRisk(List<String> addressRisk) {
    this.addressRisk = addressRisk;
  }

  public ResponseWrapperPhishingSiteResultWebsiteContractSecurity contract(String contract) {
    this.contract = contract;
    return this;
  }

   /**
   * contract address
   * @return contract
  **/
  @Schema(description = "contract address")
  public String getContract() {
    return contract;
  }

  public void setContract(String contract) {
    this.contract = contract;
  }

  public ResponseWrapperPhishingSiteResultWebsiteContractSecurity isOpenSource(Integer isOpenSource) {
    this.isOpenSource = isOpenSource;
    return this;
  }

   /**
   * It describes whether this contract is open source.  \&quot;1\&quot; means true;  \&quot;0\&quot; means false.(Notice:Un-open-sourced contracts may hide various unknown mechanisms and are extremely risky. When the contract is not open source, we will not be able to detect other risk items.)
   * @return isOpenSource
  **/
  @Schema(description = "It describes whether this contract is open source.  \"1\" means true;  \"0\" means false.(Notice:Un-open-sourced contracts may hide various unknown mechanisms and are extremely risky. When the contract is not open source, we will not be able to detect other risk items.)")
  public Integer getIsOpenSource() {
    return isOpenSource;
  }

  public void setIsOpenSource(Integer isOpenSource) {
    this.isOpenSource = isOpenSource;
  }

  public ResponseWrapperPhishingSiteResultWebsiteContractSecurity nftRisk(ResponseWrapperPhishingSiteResultNftRisk nftRisk) {
    this.nftRisk = nftRisk;
    return this;
  }

   /**
   * Get nftRisk
   * @return nftRisk
  **/
  @Schema(description = "")
  public ResponseWrapperPhishingSiteResultNftRisk getNftRisk() {
    return nftRisk;
  }

  public void setNftRisk(ResponseWrapperPhishingSiteResultNftRisk nftRisk) {
    this.nftRisk = nftRisk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseWrapperPhishingSiteResultWebsiteContractSecurity responseWrapperPhishingSiteResultWebsiteContractSecurity = (ResponseWrapperPhishingSiteResultWebsiteContractSecurity) o;
    return Objects.equals(this.standard, responseWrapperPhishingSiteResultWebsiteContractSecurity.standard) &&
        Objects.equals(this.isContract, responseWrapperPhishingSiteResultWebsiteContractSecurity.isContract) &&
        Objects.equals(this.addressRisk, responseWrapperPhishingSiteResultWebsiteContractSecurity.addressRisk) &&
        Objects.equals(this.contract, responseWrapperPhishingSiteResultWebsiteContractSecurity.contract) &&
        Objects.equals(this.isOpenSource, responseWrapperPhishingSiteResultWebsiteContractSecurity.isOpenSource) &&
        Objects.equals(this.nftRisk, responseWrapperPhishingSiteResultWebsiteContractSecurity.nftRisk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standard, isContract, addressRisk, contract, isOpenSource, nftRisk);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWrapperPhishingSiteResultWebsiteContractSecurity {\n");
    
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
    sb.append("    isContract: ").append(toIndentedString(isContract)).append("\n");
    sb.append("    addressRisk: ").append(toIndentedString(addressRisk)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    isOpenSource: ").append(toIndentedString(isOpenSource)).append("\n");
    sb.append("    nftRisk: ").append(toIndentedString(nftRisk)).append("\n");
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
