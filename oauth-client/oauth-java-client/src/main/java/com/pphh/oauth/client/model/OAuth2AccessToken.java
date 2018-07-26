/*
 * 统一认证和授权系统
 * 更多信息请联系pphh
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.pphh.oauth.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * OAuth2AccessToken
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-25T13:38:10.202Z")
public class OAuth2AccessToken {
  @SerializedName("additionalInformation")
  private Object additionalInformation = null;

  @SerializedName("expiration")
  private OffsetDateTime expiration = null;

  @SerializedName("expired")
  private Boolean expired = null;

  @SerializedName("expiresIn")
  private Integer expiresIn = null;

  @SerializedName("refreshToken")
  private OAuth2RefreshToken refreshToken = null;

  @SerializedName("scope")
  private List<String> scope = null;

  @SerializedName("tokenType")
  private String tokenType = null;

  @SerializedName("value")
  private String value = null;

  public OAuth2AccessToken additionalInformation(Object additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

   /**
   * Get additionalInformation
   * @return additionalInformation
  **/
  @ApiModelProperty(value = "")
  public Object getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(Object additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public OAuth2AccessToken expiration(OffsetDateTime expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getExpiration() {
    return expiration;
  }

  public void setExpiration(OffsetDateTime expiration) {
    this.expiration = expiration;
  }

  public OAuth2AccessToken expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

   /**
   * Get expired
   * @return expired
  **/
  @ApiModelProperty(value = "")
  public Boolean isExpired() {
    return expired;
  }

  public void setExpired(Boolean expired) {
    this.expired = expired;
  }

  public OAuth2AccessToken expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Get expiresIn
   * @return expiresIn
  **/
  @ApiModelProperty(value = "")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public OAuth2AccessToken refreshToken(OAuth2RefreshToken refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Get refreshToken
   * @return refreshToken
  **/
  @ApiModelProperty(value = "")
  public OAuth2RefreshToken getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(OAuth2RefreshToken refreshToken) {
    this.refreshToken = refreshToken;
  }

  public OAuth2AccessToken scope(List<String> scope) {
    this.scope = scope;
    return this;
  }

  public OAuth2AccessToken addScopeItem(String scopeItem) {
    if (this.scope == null) {
      this.scope = new ArrayList<String>();
    }
    this.scope.add(scopeItem);
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @ApiModelProperty(value = "")
  public List<String> getScope() {
    return scope;
  }

  public void setScope(List<String> scope) {
    this.scope = scope;
  }

  public OAuth2AccessToken tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Get tokenType
   * @return tokenType
  **/
  @ApiModelProperty(value = "")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public OAuth2AccessToken value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2AccessToken oauth2AccessToken = (OAuth2AccessToken) o;
    return Objects.equals(this.additionalInformation, oauth2AccessToken.additionalInformation) &&
        Objects.equals(this.expiration, oauth2AccessToken.expiration) &&
        Objects.equals(this.expired, oauth2AccessToken.expired) &&
        Objects.equals(this.expiresIn, oauth2AccessToken.expiresIn) &&
        Objects.equals(this.refreshToken, oauth2AccessToken.refreshToken) &&
        Objects.equals(this.scope, oauth2AccessToken.scope) &&
        Objects.equals(this.tokenType, oauth2AccessToken.tokenType) &&
        Objects.equals(this.value, oauth2AccessToken.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInformation, expiration, expired, expiresIn, refreshToken, scope, tokenType, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2AccessToken {\n");
    
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

