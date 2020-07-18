/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StajArayanBilgiIslemleri;

 
import java.sql.Connection;
import java.sql.DriverManager; 
/**
 *
 * @author Sevdanur GENC
 */
public class VeritabaniBaglanti 
{

    private Connection connection = null;
  
    String vtURL;
    String vtKullaniciadi;
    String vtSifre;
    
    
     public VeritabaniBaglanti()
     {
        this.vtURL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
        this.vtKullaniciadi = "SYSTEM";
        this.vtSifre = "sys";
   
    }

    public VeritabaniBaglanti(String url, String kadi, String sifre) 
    {
        this.vtURL = url;
        this.vtKullaniciadi = kadi;
        this.vtSifre = sifre;
    }

    public Connection baglan() throws Exception 
    {
 
        if (connection != null) {
            if (connection.isClosed() == false) {
                return connection;
            }
        }
        
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = (Connection) DriverManager.getConnection(vtURL, vtKullaniciadi, vtSifre);
         
        
        System.out.println("veritabanina baglanildi");
        
        return connection;

    }

    public void baglantiyikes() throws Exception 
    {
        if (connection != null) {
            if (connection.isClosed()) {
                connection.close();
            }
        }
    }
    
    
    
    
    
    
    
}
