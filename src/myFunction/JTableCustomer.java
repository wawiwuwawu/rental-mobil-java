package myFunction;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import myEntity.Customer;

public class JTableCustomer extends AbstractTableModel {
    List<Customer> list = new ArrayList<>();
    
    public void add(Customer cust)
    {
        list.add(cust);
        fireTableRowsInserted(getRowCount(), getColumnCount());
    }
    
    @Override
    public int getRowCount()
    {
        return list.size();
    }
    
    @Override
    public int getColumnCount()
    {
        return 5;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex)
        {
            case 0: return list.get(rowIndex).getNik_customer();
            case 1: return list.get(rowIndex).getNama();
            case 2: return list.get(rowIndex).getAlamat_customer();
            case 3: return list.get(rowIndex).getNo_telp_customer();
            case 4: return list.get(rowIndex).getSim();
            default: return null;
        }
    }
        
    @Override
    public String getColumnName (int column)
    {
        switch(column)
        {
            case 0 : return "nik_customer";
            case 1 : return "nama";
            case 2 : return "alamat_customer";
            case 3 : return "no_telp_customer";
            case 4 : return "sim"; 
            default : return null;
        }
    }
    
    public void removeRow(int i, int l) 
    {
        list.remove(i);
        fireTableRowsDeleted(i,l);
    }
}
