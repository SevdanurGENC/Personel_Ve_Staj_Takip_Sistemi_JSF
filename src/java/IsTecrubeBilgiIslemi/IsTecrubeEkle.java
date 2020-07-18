/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IsTecrubeBilgiIslemi;

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
public class IsTecrubeEkle {
    
    Connection connect;
    ResultSet res;
    PreparedStatement prs;
    
    private String kullanici_id;
    private String firma_adi;
    private String pozisyon;
    private String baslangic_tarihi;
    private String bitis_tarihi;
    
     public String istecrubeekle() throws Exception
    {
         VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            String sorgu = "INSERT INTO NDA_ISTECRUBESI(KULLANICI_ID,FIRMA_ID,POZISYON,"
                    + "BASLANGIC_TARIHI,BITIS_TARIHI) "
                    + "VALUES(?,?,?,?,?)";
            
            prs = connect.prepareStatement(sorgu);
           
            prs.setString(1, this.getKullanici_id());
            prs.setString(2, this.getFirma_adi());
            prs.setString(3, this.getPozisyon());
            prs.setString(4, this.getBaslangic_tarihi());
            prs.setString(5, this.getBitis_tarihi());            
            
            prs.execute();
            prs.close();
            vi.baglantiyikes();           
     
            return "IsTecrubeBilgiIslemleri";
        
        
    }

    public String getBaslangic_tarihi() {
        return baslangic_tarihi;
    }

    public void setBaslangic_tarihi(String baslangic_tarihi) {
        this.baslangic_tarihi = baslangic_tarihi;
    }

    public String getBitis_tarihi() {
        return bitis_tarihi;
    }

    public void setBitis_tarihi(String bitis_tarihi) {
        this.bitis_tarihi = bitis_tarihi;
    }

    public String getFirma_adi() {
        return firma_adi;
    }

    public void setFirma_adi(String firma_adi) {
        this.firma_adi = firma_adi;
    }

    public String getKullanici_id() {
        return kullanici_id;
    }

    public void setKullanici_id(String kullanici_id) {
        this.kullanici_id = kullanici_id;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }
     
     
    
    
    
}
