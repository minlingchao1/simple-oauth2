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

/**
 * ClientVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-25T13:38:10.202Z")
public class ClientVO {
  @SerializedName("basicAuth")
  private String basicAuth = null;

  @SerializedName("clientId")
  private String clientId = null;

  @SerializedName("clientSecret")
  private String clientSecret = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("ownerName")
  private String ownerName = null;

  @SerializedName("redirectUrl")
  private String redirectUrl = null;

  @SerializedName("rememberChoice")
  private String rememberChoice = null;

  @SerializedName("respType")
  private String respType = null;

  @SerializedName("scopes")
  private List<String> scopes = null;

  public ClientVO basicAuth(String basicAuth) {
    this.basicAuth = basicAuth;
    return this;
  }

   /**
   * Get basicAuth
   * @return basicAuth
  **/
  @ApiModelProperty(value = "")
  public String getBasicAuth() {
    return basicAuth;
  }

  public void setBasicAuth(String basicAuth) {
    this.basicAuth = basicAuth;
  }

  public ClientVO clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(value = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public ClientVO clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Get clientSecret
   * @return clientSecret
  **/
  @ApiModelProperty(value = "")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public ClientVO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ClientVO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ClientVO ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

   /**
   * Get ownerName
   * @return ownerName
  **/
  @ApiModelProperty(value = "")
  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public ClientVO redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * Get redirectUrl
   * @return redirectUrl
  **/
  @ApiModelProperty(value = "")
  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public ClientVO rememberChoice(String rememberChoice) {
    this.rememberChoice = rememberChoice;
    return this;
  }

   /**
   * Get rememberChoice
   * @return rememberChoice
  **/
  @ApiModelProperty(value = "")
  public String getRememberChoice() {
    return rememberChoice;
  }

  public void setRememberChoice(String rememberChoice) {
    this.rememberChoice = rememberChoice;
  }

  public ClientVO respType(String respType) {
    this.respType = respType;
    return this;
  }

   /**
   * Get respType
   * @return respType
  **/
  @ApiModelProperty(value = "")
  public String getRespType() {
    return respType;
  }

  public void setRespType(String respType) {
    this.respType = respType;
  }

  public ClientVO scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public ClientVO addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<String>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @ApiModelProperty(value = "")
  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientVO clientVO = (ClientVO) o;
    return Objects.equals(this.basicAuth, clientVO.basicAuth) &&
        Objects.equals(this.clientId, clientVO.clientId) &&
        Objects.equals(this.clientSecret, clientVO.clientSecret) &&
        Objects.equals(this.description, clientVO.description) &&
        Objects.equals(this.id, clientVO.id) &&
        Objects.equals(this.ownerName, clientVO.ownerName) &&
        Objects.equals(this.redirectUrl, clientVO.redirectUrl) &&
        Objects.equals(this.rememberChoice, clientVO.rememberChoice) &&
        Objects.equals(this.respType, clientVO.respType) &&
        Objects.equals(this.scopes, clientVO.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicAuth, clientId, clientSecret, description, id, ownerName, redirectUrl, rememberChoice, respType, scopes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientVO {\n");
    
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    rememberChoice: ").append(toIndentedString(rememberChoice)).append("\n");
    sb.append("    respType: ").append(toIndentedString(respType)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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
