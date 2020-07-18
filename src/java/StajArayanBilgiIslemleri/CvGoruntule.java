/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StajArayanBilgiIslemleri;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sevdanur GENC
 */
public class CvGoruntule {
    
      
    Connection connect; 
    ResultSet res;
    PreparedStatement prs;
    
    
    private List<KullanicilarBilgi> kullanici = new ArrayList<KullanicilarBilgi>();

    public List<KullanicilarBilgi> getKullanici() {
        return kullanici;
    }

    public void setKullanici(List<KullanicilarBilgi> kullanici) {
        this.kullanici = kullanici;
    } 
    
    public List<KullanicilarBilgi> cvgoruntule() throws Exception
    {
  
            VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            String sorgu = "SELECT * FROM NDA_KISISEL WHERE YETKI_ID=4 AND ID=43";
            
            prs = connect.prepareStatement(sorgu);
           
            ResultSet rs = prs.executeQuery();
           
            while(rs.next())
            {
              KullanicilarBilgi kulbilgi = new KullanicilarBilgi();
                
              kulbilgi.setKullanici_adi(rs.getString("kullanici_adi"));
              kulbilgi.setKullanici_id(rs.getString("kullanici_id"));
              kulbilgi.setSifre(rs.getString("sifre"));
              kulbilgi.setIsim(rs.getString("isim"));
              kulbilgi.setSoyisim(rs.getString("soyisim"));
              
              kulbilgi.setCinsiyet(rs.getString("cinsiyet"));
              kulbilgi.setDogumyeri(rs.getString("dogumyeri"));
              kulbilgi.setDogumtarihi(rs.getString("dogumtarihi"));
              kulbilgi.setCeptel(rs.getString("ceptel"));
              kulbilgi.setEvtel(rs.getString("evtel"));
              kulbilgi.setAdres(rs.getString("adres"));
              kulbilgi.setWeb(rs.getString("web"));
              kulbilgi.setEmail(rs.getString("email"));
              kulbilgi.setEhliyet(rs.getString("ehliyet"));
              kulbilgi.setUyruk(rs.getString("uyruk"));
              kulbilgi.setEgitimdurumu(rs.getString("egitimdurumu"));
              kulbilgi.setMedenidurum(rs.getString("medenidurum"));
              kulbilgi.setToplamtecrube(rs.getString("toplamtecrube"));
              kulbilgi.setCalismadurumu(rs.getString("calismadurumu"));
              
              kulbilgi.setEgitim_id(rs.getString("egitim_id"));
              kulbilgi.setNitelik_id(rs.getString("nitelik_id"));
              kulbilgi.setIstecrube_id(rs.getString("istecrube_id"));
              kulbilgi.setReferans_id(rs.getString("referans_id"));
              kulbilgi.setSertifika_id(rs.getString("sertifika_id"));
              kulbilgi.setKurs_id(rs.getString("kurs_id"));
              kulbilgi.setYabancidil_id(rs.getString("yabancidil_id"));
              kulbilgi.setSinavbilgi_id(rs.getString("sinavbilgi_id"));
              
              
             kullanici.add(kulbilgi);
            }
            
            prs.execute();
            prs.close();
            vi.baglantiyikes();
            
     return kullanici;
            
    }
    
    
    
}
