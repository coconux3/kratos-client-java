/*
 * Ory Kratos API
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.7.0-alpha.1
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
 * SubmitSelfServiceVerificationFlowWithLinkMethodBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-13T18:51:24.300092764Z[Etc/UTC]")
public class SubmitSelfServiceVerificationFlowWithLinkMethodBody {
  public static final String SERIALIZED_NAME_CSRF_TOKEN = "csrf_token";
  @SerializedName(SERIALIZED_NAME_CSRF_TOKEN)
  private String csrfToken;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  /**
   * Method supports &#x60;link&#x60; only right now.
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    PASSWORD("password"),
    
    OIDC("oidc");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private MethodEnum method;


  public SubmitSelfServiceVerificationFlowWithLinkMethodBody csrfToken(String csrfToken) {
    
    this.csrfToken = csrfToken;
    return this;
  }

   /**
   * Sending the anti-csrf token is only required for browser login flows.
   * @return csrfToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sending the anti-csrf token is only required for browser login flows.")

  public String getCsrfToken() {
    return csrfToken;
  }


  public void setCsrfToken(String csrfToken) {
    this.csrfToken = csrfToken;
  }


  public SubmitSelfServiceVerificationFlowWithLinkMethodBody email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email to Verify  Needs to be set when initiating the flow. If the email is a registered verification email, a verification link will be sent. If the email is not known, a email with details on what happened will be sent instead.  format: email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "Email to Verify  Needs to be set when initiating the flow. If the email is a registered verification email, a verification link will be sent. If the email is not known, a email with details on what happened will be sent instead.  format: email")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public SubmitSelfServiceVerificationFlowWithLinkMethodBody method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method supports &#x60;link&#x60; only right now.
   * @return method
  **/
  @ApiModelProperty(required = true, value = "Method supports `link` only right now.")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitSelfServiceVerificationFlowWithLinkMethodBody submitSelfServiceVerificationFlowWithLinkMethodBody = (SubmitSelfServiceVerificationFlowWithLinkMethodBody) o;
    return Objects.equals(this.csrfToken, submitSelfServiceVerificationFlowWithLinkMethodBody.csrfToken) &&
        Objects.equals(this.email, submitSelfServiceVerificationFlowWithLinkMethodBody.email) &&
        Objects.equals(this.method, submitSelfServiceVerificationFlowWithLinkMethodBody.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csrfToken, email, method);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitSelfServiceVerificationFlowWithLinkMethodBody {\n");
    sb.append("    csrfToken: ").append(toIndentedString(csrfToken)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

