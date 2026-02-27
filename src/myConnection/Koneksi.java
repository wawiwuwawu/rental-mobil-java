package myConnection;

import java.sql.*;

public class Koneksi {
    public Connection getConnection() throws SQLException 
    {
        Connection cn = null;
        try
        {
            String db = "rental_mobil";
            String sv = "jdbc:mysql://localhost:3306/"+db;
            String driver = "com.mysql.jdbc.Driver";
            
            Class.forName(driver);
            cn = DriverManager.getConnection(sv,"root","");
            return cn;
        }
        catch (SQLException s)
        {
            System.out.println("Eksepsi SQL : " + s.getMessage());
            return null;
        }
        catch (Exception e)
        {
            System.out.println("Eksepsi : " + e.getMessage());
            return null;
        }
    }
}