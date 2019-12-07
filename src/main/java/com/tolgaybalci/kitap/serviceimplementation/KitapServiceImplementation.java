package com.tolgaybalci.kitap.serviceimplementation;

import com.tolgaybalci.kitap.dao.KitapDaoImplementation;
import com.tolgaybalci.kitap.entity.Kitap;
import com.tolgaybalci.kitap.service.IKitapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
