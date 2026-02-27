
    
package myEntity;

public class Mobil {
  private String nomor_polisi, jenis_mobil, merk, status;

    public String getNomor_polisi() {
        return nomor_polisi;
    }

    public void setNomor_polisi(String nomor_polisi) {
        this.nomor_polisi = nomor_polisi;
    }

    public String getJenis_mobil() {
        return jenis_mobil;
    }

    public void setJenis_mobil(String jenis_mobil) {
        this.jenis_mobil = jenis_mobil;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    private int biaya_pinjam_per_hari;

    public int getBiaya_pinjam_per_hari() {
        return biaya_pinjam_per_hari;
    }

    public void setBiaya_pinjam_per_hari(int biaya_pinjam_per_hari) {
        this.biaya_pinjam_per_hari = biaya_pinjam_per_hari;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Mobil(String nomor_polisi, String jenis_mobil, String merk, int biaya_pinjam_per_hari, String status) {
        this.nomor_polisi = nomor_polisi;
        this.jenis_mobil = jenis_mobil;
        this.merk = merk;
        this.biaya_pinjam_per_hari = biaya_pinjam_per_hari;
        this.status = status;
        
    }    

   public Mobil (){}
   
    
    public String toStatus() {
        return this.status + "";
    }
}