package dao;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ngoncalves
 */
public class FabricaConexao {
    
    public static Connection getConexao() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://hostname:port/dbname", "username", "password");

        return con;
    }
}
