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
 * MECRegionInfoMecRegionInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-08T16:03:30.222Z")
public class MECRegionInfoMecRegionInfo {
  @SerializedName("regionId")
  private String regionId = null;

  @SerializedName("locationInfo")
  private LocationInfo locationInfo = null;

  public MECRegionInfoMecRegionInfo regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Identifier of the region.
   * @return regionId
  **/
  @ApiModelProperty(value = "Identifier of the region.")
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public MECRegionInfoMecRegionInfo locationInfo(LocationInfo locationInfo) {
    this.locationInfo = locationInfo;
    return this;
  }

   /**
   * Get locationInfo
   * @return locationInfo
  **/
  @ApiModelProperty(value = "")
  public LocationInfo getLocationInfo() {
    return locationInfo;
  }

  public void setLocationInfo(LocationInfo locationInfo) {
    this.locationInfo = locationInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MECRegionInfoMecRegionInfo meCRegionInfoMecRegionInfo = (MECRegionInfoMecRegionInfo) o;
    return Objects.equals(this.regionId, meCRegionInfoMecRegionInfo.regionId) &&
        Objects.equals(this.locationInfo, meCRegionInfoMecRegionInfo.locationInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionId, locationInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MECRegionInfoMecRegionInfo {\n");
    
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    locationInfo: ").append(toIndentedString(locationInfo)).append("\n");
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

