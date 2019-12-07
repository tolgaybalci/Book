package com.tolgaybalci.kitap.controller;

import com.tolgaybalci.kitap.entity.Kitap;
import com.tolgaybalci.kitap.serviceimplementation.KitapServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public ResponseEntity<Kitap> getKitapById(@PathVariable("terminalId") String id){
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

/*
* Yapılacaklar
* 1-) Update metodu doğru bir şekilde yazılmış mı?
      Daha kısa bir şekilde update metotdu yazılabilir mi?
      Update metoduna belirli bir id'ye sahip kitap güncelleneceği için String id parametresi getirilmesi gerekli mi?
      (Eğer String id parametresi gerekliyse tüm service implementation, controller da değiştirilmeli.)
* 2-) İlk olarak Postman tool'unda UPDATE nasıl yapılır o öğrenilecek.
* 3-) phpmyadmin enum tipli değerler direkt polisiye, komedi olarak değil de 2,3,5 vb. şekilde gözüküyor. Bu phpmyadmin e ait bir problem mi
*     yoksa tüm veritabanlarında bu şekilde mi görülüyor. Yani hatalı bir görünüm değil mi? (Sordum değil dediler. Emin değilim.)
* 4-) Projeye Angular eklenecek.
* 5-) Angular eklenerek projede form oluşturulacak.
* 6-) Oluşturulan Angular formuna veritabanındaki (phpmyadmin) veriler ilgili yerlere doğru bir şekilde kaydedilecek.
*     Örneğin Yazarlar Label ı yanında Dropdown list olacak. Veritabanındaki tüm yazarlar Dropdown a otomatik olarak gelecek.
*     Örneğin ben Rüzgar Gibi Geçti kitabını seçtiğimde direkt o kitabın yazarı, basım yeri, basım tarihi, vb. yerler gelecek.(Autocomlete gibi)
*     Nasıl yapıldığı öğrenilecek.
* 7-) Angular'da yeni form nasıl oluşturulur ve yeni bilgilerin forma kaydı nasıl yapılır öğrenilecek.
*
*/

}
