/*
 * Ory Kratos API
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.6.0-alpha.10
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

/**
 * ContainerTopOKBody OK response to ContainerTop operation
 */
@ApiModel(description = "ContainerTopOKBody OK response to ContainerTop operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-10T14:44:50.402860Z[Etc/UTC]")
public class ContainerTopOKBody {
  public static final String SERIALIZED_NAME_PROCESSES = "Processes";
  @SerializedName(SERIALIZED_NAME_PROCESSES)
  private List<List<String>> processes = new ArrayList<>();

  public static final String SERIALIZED_NAME_TITLES = "Titles";
  @SerializedName(SERIALIZED_NAME_TITLES)
  private List<String> titles = new ArrayList<>();


  public ContainerTopOKBody processes(List<List<String>> processes) {
    
    this.processes = processes;
    return this;
  }

  public ContainerTopOKBody addProcessesItem(List<String> processesItem) {
    this.processes.add(processesItem);
    return this;
  }

   /**
   * Each process running in the container, where each is process is an array of values corresponding to the titles
   * @return processes
  **/
  @ApiModelProperty(required = true, value = "Each process running in the container, where each is process is an array of values corresponding to the titles")

  public List<List<String>> getProcesses() {
    return processes;
  }


  public void setProcesses(List<List<String>> processes) {
    this.processes = processes;
  }


  public ContainerTopOKBody titles(List<String> titles) {
    
    this.titles = titles;
    return this;
  }

  public ContainerTopOKBody addTitlesItem(String titlesItem) {
    this.titles.add(titlesItem);
    return this;
  }

   /**
   * The ps column titles
   * @return titles
  **/
  @ApiModelProperty(required = true, value = "The ps column titles")

  public List<String> getTitles() {
    return titles;
  }


  public void setTitles(List<String> titles) {
    this.titles = titles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerTopOKBody containerTopOKBody = (ContainerTopOKBody) o;
    return Objects.equals(this.processes, containerTopOKBody.processes) &&
        Objects.equals(this.titles, containerTopOKBody.titles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processes, titles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerTopOKBody {\n");
    sb.append("    processes: ").append(toIndentedString(processes)).append("\n");
    sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
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

