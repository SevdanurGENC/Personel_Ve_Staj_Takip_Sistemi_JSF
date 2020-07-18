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
public class KursEkle {

    Connection connect;
    ResultSet res;
    PreparedStatement prs;
    
    private String kullanici_id;
    private String egitim_adi;
    private String kurum;
    private String sure;
    private String tarih;
    
    public String kursekle() throws Exception
    {
            VeritabaniBaglanti vi = new VeritabaniBaglanti();
            connect = vi.baglan();
            String sorgu = "INSERT INTO NDA_KURS(KULLANICI_ID, EGITIM_ADI, KURUM, SURE, TARIH) VALUES(?,?,?,?,?)";
            prs = connect.prepareStatement(sorgu);
           
            prs.setString(1, this.getKullanici_id());
            prs.setString(2, this.getEgitim_adi());
            prs.setString(3, this.getKurum());
            prs.setString(4, this.getSure());
            prs.setString(5, this.getTarih());
            
            prs.execute();
            prs.close();
            vi.baglantiyikes();
            
            return "MeslekBilgiIslemleri";
            
    }

    public String getEgitim_adi() {
        return egitim_adi;
    }

    public void setEgitim_adi(String egitim_adi) {
        this.egitim_adi = egitim_adi;
    }

    public String getKullanici_id() {
        return kullanici_id;
    }

    public void setKullanici_id(String kullanici_id) {
        this.kullanici_id = kullanici_id;
    }

    public String getKurum() {
        return kurum;
    }

    public void setKurum(String kurum) {
        this.kurum = kurum;
    }

    public String getSure() {
        return sure;
    }

    public void setSure(String sure) {
        this.sure = sure;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
    
    
    
    
    
    
    
    
}
