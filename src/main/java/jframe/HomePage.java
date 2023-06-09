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
public class HomePage extends javax.swing.JFrame {
    
    jutil.Jogador jogador;
    /**
     * Creates new form InicioPage
     */
    public HomePage() {
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

        logOutBotao = new javax.swing.JButton();
        texto = new javax.swing.JLabel();
        regras = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jogar = new javax.swing.JButton();
        resultadoBotao = new javax.swing.JButton();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logOutBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logOut.icon.jpg"))); // NOI18N
        logOutBotao.setBorder(null);
        logOutBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(logOutBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 600, -1, 40));

        texto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HomeEscrita.jpg"))); // NOI18N
        getContentPane().add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        regras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HomeBotaoRegras.jpg"))); // NOI18N
        regras.setBorder(null);
        regras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regrasActionPerformed(evt);
            }
        });
        getContentPane().add(regras, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, -1, 70));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo3Python.jpg"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        jogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HomebotaoJogar.jpg"))); // NOI18N
        jogar.setBorder(null);
        jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarActionPerformed(evt);
            }
        });
        getContentPane().add(jogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, 70));

        resultadoBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ResultadosBotao.jpg"))); // NOI18N
        resultadoBotao.setBorder(null);
        resultadoBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(resultadoBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, -1, -1));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InicioPage.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBotaoActionPerformed
        // TODO add your handling code here:
        LoginPage1 frame = new LoginPage1();
        frame.setVisible(true);
        this.setVisible(false);
 
    }//GEN-LAST:event_logOutBotaoActionPerformed

    private void jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarActionPerformed
        // TODO add your handling code here:
        ComecarPage frame = new ComecarPage();
        frame.setVisible(true);
        frame.setJogador(jogador);
        this.dispose();
    }//GEN-LAST:event_jogarActionPerformed

    private void regrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regrasActionPerformed
        // TODO add your handling code here:
        RegrasPage1 frame = new RegrasPage1();
        frame.setVisible(true);
        frame.setJogador(jogador);
        this.dispose();
    }//GEN-LAST:event_regrasActionPerformed

    private void resultadoBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoBotaoActionPerformed
        // TODO add your handling code here:
        ResultadosIndividualPage frame = new ResultadosIndividualPage();
        frame.setJogador(jogador);   
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_resultadoBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton jogar;
    private javax.swing.JButton logOutBotao;
    private javax.swing.JLabel logo;
    private javax.swing.JButton regras;
    private javax.swing.JButton resultadoBotao;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
