/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IsTecrubeBilgiIslemi;
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
public class IsTecrubeSil {
    
    Connection connect;
    ResultSet res;
    PreparedStatement prs;
    
    private String istecrube_id;

    public String getIstecrube_id() {
        return istecrube_id;
    }

    public void setIstecrube_id(String istecrube_id) {
        this.istecrube_id = istecrube_id;
    }
    
     public String istecrubesil() throws Exception
    {
            VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            String sorgu = "DELETE FROM NDA_ISTECRUBE WHERE ID=?";
            
            prs = connect.prepareStatement(sorgu);
           
            prs.setString(1, this.getIstecrube_id());
          
            prs.execute();
            prs.close();
            vi.baglantiyikes();
            
            return "IsTecrubeBilgiIslemleri";
        
    }
    
    
    
    
}
