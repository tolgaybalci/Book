package com.tolgaybalci.kitap.dao;

import com.tolgaybalci.kitap.entity.Kitap;
import com.tolgaybalci.kitap.repository.KitapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class KitapDaoImplementation {

    @Autowired
    private KitapRepository kitapRepository;

    public List<Kitap> getAllKitap(){ return kitapRepository.findAll();}

    public void saveKitap(Kitap kitap){ kitapRepository.save(kitap);}

    public Kitap getKitapById(String id){ return kitapRepository.findById(id).orElse(null);}

    public void updateKitap(Kitap kitap){kitapRepository.save(kitap); }

    public void deleteKitap(String id){kitapRepository.deleteById(id);}
}
