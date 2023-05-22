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
import io.swagger.client.model.ResponseWrapperGetNftInfoResultPrivilegedBurn;
import io.swagger.client.model.ResponseWrapperGetNftInfoResultPrivilegedMinting;
import io.swagger.client.model.ResponseWrapperGetNftInfoResultSameNfts;
import io.swagger.client.model.ResponseWrapperGetNftInfoResultSelfDestruct;
import io.swagger.client.model.ResponseWrapperGetNftInfoResultTransferWithoutApproval;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * Response result
 */
@Schema(description = "Response result")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-22T12:45:14.641970156Z[Etc/UTC]")
public class ResponseWrapperGetNftInfoResult {
  @SerializedName("traded_volume_24h")
  private BigDecimal tradedVolume24h = null;

  @SerializedName("total_volume")
  private BigDecimal totalVolume = null;

  @SerializedName("red_check_mark")
  private Integer redCheckMark = null;

  @SerializedName("nft_proxy")
  private Integer nftProxy = null;

  @SerializedName("restricted_approval")
  private Integer restrictedApproval = null;

  @SerializedName("highest_price")
  private BigDecimal highestPrice = null;

  @SerializedName("transfer_without_approval")
  private ResponseWrapperGetNftInfoResultTransferWithoutApproval transferWithoutApproval = null;

  @SerializedName("discord_url")
  private String discordUrl = null;

  @SerializedName("nft_open_source")
  private Integer nftOpenSource = null;

  @SerializedName("privileged_minting")
  private ResponseWrapperGetNftInfoResultPrivilegedMinting privilegedMinting = null;

  @SerializedName("nft_owner_number")
  private Long nftOwnerNumber = null;

  @SerializedName("trust_list")
  private Integer trustList = null;

  @SerializedName("token_id")
  private String tokenId = null;

  @SerializedName("lowest_price_24h")
  private BigDecimal lowestPrice24h = null;

  @SerializedName("average_price_24h")
  private BigDecimal averagePrice24h = null;

  @SerializedName("nft_erc")
  private String nftErc = null;

  @SerializedName("creator_address")
  private String creatorAddress = null;

  @SerializedName("medium_url")
  private String mediumUrl = null;

  @SerializedName("malicious_nft_contract")
  private Integer maliciousNftContract = null;

  @SerializedName("privileged_burn")
  private ResponseWrapperGetNftInfoResultPrivilegedBurn privilegedBurn = null;

  @SerializedName("twitter_url")
  private String twitterUrl = null;

  @SerializedName("nft_symbol")
  private String nftSymbol = null;

  @SerializedName("nft_description")
  private String nftDescription = null;

  @SerializedName("self_destruct")
  private ResponseWrapperGetNftInfoResultSelfDestruct selfDestruct = null;

  @SerializedName("metadata_frozen")
  private Integer metadataFrozen = null;

  @SerializedName("nft_verified")
  private Integer nftVerified = null;

  @SerializedName("same_nfts")
  private List<ResponseWrapperGetNftInfoResultSameNfts> sameNfts = null;

  @SerializedName("nft_items")
  private Long nftItems = null;

  @SerializedName("oversupply_minting")
  private Integer oversupplyMinting = null;

  @SerializedName("nft_name")
  private String nftName = null;

  @SerializedName("website_url")
  private String websiteUrl = null;

  @SerializedName("github_url")
  private String githubUrl = null;

  @SerializedName("telegram_url")
  private String telegramUrl = null;

  @SerializedName("sales_24h")
  private BigDecimal sales24h = null;

  @SerializedName("create_block_number")
  private Long createBlockNumber = null;

  public ResponseWrapperGetNftInfoResult tradedVolume24h(BigDecimal tradedVolume24h) {
    this.tradedVolume24h = tradedVolume24h;
    return this;
  }

   /**
   * It describes the trading volume of the NFT in 24h.
   * @return tradedVolume24h
  **/
  @Schema(description = "It describes the trading volume of the NFT in 24h.")
  public BigDecimal getTradedVolume24h() {
    return tradedVolume24h;
  }

  public void setTradedVolume24h(BigDecimal tradedVolume24h) {
    this.tradedVolume24h = tradedVolume24h;
  }

  public ResponseWrapperGetNftInfoResult totalVolume(BigDecimal totalVolume) {
    this.totalVolume = totalVolume;
    return this;
  }

