/*
 * Ory Kratos
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: latest
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
import java.util.List;
import sh.ory.kratos.model.Error;

/**
 * Field represents a HTML Form Field
 */
@ApiModel(description = "Field represents a HTML Form Field")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-31T15:11:32.346740Z[GMT]")
public class FormField {
  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private String disabled;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Error> errors = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PATTERN = "pattern";
  @SerializedName(SERIALIZED_NAME_PATTERN)
  private String pattern;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value;


  public FormField disabled(String disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Disabled is the equivalent of &lt;input disabled&#x3D;\&quot;{{.Disabled}}\&quot;&gt;
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Disabled is the equivalent of <input disabled=\"{{.Disabled}}\">")

  public String getDisabled() {
    return disabled;
  }


  public void setDisabled(String disabled) {
    this.disabled = disabled;
  }


  public FormField errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public FormField addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Error>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Errors contains all validation errors this particular field has caused.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Errors contains all validation errors this particular field has caused.")

  public List<Error> getErrors() {
    return errors;
  }


  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  public FormField name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name is the equivalent of &lt;input name&#x3D;\&quot;{{.Name}}\&quot;&gt;
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name is the equivalent of <input name=\"{{.Name}}\">")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FormField pattern(String pattern) {
    
    this.pattern = pattern;
    return this;
  }

   /**
   * Pattern is the equivalent of &lt;input pattern&#x3D;\&quot;{{.Pattern}}\&quot;&gt;
   * @return pattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pattern is the equivalent of <input pattern=\"{{.Pattern}}\">")

  public String getPattern() {
    return pattern;
  }


  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  public FormField required(Boolean required) {
    
    this.required = required;
    return this;
  }

   /**
   * Required is the equivalent of &lt;input required&#x3D;\&quot;{{.Required}}\&quot;&gt;
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required is the equivalent of <input required=\"{{.Required}}\">")

  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    this.required = required;
  }


  public FormField type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type is the equivalent of &lt;input type&#x3D;\&quot;{{.Type}}\&quot;&gt;
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type is the equivalent of <input type=\"{{.Type}}\">")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public FormField value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value is the equivalent of &lt;input value&#x3D;\&quot;{{.Value}}\&quot;&gt;
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value is the equivalent of <input value=\"{{.Value}}\">")

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
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
    FormField formField = (FormField) o;
    return Objects.equals(this.disabled, formField.disabled) &&
        Objects.equals(this.errors, formField.errors) &&
        Objects.equals(this.name, formField.name) &&
        Objects.equals(this.pattern, formField.pattern) &&
        Objects.equals(this.required, formField.required) &&
        Objects.equals(this.type, formField.type) &&
        Objects.equals(this.value, formField.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, errors, name, pattern, required, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormField {\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

