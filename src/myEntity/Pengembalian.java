package myEntity;
import java.util.Date;

public class Pengembalian {
    
    private int id_pengembalian, id_peminjaman, id_pegawai, nik_customer;
    private String nomor_polisi;
    private Date tanggal_pengembalian;

    public int getId_pengembalian() {
        return id_pengembalian;
    }

    public void setId_pengembalian(int id_pengembalian) {
        this.id_pengembalian = id_pengembalian;
    }

    public int getId_peminjaman() {
        return id_peminjaman;
    }

    public void setId_peminjaman(int id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }

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

    public String getNomor_polisi() {
        return nomor_polisi;
    }

    public void setNomor_polisi(String nomor_polisi) {
        this.nomor_polisi = nomor_polisi;
    }

    public Date getTanggal_pengembalian() {
        return tanggal_pengembalian;
    }

    public void setTanggal_pengembalian(Date tanggal_pengembalian) {
        this.tanggal_pengembalian = tanggal_pengembalian;
    }

    public Pengembalian(int id_pengembalian, int id_peminjaman, int id_pegawai, int nik_customer, String nomor_polisi, Date tanggal_pengembalian) {
        this.id_pengembalian = id_pengembalian;
        this.id_peminjaman = id_peminjaman;
        this.id_pegawai = id_pegawai;
        this.nik_customer = nik_customer;
        this.nomor_polisi = nomor_polisi;
        this.tanggal_pengembalian = tanggal_pengembalian;
    }

    public Pengembalian(int id_peminjaman, int id_pegawai, int nik_customer, String nomor_polisi, Date tanggal_pengembalian) {
        this.id_peminjaman = id_peminjaman;
        this.id_pegawai = id_pegawai;
        this.nik_customer = nik_customer;
        this.nomor_polisi = nomor_polisi;
        this.tanggal_pengembalian = tanggal_pengembalian;
    }
    
    
    
    public Pengembalian(){}
    
}
