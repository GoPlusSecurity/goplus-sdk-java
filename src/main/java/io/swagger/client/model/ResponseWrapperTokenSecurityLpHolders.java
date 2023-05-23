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
import java.util.ArrayList;
import java.util.List;
/**
 * ResponseWrapperTokenSecurityLpHolders
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-22T12:45:14.641970156Z[Etc/UTC]")
public class ResponseWrapperTokenSecurityLpHolders {
  @SerializedName("is_locked")
  private Integer isLocked = null;

  @SerializedName("is_contract")
  private Integer isContract = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("balance")
  private String balance = null;

  @SerializedName("locked_detail")
  private List<String> lockedDetail = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("percent")
  private String percent = null;

  public ResponseWrapperTokenSecurityLpHolders isLocked(Integer isLocked) {
    this.isLocked = isLocked;
    return this;
  }

   /**
   * It describes whether the tokens owned by the holder are locked \&quot;1\&quot; means true; \&quot;0\&quot; means false;  (3) “tag” describes the address&#x27;s public tag. Example:Burn (Notice:About \&quot;locked\&quot;: We only support the token lock addresses or black hole addresses that we have included. )
   * @return isLocked
  **/
  @Schema(description = "It describes whether the tokens owned by the holder are locked \"1\" means true; \"0\" means false;  (3) “tag” describes the address's public tag. Example:Burn (Notice:About \"locked\": We only support the token lock addresses or black hole addresses that we have included. )")
  public Integer getIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Integer isLocked) {
    this.isLocked = isLocked;
  }

  public ResponseWrapperTokenSecurityLpHolders isContract(Integer isContract) {
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

  public ResponseWrapperTokenSecurityLpHolders address(String address) {
    this.address = address;
    return this;
  }

   /**
   * It describes the holder address; 
   * @return address
  **/
  @Schema(description = "It describes the holder address; ")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public ResponseWrapperTokenSecurityLpHolders balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * It describes the balance of the holder. 
   * @return balance
  **/
  @Schema(description = "It describes the balance of the holder. ")
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public ResponseWrapperTokenSecurityLpHolders lockedDetail(List<String> lockedDetail) {
    this.lockedDetail = lockedDetail;
    return this;
  }

  public ResponseWrapperTokenSecurityLpHolders addLockedDetailItem(String lockedDetailItem) {
    if (this.lockedDetail == null) {
      this.lockedDetail = new ArrayList<String>();
    }
    this.lockedDetail.add(lockedDetailItem);
    return this;
  }

   /**
   * It is an array, decribes lock position info of this holder, only shows when \&quot;locked\&quot;: 1. This Array may contain multiple objects for multiple locking info. In every objetc, \&quot;amount\&quot; describes the number of token locked, \&quot;end_time\&quot; describes when the token will be unlocked, \&quot;opt_time\&quot; describes when the token was locked.(Notice:When \&quot;locked\&quot;:0, or lock address is a black hole address,  \&quot;locked_detail\&quot; will be no return.)
   * @return lockedDetail
  **/
  @Schema(description = "It is an array, decribes lock position info of this holder, only shows when \"locked\": 1. This Array may contain multiple objects for multiple locking info. In every objetc, \"amount\" describes the number of token locked, \"end_time\" describes when the token will be unlocked, \"opt_time\" describes when the token was locked.(Notice:When \"locked\":0, or lock address is a black hole address,  \"locked_detail\" will be no return.)")
  public List<String> getLockedDetail() {
    return lockedDetail;
  }

  public void setLockedDetail(List<String> lockedDetail) {
    this.lockedDetail = lockedDetail;
  }

  public ResponseWrapperTokenSecurityLpHolders tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * It describes the address&#x27;s public tag. Example:Burn Address/Deployer; 
   * @return tag
  **/
  @Schema(description = "It describes the address's public tag. Example:Burn Address/Deployer; ")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public ResponseWrapperTokenSecurityLpHolders percent(String percent) {
    this.percent = percent;
    return this;
  }

   /**
   * It  describes the percentage of tokens held by this holder (Notice:About \&quot;percent\&quot;: 1 means 100% here.)
   * @return percent
  **/
  @Schema(description = "It  describes the percentage of tokens held by this holder (Notice:About \"percent\": 1 means 100% here.)")
  public String getPercent() {
    return percent;
  }

  public void setPercent(String percent) {
    this.percent = percent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseWrapperTokenSecurityLpHolders responseWrapperTokenSecurityLpHolders = (ResponseWrapperTokenSecurityLpHolders) o;
    return Objects.equals(this.isLocked, responseWrapperTokenSecurityLpHolders.isLocked) &&
        Objects.equals(this.isContract, responseWrapperTokenSecurityLpHolders.isContract) &&
        Objects.equals(this.address, responseWrapperTokenSecurityLpHolders.address) &&
        Objects.equals(this.balance, responseWrapperTokenSecurityLpHolders.balance) &&
        Objects.equals(this.lockedDetail, responseWrapperTokenSecurityLpHolders.lockedDetail) &&
        Objects.equals(this.tag, responseWrapperTokenSecurityLpHolders.tag) &&
        Objects.equals(this.percent, responseWrapperTokenSecurityLpHolders.percent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isLocked, isContract, address, balance, lockedDetail, tag, percent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWrapperTokenSecurityLpHolders {\n");
    
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    isContract: ").append(toIndentedString(isContract)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    lockedDetail: ").append(toIndentedString(lockedDetail)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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