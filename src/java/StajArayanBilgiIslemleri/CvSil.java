/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StajArayanBilgiIslemleri;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Sevdanur GENC
 */
public class CvSil {
    
    Connection connect;
    ResultSet res;
    PreparedStatement prs;
    
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
       
    
    
       public String cvsil() throws Exception
    {
            VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            String sorgu = "DELETE FROM NDA_KISISEL WHERE ID=?";
            
            prs = connect.prepareStatement(sorgu);
           
            prs.setInt(1, this.getId());
          
            prs.execute();
            prs.close();
            vi.baglantiyikes();
            
            return "IsVeren";
        
    }
       
        
    
}
