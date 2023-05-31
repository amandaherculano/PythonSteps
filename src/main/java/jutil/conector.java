/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jutil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import jutil.Jogador;

/**
 * @author rafae
 */
public class conector {

    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    private static final String URL = "jdbc:mysql://localhost:3306/pythonsteps";

    //como relaciono com jogador aqui? importo?
    private static final String USER = "root";

    private static final String PASSWORD = "aa";

    public static Connection getConnection() throws Exception {
        try {
            //Class.forName(DRIVER);

            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            //System.out.println("Connected");

            return conn;
        } catch (SQLException e) {
            Connection conn2;
            conn2 = null;
            while (conn2 == null){
                try { 
                    String usuarioMySQL;
                    String senhaMySQL;

                usuarioMySQL = JOptionPane.showInputDialog(null, "Insira seu usuário do MySQL: ");
                senhaMySQL = JOptionPane.showInputDialog(null, "Insira sua senha do MySQL: ");
                conn2 = DriverManager.getConnection(URL, usuarioMySQL, senhaMySQL);
                System.err.println(e);

                return conn2;
                } catch (SQLException e2) {
                    conn2 = null;
                }
            }
            return null;
        }
    }
}
