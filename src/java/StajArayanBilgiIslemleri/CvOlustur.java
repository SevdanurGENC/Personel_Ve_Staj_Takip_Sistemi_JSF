/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StajArayanBilgiIslemleri;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Sevdanur GENC
 */
public class CvOlustur {
    
    Connection connect;
    ResultSet res;
    PreparedStatement prs1,prs2,prs3,prs4,prs5,prs6,prs7,prs8,prs9;
    
   
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
    
    private String egitim_kullanici_id;
    private String egitim_ilkogretim_adi;
    private String egitim_ilkogretim_mezun_tarihi;
    private String egitim_ilkogretim_diploma_notu;
    private String egitim_lise_adi;
    private String egitim_lise_mezun_tarihi;
    private String egitim_lise_diploma_notu;
    private String egitim_lise_bolum;
    private String egitim_lisans_bolum;
    private String egitim_lisans_adi;
    private String egitim_lisans_mezun_tarihi;
    private String egitim_lisans_diploma_notu;
    private String egitim_ylisans_bolum;
    private String egitim_ylisans_adi;
    private String egitim_ylisans_mezun_tarihi;
    private String egitim_ylisans_diploma_notu;
    private String egitim_doktora_bolum;
    private String egitim_doktora_adi;
    private String egitim_doktora_mezun_tarihi;
    private String egitim_doktora_diploma_notu;
       
    private String referans_kullanici_id;
    private String referans_isim_soyisim;
    private String referans_firma;
    private String referans_email;
    private String referans_pozisyon;
    private String referans_telefon;
    
    private String kurs_kullanici_id;
    private String kurs_egitim_adi;
    private String kurs_kurum;
    private String kurs_sure;
    private String kurs_tarih;
    
    private String sertifika_kullanici_id;
    private String sertifika_sertifika_adi;
    private String sertifika_kurum;
    private String sertifika_tarih;
    
    private String yabancidil_kullanici_id;
    private String yabancidil_dil;
    private String yabancidil_okuma;
    private String yabancidil_yazma;
    private String yabancidil_konusma;
    private String yabancidil_kurum;
    
    private String sinavbilgi_kullanici_id;
    private String sinavbilgi_sinavadi;
    private String sinavbilgi_kurum;
    private String sinavbilgi_tarih;
    private String sinavbilgi_puan;
    
    private String istecrubesi_kullanici_id;
    private String istecrubesi_firmadi_adi;
    private String istecrubesi_pozisyon;
    private String istecrubesi_baslangic_tarihi;
    private String istecrubesi_bitis_tarihi;
    
    private String nitelik_kullanici_id;
    private String nitelik_bilgisayar;
    
    
    public String cvolustur() throws Exception
    {
      
            VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            String sorgu1 = "insert into NDA_KISISEL(KULLANICI_ADI, SIFRE, ISIM, SOYISIM, CINSIYET, "
                    + "DOGUMYERI, DOGUMTARIHI, KULLANICI_ID, CEPTEL, EVTEL, ADRES, WEB, EMAIL, "
                    + "EHLIYET, UYRUK, EGITIMDURUMU, MEDENIDURUM, TOPLAMTECRUBE, CALISMADURUMU, YETKI_ID) "
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    
            prs1 = connect.prepareStatement(sorgu1);
            
            prs1.setString(1, this.getKullanici_adi());
            prs1.setString(2, this.getSifre());
            prs1.setString(3, this.getIsim());
            prs1.setString(4, this.getSoyisim());
            prs1.setString(5, this.getCinsiyet());
            prs1.setString(6, this.getDogumyeri());
            prs1.setString(7, this.getDogumtarihi());
            prs1.setString(8, this.getKullanici_id());
            prs1.setString(9, this.getCeptel());
            prs1.setString(10, this.getEvtel());
            prs1.setString(11, this.getAdres());
            prs1.setString(12, this.getWeb());
            prs1.setString(13, this.getEmail());
            prs1.setString(14, this.getEhliyet());
            prs1.setString(15, this.getUyruk());
            prs1.setString(16, this.getEgitimdurumu());
            prs1.setString(17, this.getMedenidurum());
            prs1.setString(18, this.getToplamtecrube());
            prs1.setString(19, this.getCalismadurumu());
            prs1.setString(20, this.getYetki_id());
            
             
            prs1.execute();
            prs1.close();
//            prs2.execute();
//            prs2.close();
//            prs3.execute();
//            prs3.close();
//            prs4.execute();
//            prs4.close();
//            prs5.execute();
//            prs5.close();
//            prs6.execute();
//            prs6.close();
//            prs7.execute();
//            prs7.close();
//            prs8.execute();
//            prs8.close(); 
//            prs9.execute();
//            prs9.close();
            
            vi.baglantiyikes();
       
            return "StajArayan_CvOlustur_Adim1";
    }

    
    
