/*
 * Ory Kratos API
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.6.0-alpha.8
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
import java.util.ArrayList;
import java.util.List;
import sh.ory.kratos.model.UiNode;
import sh.ory.kratos.model.UiText;

/**
 * SettingsProfileFormConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-10T13:36:58.526803Z[Etc/UTC]")
public class SettingsProfileFormConfig {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<UiText> messages = null;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_NODES = "nodes";
  @SerializedName(SERIALIZED_NAME_NODES)
  private List<UiNode> nodes = new ArrayList<>();


  public SettingsProfileFormConfig action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Action should be used as the form action URL &#x60;&lt;form action&#x3D;\&quot;{{ .Action }}\&quot; method&#x3D;\&quot;post\&quot;&gt;&#x60;.
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Action should be used as the form action URL `<form action=\"{{ .Action }}\" method=\"post\">`.")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public SettingsProfileFormConfig messages(List<UiText> messages) {
    
    this.messages = messages;
    return this;
  }

  public SettingsProfileFormConfig addMessagesItem(UiText messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
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

  public List<UiText> getMessages() {
    return messages;
  }


  public void setMessages(List<UiText> messages) {
    this.messages = messages;
  }


  public SettingsProfileFormConfig method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method is the form method (e.g. POST)
   * @return method
  **/
  @ApiModelProperty(required = true, value = "Method is the form method (e.g. POST)")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public SettingsProfileFormConfig nodes(List<UiNode> nodes) {
    
    this.nodes = nodes;
    return this;
  }

  public SettingsProfileFormConfig addNodesItem(UiNode nodesItem) {
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @ApiModelProperty(required = true, value = "")

  public List<UiNode> getNodes() {
    return nodes;
  }


  public void setNodes(List<UiNode> nodes) {
    this.nodes = nodes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsProfileFormConfig settingsProfileFormConfig = (SettingsProfileFormConfig) o;
    return Objects.equals(this.action, settingsProfileFormConfig.action) &&
        Objects.equals(this.messages, settingsProfileFormConfig.messages) &&
        Objects.equals(this.method, settingsProfileFormConfig.method) &&
        Objects.equals(this.nodes, settingsProfileFormConfig.nodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, messages, method, nodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsProfileFormConfig {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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

