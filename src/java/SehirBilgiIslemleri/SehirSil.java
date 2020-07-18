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
public class SehirSil {
    
    Connection connect;
    ResultSet res;
    PreparedStatement prs;
    
    private String sehir_kodu;

    public String getSehir_kodu() {
        return sehir_kodu;
    }

    public void setSehir_kodu(String sehir_kodu) {
        this.sehir_kodu = sehir_kodu;
    }

    
    public String sehirsil() throws Exception
    {
            VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            String sorgu = "DELETE FROM NDA_SEHIR WHERE SEHIR_KODU=?";
            
            prs = connect.prepareStatement(sorgu);
           
            prs.setString(1, this.getSehir_kodu());
          
            prs.execute();
            prs.close();
            vi.baglantiyikes();
            
            return "SehirBilgiIslemleri";
        
    }
    
}
