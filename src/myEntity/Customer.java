package myEntity;

public class Customer {
    private String nama, alamat_customer, no_telp_customer, sim;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat_customer() {
        return alamat_customer;
    }

    public void setAlamat_customer(String alamat_customer) {
        this.alamat_customer = alamat_customer;
    }

    public String getNo_telp_customer() {
        return no_telp_customer;
    }

    public void setNo_telp_customer(String no_telp_customer) {
        this.no_telp_customer = no_telp_customer;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    private int nik_customer;

    public int getNik_customer() {
        return nik_customer;
    }

    public void setNik_customer(int nik_customer) {
        this.nik_customer = nik_customer;
    }

    public Customer(String nama, String alamat_customer, String no_telp_customer, String sim) {
        this.nama = nama;
        this.alamat_customer = alamat_customer;
        this.no_telp_customer = no_telp_customer;
        this.sim = sim;
    }

    public Customer(int nik_customer, String nama, String alamat_customer, String no_telp_customer, String sim) {
        this.nik_customer = nik_customer;
        this.nama = nama;
        this.alamat_customer = alamat_customer;
        this.no_telp_customer = no_telp_customer;
        this.sim = sim;
    }

    public Customer() {}

    @Override
    public String toString() {
        return this.nik_customer + "";
    }
}