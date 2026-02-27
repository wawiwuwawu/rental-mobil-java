
package myEntityManager;

import myEntity.Peminjaman;
import myFunction.Fungsi;
public class PeminjamanManager {
    int i;
    
    public int simpanData(Peminjaman pemi)
    {
        i = 0;
        try
        {
            String sql = "insert into peminjaman_mobil(id_peminjaman, id_pegawai, nomor_polisi, nik_customer, tanggal_peminjaman, harga_pinjam, hari_sewa, bayar)"
                    + "values('"+pemi.getId_peminjaman()+"','"+pemi.getId_pegawai()+"','"+pemi.getNomor_polisi()+"','"+
                    pemi.getNik_customer()+"','"+pemi.getTanggal_peminjaman()+ "','" +pemi.getHarga_pinjam()+"','"+pemi.getHari_Sewa()+"','"+pemi.getBayar()+"')";
            
            i = Fungsi.EQuery(sql);
            return i;
        }
        catch (Exception e)
        {
            return i;
        }
    }
    
    public int hapusData (Peminjaman pemi)
    {
        i=0;
        try
        {
            String sql = "delete from peminjaman_mobil where id_peminjaman="+pemi.getId_peminjaman()+"";
            i=Fungsi.EQuery(sql);
            
            return i; 
        }
        catch (Exception e)
        {
            return i;
        }
    }
    
    public int updateData (Peminjaman pemi)
    {
       i = 0;
        try 
        {
            String sql = "update peminjaman set " +
                    "id_pegawai = '" + pemi.getId_pegawai() + "', " +
                    "nomor_polisi = '" + pemi.getNomor_polisi() + "', " +
                    "nik_customer = '" + pemi.getNik_customer() + "', " +
                    "tanggal_peminjaman = '" + pemi.getTanggal_peminjaman()+ "', " +
                    "harga_pinjam = '" + pemi.getHarga_pinjam()+ "', " +
                    "hari_sewa = '" + pemi.getHari_Sewa()+ "', " +
                    "bayar = '" + pemi.getBayar()+ "', " +
                    "where id_peminjaman = " + pemi.getId_peminjaman();
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
