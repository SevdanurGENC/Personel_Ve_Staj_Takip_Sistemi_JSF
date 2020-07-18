/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IsVerenIlanBilgiIslemleri;



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
public class IsVerenIlanListele {
     
    Connection connect; 
    ResultSet res;
    PreparedStatement prs;
     
    private String ilan_id;
    private String pozisyon_adi;
    private String pozisyon_tipi;
    private String is_alani;
    private String sehir;
    private String alinacak_kisi_sayisi;
   
    
    private List<IlanBilgi> ilanlar = new ArrayList<IlanBilgi>();

    public List<IlanBilgi> getIlanlar() {
        return ilanlar;
    }

    public void setIlanlar(List<IlanBilgi> ilanlar) {
        this.ilanlar = ilanlar;
    }
   
    
    public List<IlanBilgi> ilanlistele() throws Exception
    {
  
            VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            String sorgu = "SELECT * FROM NDA_ILANLAR";
            
            prs = connect.prepareStatement(sorgu);
           
            ResultSet rs = prs.executeQuery();
           
            while(rs.next())
            {
              IlanBilgi ilan = new IlanBilgi();
                
              ilan.setIlan_id(rs.getInt("id"));
              ilan.setPozisyon_adi(rs.getString("pozisyon_adi"));
              ilan.setPozisyon_tipi(rs.getString("pozisyon_tipi"));
              ilan.setIs_alani(rs.getString("is_alani"));
              ilan.setSehir(rs.getString("sehir"));
              ilan.setAlinacak_kisi_sayisi(rs.getString("alinacak_kisi_sayisi"));
              
             ilanlar.add(ilan);
            }
            
            prs.execute();
            prs.close();
            vi.baglantiyikes();
            
     return ilanlar;
            
    }

    public String getAlinacak_kisi_sayisi() {
        return alinacak_kisi_sayisi;
    }

    public void setAlinacak_kisi_sayisi(String alinacak_kisi_sayisi) {
        this.alinacak_kisi_sayisi = alinacak_kisi_sayisi;
    }

    public String getIlan_id() {
        return ilan_id;
    }

    public void setIlan_id(String ilan_id) {
        this.ilan_id = ilan_id;
    }

    public String getIs_alani() {
        return is_alani;
    }

    public void setIs_alani(String is_alani) {
        this.is_alani = is_alani;
    }

    public String getPozisyon_adi() {
        return pozisyon_adi;
    }

    public void setPozisyon_adi(String pozisyon_adi) {
        this.pozisyon_adi = pozisyon_adi;
    }

    public String getPozisyon_tipi() {
        return pozisyon_tipi;
    }

    public void setPozisyon_tipi(String pozisyon_tipi) {
        this.pozisyon_tipi = pozisyon_tipi;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }
        
}

     