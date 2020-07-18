/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kullanicilar;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author Sevdanur GENC
 */
public class KullanicilarEkle {
    
    Connection connect;
    ResultSet res;
    PreparedStatement prs;
    
     private String kullanici_adi;
    private String sifre;
    private String isim;
    private String soyisim;
    private String cinsiyet;
    private String dogumyeri;
    private String dogumtarihi;
    private String kullanici_id;
    private String ceptel;
    private String evtel;
    private String adres;
    private String web;
    private String email;
    private String ehliyet;
    private String uyruk;
    private String egitimdurumu;
    private String medenidurum;
    private String toplamtecrube;
    private String calismadurumu;
    private String egitim_id;
    private String nitelik_id;
    private String istecrube_id;
    private String referans_id;
    private String sertifika_id;
    private String kurs_id;
    private String yabancidil_id;
    private String sinavbilgi_id;
    private String yetki_id;
    
     public String kullanicilarekle() throws Exception
    {
         VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            String sorgu = "INSERT INTO NDA_KISISEL(KULLANICI_ADI,SIFRE,ISIM,SOYISIM,CINSIYET,"
                    + "DOGUMYERI,DOGUMTARIHI,KULLANICI_ID,CEPTEL,EVTEL,ADRES,WEB,EMAIL,EHLIYET,"
                    + "UYRUK,EGITIMDURUMU,MEDENIDURUM,TOPLAMTECRUBE,CALISMADURUMU,"
                    + "EGITIM_ID,NITELIK_ID,ISTECRUBE_ID,REFERANS_ID,SERTIFIKA_ID,KURS_ID,"
                    + "YABANCIDIL_ID,SINAVBILGI_ID,YETKI_ID) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            prs = connect.prepareStatement(sorgu);
           
            prs.setString(1, this.getKullanici_adi());
            prs.setString(2, this.getSifre());
            prs.setString(3, this.getIsim());
            prs.setString(4, this.getSoyisim());
            prs.setString(5, this.getCinsiyet());
            prs.setString(6, this.getDogumyeri());
            prs.setString(7, this.getDogumtarihi());
            prs.setString(8, this.getKullanici_id());
            prs.setString(9, this.getCeptel());
            prs.setString(10, this.getEvtel());
            prs.setString(11, this.getAdres());
            prs.setString(12, this.getWeb());
            prs.setString(13, this.getEmail());
            prs.setString(14, this.getEhliyet());
            prs.setString(15, this.getUyruk());
            prs.setString(16, this.getEgitimdurumu());
            prs.setString(17, this.getMedenidurum());
            prs.setString(18, this.getToplamtecrube());
            prs.setString(19, this.getCalismadurumu());
            prs.setString(20, this.getEgitim_id());
            prs.setString(21, this.getNitelik_id());
            prs.setString(22, this.getIstecrube_id());
            prs.setString(23, this.getReferans_id());
            prs.setString(24, this.getSertifika_id());
            prs.setString(25, this.getKurs_id());
            prs.setString(26, this.getYabancidil_id());
            prs.setString(27, this.getSinavbilgi_id());
            prs.setString(28, this.getYetki_id());
                      
            
            prs.execute();
            prs.close();
            vi.baglantiyikes();
            
     
            return "AdminPaneli";
        
        
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getCalismadurumu() {
        return calismadurumu;
    }

    public void setCalismadurumu(String calismadurumu) {
        this.calismadurumu = calismadurumu;
    }

    public String getCeptel() {
        return ceptel;
    }

    public void setCeptel(String ceptel) {
        this.ceptel = ceptel;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(String dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }

    public String getDogumyeri() {
        return dogumyeri;
    }

    public void setDogumyeri(String dogumyeri) {
        this.dogumyeri = dogumyeri;
    }

    public String getEgitim_id() {
        return egitim_id;
    }

    public void setEgitim_id(String egitim_id) {
        this.egitim_id = egitim_id;
    }

    public String getEgitimdurumu() {
        return egitimdurumu;
    }

    public void setEgitimdurumu(String egitimdurumu) {
        this.egitimdurumu = egitimdurumu;
    }

    public String getEhliyet() {
        return ehliyet;
    }

    public void setEhliyet(String ehliyet) {
        this.ehliyet = ehliyet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEvtel() {
        return evtel;
    }

    public void setEvtel(String evtel) {
        this.evtel = evtel;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getIstecrube_id() {
        return istecrube_id;
    }

    public void setIstecrube_id(String istecrube_id) {
        this.istecrube_id = istecrube_id;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getKullanici_id() {
        return kullanici_id;
    }

    public void setKullanici_id(String kullanici_id) {
        this.kullanici_id = kullanici_id;
    }

    public String getKurs_id() {
        return kurs_id;
    }

    public void setKurs_id(String kurs_id) {
        this.kurs_id = kurs_id;
    }

    public String getMedenidurum() {
        return medenidurum;
    }

    public void setMedenidurum(String medenidurum) {
        this.medenidurum = medenidurum;
    }

    public String getNitelik_id() {
        return nitelik_id;
    }

    public void setNitelik_id(String nitelik_id) {
        this.nitelik_id = nitelik_id;
    }

    public String getReferans_id() {
        return referans_id;
    }

    public void setReferans_id(String referans_id) {
        this.referans_id = referans_id;
    }

    public String getSertifika_id() {
        return sertifika_id;
    }

    public void setSertifika_id(String sertifika_id) {
        this.sertifika_id = sertifika_id;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getSinavbilgi_id() {
        return sinavbilgi_id;
    }

    public void setSinavbilgi_id(String sinavbilgi_id) {
        this.sinavbilgi_id = sinavbilgi_id;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getToplamtecrube() {
        return toplamtecrube;
    }

    public void setToplamtecrube(String toplamtecrube) {
        this.toplamtecrube = toplamtecrube;
    }

    public String getUyruk() {
        return uyruk;
    }

    public void setUyruk(String uyruk) {
        this.uyruk = uyruk;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getYabancidil_id() {
        return yabancidil_id;
    }

    public void setYabancidil_id(String yabancidil_id) {
        this.yabancidil_id = yabancidil_id;
    }

    public String getYetki_id() {
        return yetki_id;
    }

    public void setYetki_id(String yetki_id) {
        this.yetki_id = yetki_id;
    }
     
     
     
    
    
    
}
