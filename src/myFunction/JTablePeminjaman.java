
package myFunction;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import myEntity.Peminjaman;

public class JTablePeminjaman extends AbstractTableModel {
    List<Peminjaman> list = new ArrayList<>();
    
    public void add(Peminjaman pemi)
    {
        list.add(pemi);
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
        return 8;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex)
        {
            case 0: return list.get(rowIndex).getId_peminjaman();
            case 1: return list.get(rowIndex).getId_pegawai();
            case 2: return list.get(rowIndex).getNomor_polisi();
            case 3: return list.get(rowIndex).getNik_customer();
            case 4: return list.get(rowIndex).getTanggal_peminjaman();
            case 5: return list.get(rowIndex).getHarga_pinjam();
            case 6: return list.get(rowIndex).getHari_Sewa();
            case 7: return list.get(rowIndex).getBayar();
            
            default: return null;
        }
    }
        
    @Override
    public String getColumnName (int column)
    {
        switch(column)
        {
            case 0 : return "id_peminjaman";
            case 1 : return "id_pegawai";
            case 2 : return "nomor_polisi";
            case 3 : return "nik_customer";
            case 4 : return "tanggal_peminjaman";
            case 5 : return "harga_pinjam"; 
            case 6 : return "hari_sewa"; 
            case 7 : return "bayar"; 
            default : return null;
        }
    }
    
    public void removeRow(int i, int l) 
    {
        list.remove(i);
        fireTableRowsDeleted(i,l);
    }
}
