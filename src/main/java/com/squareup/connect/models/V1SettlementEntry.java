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
import com.squareup.connect.models.V1Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * V1SettlementEntry
 */

public class V1SettlementEntry {
  @JsonProperty("payment_id")
  private String paymentId = null;

  /**
   * The settlement's current status.
   */
  public enum TypeEnum {
    ADJUSTMENT("ADJUSTMENT"),
    
    BALANCE_CHARGE("BALANCE_CHARGE"),
    
    CHARGE("CHARGE"),
    
    FREE_PROCESSING("FREE_PROCESSING"),
    
    HOLD_ADJUSTMENT("HOLD_ADJUSTMENT"),
    
    PAID_SERVICE_FEE("PAID_SERVICE_FEE"),
    
    PAID_SERVICE_FEE_REFUND("PAID_SERVICE_FEE_REFUND"),
    
    REDEMPTION_CODE("REDEMPTION_CODE"),
    
    REFUND("REFUND"),
    
    RETURNED_PAYOUT("RETURNED_PAYOUT"),
    
    SQUARE_CAPITAL_ADVANCE("SQUARE_CAPITAL_ADVANCE"),
    
    SQUARE_CAPITAL_PAYMENT("SQUARE_CAPITAL_PAYMENT"),
    
    SQUARE_CAPITAL_REVERSED_PAYMENT("SQUARE_CAPITAL_REVERSED_PAYMENT"),
    
    SUBSCRIPTION_FEE("SUBSCRIPTION_FEE"),
    
    SUBSCRIPTION_FEE_REFUND("SUBSCRIPTION_FEE_REFUND"),
    
    INCENTED_PAYMENT("INCENTED_PAYMENT"),
    
    RETURNED_ACH_ENTRY("RETURNED_ACH_ENTRY"),
    
    RETURNED_SQUARE_275("RETURNED_SQUARE_275"),
    
    SQUARE_275("SQUARE_275");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("amount_money")
  private V1Money amountMoney = null;

  @JsonProperty("fee_money")
  private V1Money feeMoney = null;

  public V1SettlementEntry paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

   /**
   * The settlement's unique identifier.
   * @return paymentId
  **/
  @ApiModelProperty(value = "The settlement's unique identifier.")
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public V1SettlementEntry type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The settlement's current status.
   * @return type
  **/
  @ApiModelProperty(value = "The settlement's current status.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public V1SettlementEntry amountMoney(V1Money amountMoney) {
    this.amountMoney = amountMoney;
    return this;
  }

   /**
   * The total amount of money this entry contributes to the total settlement amount.
   * @return amountMoney
  **/
  @ApiModelProperty(value = "The total amount of money this entry contributes to the total settlement amount.")
  public V1Money getAmountMoney() {
    return amountMoney;
  }

  public void setAmountMoney(V1Money amountMoney) {
    this.amountMoney = amountMoney;
  }

  public V1SettlementEntry feeMoney(V1Money feeMoney) {
    this.feeMoney = feeMoney;
    return this;
  }

   /**
   * The amount of all Square fees associated with this settlement entry. This value is always negative or zero.
   * @return feeMoney
  **/
  @ApiModelProperty(value = "The amount of all Square fees associated with this settlement entry. This value is always negative or zero.")
  public V1Money getFeeMoney() {
    return feeMoney;
  }

  public void setFeeMoney(V1Money feeMoney) {
    this.feeMoney = feeMoney;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SettlementEntry v1SettlementEntry = (V1SettlementEntry) o;
    return Objects.equals(this.paymentId, v1SettlementEntry.paymentId) &&
        Objects.equals(this.type, v1SettlementEntry.type) &&
        Objects.equals(this.amountMoney, v1SettlementEntry.amountMoney) &&
        Objects.equals(this.feeMoney, v1SettlementEntry.feeMoney);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, type, amountMoney, feeMoney);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SettlementEntry {\n");
    
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amountMoney: ").append(toIndentedString(amountMoney)).append("\n");
    sb.append("    feeMoney: ").append(toIndentedString(feeMoney)).append("\n");
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

