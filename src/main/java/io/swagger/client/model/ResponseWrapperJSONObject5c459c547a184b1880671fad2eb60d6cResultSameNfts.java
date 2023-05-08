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
 * ResponseWrapperJSONObject5c459c547a184b1880671fad2eb60d6cResultSameNfts
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-08T09:37:56.615797436Z[Etc/UTC]")
public class ResponseWrapperJSONObject5c459c547a184b1880671fad2eb60d6cResultSameNfts {
  @SerializedName("nft_address")
  private String nftAddress = null;

  @SerializedName("nft_name")
  private String nftName = null;

  @SerializedName("nft_owner_number")
  private Long nftOwnerNumber = null;

  @SerializedName("create_block_number")
  private Long createBlockNumber = null;

  @SerializedName("nft_symbol")
  private String nftSymbol = null;

  public ResponseWrapperJSONObject5c459c547a184b1880671fad2eb60d6cResultSameNfts nftAddress(String nftAddress) {
    this.nftAddress = nftAddress;
    return this;
  }

   /**
   * It describes the address of the NFTs;
   * @return nftAddress
  **/
  @Schema(description = "It describes the address of the NFTs;")
  public String getNftAddress() {
    return nftAddress;
  }

  public void setNftAddress(String nftAddress) {
    this.nftAddress = nftAddress;
  }

  public ResponseWrapperJSONObject5c459c547a184b1880671fad2eb60d6cResultSameNfts nftName(String nftName) {
    this.nftName = nftName;
    return this;
  }

   /**
   * It describes the name of the NFT;
   * @return nftName
  **/
  @Schema(description = "It describes the name of the NFT;")
  public String getNftName() {
    return nftName;
  }

  public void setNftName(String nftName) {
    this.nftName = nftName;
  }

  public ResponseWrapperJSONObject5c459c547a184b1880671fad2eb60d6cResultSameNfts nftOwnerNumber(Long nftOwnerNumber) {
    this.nftOwnerNumber = nftOwnerNumber;
    return this;
  }

   /**
   * It describes the holders of the NFT;
   * @return nftOwnerNumber
  **/
  @Schema(description = "It describes the holders of the NFT;")
  public Long getNftOwnerNumber() {
    return nftOwnerNumber;
  }

  public void setNftOwnerNumber(Long nftOwnerNumber) {
    this.nftOwnerNumber = nftOwnerNumber;
  }

  public ResponseWrapperJSONObject5c459c547a184b1880671fad2eb60d6cResultSameNfts createBlockNumber(Long createBlockNumber) {
    this.createBlockNumber = createBlockNumber;
    return this;
  }

   /**
   * describes the number of blocks created for the NFT. Return \&quot;null\&quot; means no NFTs with duplicate name and symbol.
   * @return createBlockNumber
  **/
  @Schema(description = "describes the number of blocks created for the NFT. Return \"null\" means no NFTs with duplicate name and symbol.")
  public Long getCreateBlockNumber() {
    return createBlockNumber;
  }

  public void setCreateBlockNumber(Long createBlockNumber) {
    this.createBlockNumber = createBlockNumber;
  }

  public ResponseWrapperJSONObject5c459c547a184b1880671fad2eb60d6cResultSameNfts nftSymbol(String nftSymbol) {
    this.nftSymbol = nftSymbol;
    return this;
  }

   /**
   * It describes the symbol of the NFT;
   * @return nftSymbol
  **/
  @Schema(description = "It describes the symbol of the NFT;")
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
    ResponseWrapperJSONObject5c459c547a184b1880671fad2eb60d6cResultSameNfts responseWrapperJSONObject5c459c547a184b1880671fad2eb60d6cResultSameNfts = (ResponseWrapperJSONObject5c459c547a184b1880671fad2eb60d6cResultSameNfts) o;
    return Objects.equals(this.nftAddress, responseWrapperJSONObject5c459c547a184b1880671fad2eb60d6cResultSameNfts.nftAddress) &&
        Objects.equals(this.nftName, responseWrapperJSONObject5c459c547a184b1880671fad2eb60d6cResultSameNfts.nftName) &&
        Objects.equals(this.nftOwnerNumber, responseWrapperJSONObject5c459c547a184b1880671fad2eb60d6cResultSameNfts.nftOwnerNumber) &&
        Objects.equals(this.createBlockNumber, responseWrapperJSONObject5c459c547a184b1880671fad2eb60d6cResultSameNfts.createBlockNumber) &&
        Objects.equals(this.nftSymbol, responseWrapperJSONObject5c459c547a184b1880671fad2eb60d6cResultSameNfts.nftSymbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nftAddress, nftName, nftOwnerNumber, createBlockNumber, nftSymbol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWrapperJSONObject5c459c547a184b1880671fad2eb60d6cResultSameNfts {\n");
    
    sb.append("    nftAddress: ").append(toIndentedString(nftAddress)).append("\n");
    sb.append("    nftName: ").append(toIndentedString(nftName)).append("\n");
    sb.append("    nftOwnerNumber: ").append(toIndentedString(nftOwnerNumber)).append("\n");
    sb.append("    createBlockNumber: ").append(toIndentedString(createBlockNumber)).append("\n");
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
