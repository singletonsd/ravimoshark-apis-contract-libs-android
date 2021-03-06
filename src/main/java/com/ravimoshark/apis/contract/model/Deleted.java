/*
 * Ravimoshark Contract API
 * This is an API to interact with Ravimoshark contracts database. # Introduction This API allow to create, modify and delete contracts and machines. It also interacts with machines imported from SAGE database. # User Authentication This API does not contain any kind of user validation but It request to have a valid authentication user to interact with it. For more information about user Authentication, please refer to [Ravimoshark User Authentication](https://ravimoshark.com/back/apis/auth/latest). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: dev@ravimoshark.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.ravimoshark.apis.contract.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Deleted
 */
@JsonAdapter(Deleted.Adapter.class)
public enum Deleted {
  ACTIVE("ACTIVE"),
  DELETED("DELETED"),
  ALL("ALL");

  private String value;

  Deleted(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Deleted fromValue(String text) {
    for (Deleted b : Deleted.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Deleted> {
    @Override
    public void write(final JsonWriter jsonWriter, final Deleted enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Deleted read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Deleted.fromValue(String.valueOf(value));
    }
  }
}
