package com.tolgaybalci.kitap.controller;

import com.tolgaybalci.kitap.entity.BaskiTuru;
import com.tolgaybalci.kitap.entity.Kitap;
import com.tolgaybalci.kitap.entity.KitapTuru;
import com.tolgaybalci.kitap.serviceimplementation.KitapServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/kitaplar")
public class KitapController {

    @Autowired
    private KitapServiceImplementation kitapServiceImplementation;

    @GetMapping
    public List<Kitap> getAllKitaplar(){ return kitapServiceImplementation.getAllitap(); }

    @PostMapping
    public ResponseEntity<Kitap> saveKitap(@Valid @RequestBody Kitap kitap){
        kitapServiceImplementation.saveKitap(kitap);
        return new ResponseEntity(null, HttpStatus.CREATED);
    }

    @GetMapping("/{kitapId}")
    public ResponseEntity<Kitap> getKitapById(@PathVariable("kitapId") String id){
        Kitap kitap = kitapServiceImplementation.getKitapById(id);
        return new ResponseEntity<Kitap>(kitap, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Kitap> updateKitap(@Valid @RequestBody Kitap kitap){
        kitapServiceImplementation.updateKitap(kitap);
        return new ResponseEntity<Kitap>(kitap, HttpStatus.OK);
    }

    @DeleteMapping("/kitap/{kitapId}")
    public ResponseEntity<Void> deleteKitap(@PathVariable("kitapId") String id){
        kitapServiceImplementation.deleteKitap(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/get-baski-turleri")
    public ResponseEntity<BaskiTuru> getBaskiTurleri(){
        return new ResponseEntity(kitapServiceImplementation.baskiTuru(), HttpStatus.OK);
    }

    @GetMapping("/get-kitap-turleri")
    public ResponseEntity<KitapTuru> getKitapTurleri(){
        return new ResponseEntity(kitapServiceImplementation.kitapTuru(), HttpStatus.OK);
    }
}
