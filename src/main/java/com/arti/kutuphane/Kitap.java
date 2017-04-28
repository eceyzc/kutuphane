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
public class Kitap {
    private int id;
    private String kitap_adi;
    private String kitap_yazar;
    private Date cikis_tarihi;
    private boolean verilebilirlik;
    
    public Kitap(){
    
    }
    public Kitap(int id, String kitap_adi, String kitap_yazar,Date cikis_tarihi, boolean verilebilirlik){
        this.id = id;
        this.kitap_adi = kitap_adi;
        this.kitap_yazar = kitap_yazar;
        this.cikis_tarihi = cikis_tarihi;
        this.verilebilirlik = verilebilirlik;
    
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKitap_adi() {
        return kitap_adi;
    }

    public void setKitap_adi(String kitap_adi) {
        this.kitap_adi = kitap_adi;
    }

    public String getKitap_yazar() {
        return kitap_yazar;
    }

    public void setKitap_yazar(String kitap_yazar) {
        this.kitap_yazar = kitap_yazar;
    }

    public Date getCikis_tarihi() {
        return cikis_tarihi;
    }

    public void setCikis_tarihi(Date cikis_tarihi) {
        this.cikis_tarihi = cikis_tarihi;
    }

    public boolean getVerilebilirlik() {
        return verilebilirlik;
    }

    public void setVerilebilirlik(boolean verilebilirlik) {
        this.verilebilirlik = verilebilirlik;
    }
}