    public String cvolustur2() throws Exception
    {
           VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
        
         String sorgu2 = "insert into NDA_EGITIM(KULLANICI_ID, ILKOGRETIM_ADI, ILKOGRETIM_MEZUN_TARIHI, "
                    + "ILKOGRETIM_DIPLOMA_NOTU, LISE_ADI, LISE_MEZUN_TARIHI, LISE_DIPLOMA_NOTU, "
                    + "LISE_BOLUM, LISANS_BOLUM, LISANS_ADI, LISANS_MEZUN_TARIHI, LISANS_DIPLOMA_NOTU, "
                    + "YLISANS_BOLUM, YLISANS_ADI, YLISANS_MEZUN_TARIHI, YLISANS_DIPLOMA_NOTU, "
                    + "DOKTORA_BOLUM, DOKTORA_ADI, DOKTORA_MEZUN_TARIHI, DOKTORA_DIPLOMA_NOTU )"
                    + " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
       
            prs2 = connect.prepareStatement(sorgu2);
            
            prs2.setString(1, this.getKullanici_id());
            prs2.setString(2, this.getEgitim_ilkogretim_adi());
            prs2.setString(3, this.getEgitim_ilkogretim_mezun_tarihi());
            prs2.setString(4, this.getEgitim_ilkogretim_diploma_notu());
            prs2.setString(5, this.getEgitim_lise_adi());
            prs2.setString(6, this.getEgitim_lise_mezun_tarihi());
            prs2.setString(7, this.getEgitim_lise_diploma_notu());
            prs2.setString(8, this.getEgitim_lise_bolum());
            prs2.setString(9, this.getEgitim_lisans_bolum());
            prs2.setString(10, this.getEgitim_lisans_adi());
            prs2.setString(11, this.getEgitim_lisans_mezun_tarihi());
            prs2.setString(12, this.getEgitim_lisans_diploma_notu());
            prs2.setString(13, this.getEgitim_ylisans_bolum());
            prs2.setString(14, this.getEgitim_ylisans_adi());
            prs2.setString(15, this.getEgitim_ylisans_mezun_tarihi());
            prs2.setString(16, this.getEgitim_ylisans_diploma_notu());
            prs2.setString(17, this.getEgitim_doktora_bolum());
            prs2.setString(18, this.getEgitim_doktora_adi());
            prs2.setString(19, this.getEgitim_doktora_mezun_tarihi());
            prs2.setString(20, this.getEgitim_doktora_diploma_notu());
            
             prs2.execute();
             prs2.close();
            
            vi.baglantiyikes();
       
            return "StajArayan_CvOlustur";
            
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

    public Connection getConnect() {
        return connect;
    }

    public void setConnect(Connection connect) {
        this.connect = connect;
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

    public String getEgitim_doktora_adi() {
        return egitim_doktora_adi;
    }

    public void setEgitim_doktora_adi(String egitim_doktora_adi) {
        this.egitim_doktora_adi = egitim_doktora_adi;
    }

    public String getEgitim_doktora_bolum() {
        return egitim_doktora_bolum;
    }

    public void setEgitim_doktora_bolum(String egitim_doktora_bolum) {
        this.egitim_doktora_bolum = egitim_doktora_bolum;
    }

    public String getEgitim_doktora_diploma_notu() {
        return egitim_doktora_diploma_notu;
    }

    public void setEgitim_doktora_diploma_notu(String egitim_doktora_diploma_notu) {
        this.egitim_doktora_diploma_notu = egitim_doktora_diploma_notu;
    }

    public String getEgitim_doktora_mezun_tarihi() {
        return egitim_doktora_mezun_tarihi;
    }

    public void setEgitim_doktora_mezun_tarihi(String egitim_doktora_mezun_tarihi) {
        this.egitim_doktora_mezun_tarihi = egitim_doktora_mezun_tarihi;
    }

    public String getEgitim_id() {
        return egitim_id;
    }

    public void setEgitim_id(String egitim_id) {
        this.egitim_id = egitim_id;
    }

    public String getEgitim_ilkogretim_adi() {
        return egitim_ilkogretim_adi;
    }

    public void setEgitim_ilkogretim_adi(String egitim_ilkogretim_adi) {
        this.egitim_ilkogretim_adi = egitim_ilkogretim_adi;
    }

    public String getEgitim_ilkogretim_diploma_notu() {
        return egitim_ilkogretim_diploma_notu;
    }

    public void setEgitim_ilkogretim_diploma_notu(String egitim_ilkogretim_diploma_notu) {
        this.egitim_ilkogretim_diploma_notu = egitim_ilkogretim_diploma_notu;
    }

    public String getEgitim_ilkogretim_mezun_tarihi() {
        return egitim_ilkogretim_mezun_tarihi;
    }

    public void setEgitim_ilkogretim_mezun_tarihi(String egitim_ilkogretim_mezun_tarihi) {
        this.egitim_ilkogretim_mezun_tarihi = egitim_ilkogretim_mezun_tarihi;
    }

    public String getEgitim_kullanici_id() {
        return egitim_kullanici_id;
    }

    public void setEgitim_kullanici_id(String egitim_kullanici_id) {
        this.egitim_kullanici_id = egitim_kullanici_id;
    }

    public String getEgitim_lisans_adi() {
        return egitim_lisans_adi;
    }

    public void setEgitim_lisans_adi(String egitim_lisans_adi) {
        this.egitim_lisans_adi = egitim_lisans_adi;
    }

    public String getEgitim_lisans_bolum() {
        return egitim_lisans_bolum;
    }

    public void setEgitim_lisans_bolum(String egitim_lisans_bolum) {
        this.egitim_lisans_bolum = egitim_lisans_bolum;
    }

    public String getEgitim_lisans_diploma_notu() {
        return egitim_lisans_diploma_notu;
    }

    public void setEgitim_lisans_diploma_notu(String egitim_lisans_diploma_notu) {
        this.egitim_lisans_diploma_notu = egitim_lisans_diploma_notu;
    }

    public String getEgitim_lisans_mezun_tarihi() {
        return egitim_lisans_mezun_tarihi;
    }

    public void setEgitim_lisans_mezun_tarihi(String egitim_lisans_mezun_tarihi) {
        this.egitim_lisans_mezun_tarihi = egitim_lisans_mezun_tarihi;
    }

    public String getEgitim_lise_adi() {
        return egitim_lise_adi;
    }

    public void setEgitim_lise_adi(String egitim_lise_adi) {
        this.egitim_lise_adi = egitim_lise_adi;
    }

    public String getEgitim_lise_bolum() {
        return egitim_lise_bolum;
    }

    public void setEgitim_lise_bolum(String egitim_lise_bolum) {
        this.egitim_lise_bolum = egitim_lise_bolum;
    }

    public String getEgitim_lise_diploma_notu() {
        return egitim_lise_diploma_notu;
    }

    public void setEgitim_lise_diploma_notu(String egitim_lise_diploma_notu) {
        this.egitim_lise_diploma_notu = egitim_lise_diploma_notu;
    }

    public String getEgitim_lise_mezun_tarihi() {
        return egitim_lise_mezun_tarihi;
    }

    public void setEgitim_lise_mezun_tarihi(String egitim_lise_mezun_tarihi) {
        this.egitim_lise_mezun_tarihi = egitim_lise_mezun_tarihi;
    }

    public String getEgitim_ylisans_adi() {
        return egitim_ylisans_adi;
    }

    public void setEgitim_ylisans_adi(String egitim_ylisans_adi) {
        this.egitim_ylisans_adi = egitim_ylisans_adi;
    }

    public String getEgitim_ylisans_bolum() {
        return egitim_ylisans_bolum;
    }

    public void setEgitim_ylisans_bolum(String egitim_ylisans_bolum) {
        this.egitim_ylisans_bolum = egitim_ylisans_bolum;
    }

    public String getEgitim_ylisans_diploma_notu() {
        return egitim_ylisans_diploma_notu;
    }

    public void setEgitim_ylisans_diploma_notu(String egitim_ylisans_diploma_notu) {
        this.egitim_ylisans_diploma_notu = egitim_ylisans_diploma_notu;
    }

    public String getEgitim_ylisans_mezun_tarihi() {
        return egitim_ylisans_mezun_tarihi;
    }

    public void setEgitim_ylisans_mezun_tarihi(String egitim_ylisans_mezun_tarihi) {
        this.egitim_ylisans_mezun_tarihi = egitim_ylisans_mezun_tarihi;
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

    public String getIstecrubesi_baslangic_tarihi() {
        return istecrubesi_baslangic_tarihi;
    }

    public void setIstecrubesi_baslangic_tarihi(String istecrubesi_baslangic_tarihi) {
        this.istecrubesi_baslangic_tarihi = istecrubesi_baslangic_tarihi;
    }

    public String getIstecrubesi_bitis_tarihi() {
        return istecrubesi_bitis_tarihi;
    }

    public void setIstecrubesi_bitis_tarihi(String istecrubesi_bitis_tarihi) {
        this.istecrubesi_bitis_tarihi = istecrubesi_bitis_tarihi;
    }

    public String getIstecrubesi_firmadi_adi() {
        return istecrubesi_firmadi_adi;
    }

    public void setIstecrubesi_firmadi_adi(String istecrubesi_firmadi_adi) {
        this.istecrubesi_firmadi_adi = istecrubesi_firmadi_adi;
    }

    public String getIstecrubesi_kullanici_id() {
        return istecrubesi_kullanici_id;
    }

    public void setIstecrubesi_kullanici_id(String istecrubesi_kullanici_id) {
        this.istecrubesi_kullanici_id = istecrubesi_kullanici_id;
    }

    public String getIstecrubesi_pozisyon() {
        return istecrubesi_pozisyon;
    }

    public void setIstecrubesi_pozisyon(String istecrubesi_pozisyon) {
        this.istecrubesi_pozisyon = istecrubesi_pozisyon;
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

    public String getKurs_egitim_adi() {
        return kurs_egitim_adi;
    }

    public void setKurs_egitim_adi(String kurs_egitim_adi) {
        this.kurs_egitim_adi = kurs_egitim_adi;
    }

    public String getKurs_id() {
        return kurs_id;
    }

    public void setKurs_id(String kurs_id) {
        this.kurs_id = kurs_id;
    }

    public String getKurs_kullanici_id() {
        return kurs_kullanici_id;
    }

    public void setKurs_kullanici_id(String kurs_kullanici_id) {
        this.kurs_kullanici_id = kurs_kullanici_id;
    }

    public String getKurs_kurum() {
        return kurs_kurum;
    }

    public void setKurs_kurum(String kurs_kurum) {
        this.kurs_kurum = kurs_kurum;
    }

    public String getKurs_sure() {
        return kurs_sure;
    }

    public void setKurs_sure(String kurs_sure) {
        this.kurs_sure = kurs_sure;
    }

    public String getKurs_tarih() {
        return kurs_tarih;
    }

    public void setKurs_tarih(String kurs_tarih) {
        this.kurs_tarih = kurs_tarih;
    }

    public String getMedenidurum() {
        return medenidurum;
    }

    public void setMedenidurum(String medenidurum) {
        this.medenidurum = medenidurum;
    }

    public String getNitelik_bilgisayar() {
        return nitelik_bilgisayar;
    }

    public void setNitelik_bilgisayar(String nitelik_bilgisayar) {
        this.nitelik_bilgisayar = nitelik_bilgisayar;
    }

    public String getNitelik_id() {
        return nitelik_id;
    }

    public void setNitelik_id(String nitelik_id) {
        this.nitelik_id = nitelik_id;
    }

    public String getNitelik_kullanici_id() {
        return nitelik_kullanici_id;
    }

    public void setNitelik_kullanici_id(String nitelik_kullanici_id) {
        this.nitelik_kullanici_id = nitelik_kullanici_id;
    }

    public String getReferans_email() {
        return referans_email;
    }

    public void setReferans_email(String referans_email) {
        this.referans_email = referans_email;
    }

    public String getReferans_firma() {
        return referans_firma;
    }

    public void setReferans_firma(String referans_firma) {
        this.referans_firma = referans_firma;
    }

    public String getReferans_id() {
        return referans_id;
    }

    public void setReferans_id(String referans_id) {
        this.referans_id = referans_id;
    }

    public String getReferans_isim_soyisim() {
        return referans_isim_soyisim;
    }

    public void setReferans_isim_soyisim(String referans_isim_soyisim) {
        this.referans_isim_soyisim = referans_isim_soyisim;
    }

    public String getReferans_kullanici_id() {
        return referans_kullanici_id;
    }

    public void setReferans_kullanici_id(String referans_kullanici_id) {
        this.referans_kullanici_id = referans_kullanici_id;
    }

    public String getReferans_pozisyon() {
        return referans_pozisyon;
    }

    public void setReferans_pozisyon(String referans_pozisyon) {
        this.referans_pozisyon = referans_pozisyon;
    }

    public String getReferans_telefon() {
        return referans_telefon;
    }

    public void setReferans_telefon(String referans_telefon) {
        this.referans_telefon = referans_telefon;
    }

    public String getSertifika_id() {
        return sertifika_id;
    }

    public void setSertifika_id(String sertifika_id) {
        this.sertifika_id = sertifika_id;
    }

    public String getSertifika_kullanici_id() {
        return sertifika_kullanici_id;
    }

    public void setSertifika_kullanici_id(String sertifika_kullanici_id) {
        this.sertifika_kullanici_id = sertifika_kullanici_id;
    }

    public String getSertifika_kurum() {
        return sertifika_kurum;
    }

    public void setSertifika_kurum(String sertifika_kurum) {
        this.sertifika_kurum = sertifika_kurum;
    }

    public String getSertifika_sertifika_adi() {
        return sertifika_sertifika_adi;
    }

    public void setSertifika_sertifika_adi(String sertifika_sertifika_adi) {
        this.sertifika_sertifika_adi = sertifika_sertifika_adi;
    }

    public String getSertifika_tarih() {
        return sertifika_tarih;
    }

    public void setSertifika_tarih(String sertifika_tarih) {
        this.sertifika_tarih = sertifika_tarih;
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

    public String getSinavbilgi_kullanici_id() {
        return sinavbilgi_kullanici_id;
    }

    public void setSinavbilgi_kullanici_id(String sinavbilgi_kullanici_id) {
        this.sinavbilgi_kullanici_id = sinavbilgi_kullanici_id;
    }

    public String getSinavbilgi_kurum() {
        return sinavbilgi_kurum;
    }

    public void setSinavbilgi_kurum(String sinavbilgi_kurum) {
        this.sinavbilgi_kurum = sinavbilgi_kurum;
    }

    public String getSinavbilgi_puan() {
        return sinavbilgi_puan;
    }

    public void setSinavbilgi_puan(String sinavbilgi_puan) {
        this.sinavbilgi_puan = sinavbilgi_puan;
    }

    public String getSinavbilgi_sinavadi() {
        return sinavbilgi_sinavadi;
    }

    public void setSinavbilgi_sinavadi(String sinavbilgi_sinavadi) {
        this.sinavbilgi_sinavadi = sinavbilgi_sinavadi;
    }

    public String getSinavbilgi_tarih() {
        return sinavbilgi_tarih;
    }

    public void setSinavbilgi_tarih(String sinavbilgi_tarih) {
        this.sinavbilgi_tarih = sinavbilgi_tarih;
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

    public String getYabancidil_dil() {
        return yabancidil_dil;
    }

    public void setYabancidil_dil(String yabancidil_dil) {
        this.yabancidil_dil = yabancidil_dil;
    }

    public String getYabancidil_id() {
        return yabancidil_id;
    }

    public void setYabancidil_id(String yabancidil_id) {
        this.yabancidil_id = yabancidil_id;
    }

    public String getYabancidil_konusma() {
        return yabancidil_konusma;
    }

    public void setYabancidil_konusma(String yabancidil_konusma) {
        this.yabancidil_konusma = yabancidil_konusma;
    }

    public String getYabancidil_kullanici_id() {
        return yabancidil_kullanici_id;
    }

    public void setYabancidil_kullanici_id(String yabancidil_kullanici_id) {
        this.yabancidil_kullanici_id = yabancidil_kullanici_id;
    }

    public String getYabancidil_kurum() {
        return yabancidil_kurum;
    }

    public void setYabancidil_kurum(String yabancidil_kurum) {
        this.yabancidil_kurum = yabancidil_kurum;
    }

    public String getYabancidil_okuma() {
        return yabancidil_okuma;
    }

    public void setYabancidil_okuma(String yabancidil_okuma) {
        this.yabancidil_okuma = yabancidil_okuma;
    }

    public String getYabancidil_yazma() {
        return yabancidil_yazma;
    }

    public void setYabancidil_yazma(String yabancidil_yazma) {
        this.yabancidil_yazma = yabancidil_yazma;
    }

    public String getYetki_id() {
        return yetki_id;
    }

    public void setYetki_id(String yetki_id) {
        this.yetki_id = yetki_id;
    }
      
    
}
