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
import io.gopluslabs.client.model.AuditInfo;
import io.gopluslabs.client.model.ContractsSecurity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DappContractSecurityResponse
 */



public class DappContractSecurityResponse {
  @SerializedName("audit_info")
  private List<AuditInfo> auditInfo = null;

  @SerializedName("contracts_security")
  private List<ContractsSecurity> contractsSecurity = null;

  @SerializedName("is_audit")
  private Integer isAudit = null;

  @SerializedName("project_name")
  private String projectName = null;

  @SerializedName("trust_list")
  private Integer trustList = null;

  @SerializedName("url")
  private String url = null;

  public DappContractSecurityResponse auditInfo(List<AuditInfo> auditInfo) {
    this.auditInfo = auditInfo;
    return this;
  }

  public DappContractSecurityResponse addAuditInfoItem(AuditInfo auditInfoItem) {
    if (this.auditInfo == null) {
      this.auditInfo = new ArrayList<AuditInfo>();
    }
    this.auditInfo.add(auditInfoItem);
    return this;
  }

   /**
   * audit info(Notice:When the dApp was not audited, (\&quot;is_audit\&quot;&#x3D;0), it will return \&quot;null\&quot;.If there are multiple audit reports, the information of the latest audit report is displayed.)
   * @return auditInfo
  **/
  @Schema(description = "audit info(Notice:When the dApp was not audited, (\"is_audit\"=0), it will return \"null\".If there are multiple audit reports, the information of the latest audit report is displayed.)")
  public List<AuditInfo> getAuditInfo() {
    return auditInfo;
  }

  public void setAuditInfo(List<AuditInfo> auditInfo) {
    this.auditInfo = auditInfo;
  }

  public DappContractSecurityResponse contractsSecurity(List<ContractsSecurity> contractsSecurity) {
    this.contractsSecurity = contractsSecurity;
    return this;
  }

  public DappContractSecurityResponse addContractsSecurityItem(ContractsSecurity contractsSecurityItem) {
    if (this.contractsSecurity == null) {
      this.contractsSecurity = new ArrayList<ContractsSecurity>();
    }
    this.contractsSecurity.add(contractsSecurityItem);
    return this;
  }

   /**
   * Get contractsSecurity
   * @return contractsSecurity
  **/
  @Schema(description = "")
  public List<ContractsSecurity> getContractsSecurity() {
    return contractsSecurity;
  }

  public void setContractsSecurity(List<ContractsSecurity> contractsSecurity) {
    this.contractsSecurity = contractsSecurity;
  }

  public DappContractSecurityResponse isAudit(Integer isAudit) {
    this.isAudit = isAudit;
    return this;
  }

   /**
   * It describes whether the dApp was audited by a reputable audit firm. \&quot;1\&quot; means true; \&quot;0\&quot; means that we have not found audit information for this dApp .(Notice:Return \&quot;0\&quot; does not mean the dApp was not audited. Maybe we just haven&#x27;t found audit information for this dApp yet.)
   * @return isAudit
  **/
  @Schema(description = "It describes whether the dApp was audited by a reputable audit firm. \"1\" means true; \"0\" means that we have not found audit information for this dApp .(Notice:Return \"0\" does not mean the dApp was not audited. Maybe we just haven't found audit information for this dApp yet.)")
  public Integer getIsAudit() {
    return isAudit;
  }

  public void setIsAudit(Integer isAudit) {
    this.isAudit = isAudit;
  }

  public DappContractSecurityResponse projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * It describes the dApp project name.
   * @return projectName
  **/
  @Schema(description = "It describes the dApp project name.")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public DappContractSecurityResponse trustList(Integer trustList) {
    this.trustList = trustList;
    return this;
  }

   /**
   * It describes whether the dapp is a famous and trustworthy one. \&quot;1\&quot; means true;  \&quot;0\&quot; means that this dapp is not yet in our trusted list.(Notice:(1) Only \&quot;trust_list\&quot;: \&quot;1\&quot; means it is a famous and trustworthy dapp.  (2) \&quot;0\&quot; return doesn&#x27;t mean it is risky.)
   * @return trustList
  **/
  @Schema(description = "It describes whether the dapp is a famous and trustworthy one. \"1\" means true;  \"0\" means that this dapp is not yet in our trusted list.(Notice:(1) Only \"trust_list\": \"1\" means it is a famous and trustworthy dapp.  (2) \"0\" return doesn't mean it is risky.)")
  public Integer getTrustList() {
    return trustList;
  }

  public void setTrustList(Integer trustList) {
    this.trustList = trustList;
  }

  public DappContractSecurityResponse url(String url) {
    this.url = url;
    return this;
  }

   /**
   * It describes the dApp&#x27;s website link.
   * @return url
  **/
  @Schema(description = "It describes the dApp's website link.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DappContractSecurityResponse dappContractSecurityResponse = (DappContractSecurityResponse) o;
    return Objects.equals(this.auditInfo, dappContractSecurityResponse.auditInfo) &&
        Objects.equals(this.contractsSecurity, dappContractSecurityResponse.contractsSecurity) &&
        Objects.equals(this.isAudit, dappContractSecurityResponse.isAudit) &&
        Objects.equals(this.projectName, dappContractSecurityResponse.projectName) &&
        Objects.equals(this.trustList, dappContractSecurityResponse.trustList) &&
        Objects.equals(this.url, dappContractSecurityResponse.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditInfo, contractsSecurity, isAudit, projectName, trustList, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DappContractSecurityResponse {\n");
    
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    contractsSecurity: ").append(toIndentedString(contractsSecurity)).append("\n");
    sb.append("    isAudit: ").append(toIndentedString(isAudit)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    trustList: ").append(toIndentedString(trustList)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
