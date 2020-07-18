/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IlanBilgiIslemleri;

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
public class IlanSil {
    
    Connection connect;
    ResultSet res;
    PreparedStatement prs;
    
    private String ilan_id;

    public String getIlan_id() {
        return ilan_id;
    }

    public void setIlan_id(String ilan_id) {
        this.ilan_id = ilan_id;
    }
    
     public String ilansil() throws Exception
    {
            VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            String sorgu = "DELETE FROM NDA_ILANLAR WHERE ID=?";
            
            prs = connect.prepareStatement(sorgu);
           
            prs.setString(1, this.getIlan_id());
          
            prs.execute();
            prs.close();
            vi.baglantiyikes();
            
            return "IlanBilgiIslemleri";
        
    }
    
    
    
}
