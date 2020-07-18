/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MeslekBilgiIslemleri;

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
public class MeslekEkle {
    
    Connection connect;
    ResultSet res;
    PreparedStatement prs;
   
    
    private String meslek_kodu;
    private String meslek_adi;
    

    public String meslekekle() throws Exception
    {
      //  MeslekBilgi meslek = new MeslekBilgi();
        
        VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            
            String sorgu= "INSERT INTO NDA_MESLEK(MESLEK_KODU, MESLEK_ADI) VALUES(?,?)";
             
            prs = connect.prepareStatement(sorgu);
            
            prs.setString(1, this.getMeslek_kodu());
            prs.setString(2, this.getMeslek_adi());
           
        
            prs.execute();
         
            prs.close();
            
           
            vi.baglantiyikes();
            
     
            return "MeslekBilgiIslemleri";
        
        
    }

    public String getMeslek_adi() {
        return meslek_adi;
    }

    public void setMeslek_adi(String meslek_adi) {
        this.meslek_adi = meslek_adi;
    }

    public String getMeslek_kodu() {
        return meslek_kodu;
    }

    public void setMeslek_kodu(String meslek_kodu) {
        this.meslek_kodu = meslek_kodu;
    }
    
    
    
    
    
    
    
    
}
