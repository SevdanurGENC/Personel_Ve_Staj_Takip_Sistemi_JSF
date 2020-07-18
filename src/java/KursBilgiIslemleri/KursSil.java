/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KursBilgiIslemleri;

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
public class KursSil {

    
    Connection connect;
    ResultSet res;
    PreparedStatement prs;
    
    private String kurs_id;

    public String getKurs_id() {
        return kurs_id;
    }

    public void setKurs_id(String kurs_id) {
        this.kurs_id = kurs_id;
    }
    
    
    
    public String kurssil() throws Exception
    {
            VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            String sorgu = "DELETE FROM NDA_KURS WHERE ID=?";
            
            prs = connect.prepareStatement(sorgu);
           
            prs.setString(1, this.getKurs_id());
          
            prs.execute();
            prs.close();
            vi.baglantiyikes();
            
            return "KursBilgiIslemleri";        
    }
    
}
