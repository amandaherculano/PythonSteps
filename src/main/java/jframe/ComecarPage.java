/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;
import javax.swing.JFrame;
import jutil.Jogador;

/**
 *
 * @author alexa
 */
public class ComecarPage extends javax.swing.JFrame {

    jutil.Jogador jogador;
    
    /**
     * Creates new form ComecarPage
     */
    public ComecarPage() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }
    public void setJogador(jutil.Jogador jogador){
        this.jogador = jogador;
    }  
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeBotao = new javax.swing.JButton();
        logOutBotao = new javax.swing.JButton();
        comecarBotao = new javax.swing.JButton();
        começarFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeIcon.jpg"))); // NOI18N
        homeBotao.setBorder(null);
        homeBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(homeBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 600, 150, 60));

        logOutBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logOut.icon.jpg"))); // NOI18N
        logOutBotao.setBorder(null);
        logOutBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(logOutBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 610, -1, -1));

        comecarBotao.setBackground(new java.awt.Color(255, 204, 51));
        comecarBotao.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        comecarBotao.setForeground(new java.awt.Color(0, 102, 204));
        comecarBotao.setText("Começar");
        comecarBotao.setDoubleBuffered(true);
        comecarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comecarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(comecarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, 310, 90));

        começarFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ComecarPage2.png"))); // NOI18N
        getContentPane().add(começarFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBotaoActionPerformed
        
        if (jogador.getIsAdmin() == 1){
           HomeAdminPage frame = new HomeAdminPage();
           frame.setVisible(true);
           frame.setJogador(jogador);
           this.dispose();
        }
        else if (jogador.getIsAdmin() == 0){
           HomePage frame = new HomePage();
           frame.setVisible(true);
           frame.setJogador(jogador);
           this.dispose(); 
        }
        
    }//GEN-LAST:event_homeBotaoActionPerformed

    private void comecarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comecarBotaoActionPerformed
        
        JogoPage frame = new JogoPage();
        frame.setVisible(true);
        frame.setJogador(jogador);
        this.dispose();
    }//GEN-LAST:event_comecarBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(ComecarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComecarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComecarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComecarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComecarPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comecarBotao;
    private javax.swing.JLabel começarFundo;
    private javax.swing.JButton homeBotao;
    private javax.swing.JButton logOutBotao;
    // End of variables declaration//GEN-END:variables
}
