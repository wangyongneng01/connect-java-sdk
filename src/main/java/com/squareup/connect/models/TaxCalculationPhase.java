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
import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * When to calculate the taxes due on a cart.
 */
public enum TaxCalculationPhase {
  
  SUBTOTAL_PHASE("TAX_SUBTOTAL_PHASE"),
  
  TOTAL_PHASE("TAX_TOTAL_PHASE");

  private String value;

  TaxCalculationPhase(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TaxCalculationPhase fromValue(String text) {
    for (TaxCalculationPhase b : TaxCalculationPhase.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

