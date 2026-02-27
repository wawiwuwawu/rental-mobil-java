package myEntity;

public class Pegawai {
    private String nama, alamat, telp, jabatan;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    private int id_pegawai;

    public int getId_pegawai() {
        return id_pegawai;
    }

    public void setId_pegawai(int id_pegawai) {
        this.id_pegawai = id_pegawai;
    }

    public Pegawai(String nama, String alamat, String telp, String jabatan) {
        this.nama = nama;
        this.alamat = alamat;
        this.telp = telp;
        this.jabatan = jabatan;
    }

    public Pegawai(int id_pegawai, String nama, String alamat, String telp, String jabatan) {
        this.id_pegawai = id_pegawai;
        this.nama = nama;
        this.alamat = alamat;
        this.telp = telp;
        this.jabatan = jabatan;
    }
   
    
    public Pegawai(){}

    @Override
    public String toString() {
        return this.id_pegawai + "";
    }
    
    
}
