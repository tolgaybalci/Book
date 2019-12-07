package com.tolgaybalci.kitap.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Kitap {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    @Column(name = "kitap_ismi")
    private String kitapIsmi;

    @Column(name = "kitap_yazari")
    private String kitapYazari;

    @Column(name = "basim_tarihi")
    @Temporal(TemporalType.DATE)
    private Date basimTarihi;

    @Column(name = "basim_yeri")
    private String basimYeri;

    @Column(name = "editor")
    private String editor;

    @Column(name = "kitap_turu")
    private KitapTuru kitapTuru;

    @Column(name = "isbn_numarasi")
    private String ISBN_Numarasi;

    @Column(name = "fiyat")
    private BigDecimal fiyat;

    @Column(name = "baski_sayisi")
    private BigDecimal baskiSayisi;

    @Column(name = "etiket_numarasi")
    private String etiketNumarasi;

    @Column(name = "baski_turu")
    private BaskiTuru baskiTuru;

    @Lob
    @Column(name = "aciklama")
    private String aciklama;

    @Lob
    @Column(name = "onsoz")
    private String onsoz;

    @Lob
    @Column(name = "yazarin_biyorgarifi")
    private String yazarinBiyografisi;

    public Kitap() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKitapIsmi() {
        return kitapIsmi;
    }

    public void setKitapIsmi(String kitapIsmi) {
        this.kitapIsmi = kitapIsmi;
    }

    public String getKitapYazari() {
        return kitapYazari;
    }

    public void setKitapYazari(String kitapYazari) {
        this.kitapYazari = kitapYazari;
    }

    public Date getBasimTarihi() {
        return basimTarihi;
    }

    public void setBasimTarihi(Date basimTarihi) {
        this.basimTarihi = basimTarihi;
    }

    public String getBasimYeri() {
        return basimYeri;
    }

    public void setBasimYeri(String basimYeri) {
        this.basimYeri = basimYeri;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public KitapTuru getKitapTuru() {
        return kitapTuru;
    }

    public void setKitapTuru(KitapTuru kitapTuru) {
        this.kitapTuru = kitapTuru;
    }

    public String getISBN_Numarasi() {
        return ISBN_Numarasi;
    }

    public void setISBN_Numarasi(String ISBN_Numarasi) {
        this.ISBN_Numarasi = ISBN_Numarasi;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public BigDecimal getBaskiSayisi() {
        return baskiSayisi;
    }

    public void setBaskiSayisi(BigDecimal baskiSayisi) {
        this.baskiSayisi = baskiSayisi;
    }

    public String getEtiketNumarasi() {
        return etiketNumarasi;
    }

    public void setEtiketNumarasi(String etiketNumarasi) {
        this.etiketNumarasi = etiketNumarasi;
    }

    public BaskiTuru getBaskiTuru() {
        return baskiTuru;
    }

    public void setBaskiTuru(BaskiTuru baskiTuru) {
        this.baskiTuru = baskiTuru;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getOnsoz() {
        return onsoz;
    }

    public void setOnsoz(String onsoz) {
        this.onsoz = onsoz;
    }

    public String getYazarinBiyografisi() {
        return yazarinBiyografisi;
    }

    public void setYazarinBiyografisi(String yazarinBiyografisi) {
        this.yazarinBiyografisi = yazarinBiyografisi;
    }
}
