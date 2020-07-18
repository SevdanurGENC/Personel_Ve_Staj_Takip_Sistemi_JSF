/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IsVerenIlanBilgiIslemleri;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Sevdanur GENC
 */
public class IsVerenIlanGuncelle {
      
    private IlanBilgi ilanbilgi = new IlanBilgi();
    
    Connection connect;
    ResultSet res;
    PreparedStatement prs;
    
    private int id;
    private String firma_id;
    private String pozisyon_adi;
    private String pozisyon_tipi;
    private String is_alani;
    private String sehir;
    private String alinacak_kisi_sayisi;
    private String is_tanimi;
      
     
    public IsVerenIlanGuncelle() throws SQLException, Exception
     {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
        
        if (request.getParameter("id") != null)
        {
              Integer yid = Integer.parseInt(request.getParameter("id"));
       
              VeritabaniBaglanti vi = new VeritabaniBaglanti();
              connect = vi.baglan();
            
              String sorgum = "SELECT * FROM NDA_ILANLAR ID=?";
              
               prs = connect.prepareStatement(sorgum); 
               prs.setInt(1, yid);
                  
           res = prs.executeQuery();

            if (res.next()) 
                {
                    ilanbilgi = new IlanBilgi();

                    ilanbilgi.setFirma_id(res.getString("firma_id"));
                    ilanbilgi.setPozisyon_adi(res.getString("pozisyon_adi"));
                    ilanbilgi.setPozisyon_tipi(res.getString("pozisyon_tipi"));
                    ilanbilgi.setFirma_id(res.getString("is_alani"));
                    ilanbilgi.setPozisyon_adi(res.getString("sehir"));
                    ilanbilgi.setPozisyon_tipi(res.getString("alinacak_kisi_sayisi"));
                    ilanbilgi.setFirma_id(res.getString("is_tanimi"));
                
                }

             prs.execute();
             prs.close();
             vi.baglantiyikes();    
          }
      }
    
    
    public String ilanekleme() throws Exception
    {
         VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            String sorgu = 
                    "UPDATE NDA_ILANLAR SET POZISYON_ADI=?, POZISYON_TIPI=?, IS_ALANI=?,"
                    + "SEHIR=?, ALINACAK_KISI_SAYISI=?, IS_TANIMI=? WHERE ID=?";
                                
            prs = connect.prepareStatement(sorgu); 
            
            prs.setString(1, ilanbilgi.getPozisyon_adi());
            prs.setString(2, ilanbilgi.getPozisyon_tipi());
            prs.setString(3, ilanbilgi.getIs_alani());
            prs.setString(4, ilanbilgi.getSehir());
            prs.setString(5, ilanbilgi.getAlinacak_kisi_sayisi());
            prs.setString(6, ilanbilgi.getIs_tanimi());
            prs.setInt(7, ilanbilgi.getIlan_id());
            
            prs.execute();
            prs.close();
            vi.baglantiyikes();            
     
            return "IsVeren";        
        
    }
    
     
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } 
     
    public String getAlinacak_kisi_sayisi() {
        return alinacak_kisi_sayisi;
    }

    public void setAlinacak_kisi_sayisi(String alinacak_kisi_sayisi) {
        this.alinacak_kisi_sayisi = alinacak_kisi_sayisi;
    }

    public String getFirma_id() {
        return firma_id;
    }

    public void setFirma_id(String firma_id) {
        this.firma_id = firma_id;
    }

    public String getIs_alani() {
        return is_alani;
    }

    public void setIs_alani(String is_alani) {
        this.is_alani = is_alani;
    }

    public String getIs_tanimi() {
        return is_tanimi;
    }

    public void setIs_tanimi(String is_tanimi) {
        this.is_tanimi = is_tanimi;
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