   /**
   * It describes the total volume of the NFT.
   * @return totalVolume
  **/
  @Schema(description = "It describes the total volume of the NFT.")
  public BigDecimal getTotalVolume() {
    return totalVolume;
  }

  public void setTotalVolume(BigDecimal totalVolume) {
    this.totalVolume = totalVolume;
  }

  public ResponseWrapperGetNftInfoResult redCheckMark(Integer redCheckMark) {
    this.redCheckMark = redCheckMark;
    return this;
  }

   /**
   * red check mark
   * @return redCheckMark
  **/
  @Schema(description = "red check mark")
  public Integer getRedCheckMark() {
    return redCheckMark;
  }

  public void setRedCheckMark(Integer redCheckMark) {
    this.redCheckMark = redCheckMark;
  }

  public ResponseWrapperGetNftInfoResult nftProxy(Integer nftProxy) {
    this.nftProxy = nftProxy;
    return this;
  }

   /**
   * It describes whether this NFT contract has a proxy contract.  \&quot;1\&quot; means true;  \&quot;0\&quot; means false;  \&quot;Null\&quot; means unknown.(Notice:(1) When \&quot;is_open_source\&quot;: \&quot;0\&quot;, it will return \&quot;null\&quot;. (2) Most Proxy contracts are accompanied by modifiable implementation contracts, and implementation contracts may contain significant potential risk.)
   * @return nftProxy
  **/
  @Schema(description = "It describes whether this NFT contract has a proxy contract.  \"1\" means true;  \"0\" means false;  \"Null\" means unknown.(Notice:(1) When \"is_open_source\": \"0\", it will return \"null\". (2) Most Proxy contracts are accompanied by modifiable implementation contracts, and implementation contracts may contain significant potential risk.)")
  public Integer getNftProxy() {
    return nftProxy;
  }

  public void setNftProxy(Integer nftProxy) {
    this.nftProxy = nftProxy;
  }

  public ResponseWrapperGetNftInfoResult restrictedApproval(Integer restrictedApproval) {
    this.restrictedApproval = restrictedApproval;
    return this;
  }

   /**
   * It describes whether the NFT contract can restrict the approval, resulting in NFT can not be traded on the NFT DEX. \&quot;1\&quot; means true;  \&quot;0\&quot; means false;  \&quot;Null\&quot; means unknown.(Notice:If this risk exists, it means that users will not be able to trade the NFT on the exchange and only privileged users in the whitelist will be able to trade normally.)
   * @return restrictedApproval
  **/
  @Schema(description = "It describes whether the NFT contract can restrict the approval, resulting in NFT can not be traded on the NFT DEX. \"1\" means true;  \"0\" means false;  \"Null\" means unknown.(Notice:If this risk exists, it means that users will not be able to trade the NFT on the exchange and only privileged users in the whitelist will be able to trade normally.)")
  public Integer getRestrictedApproval() {
    return restrictedApproval;
  }

  public void setRestrictedApproval(Integer restrictedApproval) {
    this.restrictedApproval = restrictedApproval;
  }

  public ResponseWrapperGetNftInfoResult highestPrice(BigDecimal highestPrice) {
    this.highestPrice = highestPrice;
    return this;
  }

   /**
   * It describes the highest price of the NFT.
   * @return highestPrice
  **/
  @Schema(description = "It describes the highest price of the NFT.")
  public BigDecimal getHighestPrice() {
    return highestPrice;
  }

  public void setHighestPrice(BigDecimal highestPrice) {
    this.highestPrice = highestPrice;
  }

  public ResponseWrapperGetNftInfoResult transferWithoutApproval(ResponseWrapperGetNftInfoResultTransferWithoutApproval transferWithoutApproval) {
    this.transferWithoutApproval = transferWithoutApproval;
    return this;
  }

   /**
   * Get transferWithoutApproval
   * @return transferWithoutApproval
  **/
  @Schema(description = "")
  public ResponseWrapperGetNftInfoResultTransferWithoutApproval getTransferWithoutApproval() {
    return transferWithoutApproval;
  }

  public void setTransferWithoutApproval(ResponseWrapperGetNftInfoResultTransferWithoutApproval transferWithoutApproval) {
    this.transferWithoutApproval = transferWithoutApproval;
  }

