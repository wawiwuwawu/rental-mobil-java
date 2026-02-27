package myEntityManager;

import myEntity.Customer;
import myFunction.Fungsi;

public class CustomerManager {
    int i;
    
    public int inputData(Customer cust)
    {
        i = 0;
        try
        {
            String sql = "insert into customer(nama, alamat_customer, no_telp_customer, sim)"
                    + "values('"+cust.getNama()+"','"+cust.getAlamat_customer()+"','"+
                    cust.getNo_telp_customer()+"','"+cust.getSim()+"')";
            
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
            String sql = "delete from customer where nik_customer="+ID+"";
            i=Fungsi.EQuery(sql);
            
            return i; 
        }
        catch (Exception e)
        {
            return i;
        }
    }
    
    public int updateData (Customer cust)
    {
       i = 0;
        try 
        {
            String sql = "update customer set " +
                    "nama = '" + cust.getNama() + "', " +
                    "alamat_customer = '" + cust.getAlamat_customer() + "', " +
                    "no_telp_customer = '" + cust.getNo_telp_customer() + "', " +
                    "sim = '" + cust.getSim()+ "' " +
                    "where nik_customer = " + cust.getNik_customer();
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
