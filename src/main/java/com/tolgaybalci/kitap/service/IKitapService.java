package com.tolgaybalci.kitap.service;

import com.tolgaybalci.kitap.entity.Kitap;

import java.util.List;

public interface IKitapService {

    List<Kitap> getAllitap();

    Kitap getKitapById(String id);

    void saveKitap(Kitap kitap);

    void updateKitap(Kitap kitap);

    void deleteKitap(String id);
}
