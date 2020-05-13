/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: release-1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes;
import io.kubernetes.client.openapi.models.V1beta1ResourceAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 */
@ApiModel(description = "SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-14T09:13:11.368Z[Etc/UTC]")
public class V1beta1SelfSubjectAccessReviewSpec {
  public static final String SERIALIZED_NAME_NON_RESOURCE_ATTRIBUTES = "nonResourceAttributes";
  @SerializedName(SERIALIZED_NAME_NON_RESOURCE_ATTRIBUTES)
  private V1beta1NonResourceAttributes nonResourceAttributes;

  public static final String SERIALIZED_NAME_RESOURCE_ATTRIBUTES = "resourceAttributes";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ATTRIBUTES)
  private V1beta1ResourceAttributes resourceAttributes;


  public V1beta1SelfSubjectAccessReviewSpec nonResourceAttributes(V1beta1NonResourceAttributes nonResourceAttributes) {
    
    this.nonResourceAttributes = nonResourceAttributes;
    return this;
  }

   /**
   * Get nonResourceAttributes
   * @return nonResourceAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1NonResourceAttributes getNonResourceAttributes() {
    return nonResourceAttributes;
  }


  public void setNonResourceAttributes(V1beta1NonResourceAttributes nonResourceAttributes) {
    this.nonResourceAttributes = nonResourceAttributes;
  }


  public V1beta1SelfSubjectAccessReviewSpec resourceAttributes(V1beta1ResourceAttributes resourceAttributes) {
    
    this.resourceAttributes = resourceAttributes;
    return this;
  }

   /**
   * Get resourceAttributes
   * @return resourceAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1ResourceAttributes getResourceAttributes() {
    return resourceAttributes;
  }


  public void setResourceAttributes(V1beta1ResourceAttributes resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1SelfSubjectAccessReviewSpec v1beta1SelfSubjectAccessReviewSpec = (V1beta1SelfSubjectAccessReviewSpec) o;
    return Objects.equals(this.nonResourceAttributes, v1beta1SelfSubjectAccessReviewSpec.nonResourceAttributes) &&
        Objects.equals(this.resourceAttributes, v1beta1SelfSubjectAccessReviewSpec.resourceAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonResourceAttributes, resourceAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1SelfSubjectAccessReviewSpec {\n");
    sb.append("    nonResourceAttributes: ").append(toIndentedString(nonResourceAttributes)).append("\n");
    sb.append("    resourceAttributes: ").append(toIndentedString(resourceAttributes)).append("\n");
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

