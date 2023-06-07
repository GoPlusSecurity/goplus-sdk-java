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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * ParseAbiDataRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-07T05:46:11.788536588Z[Etc/UTC]")

public class ParseAbiDataRequest {
  @SerializedName("chain_id")
  private String chainId = null;

  @SerializedName("contract_address")
  private String contractAddress = null;

  @SerializedName("data")
  private String data = null;

  @SerializedName("input")
  private Map<String, Object> input = null;

  @SerializedName("signer")
  private String signer = null;

  /**
   * Transaction type
   */
  @JsonAdapter(TranscationTypeEnum.Adapter.class)
  public enum TranscationTypeEnum {
    @SerializedName("common")
    COMMON("common"),
    @SerializedName("eth_signTypedData_v4")
    ETH_SIGNTYPEDDATA_V4("eth_signTypedData_v4"),
    @SerializedName("personal_sign")
    PERSONAL_SIGN("personal_sign"),
    @SerializedName("eth_sign")
    ETH_SIGN("eth_sign");

    private String value;

    TranscationTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TranscationTypeEnum fromValue(String input) {
      for (TranscationTypeEnum b : TranscationTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TranscationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TranscationTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TranscationTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TranscationTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("transcation_type")
  private TranscationTypeEnum transcationType = null;

  public ParseAbiDataRequest chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

   /**
   * Chain id, (ETH: 1, Cronos:25, BSC: 56, Heco: 128, Polygon: 137, Fantom:250, KCC: 321, Arbitrum: 42161, Avalanche: 43114)
   * @return chainId
  **/
  @Schema(example = "56", required = true, description = "Chain id, (ETH: 1, Cronos:25, BSC: 56, Heco: 128, Polygon: 137, Fantom:250, KCC: 321, Arbitrum: 42161, Avalanche: 43114)")
  public String getChainId() {
    return chainId;
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }

  public ParseAbiDataRequest contractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * Carrying the signer and contract address will help to decode more information.
   * @return contractAddress
  **/
  @Schema(example = "489982930986835137684486657990555633941558688085", description = "Carrying the signer and contract address will help to decode more information.")
  public String getContractAddress() {
    return contractAddress;
  }

  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }

  public ParseAbiDataRequest data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Transaction input
   * @return data
  **/
  @Schema(example = "38020752995870066111790065015062961812328902090107696250858266643344188923832740441241402799828641949243718670476236652057420675249926299203332389775628687908012032", required = true, description = "Transaction input")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public ParseAbiDataRequest input(Map<String, Object> input) {
    this.input = input;
    return this;
  }

  public ParseAbiDataRequest putInputItem(String key, Object inputItem) {
    if (this.input == null) {
      this.input = new HashMap<String, Object>();
    }
    this.input.put(key, inputItem);
    return this;
  }

   /**
   * input info
   * @return input
  **/
  @Schema(example = "{}", description = "input info")
  public Map<String, Object> getInput() {
    return input;
  }

  public void setInput(Map<String, Object> input) {
    this.input = input;
  }

  public ParseAbiDataRequest signer(String signer) {
    this.signer = signer;
    return this;
  }

   /**
   * Carrying the signer and contract address will help to decode more information.
   * @return signer
  **/
  @Schema(description = "Carrying the signer and contract address will help to decode more information.")
  public String getSigner() {
    return signer;
  }

  public void setSigner(String signer) {
    this.signer = signer;
  }

  public ParseAbiDataRequest transcationType(TranscationTypeEnum transcationType) {
    this.transcationType = transcationType;
    return this;
  }

   /**
   * Transaction type
   * @return transcationType
  **/
  @Schema(description = "Transaction type")
  public TranscationTypeEnum getTranscationType() {
    return transcationType;
  }

  public void setTranscationType(TranscationTypeEnum transcationType) {
    this.transcationType = transcationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParseAbiDataRequest parseAbiDataRequest = (ParseAbiDataRequest) o;
    return Objects.equals(this.chainId, parseAbiDataRequest.chainId) &&
        Objects.equals(this.contractAddress, parseAbiDataRequest.contractAddress) &&
        Objects.equals(this.data, parseAbiDataRequest.data) &&
        Objects.equals(this.input, parseAbiDataRequest.input) &&
        Objects.equals(this.signer, parseAbiDataRequest.signer) &&
        Objects.equals(this.transcationType, parseAbiDataRequest.transcationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chainId, contractAddress, data, input, signer, transcationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParseAbiDataRequest {\n");
    
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    signer: ").append(toIndentedString(signer)).append("\n");
    sb.append("    transcationType: ").append(toIndentedString(transcationType)).append("\n");
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
