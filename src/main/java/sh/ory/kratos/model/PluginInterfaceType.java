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

/**
 * PluginInterfaceType plugin interface type
 */
@ApiModel(description = "PluginInterfaceType plugin interface type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-10T13:30:48.922980Z[Etc/UTC]")
public class PluginInterfaceType {
  public static final String SERIALIZED_NAME_CAPABILITY = "Capability";
  @SerializedName(SERIALIZED_NAME_CAPABILITY)
  private String capability;

  public static final String SERIALIZED_NAME_PREFIX = "Prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public PluginInterfaceType capability(String capability) {
    
    this.capability = capability;
    return this;
  }

   /**
   * capability
   * @return capability
  **/
  @ApiModelProperty(required = true, value = "capability")

  public String getCapability() {
    return capability;
  }


  public void setCapability(String capability) {
    this.capability = capability;
  }


  public PluginInterfaceType prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * prefix
   * @return prefix
  **/
  @ApiModelProperty(required = true, value = "prefix")

  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public PluginInterfaceType version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "version")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginInterfaceType pluginInterfaceType = (PluginInterfaceType) o;
    return Objects.equals(this.capability, pluginInterfaceType.capability) &&
        Objects.equals(this.prefix, pluginInterfaceType.prefix) &&
        Objects.equals(this.version, pluginInterfaceType.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capability, prefix, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginInterfaceType {\n");
    sb.append("    capability: ").append(toIndentedString(capability)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

