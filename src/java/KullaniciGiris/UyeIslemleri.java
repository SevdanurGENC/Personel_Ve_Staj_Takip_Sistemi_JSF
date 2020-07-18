/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KullaniciGiris;

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
public class UyeIslemleri implements Serializable 
{
    
    Connection connect;
    ResultSet res;
    PreparedStatement prs;
    
    private String kullanici_adi;
    private String sifre;
    private int yetki_id;
  
    
    private String isim;
    private String soyisim;
    private String cinsiyet;
    private String dogumyeri;
    private String dogumtarihi;
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

    public boolean isKsonuc() {
        return ksonuc;
    }

    public void setKsonuc(boolean ksonuc) {
        this.ksonuc = ksonuc;
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

    public PreparedStatement getPrs() {
        return prs;
    }

    public void setPrs(PreparedStatement prs) {
        this.prs = prs;
    }

    public String getReferans_id() {
        return referans_id;
    }

    public void setReferans_id(String referans_id) {
        this.referans_id = referans_id;
    }

    public ResultSet getRes() {
        return res;
    }

    public void setRes(ResultSet res) {
        this.res = res;
    }

    public String getSertifika_id() {
        return sertifika_id;
    }

    public void setSertifika_id(String sertifika_id) {
        this.sertifika_id = sertifika_id;
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
    
    
    
    
    
    
    
    private boolean ksonuc;

    public UyeIslemleri() {
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

    public int getYetki_id() {
        return yetki_id;
    }

    public void setYetki_id(int yetki_id) {
        this.yetki_id = yetki_id;
    }

  
    public String girisyap()  
    {
        try {
            UyeBilgi ubilgi = new UyeBilgi();
            VeritabaniBaglanti vi = new VeritabaniBaglanti();
           
            connect = vi.baglan();
            
            String sorgu = "SELECT * FROM NDA_KISISEL "
                    + "WHERE KULLANICI_ADI=? AND SIFRE=? AND YETKI_ID=?";
            
            prs = connect.prepareStatement(sorgu);
           
            prs.setString(1, getKullanici_adi());
            prs.setString(2, getSifre());
            prs.setInt(3, getYetki_id());
            
            ResultSet rs = prs.executeQuery();
          
            while (rs.next()) {
            
                ubilgi.setSifre(rs.getString("SIFRE"));
                ubilgi.setYetki_id(rs.getInt("YETKI_ID"));
                ubilgi.setKullanici_adi(rs.getString("KULLANICI_ADI"));
               
                if(rs.getInt("YETKI_ID")==1) 
                    ksonuc=true;
            }
     
            prs.close();
            vi.baglantiyikes();
            
            if (ubilgi.getKullanici_adi().equals(getKullanici_adi())) 
            {
               if (ubilgi.getYetki_id()==1) 
               { 
                return "IsArayan";                
               }
               else if(ubilgi.getYetki_id()==2)
               {
                return "AdminPaneli";
               }
               else
               {
                return "IsVeren";
               }
               
            }
            else
            {
                this.setKullanici_adi("");
                this.setSifre("");
                this.setYetki_id(0);
                return "HataliGiris";
            }
        } 
        catch (Exception ex) 
        {
            return "UyeGiris";
        }
    }
    
    
    public boolean isKullaniciGirisYaptimi() 
    {       
        return ksonuc;
    }
        
    
    public String uyekaydet() throws Exception
    {
            VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            String sorgu = "INSERT INTO NDA_KISISEL(KULLANICI_ADI,SIFRE,YETKI_ID,"
                    + "ISIM, SOYISIM, CINSIYET, DOGUMYERI, DOGUMTARIHI, CEPTEL, EVTEL, ADRES, WEB, EMAIL,"
                    + "EHLIYET, UYRUK, EGITIMDURUMU, MEDENIDURUM, TOPLAMTECRUBE, CALISMADURUMU, EGITIM_ID,"
                    + " NITELIK_ID, ISTECRUBE_ID, REFERANS_ID, SERTIFIKA_ID, KURS_ID, YABANCIDIL_ID, "
                    + "SINAVBILGI_ID ) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            prs = connect.prepareStatement(sorgu);
           
            prs.setString(1, this.getKullanici_adi());
            prs.setString(2, this.getSifre());
            prs.setInt(3, this.getYetki_id());

            prs.setString(4, this.getIsim());
            prs.setString(5, this.getSoyisim());
            prs.setString(6, this.getCinsiyet());
            prs.setString(7, this.getDogumyeri());
            prs.setString(8, this.getDogumtarihi());
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
            
            
          //  boolean sonuc = prs.execute();
            prs.execute();
            prs.close();
            vi.baglantiyikes();
            
            //return sonuc;
            return "index";
        
     
        
    }
    
  
    private List<UyeBilgi> uyebilgial = new ArrayList<UyeBilgi>();

    public List<UyeBilgi> getUyebilgial() {
        return uyebilgial;
    }

    public void setUyebilgial(List<UyeBilgi> uyebilgial) {
        this.uyebilgial = uyebilgial;
    }

    
  
  
    public void uyelistele() throws Exception
    {
            UyeBilgi ubilgi = new UyeBilgi();    

            VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            
            String sorgu = "SELECT * FROM NDA_KISISEL";

            prs = connect.prepareStatement(sorgu);
           
            ResultSet rs = prs.executeQuery();
          
            while (rs.next()) {   
                
                ubilgi.setKullanici_adi(rs.getString("KULLANICI_ADI"));
                ubilgi.setIsim(rs.getString("ISIM"));
                ubilgi.setSoyisim(rs.getString("SOYISIM"));
                ubilgi.setCinsiyet(rs.getString("CINSIYET"));
                ubilgi.setDogumyeri(rs.getString("DOGUMYERI"));
                ubilgi.setDogumtarihi(rs.getString("DOGUMTARIHI"));
                ubilgi.setAdres(rs.getString("ADRES"));
                
                uyebilgial.add(ubilgi);
            }
     
            prs.close();
            rs.close();
            vi.baglantiyikes();
             
    }
     
}
