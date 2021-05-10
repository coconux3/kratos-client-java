/*
 * Ory Kratos API
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.6.0-alpha.11
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.kratos.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SubmitSelfServiceSettingsFlowWithPasswordMethod
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-10T15:29:10.580700Z[Etc/UTC]")
public class SubmitSelfServiceSettingsFlowWithPasswordMethod {
  public static final String SERIALIZED_NAME_CSRF_TOKEN = "csrf_token";
  @SerializedName(SERIALIZED_NAME_CSRF_TOKEN)
  private String csrfToken;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;


  public SubmitSelfServiceSettingsFlowWithPasswordMethod csrfToken(String csrfToken) {
    
    this.csrfToken = csrfToken;
    return this;
  }

   /**
   * CSRFToken is the anti-CSRF token  type: string
   * @return csrfToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSRFToken is the anti-CSRF token  type: string")

  public String getCsrfToken() {
    return csrfToken;
  }


  public void setCsrfToken(String csrfToken) {
    this.csrfToken = csrfToken;
  }


  public SubmitSelfServiceSettingsFlowWithPasswordMethod method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method  Should be set to password when trying to update a password.  type: string
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Method  Should be set to password when trying to update a password.  type: string")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public SubmitSelfServiceSettingsFlowWithPasswordMethod password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password is the updated password  type: string
   * @return password
  **/
  @ApiModelProperty(required = true, value = "Password is the updated password  type: string")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitSelfServiceSettingsFlowWithPasswordMethod submitSelfServiceSettingsFlowWithPasswordMethod = (SubmitSelfServiceSettingsFlowWithPasswordMethod) o;
    return Objects.equals(this.csrfToken, submitSelfServiceSettingsFlowWithPasswordMethod.csrfToken) &&
        Objects.equals(this.method, submitSelfServiceSettingsFlowWithPasswordMethod.method) &&
        Objects.equals(this.password, submitSelfServiceSettingsFlowWithPasswordMethod.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csrfToken, method, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitSelfServiceSettingsFlowWithPasswordMethod {\n");
    sb.append("    csrfToken: ").append(toIndentedString(csrfToken)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

