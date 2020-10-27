/*
 * Ory Kratos
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: v0.5.3-alpha.1.pre.0
 * 
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import sh.ory.kratos.model.LoginFlowMethod;
import sh.ory.kratos.model.Message;

/**
 * This object represents a login flow. A login flow is initiated at the \&quot;Initiate Login API / Browser Flow\&quot; endpoint by a client.  Once a login flow is completed successfully, a session cookie or session token will be issued.
 */
@ApiModel(description = "This object represents a login flow. A login flow is initiated at the \"Initiate Login API / Browser Flow\" endpoint by a client.  Once a login flow is completed successfully, a session cookie or session token will be issued.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-27T12:26:05.417076Z[GMT]")
public class LoginFlow {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private String active;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_FORCED = "forced";
  @SerializedName(SERIALIZED_NAME_FORCED)
  private Boolean forced;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ISSUED_AT = "issued_at";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT)
  private OffsetDateTime issuedAt;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<Message> messages = null;

  public static final String SERIALIZED_NAME_METHODS = "methods";
  @SerializedName(SERIALIZED_NAME_METHODS)
  private Map<String, LoginFlowMethod> methods = new HashMap<String, LoginFlowMethod>();

  public static final String SERIALIZED_NAME_REQUEST_URL = "request_url";
  @SerializedName(SERIALIZED_NAME_REQUEST_URL)
  private String requestUrl;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public LoginFlow active(String active) {
    
    this.active = active;
    return this;
  }

   /**
   * and so on.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "and so on.")

  public String getActive() {
    return active;
  }


  public void setActive(String active) {
    this.active = active;
  }


  public LoginFlow expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated.
   * @return expiresAt
  **/
  @ApiModelProperty(required = true, value = "ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated.")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public LoginFlow forced(Boolean forced) {
    
    this.forced = forced;
    return this;
  }

   /**
   * Forced stores whether this login flow should enforce re-authentication.
   * @return forced
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Forced stores whether this login flow should enforce re-authentication.")

  public Boolean getForced() {
    return forced;
  }


  public void setForced(Boolean forced) {
    this.forced = forced;
  }


  public LoginFlow id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public LoginFlow issuedAt(OffsetDateTime issuedAt) {
    
    this.issuedAt = issuedAt;
    return this;
  }

   /**
   * IssuedAt is the time (UTC) when the flow started.
   * @return issuedAt
  **/
  @ApiModelProperty(required = true, value = "IssuedAt is the time (UTC) when the flow started.")

  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }


  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }


  public LoginFlow messages(List<Message> messages) {
    
    this.messages = messages;
    return this;
  }

  public LoginFlow addMessagesItem(Message messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<Message>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Message> getMessages() {
    return messages;
  }


  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }


  public LoginFlow methods(Map<String, LoginFlowMethod> methods) {
    
    this.methods = methods;
    return this;
  }

  public LoginFlow putMethodsItem(String key, LoginFlowMethod methodsItem) {
    this.methods.put(key, methodsItem);
    return this;
  }

   /**
   * List of login methods  This is the list of available login methods with their required form fields, such as &#x60;identifier&#x60; and &#x60;password&#x60; for the password login method. This will also contain error messages such as \&quot;password can not be empty\&quot;.
   * @return methods
  **/
  @ApiModelProperty(required = true, value = "List of login methods  This is the list of available login methods with their required form fields, such as `identifier` and `password` for the password login method. This will also contain error messages such as \"password can not be empty\".")

  public Map<String, LoginFlowMethod> getMethods() {
    return methods;
  }


  public void setMethods(Map<String, LoginFlowMethod> methods) {
    this.methods = methods;
  }


  public LoginFlow requestUrl(String requestUrl) {
    
    this.requestUrl = requestUrl;
    return this;
  }

   /**
   * RequestURL is the initial URL that was requested from ORY Kratos. It can be used to forward information contained in the URL&#39;s path or query for example.
   * @return requestUrl
  **/
  @ApiModelProperty(required = true, value = "RequestURL is the initial URL that was requested from ORY Kratos. It can be used to forward information contained in the URL's path or query for example.")

  public String getRequestUrl() {
    return requestUrl;
  }


  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }


  public LoginFlow type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The flow type can either be &#x60;api&#x60; or &#x60;browser&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The flow type can either be `api` or `browser`.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginFlow loginFlow = (LoginFlow) o;
    return Objects.equals(this.active, loginFlow.active) &&
        Objects.equals(this.expiresAt, loginFlow.expiresAt) &&
        Objects.equals(this.forced, loginFlow.forced) &&
        Objects.equals(this.id, loginFlow.id) &&
        Objects.equals(this.issuedAt, loginFlow.issuedAt) &&
        Objects.equals(this.messages, loginFlow.messages) &&
        Objects.equals(this.methods, loginFlow.methods) &&
        Objects.equals(this.requestUrl, loginFlow.requestUrl) &&
        Objects.equals(this.type, loginFlow.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, expiresAt, forced, id, issuedAt, messages, methods, requestUrl, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginFlow {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    forced: ").append(toIndentedString(forced)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
    sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

