package myEntity;
import java.util.Date;

public class Peminjaman {
    private int id_pegawai, nik_customer, harga_pinjam, hari_sewa, bayar;

    public int getId_pegawai() {
        return id_pegawai;
    }

    public void setId_pegawai(int id_pegawai) {
        this.id_pegawai = id_pegawai;
    }

    public int getNik_customer() {
        return nik_customer;
    }

    public void setNik_customer(int nik_customer) {
        this.nik_customer = nik_customer;
    }

    public int getHarga_pinjam() {
        return harga_pinjam;
    }

    public void setHarga_pinjam(int harga_pinjam) {
        this.harga_pinjam = harga_pinjam;
    }

    public int getHari_Sewa() {
        return hari_sewa;
    }

    public void setHari_Sewa(int hari_sewa) {
        this.hari_sewa = hari_sewa;
    }

    public int getBayar() {
        return bayar;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
    }
    
    
    private String nomor_polisi;

    public String getNomor_polisi() {
        return nomor_polisi;
    }

    public void setNomor_polisi(String nomor_polisi) {
        this.nomor_polisi = nomor_polisi;
    }

    
    private Date tanggal_peminjaman;

    public Date getTanggal_peminjaman() {
        return tanggal_peminjaman;
    }

    public void setTanggal_peminjaman(Date tanggal_peminjaman) {
        this.tanggal_peminjaman = tanggal_peminjaman;
    }
private int id_peminjaman;

    public int getId_peminjaman() {
        return id_peminjaman;
    }

    public void setId_peminjaman(int id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }

    public Peminjaman(int id_pegawai, String nomor_polisi, int nik_customer, Date tanggal_peminjaman, int harga_pinjam, int hari_sewa, int bayar) {
        this.id_pegawai = id_pegawai;
        this.nomor_polisi = nomor_polisi;
        this.nik_customer = nik_customer;
        this.tanggal_peminjaman = tanggal_peminjaman;
        this.harga_pinjam = harga_pinjam;
        this.hari_sewa = hari_sewa;
        this.bayar = bayar;
    }
    
    
    
    public Peminjaman(int id_peminjaman, int id_pegawai, String nomor_polisi, int nik_customer, Date tanggal_peminjaman, int harga_pinjam, int hari_sewa, int bayar) {
        this.id_peminjaman = id_peminjaman;
        this.id_pegawai = id_pegawai;
        this.nomor_polisi = nomor_polisi;
        this.nik_customer = nik_customer;
        this.tanggal_peminjaman = tanggal_peminjaman;
        this.harga_pinjam = harga_pinjam;
        this.hari_sewa = hari_sewa;
        this.bayar = bayar;
    }

    
    
    public Peminjaman(){}
    
    @Override
    public String toString() {
        return this.id_peminjaman + "";
    }
    
}