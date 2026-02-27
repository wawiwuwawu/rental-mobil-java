package myFunction;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import myEntity.Pengembalian;

public class JTablePengembalian extends AbstractTableModel {
    List<Pengembalian> list = new ArrayList<>();
    
    public void add(Pengembalian pn)
    {
        list.add(pn);
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
        return 6;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex)
        {
            case 0: return list.get(rowIndex).getId_pengembalian();
            case 1: return list.get(rowIndex).getId_peminjaman();
            case 2: return list.get(rowIndex).getId_pegawai();
            case 3: return list.get(rowIndex).getNik_customer();
            case 4: return list.get(rowIndex).getNomor_polisi();
            case 5: return list.get(rowIndex).getTanggal_pengembalian();
            
            default: return null;
        }
    }
        
    @Override
    public String getColumnName (int column)
    {
        switch(column)
        {
            case 0 : return "id_pengembalian";
            case 1 : return "id_peminjaman";
            case 2 : return "id_pegawai";
            case 3 : return "nik_customer";
            case 4 : return "nomor_polisi";
            case 5 : return "tanggal_pengembalian"; 
            default : return null;
        }
    }
    
    public void removeRow(int i, int l) 
    {
        list.remove(i);
        fireTableRowsDeleted(i,l);
    }
}
