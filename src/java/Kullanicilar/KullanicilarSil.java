/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kullanicilar;

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
public class KullanicilarSil {
 
    Connection connect;
    ResultSet res;
    PreparedStatement prs;
    
    private String kisisel_id;

    public String getKisisel_id() {
        return kisisel_id;
    }

    public void setKisisel_id(String kisisel_id) {
        this.kisisel_id = kisisel_id;
    }
    
     public String kullanicilarsil() throws Exception
    {
            VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            String sorgu = "DELETE FROM NDA_KISISEL WHERE ID=?";
            
            prs = connect.prepareStatement(sorgu);
           
            prs.setString(1, this.getKisisel_id());
          
            prs.execute();
            prs.close();
            vi.baglantiyikes();
            
            return "AdminPaneli";
        
    }
    
    
    
    
    
}
