/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author rafae
 */
public class conector {
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/pythonsteps";
    
    private static boolean isConnected = false;// Variável para controlar se a conexão já foi estabelecida
   
    public static String usuarioMySQL = null;
    public static String senhaMySQL =  null;
    
   
    public static Connection getConnection() throws Exception {
        if (isConnected) {
            // Conectado
            return DriverManager.getConnection(URL,usuarioMySQL, senhaMySQL);
        }

        Connection conn = null;
        boolean tentarNovamente = true;

        while (conn == null && tentarNovamente) {
            if (usuarioMySQL == null || senhaMySQL == null) {
                readCredentialsFromDialog();
            }

            try {
                conn = DriverManager.getConnection(URL, usuarioMySQL, senhaMySQL);
                isConnected = true; // Conectado
            } catch (SQLException error) {
                System.err.println(error);
                int option = JOptionPane.showOptionDialog(null, "Credenciais incorretas. Deseja tentar novamente?", "Acesso ao Banco de Dados",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                        new String[]{"Sim", "Não"}, "Sim");
                if (option == JOptionPane.NO_OPTION) {
                    tentarNovamente = false;
                    break;
                
                }
                usuarioMySQL = null;
                senhaMySQL  = null;
            }
        }

        return conn;
    }

     private static void readCredentialsFromDialog() {
        JPasswordField passwordField = new JPasswordField();
        JTextField userField = new JTextField();

        Object[] message = {
            "Usuário:", userField,
            "Senha:", passwordField
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Acesso ao Banco de Dados", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (option == JOptionPane.OK_OPTION) {
            usuarioMySQL = userField.getText();
            senhaMySQL = new String(passwordField.getPassword());
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário.", "Acesso ao Banco de Dados", JOptionPane.WARNING_MESSAGE);
        }
    }
}
