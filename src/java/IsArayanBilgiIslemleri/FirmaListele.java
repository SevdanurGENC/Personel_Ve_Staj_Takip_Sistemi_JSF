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
public class FirmaListele {
  
    Connection connect; 
    ResultSet res;
    PreparedStatement prs;
    
    
    private List<FirmaBilgi> firma = new ArrayList<FirmaBilgi>();
    
    
    public List<FirmaBilgi> listele() throws Exception
    {
  
            VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            String sorgu = "SELECT * FROM NDA_FIRMA";
            
            prs = connect.prepareStatement(sorgu);
           
            ResultSet rs = prs.executeQuery();
           
            while(rs.next())
            {
              FirmaBilgi firbil = new FirmaBilgi();
                
              firbil.setFirma_adi(rs.getString("firma_adi"));
              firbil.setSektor(rs.getString("sektor"));
              firbil.setIsalani(rs.getString("isalani"));
              firbil.setWeb(rs.getString("web"));
              firbil.setSehir(rs.getString("sehir"));
         
              firma.add(firbil);
            }
            
            prs.execute();
            prs.close();
            vi.baglantiyikes();
            
     return firma;
            
    }
    
    
}