  public ResponseWrapperGetNftInfoResult discordUrl(String discordUrl) {
    this.discordUrl = discordUrl;
    return this;
  }

   /**
   * It describes the discord url of the NFT. Return “null” means there is no discord url or didn&#x27;t find the discord url.
   * @return discordUrl
  **/
  @Schema(description = "It describes the discord url of the NFT. Return “null” means there is no discord url or didn't find the discord url.")
  public String getDiscordUrl() {
    return discordUrl;
  }

  public void setDiscordUrl(String discordUrl) {
    this.discordUrl = discordUrl;
  }

  public ResponseWrapperGetNftInfoResult nftOpenSource(Integer nftOpenSource) {
    this.nftOpenSource = nftOpenSource;
    return this;
  }

   /**
   * It describes whether this contract is open source.  \&quot;1\&quot; means true;  \&quot;0\&quot; means false.(Notice:Un-open-sourced contracts may hide various unknown mechanisms and are extremely risky. When the contract is not open source, we will not be able to detect other risk items.)
   * @return nftOpenSource
  **/
  @Schema(description = "It describes whether this contract is open source.  \"1\" means true;  \"0\" means false.(Notice:Un-open-sourced contracts may hide various unknown mechanisms and are extremely risky. When the contract is not open source, we will not be able to detect other risk items.)")
  public Integer getNftOpenSource() {
    return nftOpenSource;
  }

  public void setNftOpenSource(Integer nftOpenSource) {
    this.nftOpenSource = nftOpenSource;
  }

  public ResponseWrapperGetNftInfoResult privilegedMinting(ResponseWrapperGetNftInfoResultPrivilegedMinting privilegedMinting) {
    this.privilegedMinting = privilegedMinting;
    return this;
  }

   /**
   * Get privilegedMinting
   * @return privilegedMinting
  **/
  @Schema(description = "")
  public ResponseWrapperGetNftInfoResultPrivilegedMinting getPrivilegedMinting() {
    return privilegedMinting;
  }

  public void setPrivilegedMinting(ResponseWrapperGetNftInfoResultPrivilegedMinting privilegedMinting) {
    this.privilegedMinting = privilegedMinting;
  }

  public ResponseWrapperGetNftInfoResult nftOwnerNumber(Long nftOwnerNumber) {
    this.nftOwnerNumber = nftOwnerNumber;
    return this;
  }

   /**
   * It describes the holders of the NFT.
   * @return nftOwnerNumber
  **/
  @Schema(description = "It describes the holders of the NFT.")
  public Long getNftOwnerNumber() {
    return nftOwnerNumber;
  }

  public void setNftOwnerNumber(Long nftOwnerNumber) {
    this.nftOwnerNumber = nftOwnerNumber;
  }

  public ResponseWrapperGetNftInfoResult trustList(Integer trustList) {
    this.trustList = trustList;
    return this;
  }

   /**
   * It describes whether the NFT is a famous and trustworthy one. \&quot;1\&quot; means true;  Return \&quot;null\&quot; means no result.(Notice:(1) Only \&quot;trust_list\&quot;: \&quot;1\&quot; means it is a famous and trustworthy NFT. (2) Return \&quot;null\&quot; doesn&#x27;t mean it is risky.Th)
   * @return trustList
  **/
  @Schema(description = "It describes whether the NFT is a famous and trustworthy one. \"1\" means true;  Return \"null\" means no result.(Notice:(1) Only \"trust_list\": \"1\" means it is a famous and trustworthy NFT. (2) Return \"null\" doesn't mean it is risky.Th)")
  public Integer getTrustList() {
    return trustList;
  }

  public void setTrustList(Integer trustList) {
    this.trustList = trustList;
  }

  public ResponseWrapperGetNftInfoResult tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * token_id
   * @return tokenId
  **/
  @Schema(description = "token_id")
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  public ResponseWrapperGetNftInfoResult lowestPrice24h(BigDecimal lowestPrice24h) {
    this.lowestPrice24h = lowestPrice24h;
    return this;
  }

   /**
   * It describes the lowest price of the NFT in 24h.
   * @return lowestPrice24h
  **/
  @Schema(description = "It describes the lowest price of the NFT in 24h.")
  public BigDecimal getLowestPrice24h() {
    return lowestPrice24h;
  }

