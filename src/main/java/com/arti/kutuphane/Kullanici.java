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
public class Kullanici {
    
    private int id;
    private String kullanici_adi;
    private String sifre;
    private String eposta;
    private String isim;
    private String soyisim;
    private String tur;
    private Date olusturulma_tarihi;
    private boolean durum;
    
    public Kullanici(){
    
    }
    
    public Kullanici(int id, String kullanici_adi, String sifre, String eposta, String isim, String soyisim , String tur, Date olusturulma_tarihi, boolean durum){
        this.id = id;
        this.kullanici_adi = kullanici_adi;
        this.sifre = sifre;
        this.eposta = eposta;
        this.isim = isim;
        this.soyisim = soyisim;
        this.tur = tur;
        this.olusturulma_tarihi = olusturulma_tarihi;
        this.durum = durum;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public Date getOlusturulma_tarihi() {
        return olusturulma_tarihi;
    }

    public void setOlusturulma_tarihi(Date olusturulma_tarihi) {
        this.olusturulma_tarihi = olusturulma_tarihi;
    }

    public boolean isDurum() {
        return durum;
    }

    public void setDurum(boolean durum) {
        this.durum = durum;
    }
}
