package com.tolgaybalci.kitap.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.tolgaybalci.kitap.deserializer.KitapTuruDeserializer;
import com.tolgaybalci.kitap.serializer.KitapTuruSerializer;

@JsonDeserialize(using = KitapTuruDeserializer.class)
@JsonSerialize(using = KitapTuruSerializer.class)
public enum KitapTuru {

    BILIMKURGU("BİLİMKURGU"),
    KORKU("KORKU"),
    GERILIM("GERİLİM"),
    MIZAH("MİZAH"),
    DRAM("DRAM"),
    KLASIK("KLASİK"),
    POLISIYE("POLİSİYE"),
    BIYOGRAFI("BİYOGRAFİ"),
    SIIR("ŞİİR"),
    OYKU("ÖYKÜ"),
    HIKAYE("HİKAYE"),
    DESTAN("DESTAN"),
    GEZI("GEZİ"),
    DIL("DİL"),
    DERS("DERS"),
    ANSIKLOPEDI("ANSİKLOPEDİ");

    private final String label;

    KitapTuru(String label) { this.label = label; }

    public String getLabel() { return label; }
}
