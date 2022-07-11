/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * MapTest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MapTest {
  public static final String SERIALIZED_NAME_MAP_MAP_OF_STRING = "map_map_of_string";
  @SerializedName(SERIALIZED_NAME_MAP_MAP_OF_STRING)
  private Map<String, Map<String, String>> mapMapOfString = null;

  /**
   * Gets or Sets inner
   */
  @JsonAdapter(InnerEnum.Adapter.class)
  public enum InnerEnum {
    UPPER("UPPER"),
    
    LOWER("lower");

    private String value;

    InnerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InnerEnum fromValue(String value) {
      for (InnerEnum b : InnerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<InnerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InnerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InnerEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InnerEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MAP_OF_ENUM_STRING = "map_of_enum_string";
  @SerializedName(SERIALIZED_NAME_MAP_OF_ENUM_STRING)
  private Map<String, InnerEnum> mapOfEnumString = null;

  public static final String SERIALIZED_NAME_DIRECT_MAP = "direct_map";
  @SerializedName(SERIALIZED_NAME_DIRECT_MAP)
  private Map<String, Boolean> directMap = null;

  public static final String SERIALIZED_NAME_INDIRECT_MAP = "indirect_map";
  @SerializedName(SERIALIZED_NAME_INDIRECT_MAP)
  private Map<String, Boolean> indirectMap = null;

  public MapTest() { 
  }

  public MapTest mapMapOfString(Map<String, Map<String, String>> mapMapOfString) {
    
    this.mapMapOfString = mapMapOfString;
    return this;
  }

  public MapTest putMapMapOfStringItem(String key, Map<String, String> mapMapOfStringItem) {
    if (this.mapMapOfString == null) {
      this.mapMapOfString = new HashMap<>();
    }
    this.mapMapOfString.put(key, mapMapOfStringItem);
    return this;
  }

   /**
   * Get mapMapOfString
   * @return mapMapOfString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Map<String, String>> getMapMapOfString() {
    return mapMapOfString;
  }


  public void setMapMapOfString(Map<String, Map<String, String>> mapMapOfString) {
    this.mapMapOfString = mapMapOfString;
  }


  public MapTest mapOfEnumString(Map<String, InnerEnum> mapOfEnumString) {
    
    this.mapOfEnumString = mapOfEnumString;
    return this;
  }

  public MapTest putMapOfEnumStringItem(String key, InnerEnum mapOfEnumStringItem) {
    if (this.mapOfEnumString == null) {
      this.mapOfEnumString = new HashMap<>();
    }
    this.mapOfEnumString.put(key, mapOfEnumStringItem);
    return this;
  }

   /**
   * Get mapOfEnumString
   * @return mapOfEnumString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, InnerEnum> getMapOfEnumString() {
    return mapOfEnumString;
  }


  public void setMapOfEnumString(Map<String, InnerEnum> mapOfEnumString) {
    this.mapOfEnumString = mapOfEnumString;
  }


  public MapTest directMap(Map<String, Boolean> directMap) {
    
    this.directMap = directMap;
    return this;
  }

  public MapTest putDirectMapItem(String key, Boolean directMapItem) {
    if (this.directMap == null) {
      this.directMap = new HashMap<>();
    }
    this.directMap.put(key, directMapItem);
    return this;
  }

   /**
   * Get directMap
   * @return directMap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Boolean> getDirectMap() {
    return directMap;
  }


  public void setDirectMap(Map<String, Boolean> directMap) {
    this.directMap = directMap;
  }


  public MapTest indirectMap(Map<String, Boolean> indirectMap) {
    
    this.indirectMap = indirectMap;
    return this;
  }

  public MapTest putIndirectMapItem(String key, Boolean indirectMapItem) {
    if (this.indirectMap == null) {
      this.indirectMap = new HashMap<>();
    }
    this.indirectMap.put(key, indirectMapItem);
    return this;
  }

   /**
   * Get indirectMap
   * @return indirectMap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Boolean> getIndirectMap() {
    return indirectMap;
  }


  public void setIndirectMap(Map<String, Boolean> indirectMap) {
    this.indirectMap = indirectMap;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public MapTest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MapTest mapTest = (MapTest) o;
    return Objects.equals(this.mapMapOfString, mapTest.mapMapOfString) &&
        Objects.equals(this.mapOfEnumString, mapTest.mapOfEnumString) &&
        Objects.equals(this.directMap, mapTest.directMap) &&
        Objects.equals(this.indirectMap, mapTest.indirectMap)&&
        Objects.equals(this.additionalProperties, mapTest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapMapOfString, mapOfEnumString, directMap, indirectMap, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapTest {\n");
    sb.append("    mapMapOfString: ").append(toIndentedString(mapMapOfString)).append("\n");
    sb.append("    mapOfEnumString: ").append(toIndentedString(mapOfEnumString)).append("\n");
    sb.append("    directMap: ").append(toIndentedString(directMap)).append("\n");
    sb.append("    indirectMap: ").append(toIndentedString(indirectMap)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("map_map_of_string");
    openapiFields.add("map_of_enum_string");
    openapiFields.add("direct_map");
    openapiFields.add("indirect_map");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MapTest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MapTest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MapTest is not found in the empty JSON string", MapTest.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MapTest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MapTest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MapTest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MapTest.class));

       return (TypeAdapter<T>) new TypeAdapter<MapTest>() {
           @Override
           public void write(JsonWriter out, MapTest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public MapTest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MapTest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MapTest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MapTest
  * @throws IOException if the JSON string is invalid with respect to MapTest
  */
  public static MapTest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MapTest.class);
  }

 /**
  * Convert an instance of MapTest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

