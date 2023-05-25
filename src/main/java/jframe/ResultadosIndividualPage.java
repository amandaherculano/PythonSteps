/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import jutil.conector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import jutil.Jogador;

/**
 *
 * @author alexa
 */
public class ResultadosIndividualPage extends javax.swing.JFrame {
    
    jutil.Jogador jogador;
    /**
     * Creates new form ResultadosIndividualPage
     */
    
    public ResultadosIndividualPage() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    public void setJogador(jutil.Jogador jogador){
        this.jogador = jogador;
        ExibirResultados();
        
    }
    
    public void header(){
        JTableHeader header = resultado.getTableHeader();
        header.setBackground(Color.LIGHT_GRAY);
        header.setFont(new Font("Times New Roman", Font.BOLD, 18));
    } 
    public void ExibirResultados(){
        try (Connection con = conector.getConnection();) {
            
            Statement stmt = con.createStatement();
            //trocar para jogador.getID()
            String SQLQuestion = "SELECT nome, ra, nota FROM `pythonsteps`.`resultados` WHERE ra = '" + jogador.getRA() + "' ORDER BY idTentativa";
            ResultSet rs = stmt.executeQuery(SQLQuestion);
            DefaultTableModel model = (DefaultTableModel)resultado.getModel();
            resultado.getColumnModel().getColumn(0).setPreferredWidth(100);
            resultado.getColumnModel().getColumn(2).setPreferredWidth(100); 
            resultado.getColumnModel().getColumn(1).setPreferredWidth(100);
            header();    
            while (rs.next()){
                String nome = String.valueOf(rs.getNString("nome"));
                String ra = String.valueOf(rs.getNString("ra"));
                String pontuacao = String.valueOf(rs.getInt("nota"));
                
                model.addRow(new String[]{nome, ra, pontuacao});
            }
            
        } catch (Exception e) {
            System.err.println(e); }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        logOutBotao = new javax.swing.JButton();
        homeBotao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTable();
        FundoResultados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Book Antiqua", 0, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 51, 153));
        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ResultadosTitulo.jpg"))); // NOI18N
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, -1, -1));

        logOutBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logOut.icon.jpg"))); // NOI18N
        logOutBotao.setBorder(null);
        logOutBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(logOutBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 610, -1, -1));

        homeBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeIcon.jpg"))); // NOI18N
        homeBotao.setBorder(null);
        homeBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(homeBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 600, 150, 60));

        resultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome:", "RA:", "pontuação:"
            }
        ));
        jScrollPane1.setViewportView(resultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 50, 1250, 520));

        FundoResultados.setBackground(new java.awt.Color(217, 217, 217));
        FundoResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginPage.png"))); // NOI18N
        getContentPane().add(FundoResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 1370, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBotaoActionPerformed

        HomePage frame = new HomePage();
        frame.setVisible(true);
        frame.setJogador(jogador);
        this.dispose();
    }//GEN-LAST:event_homeBotaoActionPerformed

    private void logOutBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBotaoActionPerformed

        LoginPage1 frame = new LoginPage1();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutBotaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResultadosIndividualPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultadosIndividualPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultadosIndividualPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultadosIndividualPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultadosIndividualPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FundoResultados;
    private javax.swing.JButton homeBotao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOutBotao;
    private javax.swing.JTable resultado;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
