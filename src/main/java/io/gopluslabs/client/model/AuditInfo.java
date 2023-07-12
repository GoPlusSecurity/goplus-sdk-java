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
/**
 * AuditInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-12T10:15:49.495196307Z[Etc/UTC]")

public class AuditInfo {
  @SerializedName("audit_firm")
  private String auditFirm = null;

  @SerializedName("audit_link")
  private String auditLink = null;

  @SerializedName("audit_time")
  private String auditTime = null;

  public AuditInfo auditFirm(String auditFirm) {
    this.auditFirm = auditFirm;
    return this;
  }

   /**
   * It describes the firm that audited the dApp.
   * @return auditFirm
  **/
  @Schema(description = "It describes the firm that audited the dApp.")
  public String getAuditFirm() {
    return auditFirm;
  }

  public void setAuditFirm(String auditFirm) {
    this.auditFirm = auditFirm;
  }

  public AuditInfo auditLink(String auditLink) {
    this.auditLink = auditLink;
    return this;
  }

   /**
   * It describes the website link of the audit report.
   * @return auditLink
  **/
  @Schema(description = "It describes the website link of the audit report.")
  public String getAuditLink() {
    return auditLink;
  }

  public void setAuditLink(String auditLink) {
    this.auditLink = auditLink;
  }

  public AuditInfo auditTime(String auditTime) {
    this.auditTime = auditTime;
    return this;
  }

   /**
   * It describes the time shown in the latest audit report.
   * @return auditTime
  **/
  @Schema(description = "It describes the time shown in the latest audit report.")
  public String getAuditTime() {
    return auditTime;
  }

  public void setAuditTime(String auditTime) {
    this.auditTime = auditTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditInfo auditInfo = (AuditInfo) o;
    return Objects.equals(this.auditFirm, auditInfo.auditFirm) &&
        Objects.equals(this.auditLink, auditInfo.auditLink) &&
        Objects.equals(this.auditTime, auditInfo.auditTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditFirm, auditLink, auditTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditInfo {\n");
    
    sb.append("    auditFirm: ").append(toIndentedString(auditFirm)).append("\n");
    sb.append("    auditLink: ").append(toIndentedString(auditLink)).append("\n");
    sb.append("    auditTime: ").append(toIndentedString(auditTime)).append("\n");
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
