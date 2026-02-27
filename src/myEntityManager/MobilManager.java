
package myEntityManager;

import myEntity.Mobil;
import myFunction.Fungsi;

public class MobilManager {
    int i;
    
    public int inputData(Mobil mobi)
    {
        i = 0;
        try
        {
            String sql = "insert into mobil(nomor_polisi, jenis_mobil, merk, biaya_pinjam_per_hari, status)"
                    + "values('"+mobi.getNomor_polisi()+"','"+mobi.getJenis_mobil()+"','"+
                    mobi.getMerk()+"','"+mobi.getBiaya_pinjam_per_hari()+"','"+mobi.toStatus()+"')";
            
            i = Fungsi.EQuery(sql);
            return i;
        }
        catch (Exception e)
        {
            return i;
        }
    }
    
    public int hapusData (Mobil mobi)
    {
        i=0;
        try
        {
            String sql = "delete from mobil where nomor_polisi='"+mobi.getNomor_polisi()+"'";
            i=Fungsi.EQuery(sql);
            
            return i; 
        }
        catch (Exception e)
        {
            return i;
        }
    }
    
    public int updateData (Mobil mobi)
    {
       i = 0;
        try 
        {
            String sql = "UPDATE mobil SET " +
                    "nomor_polisi = '" + mobi.getNomor_polisi() + "', " +
                    "jenis_mobil = '" + mobi.getJenis_mobil() + "', " +
                    "merk = '" + mobi.getMerk() + "', " +
                    "biaya_pinjam_per_hari = '" + mobi.getBiaya_pinjam_per_hari()+ "', " +
                    "status = '" + mobi.getStatus()+ "' " +
                    "where nomor_polisi = '" + mobi.getNomor_polisi() +"'";
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
