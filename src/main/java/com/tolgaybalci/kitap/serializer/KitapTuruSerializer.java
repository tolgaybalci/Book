package com.tolgaybalci.kitap.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.tolgaybalci.kitap.entity.KitapTuru;

import java.io.IOException;

public class KitapTuruSerializer  extends StdSerializer {

    public KitapTuruSerializer(){ super(KitapTuru.class); }

    public KitapTuruSerializer(Class t){ super(t); }

    @Override
    public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName("label");
        jsonGenerator.writeString(((KitapTuru)o).getLabel());
        jsonGenerator.writeEndObject();
    }

        }