  public void setLowestPrice24h(BigDecimal lowestPrice24h) {
    this.lowestPrice24h = lowestPrice24h;
  }

  public ResponseWrapperGetNftInfoResult averagePrice24h(BigDecimal averagePrice24h) {
    this.averagePrice24h = averagePrice24h;
    return this;
  }

   /**
   * It describes the average price of the NFT in 24h.
   * @return averagePrice24h
  **/
  @Schema(description = "It describes the average price of the NFT in 24h.")
  public BigDecimal getAveragePrice24h() {
    return averagePrice24h;
  }

  public void setAveragePrice24h(BigDecimal averagePrice24h) {
    this.averagePrice24h = averagePrice24h;
  }

  public ResponseWrapperGetNftInfoResult nftErc(String nftErc) {
    this.nftErc = nftErc;
    return this;
  }

   /**
   * It describes the ERC protocol of the NFT. Example: \&quot;nft_erc\&quot;: \&quot;erc721\&quot;
   * @return nftErc
  **/
  @Schema(description = "It describes the ERC protocol of the NFT. Example: \"nft_erc\": \"erc721\"")
  public String getNftErc() {
    return nftErc;
  }

  public void setNftErc(String nftErc) {
    this.nftErc = nftErc;
  }

  public ResponseWrapperGetNftInfoResult creatorAddress(String creatorAddress) {
    this.creatorAddress = creatorAddress;
    return this;
  }

   /**
   * It describes the creator address of the NFT. Example: \&quot;creator_address\&quot;: \&quot;0x1ee0af784b96bb55ece98c9b15675726b0da1b6b\&quot;; Return “null” means that we didn&#x27;t find the creator address.
   * @return creatorAddress
  **/
  @Schema(description = "It describes the creator address of the NFT. Example: \"creator_address\": \"0x1ee0af784b96bb55ece98c9b15675726b0da1b6b\"; Return “null” means that we didn't find the creator address.")
  public String getCreatorAddress() {
    return creatorAddress;
  }

  public void setCreatorAddress(String creatorAddress) {
    this.creatorAddress = creatorAddress;
  }

  public ResponseWrapperGetNftInfoResult mediumUrl(String mediumUrl) {
    this.mediumUrl = mediumUrl;
    return this;
  }

   /**
   * It describes the medium url of the NFT. Return “null” means there is no medium url or didn&#x27;t find the medium url.
   * @return mediumUrl
  **/
  @Schema(description = "It describes the medium url of the NFT. Return “null” means there is no medium url or didn't find the medium url.")
  public String getMediumUrl() {
    return mediumUrl;
  }

  public void setMediumUrl(String mediumUrl) {
    this.mediumUrl = mediumUrl;
  }

  public ResponseWrapperGetNftInfoResult maliciousNftContract(Integer maliciousNftContract) {
    this.maliciousNftContract = maliciousNftContract;
    return this;
  }

   /**
   * It describes whether this NFT has performed malicious behaviors. \&quot;1\&quot; means true; \&quot;0\&quot; means false.(Notice:Malicious behaviors include random additions, blacklist abuse, falsified transactions, and other high-risk behaviors. Interacting with NFTs flagged as Malicious may contain a high level of risk)
   * @return maliciousNftContract
  **/
  @Schema(description = "It describes whether this NFT has performed malicious behaviors. \"1\" means true; \"0\" means false.(Notice:Malicious behaviors include random additions, blacklist abuse, falsified transactions, and other high-risk behaviors. Interacting with NFTs flagged as Malicious may contain a high level of risk)")
  public Integer getMaliciousNftContract() {
    return maliciousNftContract;
  }

  public void setMaliciousNftContract(Integer maliciousNftContract) {
    this.maliciousNftContract = maliciousNftContract;
  }

  public ResponseWrapperGetNftInfoResult privilegedBurn(ResponseWrapperGetNftInfoResultPrivilegedBurn privilegedBurn) {
    this.privilegedBurn = privilegedBurn;
    return this;
  }

   /**
   * Get privilegedBurn
   * @return privilegedBurn
  **/
  @Schema(description = "")
  public ResponseWrapperGetNftInfoResultPrivilegedBurn getPrivilegedBurn() {
    return privilegedBurn;
  }

