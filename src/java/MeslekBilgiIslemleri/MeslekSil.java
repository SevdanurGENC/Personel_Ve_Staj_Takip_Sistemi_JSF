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
public class MeslekSil {
    
     Connection connect;
    ResultSet res;
    PreparedStatement prs;
    
     private String meslek_kodu;

    public String getMeslek_kodu() {
        return meslek_kodu;
    }

    public void setMeslek_kodu(String meslek_kodu) {
        this.meslek_kodu = meslek_kodu;
    }
     
   
     public String mesleksil() throws Exception
    {
            VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            String sorgu = "DELETE FROM NDA_MESLEK WHERE MESLEK_KODU=?";
            
            prs = connect.prepareStatement(sorgu);
           
            prs.setString(1, this.getMeslek_kodu());
          
            prs.execute();
            prs.close();
            vi.baglantiyikes();
            
            return "MeslekBilgiIslemleri";
        
    }
    
}
