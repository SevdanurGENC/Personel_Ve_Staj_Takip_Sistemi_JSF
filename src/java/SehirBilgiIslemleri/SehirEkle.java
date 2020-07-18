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
public class SehirEkle {
 
    
    Connection connect;
    ResultSet res;
    PreparedStatement prs;
    
    private String sehir_kodu;
    private String sehir_adi;

    public String sehirekle() throws Exception
    {
         VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            String sorgu = "INSERT INTO NDA_SEHIR(SEHIR_KODU, SEHIR_ADI) VALUES(?,?)";
            
            prs = connect.prepareStatement(sorgu);
           
            prs.setString(1, this.getSehir_kodu());
            prs.setString(2, this.getSehir_adi());
            
        
            prs.execute();
            prs.close();
            vi.baglantiyikes();
            
     
            return "SehirBilgiIslemleri";
        
        
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
