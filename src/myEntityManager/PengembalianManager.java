package myEntityManager;

import myEntity.Pengembalian;
import myFunction.Fungsi;

public class PengembalianManager {
    int i;
    
    public int simpanData(Pengembalian pn)
    {
        i = 0;
        try
        {
            String sql = "insert into pengembalian_mobil(id_pengembalian, id_peminjaman, id_pegawai, nik_customer, nomor_polisi, tanggal_pengembalian)"
                    + "values('"+pn.getId_pengembalian()+"','"+pn.getId_peminjaman()+"','"+pn.getId_pegawai()+"','"+pn.getNik_customer()+"','" 
                    + pn.getNomor_polisi()+"','"+ pn.getTanggal_pengembalian()+"')";
            
            i = Fungsi.EQuery(sql);
            return i;
        }
        catch (Exception e)
        {
            return i;
        }
    }
    
    public int hapusData (Pengembalian pn)
    {
        i=0;
        try
        {
            String sql = "delete from pengembalian_mobil where id_pengembalian="+pn.getId_pengembalian()+"";
            i=Fungsi.EQuery(sql);
            
            return i; 
        }
        catch (Exception e)
        {
            return i;
        }
    }
    
    public int updateData (Pengembalian pn)
    {
       i = 0;
        try 
        {
            String sql = "update Pengembalian_mobil set " +
                    "id_peminjaman = '" + pn.getId_peminjaman() + "', " +
                    "id_pegawai = '" + pn.getId_pegawai() + "', " +
                    "nik_customer = '" + pn.getNik_customer() + "', " +
                    "nomor_polisi = '" + pn.getNomor_polisi() + "', " +
                    "tanggal_peminjaman = '" + pn.getTanggal_pengembalian()+ "', " +
                    "where id_peminjaman = " + pn.getId_pengembalian();
            i = Fungsi.EQuery(sql);
            return i;
        } 
        
        catch (Exception e) 
        {
            e.printStackTrace();
            return i;
        }
    }
}
