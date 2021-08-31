/*
 * Ory Kratos API
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.7.3-alpha.5
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
import sh.ory.kratos.model.Identity;
import sh.ory.kratos.model.SelfServiceSettingsFlow;

/**
 * The Response for Settings Flows via API
 */
@ApiModel(description = "The Response for Settings Flows via API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-31T15:17:55.750208384Z[Etc/UTC]")
public class SuccessfulSelfServiceSettingsWithoutBrowser {
  public static final String SERIALIZED_NAME_FLOW = "flow";
  @SerializedName(SERIALIZED_NAME_FLOW)
  private SelfServiceSettingsFlow flow;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private Identity identity;


  public SuccessfulSelfServiceSettingsWithoutBrowser flow(SelfServiceSettingsFlow flow) {
    
    this.flow = flow;
    return this;
  }

   /**
   * Get flow
   * @return flow
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SelfServiceSettingsFlow getFlow() {
    return flow;
  }


  public void setFlow(SelfServiceSettingsFlow flow) {
    this.flow = flow;
  }


  public SuccessfulSelfServiceSettingsWithoutBrowser identity(Identity identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Identity getIdentity() {
    return identity;
  }


  public void setIdentity(Identity identity) {
    this.identity = identity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessfulSelfServiceSettingsWithoutBrowser successfulSelfServiceSettingsWithoutBrowser = (SuccessfulSelfServiceSettingsWithoutBrowser) o;
    return Objects.equals(this.flow, successfulSelfServiceSettingsWithoutBrowser.flow) &&
        Objects.equals(this.identity, successfulSelfServiceSettingsWithoutBrowser.identity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flow, identity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessfulSelfServiceSettingsWithoutBrowser {\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
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

