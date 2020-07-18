/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SehirBilgiIslemleri;

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
public class SehirListele {
    
    Connection connect;
    ResultSet res;
    PreparedStatement prs;
     
    private String sehir_kodu;
    private String sehir_adi;
    
    private List<SehirBilgi> sehirler = new ArrayList<SehirBilgi>();

    public List<SehirBilgi> getSehirler() {
        return sehirler;
    }

    public void setSehirler(List<SehirBilgi> sehirler) {
        this.sehirler = sehirler;
    }

    
    
     public List<SehirBilgi> sehirListele() throws Exception
    {
  
            VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            String sorgu = "SELECT * FROM NDA_SEHIR";
            
            prs = connect.prepareStatement(sorgu);
           
            ResultSet rs = prs.executeQuery();
           
            while (rs.next())
            {          
                
              SehirBilgi sehir = new SehirBilgi();
                
              sehir.setSehir_kodu(rs.getString("sehir_kodu")); 
              sehir.setSehir_adi(rs.getString("sehir_adi"));

              sehirler.add(sehir);
            }
            
            prs.execute();
            prs.close();
            vi.baglantiyikes();
            
     return sehirler;
    }
    
     
    public String getSehir_adi() {
        return sehir_adi;
    }

    public void setSehir_adi(String sehir_adi) {
        this.sehir_adi = sehir_adi;
    }

    public String getSehir_kodu() {
        return sehir_kodu;
    }

    public void setSehir_kodu(String sehir_kodu) {
        this.sehir_kodu = sehir_kodu;
    }
      
    
    
    
    
}
