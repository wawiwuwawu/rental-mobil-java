package myFunction;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import myEntity.Mobil;

public class JTableMobil extends AbstractTableModel{
    List<Mobil> list = new ArrayList<>();
    
    public void add(Mobil mobi)
    {
        list.add(mobi);      
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
            case 0: return list.get(rowIndex).getNomor_polisi();
            case 1: return list.get(rowIndex).getJenis_mobil();
            case 2: return list.get(rowIndex).getMerk();
            case 3: return list.get(rowIndex).getBiaya_pinjam_per_hari();
            case 4: return list.get(rowIndex).getStatus();
            default: return null;
        }
    }
        
    @Override
    public String getColumnName (int column)
    {
        switch(column)
        {
            case 0 : return "NOMOR";
            case 1 : return "JENIS";
            case 2 : return "MERK";
            case 3 : return "BIAYA";
            case 4 : return "STATUS";
            default : return null;
        }
    }
    
    public void removeRow(int i, int l) 
    {
        list.remove(i);
        fireTableRowsDeleted(i,l);
    }
    

}
