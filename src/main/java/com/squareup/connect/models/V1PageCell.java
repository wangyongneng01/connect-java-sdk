/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * V1PageCell
 */

public class V1PageCell {
  @JsonProperty("page_id")
  private String pageId = null;

  @JsonProperty("row")
  private Integer row = null;

  @JsonProperty("column")
  private Integer column = null;

  /**
   * Gets or Sets objectType
   */
  public enum ObjectTypeEnum {
    ITEM("ITEM"),
    
    DISCOUNT("DISCOUNT"),
    
    CATEGORY("CATEGORY"),
    
    PLACEHOLDER("PLACEHOLDER");

    private String value;

    ObjectTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectTypeEnum fromValue(String text) {
      for (ObjectTypeEnum b : ObjectTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("object_type")
  private List<ObjectTypeEnum> objectType = new ArrayList<ObjectTypeEnum>();

  @JsonProperty("object_id")
  private String objectId = null;

  /**
   * Gets or Sets placeholderType
   */
  public enum PlaceholderTypeEnum {
    ALL_ITEMS("ALL_ITEMS"),
    
    DISCOUNTS_CATEGORY("DISCOUNTS_CATEGORY"),
    
    REWARDS_FINDER("REWARDS_FINDER");

    private String value;

    PlaceholderTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PlaceholderTypeEnum fromValue(String text) {
      for (PlaceholderTypeEnum b : PlaceholderTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("placeholder_type")
  private List<PlaceholderTypeEnum> placeholderType = new ArrayList<PlaceholderTypeEnum>();

  public V1PageCell pageId(String pageId) {
    this.pageId = pageId;
    return this;
  }

   /**
   * The unique identifier of the page the cell is included on.
   * @return pageId
  **/
  @ApiModelProperty(value = "The unique identifier of the page the cell is included on.")
  public String getPageId() {
    return pageId;
  }

  public void setPageId(String pageId) {
    this.pageId = pageId;
  }

  public V1PageCell row(Integer row) {
    this.row = row;
    return this;
  }

   /**
   * The row of the cell. Always an integer between 0 and 4, inclusive.
   * @return row
  **/
  @ApiModelProperty(value = "The row of the cell. Always an integer between 0 and 4, inclusive.")
  public Integer getRow() {
    return row;
  }

  public void setRow(Integer row) {
    this.row = row;
  }

  public V1PageCell column(Integer column) {
    this.column = column;
    return this;
  }

   /**
   * The column of the cell. Always an integer between 0 and 4, inclusive.
   * @return column
  **/
  @ApiModelProperty(value = "The column of the cell. Always an integer between 0 and 4, inclusive.")
  public Integer getColumn() {
    return column;
  }

  public void setColumn(Integer column) {
    this.column = column;
  }

  public V1PageCell objectType(List<ObjectTypeEnum> objectType) {
    this.objectType = objectType;
    return this;
  }

  public V1PageCell addObjectTypeItem(ObjectTypeEnum objectTypeItem) {
    this.objectType.add(objectTypeItem);
    return this;
  }

   /**
   * The type of entity represented in the cell (ITEM, DISCOUNT, CATEGORY, or PLACEHOLDER).
   * @return objectType
  **/
  @ApiModelProperty(value = "The type of entity represented in the cell (ITEM, DISCOUNT, CATEGORY, or PLACEHOLDER).")
  public List<ObjectTypeEnum> getObjectType() {
    return objectType;
  }

  public void setObjectType(List<ObjectTypeEnum> objectType) {
    this.objectType = objectType;
  }

  public V1PageCell objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * The unique identifier of the entity represented in the cell. Not present for cells with an object_type of PLACEHOLDER.
   * @return objectId
  **/
  @ApiModelProperty(value = "The unique identifier of the entity represented in the cell. Not present for cells with an object_type of PLACEHOLDER.")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public V1PageCell placeholderType(List<PlaceholderTypeEnum> placeholderType) {
    this.placeholderType = placeholderType;
    return this;
  }

  public V1PageCell addPlaceholderTypeItem(PlaceholderTypeEnum placeholderTypeItem) {
    this.placeholderType.add(placeholderTypeItem);
    return this;
  }

   /**
   * For a cell with an object_type of PLACEHOLDER, this value indicates the cell's special behavior.
   * @return placeholderType
  **/
  @ApiModelProperty(value = "For a cell with an object_type of PLACEHOLDER, this value indicates the cell's special behavior.")
  public List<PlaceholderTypeEnum> getPlaceholderType() {
    return placeholderType;
  }

  public void setPlaceholderType(List<PlaceholderTypeEnum> placeholderType) {
    this.placeholderType = placeholderType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PageCell v1PageCell = (V1PageCell) o;
    return Objects.equals(this.pageId, v1PageCell.pageId) &&
        Objects.equals(this.row, v1PageCell.row) &&
        Objects.equals(this.column, v1PageCell.column) &&
        Objects.equals(this.objectType, v1PageCell.objectType) &&
        Objects.equals(this.objectId, v1PageCell.objectId) &&
        Objects.equals(this.placeholderType, v1PageCell.placeholderType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageId, row, column, objectType, objectId, placeholderType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PageCell {\n");
    
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    placeholderType: ").append(toIndentedString(placeholderType)).append("\n");
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