  public void setPrivilegedBurn(ResponseWrapperGetNftInfoResultPrivilegedBurn privilegedBurn) {
    this.privilegedBurn = privilegedBurn;
  }

  public ResponseWrapperGetNftInfoResult twitterUrl(String twitterUrl) {
    this.twitterUrl = twitterUrl;
    return this;
  }

   /**
   * It describes the twitter url of the NFT. Return “null” means there is no twitter url or didn&#x27;t find the twitter url.
   * @return twitterUrl
  **/
  @Schema(description = "It describes the twitter url of the NFT. Return “null” means there is no twitter url or didn't find the twitter url.")
  public String getTwitterUrl() {
    return twitterUrl;
  }

  public void setTwitterUrl(String twitterUrl) {
    this.twitterUrl = twitterUrl;
  }

  public ResponseWrapperGetNftInfoResult nftSymbol(String nftSymbol) {
    this.nftSymbol = nftSymbol;
    return this;
  }

   /**
   * nft_symbol
   * @return nftSymbol
  **/
  @Schema(description = "nft_symbol")
  public String getNftSymbol() {
    return nftSymbol;
  }

  public void setNftSymbol(String nftSymbol) {
    this.nftSymbol = nftSymbol;
  }

  public ResponseWrapperGetNftInfoResult nftDescription(String nftDescription) {
    this.nftDescription = nftDescription;
    return this;
  }

   /**
   * It describes the introduction of the NFT. Return “null” means there is no description of the NFT.
   * @return nftDescription
  **/
  @Schema(description = "It describes the introduction of the NFT. Return “null” means there is no description of the NFT.")
  public String getNftDescription() {
    return nftDescription;
  }

  public void setNftDescription(String nftDescription) {
    this.nftDescription = nftDescription;
  }

  public ResponseWrapperGetNftInfoResult selfDestruct(ResponseWrapperGetNftInfoResultSelfDestruct selfDestruct) {
    this.selfDestruct = selfDestruct;
    return this;
  }

   /**
   * Get selfDestruct
   * @return selfDestruct
  **/
  @Schema(description = "")
  public ResponseWrapperGetNftInfoResultSelfDestruct getSelfDestruct() {
    return selfDestruct;
  }

  public void setSelfDestruct(ResponseWrapperGetNftInfoResultSelfDestruct selfDestruct) {
    this.selfDestruct = selfDestruct;
  }

  public ResponseWrapperGetNftInfoResult metadataFrozen(Integer metadataFrozen) {
    this.metadataFrozen = metadataFrozen;
    return this;
  }

   /**
   * metadata_frozen
   * @return metadataFrozen
  **/
  @Schema(description = "metadata_frozen")
  public Integer getMetadataFrozen() {
    return metadataFrozen;
  }

  public void setMetadataFrozen(Integer metadataFrozen) {
    this.metadataFrozen = metadataFrozen;
  }

  public ResponseWrapperGetNftInfoResult nftVerified(Integer nftVerified) {
    this.nftVerified = nftVerified;
    return this;
  }

   /**
   * It describes whether the NFT is verified. \&quot;1\&quot; means that the NFT is verified; \&quot;0\&quot; means that we did not find any information about whether the NFT is verified.
   * @return nftVerified
  **/
  @Schema(description = "It describes whether the NFT is verified. \"1\" means that the NFT is verified; \"0\" means that we did not find any information about whether the NFT is verified.")
  public Integer getNftVerified() {
    return nftVerified;
  }

  public void setNftVerified(Integer nftVerified) {
    this.nftVerified = nftVerified;
  }

  public ResponseWrapperGetNftInfoResult sameNfts(List<ResponseWrapperGetNftInfoResultSameNfts> sameNfts) {
    this.sameNfts = sameNfts;
    return this;
  }

  public ResponseWrapperGetNftInfoResult addSameNftsItem(ResponseWrapperGetNftInfoResultSameNfts sameNftsItem) {
    if (this.sameNfts == null) {
      this.sameNfts = new ArrayList<ResponseWrapperGetNftInfoResultSameNfts>();
    }
    this.sameNfts.add(sameNftsItem);
    return this;
  }

   /**
   * It describes the info of other NFTs with duplicate name and symbol.
   * @return sameNfts
  **/
  @Schema(description = "It describes the info of other NFTs with duplicate name and symbol.")
  public List<ResponseWrapperGetNftInfoResultSameNfts> getSameNfts() {
    return sameNfts;
  }

