package myFunction;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import myEntity.Pegawai;

public class JTablePegawai extends AbstractTableModel {
    List<Pegawai> list = new ArrayList<>();
    
    public void add(Pegawai pega)
    {
        list.add(pega);
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
            case 0: return list.get(rowIndex).getId_pegawai();
            case 1: return list.get(rowIndex).getNama();
            case 2: return list.get(rowIndex).getAlamat();
            case 3: return list.get(rowIndex).getTelp();
            case 4: return list.get(rowIndex).getJabatan();
            
            default: return null;
        }
    }
        
    @Override
    public String getColumnName (int column)
    {
        switch(column)
        {
            case 0 : return "ID";
            case 1 : return "NAMA";
            case 2 : return "ALAMAT";
            case 3 : return "TELP";
            case 4 : return "JABATAN"; 
            default : return null;
        }
    }
    
    public void removeRow(int i, int l) 
    {
        list.remove(i);
        fireTableRowsDeleted(i,l);
    }




}
