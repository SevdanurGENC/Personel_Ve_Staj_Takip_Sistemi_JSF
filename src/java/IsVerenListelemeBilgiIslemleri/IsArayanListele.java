/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IsVerenListelemeBilgiIslemleri;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List; 



/**
 *
 * @author Sevdanur GENC
 */
public class IsArayanListele {
    Connection connect; 
    ResultSet res;
    PreparedStatement prs;
     
    private String isim;
    private String soyisim; 
    private String egitimdurumu; 
    private String toplamtecrube; 
 
    
    
    
    private List<KullanicilarBilgi> kullanici = new ArrayList<KullanicilarBilgi>();

   
    
    public List<KullanicilarBilgi> listele() throws Exception
    {
  
            VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            String sorgu = "SELECT * FROM NDA_KISISEL WHERE YETKI_ID=2";
            
            prs = connect.prepareStatement(sorgu);
           
            ResultSet rs = prs.executeQuery();
           
            while(rs.next())
            {
              KullanicilarBilgi kbilgi = new KullanicilarBilgi();
                
              kbilgi.setIsim(rs.getString("isim"));
              kbilgi.setSoyisim(rs.getString("soyisim"));
              kbilgi.setEgitimdurumu(rs.getString("egitimdurumu"));
              kbilgi.setToplamtecrube(rs.getString("toplamtecrube"));
           
            
             kullanici.add(kbilgi);
            }
            
            prs.execute();
            prs.close();
            vi.baglantiyikes();
            
     return kullanici;
            
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public List<KullanicilarBilgi> getKullanici() {
        return kullanici;
    }

    public void setKullanici(List<KullanicilarBilgi> kullanici) {
        this.kullanici = kullanici;
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

  

    public String getEgitimdurumu() {
        return egitimdurumu;
    }

    public void setEgitimdurumu(String egitimdurumu) {
        this.egitimdurumu = egitimdurumu;
    }
    
    
    
    
}
