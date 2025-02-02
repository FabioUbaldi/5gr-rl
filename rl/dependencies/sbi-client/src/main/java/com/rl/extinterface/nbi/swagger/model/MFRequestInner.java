/*
 * MTP Manager API
 * MTP Manager API
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.rl.extinterface.nbi.swagger.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * MFRequestInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-08T16:03:30.222Z")
public class MFRequestInner {
  @SerializedName("mfid")
  private String mfid = null;

  @SerializedName("status")
  private String status = null;

  public MFRequestInner mfid(String mfid) {
    this.mfid = mfid;
    return this;
  }

   /**
   * Get mfid
   * @return mfid
  **/
  @ApiModelProperty(value = "")
  public String getMfid() {
    return mfid;
  }

  public void setMfid(String mfid) {
    this.mfid = mfid;
  }

  public MFRequestInner status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MFRequestInner mfRequestInner = (MFRequestInner) o;
    return Objects.equals(this.mfid, mfRequestInner.mfid) &&
        Objects.equals(this.status, mfRequestInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mfid, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MFRequestInner {\n");
    
    sb.append("    mfid: ").append(toIndentedString(mfid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

