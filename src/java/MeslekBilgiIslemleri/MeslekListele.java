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
public class MeslekListele {
     
    Connection connect; 
    ResultSet res;
    PreparedStatement prs;
     
    private String meslek_kodu;
    private String meslek_adi;
    
    private List<MeslekBilgi> meslekler = new ArrayList<MeslekBilgi>();

    public List<MeslekBilgi> getMeslekler() {
        return meslekler;
    }

    public void setMeslekler(List<MeslekBilgi> meslekler) {
        this.meslekler = meslekler;
    }
   
    
    public  MeslekListele() throws Exception
    {
  
            VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            String sorgu = "SELECT * FROM NDA_MESLEK";
            
            prs = connect.prepareStatement(sorgu);
           
            ResultSet rs = prs.executeQuery();
           
            while(rs.next())
            {
               MeslekBilgi meslek = new MeslekBilgi();
                
              meslek.setMeslek_adi(rs.getString("meslek_adi"));
               meslek.setMeslek_kodu(rs.getString("meslek_kodu"));
                System.out.println("dkjhfkj");
             meslekler.add(meslek);
            }
            
            prs.execute();
            prs.close();
            vi.baglantiyikes();
  
            
        
        
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
