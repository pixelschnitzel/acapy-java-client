/*
 * aca-py client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.0-pre3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.hyperledger.acy_py.generated.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.List;

/**
 * DIFHolder
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class DIFHolder {
    /**
     * Preference
     */
    @JsonAdapter(DirectiveEnum.Adapter.class)
    public enum DirectiveEnum {
        REQUIRED("required"),

        PREFERRED("preferred");

        private String value;

        DirectiveEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DirectiveEnum fromValue(String value) {
            for (DirectiveEnum b : DirectiveEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<DirectiveEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final DirectiveEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DirectiveEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return DirectiveEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_DIRECTIVE = "directive";
    @SerializedName(SERIALIZED_NAME_DIRECTIVE)
    private DirectiveEnum directive;
    public static final String SERIALIZED_NAME_FIELD_ID = "field_id";
    @SerializedName(SERIALIZED_NAME_FIELD_ID)
    private List<String> fieldId = null;
}