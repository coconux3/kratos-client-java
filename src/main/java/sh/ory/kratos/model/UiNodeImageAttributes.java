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
 * UiNodeImageAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-13T18:51:24.300092764Z[Etc/UTC]")
public class UiNodeImageAttributes {
  public static final String SERIALIZED_NAME_SRC = "src";
  @SerializedName(SERIALIZED_NAME_SRC)
  private String src;


  public UiNodeImageAttributes src(String src) {
    
    this.src = src;
    return this;
  }

   /**
   * The image&#39;s source URL.  format: uri
   * @return src
  **/
  @ApiModelProperty(required = true, value = "The image's source URL.  format: uri")

  public String getSrc() {
    return src;
  }


  public void setSrc(String src) {
    this.src = src;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UiNodeImageAttributes uiNodeImageAttributes = (UiNodeImageAttributes) o;
    return Objects.equals(this.src, uiNodeImageAttributes.src);
  }

  @Override
  public int hashCode() {
    return Objects.hash(src);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UiNodeImageAttributes {\n");
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
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

