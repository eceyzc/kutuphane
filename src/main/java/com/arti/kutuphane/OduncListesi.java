/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arti.kutuphane;

import java.util.Date;

/**
 *
 * @author pc
 */
public class OduncListesi {
    
    private int id;
    private int kullanici_id;
    private int kitap_id;
    private Date verilis_tarihi;
    private Date bitis_tarihi;
    private boolean durum;
    
    
    public OduncListesi(){
    
    }
    public OduncListesi(int id, int kullanici_id, int kitap_id, Date verilis_tarihi, Date bitis_tarihi, boolean durum){
        this.id = id;
        this.kullanici_id = kullanici_id;
        this.kitap_id = kullanici_id;
        this.verilis_tarihi = verilis_tarihi;
        this.bitis_tarihi = bitis_tarihi;
        this.durum = durum;
        
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKullanici_id() {
        return kullanici_id;
    }

    public void setKullanici_id(int kullanici_id) {
        this.kullanici_id = kullanici_id;
    }

    public int getKitap_id() {
        return kitap_id;
    }

    public void setKitap_id(int kitap_id) {
        this.kitap_id = kitap_id;
    }

    public Date getVerilis_tarihi() {
        return verilis_tarihi;
    }

    public void setVerilis_tarihi(Date verilis_tarihi) {
        this.verilis_tarihi = verilis_tarihi;
    }

    public Date getBitis_tarihi() {
        return bitis_tarihi;
    }

    public void setBitis_tarihi(Date bitis_tarihi) {
        this.bitis_tarihi = bitis_tarihi;
    }

    public boolean isDurum() {
        return durum;
    }

    public void setDurum(boolean durum) {
        this.durum = durum;
    }
}
