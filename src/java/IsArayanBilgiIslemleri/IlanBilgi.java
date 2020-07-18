/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IsArayanBilgiIslemleri;

/**
 *
 * @author Sevdanur GENC
 */
public class IlanBilgi {
    
    private String firma_id;
    private String pozisyon_adi;
    private String pozisyon_tipi;
    private String is_alani;
    private String sehir;
    private String alinacak_kisi_sayisi;
    private String is_tanimi;

    public IlanBilgi() {
    }

    public String getAlinacak_kisi_sayisi() {
        return alinacak_kisi_sayisi;
    }

    public void setAlinacak_kisi_sayisi(String alinacak_kisi_sayisi) {
        this.alinacak_kisi_sayisi = alinacak_kisi_sayisi;
    }

    public String getFirma_id() {
        return firma_id;
    }

    public void setFirma_id(String firma_id) {
        this.firma_id = firma_id;
    }

    public String getIs_alani() {
        return is_alani;
    }

    public void setIs_alani(String is_alani) {
        this.is_alani = is_alani;
    }

    public String getIs_tanimi() {
        return is_tanimi;
    }

    public void setIs_tanimi(String is_tanimi) {
        this.is_tanimi = is_tanimi;
    }

    public String getPozisyon_adi() {
        return pozisyon_adi;
    }

    public void setPozisyon_adi(String pozisyon_adi) {
        this.pozisyon_adi = pozisyon_adi;
    }

    public String getPozisyon_tipi() {
        return pozisyon_tipi;
    }

    public void setPozisyon_tipi(String pozisyon_tipi) {
        this.pozisyon_tipi = pozisyon_tipi;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }
    
    
    
    
    
    
    
}