  public void setSameNfts(List<ResponseWrapperGetNftInfoResultSameNfts> sameNfts) {
    this.sameNfts = sameNfts;
  }

  public ResponseWrapperGetNftInfoResult nftItems(Long nftItems) {
    this.nftItems = nftItems;
    return this;
  }

   /**
   * It describes the numbers of the NFT.
   * @return nftItems
  **/
  @Schema(description = "It describes the numbers of the NFT.")
  public Long getNftItems() {
    return nftItems;
  }

  public void setNftItems(Long nftItems) {
    this.nftItems = nftItems;
  }

  public ResponseWrapperGetNftInfoResult oversupplyMinting(Integer oversupplyMinting) {
    this.oversupplyMinting = oversupplyMinting;
    return this;
  }

   /**
   * It describes whether this NFT owner can bypass the maximum amount of minting specified in the contract, and continue to mint NFTs beyond this limit.  \&quot;1\&quot; means true;  \&quot;0\&quot; means false;  \&quot;Null\&quot; means unknown.(Notice:Oversupply minting refers to the existence of a special mint method in the NFT contract — the owner can bypass the maximum amount of minting specified in the contract, and continue to mint NFTs beyond this limit.)
   * @return oversupplyMinting
  **/
  @Schema(description = "It describes whether this NFT owner can bypass the maximum amount of minting specified in the contract, and continue to mint NFTs beyond this limit.  \"1\" means true;  \"0\" means false;  \"Null\" means unknown.(Notice:Oversupply minting refers to the existence of a special mint method in the NFT contract — the owner can bypass the maximum amount of minting specified in the contract, and continue to mint NFTs beyond this limit.)")
  public Integer getOversupplyMinting() {
    return oversupplyMinting;
  }

  public void setOversupplyMinting(Integer oversupplyMinting) {
    this.oversupplyMinting = oversupplyMinting;
  }

  public ResponseWrapperGetNftInfoResult nftName(String nftName) {
    this.nftName = nftName;
    return this;
  }

   /**
   * nft_name
   * @return nftName
  **/
  @Schema(description = "nft_name")
  public String getNftName() {
    return nftName;
  }

  public void setNftName(String nftName) {
    this.nftName = nftName;
  }

