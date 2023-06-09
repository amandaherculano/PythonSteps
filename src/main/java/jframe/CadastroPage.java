/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import jutil.conector;
import jutil.Jogador;

/**
 *
 * @author alexa
 */
public class CadastroPage extends javax.swing.JFrame {

    /**
     * Creates new form loginPage
     */
    public CadastroPage() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        senhaUsuario.setEchoChar('\u25cf');
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoNome = new javax.swing.JLabel();
        TextoSenha = new javax.swing.JLabel();
        TextoEmail = new javax.swing.JLabel();
        TextoRegistro = new javax.swing.JLabel();
        senhaUsuario = new javax.swing.JPasswordField();
        verSenha = new javax.swing.JToggleButton();
        emailUsuario = new javax.swing.JFormattedTextField();
        nomeUsuario = new javax.swing.JFormattedTextField();
        registroUsuario = new javax.swing.JFormattedTextField();
        cadastrar = new javax.swing.JButton();
        voltarLogin = new javax.swing.JButton();
        raTexto = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(13, 47, 55));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoNome.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        TextoNome.setForeground(new java.awt.Color(255, 255, 255));
        TextoNome.setText("Nome completo:");
        getContentPane().add(TextoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 140, 170, -1));

        TextoSenha.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        TextoSenha.setForeground(new java.awt.Color(255, 255, 255));
        TextoSenha.setText("Senha:");
        getContentPane().add(TextoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 230, -1, -1));

        TextoEmail.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        TextoEmail.setForeground(new java.awt.Color(255, 255, 255));
        TextoEmail.setText("E-mail:");
        getContentPane().add(TextoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 330, -1, -1));

        TextoRegistro.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        TextoRegistro.setForeground(new java.awt.Color(255, 255, 255));
        TextoRegistro.setText("Registro do Usuário:");
        getContentPane().add(TextoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 430, -1, -1));

        senhaUsuario.setBackground(new java.awt.Color(204, 204, 204));
        senhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(senhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 260, 240, 40));

        verSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/verSenha2.png"))); // NOI18N
        verSenha.setBorder(null);
        verSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(verSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 260, 40, 40));

        emailUsuario.setBackground(new java.awt.Color(204, 204, 204));
        emailUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(emailUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 360, 240, 40));

        nomeUsuario.setBackground(new java.awt.Color(204, 204, 204));
        nomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(nomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 170, 240, 40));

        registroUsuario.setBackground(new java.awt.Color(204, 204, 204));
        registroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(registroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 460, 240, 40));

        cadastrar.setBackground(new java.awt.Color(255, 255, 0));
        cadastrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cadastrar.setForeground(new java.awt.Color(0, 0, 153));
        cadastrar.setText("CADASTRAR");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 560, 170, 40));

        voltarLogin.setBackground(new java.awt.Color(153, 153, 255));
        voltarLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        voltarLogin.setForeground(new java.awt.Color(255, 255, 51));
        voltarLogin.setText("VOLTAR");
        voltarLogin.setToolTipText("");
        voltarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarLoginActionPerformed(evt);
            }
        });
        getContentPane().add(voltarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1232, 10, 120, 30));

        raTexto.setForeground(new java.awt.Color(255, 255, 255));
        raTexto.setText("RA completo (com ponto e traço)");
        getContentPane().add(raTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 500, -1, -1));

        Fundo.setBackground(new java.awt.Color(13, 47, 55));
        Fundo.setForeground(new java.awt.Color(13, 47, 55));
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cadastro2.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2460, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeUsuarioActionPerformed

    }//GEN-LAST:event_nomeUsuarioActionPerformed

    private void emailUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailUsuarioActionPerformed

    }//GEN-LAST:event_emailUsuarioActionPerformed

    private void voltarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarLoginActionPerformed
        // TODO add your handling code here:
        LoginPage1 frame = new LoginPage1();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_voltarLoginActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        
        try (Connection con = conector.getConnection();) {
            Statement stmt = con.createStatement();

            String SQLUser = "SELECT * FROM `pythonsteps`.`usuarios` WHERE ra='" + registroUsuario.getText() + "'";
            ResultSet rs = stmt.executeQuery(SQLUser);
            
            String semNome = nomeUsuario.getText().trim();
            String semSenha = senhaUsuario.getText().trim();
            String semEmail = emailUsuario.getText().trim();
            String semRegistro = registroUsuario.getText().trim();
            
            if (rs.next() == false) {
                
                if (semNome.equals("") || semSenha.equals("") || semEmail.equals("") || semRegistro.equals("")){
                    JOptionPane.showMessageDialog(null,"Informe todos os campos corretamente.", "INFORMAÇÕES INCOMPLETAS", JOptionPane.WARNING_MESSAGE);
                
                }
                //se for admin
                
                else {
                    if (registroUsuario.getText().substring(0, 5).equals("admin") && (senhaUsuario.getText().substring(0,5)).equals("admin")){

                        PreparedStatement insertUser = con.prepareStatement("INSERT INTO `pythonsteps`.`usuarios` (`ra`, `nome`, `email`, `senha`, `admin` ) VALUES ('" + registroUsuario.getText() + "', '" +  nomeUsuario.getText() + "', '" + emailUsuario.getText() + "', '"+ senhaUsuario.getText() +  "', '" + "1"+ "')");
                        insertUser.execute();

                        JOptionPane.showMessageDialog(null, "Usuário criado com sucesso. Conecte-se!");

                        LoginPage1 frame = new LoginPage1();
                        frame.setVisible(true);
                        this.setVisible(false);

                        insertUser.close();
                        stmt.close();
                        rs.close();
                    //aluno, conferir formato RA
                    } else{

                        if (registroUsuario.getText().contains(".") && registroUsuario.getText().contains("-")){

                        PreparedStatement insertUser = con.prepareStatement("INSERT INTO `pythonsteps`.`usuarios` (`ra`, `nome`, `email`, `senha`, `admin` ) VALUES ('" + registroUsuario.getText() + "', '" +  nomeUsuario.getText() + "', '" + emailUsuario.getText() + "', '"+ senhaUsuario.getText() +  "', '" + "0" + "')");
                        insertUser.execute();
                        JOptionPane.showMessageDialog(null, "Usuário criado com sucesso. Conecte-se!");

                        LoginPage1 frame = new LoginPage1();
                        frame.setVisible(true);
                        this.setVisible(false);

                        insertUser.close();
                        stmt.close();
                        rs.close();
                        }else{
                           JOptionPane.showMessageDialog(null, "Insira o registro do usuário da forma correta!"); 
                        }
                    }
                }
            }else {

                JOptionPane.showMessageDialog(null, "Usuário já existente!");

                LoginPage1 frame = new LoginPage1();
                frame.setVisible(true);
                this.setVisible(false);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_cadastrarActionPerformed

    private void verSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verSenhaActionPerformed
        
        if (verSenha.isSelected()){
            senhaUsuario.setEchoChar((char)0);
        }else{
            senhaUsuario.setEchoChar('\u25cf');
        }
    }//GEN-LAST:event_verSenhaActionPerformed

    private void senhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaUsuarioActionPerformed

    private void registroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registroUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel TextoEmail;
    private javax.swing.JLabel TextoNome;
    private javax.swing.JLabel TextoRegistro;
    private javax.swing.JLabel TextoSenha;
    private javax.swing.JButton cadastrar;
    private javax.swing.JFormattedTextField emailUsuario;
    private javax.swing.JFormattedTextField nomeUsuario;
    private javax.swing.JLabel raTexto;
    private javax.swing.JFormattedTextField registroUsuario;
    private javax.swing.JPasswordField senhaUsuario;
    private javax.swing.JToggleButton verSenha;
    private javax.swing.JButton voltarLogin;
    // End of variables declaration//GEN-END:variables
}
