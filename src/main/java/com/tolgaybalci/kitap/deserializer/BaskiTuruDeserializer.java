package com.tolgaybalci.kitap.deserializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.tolgaybalci.kitap.entity.BaskiTuru;

import java.io.IOException;

public class BaskiTuruDeserializer extends StdDeserializer<BaskiTuru> {

    public BaskiTuruDeserializer(){ super(BaskiTuru.class); }

    public BaskiTuruDeserializer(Class<?> t){ super(t); }

    @Override
    public BaskiTuru deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        return BaskiTuru.valueOf(node.get("name").asText());
    }



}
