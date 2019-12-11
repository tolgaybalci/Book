package com.tolgaybalci.kitap.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.tolgaybalci.kitap.deserializer.BaskiTuruDeserializer;
import com.tolgaybalci.kitap.serializer.BaskiTuruSerializer;

@JsonDeserialize(using = BaskiTuruDeserializer.class)
@JsonSerialize(using = BaskiTuruSerializer.class)
public enum BaskiTuru {

    ORJINAL_KAGIT("Orjinal Kağıt"),
    KUŞE_KAGIT("Kuşe Kağıt"),
    SAMAN_KAGIT("Saman Kağıt"),
    BIRINCI_HAMUR("Birinci Hamur"),
    IKINCI_HAMUR("İkinci Hamur"),
    UCUNCU_HAMUR("Üçüncü Hamur");

    public final String label;

    BaskiTuru(String label){ this.label = label; }

    public String getLabel(){ return label; }
}
