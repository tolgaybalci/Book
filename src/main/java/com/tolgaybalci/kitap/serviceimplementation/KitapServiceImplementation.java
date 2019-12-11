package com.tolgaybalci.kitap.serviceimplementation;

import com.tolgaybalci.kitap.dao.KitapDaoImplementation;
import com.tolgaybalci.kitap.entity.BaskiTuru;
import com.tolgaybalci.kitap.entity.Kitap;
import com.tolgaybalci.kitap.entity.KitapTuru;
import com.tolgaybalci.kitap.service.IKitapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class KitapServiceImplementation implements IKitapService {

    @Autowired
    private KitapDaoImplementation kitapDaoImplementation;

    @Override
    public List<Kitap> getAllitap() {
        return kitapDaoImplementation.getAllKitap();
    }

    @Override
    public Kitap getKitapById(String id) {
        return kitapDaoImplementation.getKitapById(id);
    }

    @Override
    public void saveKitap(Kitap kitap) {
        kitapDaoImplementation.saveKitap(kitap);
    }

    @Override
    public void updateKitap(Kitap kitap) {
        kitapDaoImplementation.updateKitap(kitap);
    }

    @Override
    public void deleteKitap(String id) {
        kitapDaoImplementation.deleteKitap(id);
    }

    @Override
    public List<HashMap<String, String>> baskiTuru() {
        List<HashMap<String, String>> baskiTurleri = new ArrayList<>();
        for(BaskiTuru baskiTuru: BaskiTuru.values()) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("name", baskiTuru.name());
            hashMap.put("label", baskiTuru.getLabel());
            baskiTurleri.add(hashMap);
        }
        return baskiTurleri;
    }

    @Override
    public List<HashMap<String, String>> kitapTuru() {
        List<HashMap<String, String>> kitapTurleri = new ArrayList<>();
        for(KitapTuru kitapTuru: KitapTuru.values()) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("name", kitapTuru.name());
            hashMap.put("label", kitapTuru.getLabel());
            kitapTurleri.add(hashMap);
        }
        return kitapTurleri;
    }
}
