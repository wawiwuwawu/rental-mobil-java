package myEntityManager;


import myEntity.Pegawai;
import myFunction.Fungsi;

public class PegawaiManager {
    int i;
    
    public int inputData(Pegawai pega)
    {
        i = 0;
        try
        {
            String sql = "insert into pegawai(nama, alamat, telp, jabatan)"
                    + "values('"+pega.getNama()+"','"+pega.getAlamat()+"','"+
                    pega.getTelp()+"','"+pega.getJabatan()+"')";
            
            i = Fungsi.EQuery(sql);
            return i;
        }
        catch (Exception e)
        {
            return i;
        }
    }
    
public int hapusData (int ID)
    {
        i=0;
        try
        {
            String sql = "delete from pegawai where id_pegawai="+ID+"";
            i=Fungsi.EQuery(sql);
            
            return i; 
        }
        catch (Exception e)
        {
            return i;
        }
    }

    

    
    public int updateData (Pegawai pega)
    {
       i = 0;
        try 
        {
            String sql = "update pegawai set " +
                    "nama = '" + pega.getNama() + "', " +
                    "alamat = '" + pega.getAlamat() + "', " +
                    "telp = '" + pega.getTelp() + "', " +
                    "jabatan = '" + pega.getJabatan()+ "' " +
                    "where id_pegawai = " + pega.getId_pegawai();
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
