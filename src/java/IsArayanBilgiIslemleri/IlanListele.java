/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IsArayanBilgiIslemleri;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sevdanur GENC
 */
public class IlanListele {
    
    Connection connect; 
    ResultSet res;
    PreparedStatement prs;
    
    
    private List<IlanBilgi> ilan = new ArrayList<IlanBilgi>();
    
    
    public List<IlanBilgi> listele() throws Exception
    {
  
            VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            String sorgu = "SELECT * FROM NDA_ILANLAR";
            
            prs = connect.prepareStatement(sorgu);
           
            ResultSet rs = prs.executeQuery();
           
            while(rs.next())
            {
              IlanBilgi ilbilgi = new IlanBilgi();
                
              ilbilgi.setFirma_id(rs.getString("firma_id"));
              ilbilgi.setPozisyon_adi(rs.getString("pozisyon_adi"));
              ilbilgi.setPozisyon_tipi(rs.getString("pozisyon_tipi"));
              ilbilgi.setIs_alani(rs.getString("is_alani"));
              ilbilgi.setIs_tanimi(rs.getString("is_tanimi"));
              ilbilgi.setAlinacak_kisi_sayisi(rs.getString("alinacak_kisi_sayisi"));
              ilbilgi.setSehir(rs.getString("sehir"));
          
              ilan.add(ilbilgi);
            }
            
            prs.execute();
            prs.close();
            vi.baglantiyikes();
            
     return ilan;
            
    }
    
}
