/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.stocks_laboratory.twelvedata7.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * ResponseFiftyTwoWeek
 */

public class ResponseFiftyTwoWeek {
  @JsonProperty("low_change")
  private String low_change = null;

  @JsonProperty("high")
  private String high = null;

  @JsonProperty("low_change_percent")
  private String low_change_percent = null;

  @JsonProperty("low")
  private String low = null;

  @JsonProperty("range")
  private String range = null;

  @JsonProperty("high_change")
  private String high_change = null;

  @JsonProperty("high_change_percent")
  private String high_change_percent = null;

  public ResponseFiftyTwoWeek low_change(String low_change) {
    this.low_change = low_change;
    return this;
  }

   /**
   * Get low_change
   * @return low_change
  **/
  public String getLowChange() {
    return low_change;
  }

  public void setLowChange(String low_change) {
    this.low_change = low_change;
  }

  public ResponseFiftyTwoWeek high(String high) {
    this.high = high;
    return this;
  }

   /**
   * Get high
   * @return high
  **/
  public String getHigh() {
    return high;
  }

  public void setHigh(String high) {
    this.high = high;
  }

  public ResponseFiftyTwoWeek low_change_percent(String low_change_percent) {
    this.low_change_percent = low_change_percent;
    return this;
  }

   /**
   * Get low_change_percent
   * @return low_change_percent
  **/
  public String getLowChangePercent() {
    return low_change_percent;
  }

  public void setLowChangePercent(String low_change_percent) {
    this.low_change_percent = low_change_percent;
  }

  public ResponseFiftyTwoWeek low(String low) {
    this.low = low;
    return this;
  }

   /**
   * Get low
   * @return low
  **/
  public String getLow() {
    return low;
  }

  public void setLow(String low) {
    this.low = low;
  }

  public ResponseFiftyTwoWeek range(String range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  public String getRange() {
    return range;
  }

  public void setRange(String range) {
    this.range = range;
  }

  public ResponseFiftyTwoWeek high_change(String high_change) {
    this.high_change = high_change;
    return this;
  }

   /**
   * Get high_change
   * @return high_change
  **/
  public String getHighChange() {
    return high_change;
  }

  public void setHighChange(String high_change) {
    this.high_change = high_change;
  }

  public ResponseFiftyTwoWeek high_change_percent(String high_change_percent) {
    this.high_change_percent = high_change_percent;
    return this;
  }

   /**
   * Get high_change_percent
   * @return high_change_percent
  **/
  public String getHighChangePercent() {
    return high_change_percent;
  }

  public void setHighChangePercent(String high_change_percent) {
    this.high_change_percent = high_change_percent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseFiftyTwoWeek Response_fifty_two_week = (ResponseFiftyTwoWeek) o;
    return Objects.equals(this.low_change, Response_fifty_two_week.low_change) &&
        Objects.equals(this.high, Response_fifty_two_week.high) &&
        Objects.equals(this.low_change_percent, Response_fifty_two_week.low_change_percent) &&
        Objects.equals(this.low, Response_fifty_two_week.low) &&
        Objects.equals(this.range, Response_fifty_two_week.range) &&
        Objects.equals(this.high_change, Response_fifty_two_week.high_change) &&
        Objects.equals(this.high_change_percent, Response_fifty_two_week.high_change_percent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(low_change, high, low_change_percent, low, range, high_change, high_change_percent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseFiftyTwoWeek {\n");
    
    sb.append("    low_change: ").append(toIndentedString(low_change)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low_change_percent: ").append(toIndentedString(low_change_percent)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    high_change: ").append(toIndentedString(high_change)).append("\n");
    sb.append("    high_change_percent: ").append(toIndentedString(high_change_percent)).append("\n");
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
