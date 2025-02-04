// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Specifies an Azure Machine Learning endpoint deployed via the Azure AI Studio Model Catalog for generating the
 * vector embedding of a query string.
 */
@Fluent
public final class AMLVectorizer extends VectorSearchVectorizer {
    /*
     * Specifies the properties of the AML vectorizer.
     */
    private AMLParameters aMLParameters;

    /**
     * Creates an instance of AMLVectorizer class.
     * 
     * @param name the name value to set.
     */
    public AMLVectorizer(String name) {
        super(name);
    }

    /**
     * Get the aMLParameters property: Specifies the properties of the AML vectorizer.
     * 
     * @return the aMLParameters value.
     */
    public AMLParameters getAMLParameters() {
        return this.aMLParameters;
    }

    /**
     * Set the aMLParameters property: Specifies the properties of the AML vectorizer.
     * 
     * @param aMLParameters the aMLParameters value to set.
     * @return the AMLVectorizer object itself.
     */
    public AMLVectorizer setAMLParameters(AMLParameters aMLParameters) {
        this.aMLParameters = aMLParameters;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind",
            VectorSearchVectorizerKind.AML == null ? null : VectorSearchVectorizerKind.AML.toString());
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeJsonField("amlParameters", this.aMLParameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AMLVectorizer from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AMLVectorizer if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the AMLVectorizer.
     */
    public static AMLVectorizer fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean nameFound = false;
            String name = null;
            AMLParameters aMLParameters = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("kind".equals(fieldName)) {
                    String kind = reader.getString();
                    if (!"aml".equals(kind)) {
                        throw new IllegalStateException(
                            "'kind' was expected to be non-null and equal to 'aml'. The found 'kind' was '" + kind
                                + "'.");
                    }
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                    nameFound = true;
                } else if ("amlParameters".equals(fieldName)) {
                    aMLParameters = AMLParameters.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            if (nameFound) {
                AMLVectorizer deserializedAMLVectorizer = new AMLVectorizer(name);
                deserializedAMLVectorizer.aMLParameters = aMLParameters;

                return deserializedAMLVectorizer;
            }
            throw new IllegalStateException("Missing required property: name");
        });
    }
}