  public ResponseWrapperGetNftInfoResult websiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
    return this;
  }

   /**
   * It describes the website url of the NFT. Return “null” means there is no website url or didn&#x27;t find the website url.
   * @return websiteUrl
  **/
  @Schema(description = "It describes the website url of the NFT. Return “null” means there is no website url or didn't find the website url.")
  public String getWebsiteUrl() {
    return websiteUrl;
  }

  public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }

  public ResponseWrapperGetNftInfoResult githubUrl(String githubUrl) {
    this.githubUrl = githubUrl;
    return this;
  }

   /**
   * It describes the github url of the NFT. Return “null” means there is no github url or didn&#x27;t find the github url.
   * @return githubUrl
  **/
  @Schema(description = "It describes the github url of the NFT. Return “null” means there is no github url or didn't find the github url.")
  public String getGithubUrl() {
    return githubUrl;
  }

  public void setGithubUrl(String githubUrl) {
    this.githubUrl = githubUrl;
  }

  public ResponseWrapperGetNftInfoResult telegramUrl(String telegramUrl) {
    this.telegramUrl = telegramUrl;
    return this;
  }

   /**
   * It describes the telegram url of the NFT. Return “null” means there is no telegram url or didn&#x27;t find the telegram url.
   * @return telegramUrl
  **/
  @Schema(description = "It describes the telegram url of the NFT. Return “null” means there is no telegram url or didn't find the telegram url.")
  public String getTelegramUrl() {
    return telegramUrl;
  }

  public void setTelegramUrl(String telegramUrl) {
    this.telegramUrl = telegramUrl;
  }

  public ResponseWrapperGetNftInfoResult sales24h(BigDecimal sales24h) {
    this.sales24h = sales24h;
    return this;
  }

   /**
   * It describes the sales of the NFT in 24h.
   * @return sales24h
  **/
  @Schema(description = "It describes the sales of the NFT in 24h.")
  public BigDecimal getSales24h() {
    return sales24h;
  }

  public void setSales24h(BigDecimal sales24h) {
    this.sales24h = sales24h;
  }

  public ResponseWrapperGetNftInfoResult createBlockNumber(Long createBlockNumber) {
    this.createBlockNumber = createBlockNumber;
    return this;
  }

   /**
   * It describes the number of blocks created for the NFT. Return “null” means that we didn&#x27;t find the number of blocks created for the NFT.
   * @return createBlockNumber
  **/
  @Schema(description = "It describes the number of blocks created for the NFT. Return “null” means that we didn't find the number of blocks created for the NFT.")
  public Long getCreateBlockNumber() {
    return createBlockNumber;
  }

  public void setCreateBlockNumber(Long createBlockNumber) {
    this.createBlockNumber = createBlockNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseWrapperGetNftInfoResult responseWrapperGetNftInfoResult = (ResponseWrapperGetNftInfoResult) o;
    return Objects.equals(this.tradedVolume24h, responseWrapperGetNftInfoResult.tradedVolume24h) &&
        Objects.equals(this.totalVolume, responseWrapperGetNftInfoResult.totalVolume) &&
        Objects.equals(this.redCheckMark, responseWrapperGetNftInfoResult.redCheckMark) &&
        Objects.equals(this.nftProxy, responseWrapperGetNftInfoResult.nftProxy) &&
        Objects.equals(this.restrictedApproval, responseWrapperGetNftInfoResult.restrictedApproval) &&
        Objects.equals(this.highestPrice, responseWrapperGetNftInfoResult.highestPrice) &&
        Objects.equals(this.transferWithoutApproval, responseWrapperGetNftInfoResult.transferWithoutApproval) &&
        Objects.equals(this.discordUrl, responseWrapperGetNftInfoResult.discordUrl) &&
        Objects.equals(this.nftOpenSource, responseWrapperGetNftInfoResult.nftOpenSource) &&
        Objects.equals(this.privilegedMinting, responseWrapperGetNftInfoResult.privilegedMinting) &&
        Objects.equals(this.nftOwnerNumber, responseWrapperGetNftInfoResult.nftOwnerNumber) &&
        Objects.equals(this.trustList, responseWrapperGetNftInfoResult.trustList) &&
        Objects.equals(this.tokenId, responseWrapperGetNftInfoResult.tokenId) &&
        Objects.equals(this.lowestPrice24h, responseWrapperGetNftInfoResult.lowestPrice24h) &&
        Objects.equals(this.averagePrice24h, responseWrapperGetNftInfoResult.averagePrice24h) &&
        Objects.equals(this.nftErc, responseWrapperGetNftInfoResult.nftErc) &&
        Objects.equals(this.creatorAddress, responseWrapperGetNftInfoResult.creatorAddress) &&
        Objects.equals(this.mediumUrl, responseWrapperGetNftInfoResult.mediumUrl) &&
        Objects.equals(this.maliciousNftContract, responseWrapperGetNftInfoResult.maliciousNftContract) &&
        Objects.equals(this.privilegedBurn, responseWrapperGetNftInfoResult.privilegedBurn) &&
        Objects.equals(this.twitterUrl, responseWrapperGetNftInfoResult.twitterUrl) &&
        Objects.equals(this.nftSymbol, responseWrapperGetNftInfoResult.nftSymbol) &&
        Objects.equals(this.nftDescription, responseWrapperGetNftInfoResult.nftDescription) &&
        Objects.equals(this.selfDestruct, responseWrapperGetNftInfoResult.selfDestruct) &&
        Objects.equals(this.metadataFrozen, responseWrapperGetNftInfoResult.metadataFrozen) &&
        Objects.equals(this.nftVerified, responseWrapperGetNftInfoResult.nftVerified) &&
        Objects.equals(this.sameNfts, responseWrapperGetNftInfoResult.sameNfts) &&
        Objects.equals(this.nftItems, responseWrapperGetNftInfoResult.nftItems) &&
        Objects.equals(this.oversupplyMinting, responseWrapperGetNftInfoResult.oversupplyMinting) &&
        Objects.equals(this.nftName, responseWrapperGetNftInfoResult.nftName) &&
        Objects.equals(this.websiteUrl, responseWrapperGetNftInfoResult.websiteUrl) &&
        Objects.equals(this.githubUrl, responseWrapperGetNftInfoResult.githubUrl) &&
        Objects.equals(this.telegramUrl, responseWrapperGetNftInfoResult.telegramUrl) &&
        Objects.equals(this.sales24h, responseWrapperGetNftInfoResult.sales24h) &&
        Objects.equals(this.createBlockNumber, responseWrapperGetNftInfoResult.createBlockNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tradedVolume24h, totalVolume, redCheckMark, nftProxy, restrictedApproval, highestPrice, transferWithoutApproval, discordUrl, nftOpenSource, privilegedMinting, nftOwnerNumber, trustList, tokenId, lowestPrice24h, averagePrice24h, nftErc, creatorAddress, mediumUrl, maliciousNftContract, privilegedBurn, twitterUrl, nftSymbol, nftDescription, selfDestruct, metadataFrozen, nftVerified, sameNfts, nftItems, oversupplyMinting, nftName, websiteUrl, githubUrl, telegramUrl, sales24h, createBlockNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWrapperGetNftInfoResult {\n");
    
    sb.append("    tradedVolume24h: ").append(toIndentedString(tradedVolume24h)).append("\n");
    sb.append("    totalVolume: ").append(toIndentedString(totalVolume)).append("\n");
    sb.append("    redCheckMark: ").append(toIndentedString(redCheckMark)).append("\n");
    sb.append("    nftProxy: ").append(toIndentedString(nftProxy)).append("\n");
    sb.append("    restrictedApproval: ").append(toIndentedString(restrictedApproval)).append("\n");
    sb.append("    highestPrice: ").append(toIndentedString(highestPrice)).append("\n");
    sb.append("    transferWithoutApproval: ").append(toIndentedString(transferWithoutApproval)).append("\n");
    sb.append("    discordUrl: ").append(toIndentedString(discordUrl)).append("\n");
    sb.append("    nftOpenSource: ").append(toIndentedString(nftOpenSource)).append("\n");
    sb.append("    privilegedMinting: ").append(toIndentedString(privilegedMinting)).append("\n");
    sb.append("    nftOwnerNumber: ").append(toIndentedString(nftOwnerNumber)).append("\n");
    sb.append("    trustList: ").append(toIndentedString(trustList)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    lowestPrice24h: ").append(toIndentedString(lowestPrice24h)).append("\n");
    sb.append("    averagePrice24h: ").append(toIndentedString(averagePrice24h)).append("\n");
    sb.append("    nftErc: ").append(toIndentedString(nftErc)).append("\n");
    sb.append("    creatorAddress: ").append(toIndentedString(creatorAddress)).append("\n");
    sb.append("    mediumUrl: ").append(toIndentedString(mediumUrl)).append("\n");
    sb.append("    maliciousNftContract: ").append(toIndentedString(maliciousNftContract)).append("\n");
    sb.append("    privilegedBurn: ").append(toIndentedString(privilegedBurn)).append("\n");
    sb.append("    twitterUrl: ").append(toIndentedString(twitterUrl)).append("\n");
    sb.append("    nftSymbol: ").append(toIndentedString(nftSymbol)).append("\n");
    sb.append("    nftDescription: ").append(toIndentedString(nftDescription)).append("\n");
    sb.append("    selfDestruct: ").append(toIndentedString(selfDestruct)).append("\n");
    sb.append("    metadataFrozen: ").append(toIndentedString(metadataFrozen)).append("\n");
    sb.append("    nftVerified: ").append(toIndentedString(nftVerified)).append("\n");
    sb.append("    sameNfts: ").append(toIndentedString(sameNfts)).append("\n");
    sb.append("    nftItems: ").append(toIndentedString(nftItems)).append("\n");
    sb.append("    oversupplyMinting: ").append(toIndentedString(oversupplyMinting)).append("\n");
    sb.append("    nftName: ").append(toIndentedString(nftName)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
    sb.append("    githubUrl: ").append(toIndentedString(githubUrl)).append("\n");
    sb.append("    telegramUrl: ").append(toIndentedString(telegramUrl)).append("\n");
    sb.append("    sales24h: ").append(toIndentedString(sales24h)).append("\n");
    sb.append("    createBlockNumber: ").append(toIndentedString(createBlockNumber)).append("\n");
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
