package com.tolgaybalci.kitap.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.tolgaybalci.kitap.entity.KitapTuru;

import java.io.IOException;

public class KitapTuruDeserializer extends StdDeserializer<KitapTuru> {

    public KitapTuruDeserializer(){ super(KitapTuru.class); }

    public KitapTuruDeserializer(Class<?> t){ super(t); }

    @Override
    public KitapTuru deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        return KitapTuru.valueOf(node.get("name").asText());
    }
}
