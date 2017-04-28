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
public class IstekListesi {
    private int id;
    private int istekte_bulunan;
    private Date istek_tarihi;
    private boolean onay_durumu;
    private int islem_yapan;
    private Date islem_tarihi;
    
    
    public IstekListesi(){
    
    }
    public IstekListesi(int id, int istekte_bulunan,Date istek_tarihi, boolean onay_durumu,int islem_yapan, Date islem_tarihi){
        this.id = id;
        this.islem_tarihi = islem_tarihi;
        this.islem_yapan = islem_yapan;
        this.istek_tarihi = istek_tarihi;
        this.istekte_bulunan = istekte_bulunan;
        this.onay_durumu = onay_durumu;
    }
    public int getId() {
      return id;
    }
    public void setId( int id ) {
      this.id = id;
    }
    public int getIstekteBulunan() {
      return istekte_bulunan;
    }
    public void setIstekteBulunan( int istekte_bulunan ) {
      this.istekte_bulunan = istekte_bulunan;
    }
    public Date getIstekTarihi(){
        return istek_tarihi;
    }
    public void setIstekTarihi(Date istek_tarihi){
        this.istek_tarihi = istek_tarihi;
    }
    public boolean getOnayDurumu(){
        return onay_durumu;
    }
    public void setOnayDurumu(boolean onay_durumu){
        this.onay_durumu = onay_durumu;
    }
    public int getIslemYapan(){
        return islem_yapan;
    }
    public void setIslemYapan(int islem_yapan){
        this.islem_yapan = islem_yapan;
    }
    public Date getIslemTarihi(){
        return islem_tarihi;
    }
    public void setIslemTarihi(Date islem_tarihi){
        this.islem_tarihi = islem_tarihi;
    }
    
}

