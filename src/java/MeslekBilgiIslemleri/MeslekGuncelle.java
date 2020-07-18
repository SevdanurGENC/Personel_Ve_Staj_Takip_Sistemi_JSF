/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MeslekBilgiIslemleri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
/**
 *
 * @author Sevdanur GENC
 */
public class MeslekGuncelle {
    
    
    Connection connect; 
    ResultSet res;
    PreparedStatement prs;
    
    private MeslekBilgi mesbil = new MeslekBilgi();

    public MeslekBilgi getMesbil() {
        return mesbil;
    }

    public void setMesbil(MeslekBilgi mesbil) {
        this.mesbil = mesbil;
    }
    
     
    
public MeslekGuncelle() throws Exception
{
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();

    if (request.getParameter("meslek_kodu") != null)
    {
    
       String meslek_kodu = request.getParameter("meslek_kodu");
     
          VeritabaniBaglanti vi = new VeritabaniBaglanti();
          connect = vi.baglan();
        
            String sorgu = "SELECT * FROM NDA_MESLEK WHERE MESLEK_KODU=?";
            
            prs = connect.prepareStatement(sorgu);
           
            prs.setString(1, meslek_kodu);
            ResultSet rs = prs.executeQuery();
             
   
            if (rs.next()) 
            {
                mesbil = new MeslekBilgi();
                
                mesbil.setMeslek_kodu(rs.getString("meslek_kodu"));
                mesbil.setMeslek_adi(rs.getString("meslek_adi"));
               
            }
            
    prs.close();
    connect.close();
    
    }
}

public String meslekEkleme() throws Exception
{   
          VeritabaniBaglanti vi = new VeritabaniBaglanti();
          connect = vi.baglan();
        
            String sorgu = "UPDATE NDA_MESLEK SET MESLEK_ADI=?, MESLEK_KODU=? WHERE MESLEK_KODU=?";
            
            prs = connect.prepareStatement(sorgu);
      
            prs.setString(1, mesbil.getMeslek_adi());
            prs.setString(2, mesbil.getMeslek_kodu());
            prs.setString(3, mesbil.getMeslek_kodu());
            
           prs.execute();
           prs.close();
           connect.close();
            
  
    return "Meslekler_Liste";
}
 
    
}
