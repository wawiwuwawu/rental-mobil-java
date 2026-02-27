package rentalmobil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import myConnection.Koneksi;

public class RentalMobil {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() {
                new frmLogin().setVisible(true);
            }
        }
        );
    }
}
