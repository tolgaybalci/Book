package com.tolgaybalci.kitap.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.tolgaybalci.kitap.entity.BaskiTuru;

import java.io.IOException;

public class BaskiTuruSerializer extends StdSerializer {

    public BaskiTuruSerializer() { super(BaskiTuru.class); }

    public BaskiTuruSerializer(Class t) { super(t); }

    @Override
    public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName("label");
        jsonGenerator.writeString(((BaskiTuru)o).getLabel());
        jsonGenerator.writeEndObject();
    }
}
