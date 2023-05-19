/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;


import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import jutil.conector;

/**
 *
 * @author alexa
 */
public class Categoria2Page extends javax.swing.JFrame {
    
    int pontos;
    int pergunta = 1;
    String resposta;
    public List<Integer> listID = new ArrayList<>();
    Random random = new Random();
    int categoria = 2;
    static JogoPage jogo;
    static jutil.Jogador jogador;
    int selecionada = 0,peso = 0 , correta = 0;
    int vezes = 1;

    
    /**
     * Creates new form Categoria2Page
     * @param jogo
     * @param jogador
     */
    public Categoria2Page(JogoPage jogo, jutil.Jogador jogador) {
        initComponents();
        this.jogo = jogo;
        this.jogador = jogador;
        int qte = 0;
        
        try (Connection con = conector.getConnection();) {
            
            Statement stmt = con.createStatement();

            //quantidade de linhas encontradas na categoria 2
            String SQLQuestion = "SELECT count(idQuestao) FROM `pythonsteps`.`questoes` WHERE `categoria` = " + categoria;
            ResultSet quantidade = stmt.executeQuery(SQLQuestion);
            
            if (quantidade.next()){
                qte = quantidade.getInt(1); 
            }
            
            //adicionar id das linhas no listID
            String SQLQuestionID = "SELECT `idQuestao` FROM `pythonsteps`.`questoes` WHERE `categoria` = " + categoria;
            ResultSet idLinha = stmt.executeQuery(SQLQuestionID);
            
            while(idLinha.next()){
                int id = idLinha.getInt(1);
                if (!jogador.getPerguntas2().contains(id)){
                    listID.add(id);
                }
            }
            
            
            Random rand = new Random();
            int elementId = listID.get(rand.nextInt(listID.size())); //gera um índice aleatorio
            jogador.AddPerguntas2(elementId);
            
            
            String SQLQuestion2 = "SELECT * FROM `pythonsteps`.`questoes` WHERE `idQuestao` = " + elementId;
            ResultSet resultado = stmt.executeQuery(SQLQuestion2);
            
           
            while (resultado.next()){
                enunciado.setText(resultado.getNString("enunciado"));
                alternativaA.setText(resultado.getNString("alternativaA"));
                alternativaB.setText(resultado.getNString("alternativaB"));
                alternativaC.setText(resultado.getNString("alternativaC"));
                alternativaD.setText(resultado.getNString("alternativaD"));
                correta = resultado.getInt("correta");
                peso = resultado.getInt("peso");
            }     
            
    } catch (Exception e) {
            System.err.println(e); }}  
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SeguinteBotao = new javax.swing.JButton();
        alternativaA = new javax.swing.JButton();
        alternativaB = new javax.swing.JButton();
        alternativaC = new javax.swing.JButton();
        alternativaD = new javax.swing.JButton();
        TituloComplete = new javax.swing.JLabel();
        enunciado = new javax.swing.JTextArea();
        Categoria2Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SeguinteBotao.setBackground(new java.awt.Color(102, 255, 102));
        SeguinteBotao.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SeguinteBotao.setForeground(new java.awt.Color(0, 153, 0));
        SeguinteBotao.setText("Seguinte");
        SeguinteBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeguinteBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(SeguinteBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 610, 150, 50));

        alternativaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativaAActionPerformed(evt);
            }
        });
        getContentPane().add(alternativaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 1190, 90));

        alternativaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativaBActionPerformed(evt);
            }
        });
        getContentPane().add(alternativaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 1190, 90));

        alternativaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativaCActionPerformed(evt);
            }
        });
        getContentPane().add(alternativaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 1190, 90));

        alternativaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativaDActionPerformed(evt);
            }
        });
        getContentPane().add(alternativaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 1190, 90));

        TituloComplete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/completeCodigoTitulo.jpg"))); // NOI18N
        getContentPane().add(TituloComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, -1, -1));

        enunciado.setEditable(false);
        enunciado.setBackground(new java.awt.Color(204, 226, 176));
        enunciado.setColumns(20);
        enunciado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        enunciado.setRows(5);
        enunciado.setAutoscrolls(false);
        enunciado.setBorder(null);
        getContentPane().add(enunciado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 1190, 110));

        Categoria2Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Categoria2Page.png"))); // NOI18N
        getContentPane().add(Categoria2Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SeguinteBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeguinteBotaoActionPerformed
        // TODO add your handling code here:
        if (selecionada == 0){
            JOptionPane.showMessageDialog(null,"Selecione uma alternativa", "SELECIONE", JOptionPane.WARNING_MESSAGE);
        }
        else{
            if (selecionada == correta){
              jogador.AddPontuacao(peso);
              JOptionPane.showMessageDialog(null, "Resposta correta.");
              System.out.println(jogador.getPontuacao());
            }
            else {
                JOptionPane.showMessageDialog(null, "Resposta errada.", "RESPOSTA",JOptionPane.ERROR_MESSAGE);
            }
        
        if (jogador.getVezes() == 5){
            JOptionPane.showMessageDialog(null, "fim");
            FeedbackPage feedbackPage = new FeedbackPage();
            feedbackPage.setJogador(jogador);
            feedbackPage.setVisible(true);
            jogo.dispose();
            this.dispose();
        }
        else{
           jogador.Addvezes(vezes);
           jogo.AlteraTextoRodada(jogador.getVezes());
           jogo.setVisible(true);
           this.dispose();  
        }
        }
    }//GEN-LAST:event_SeguinteBotaoActionPerformed

    private void alternativaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaAActionPerformed
        // TODO add your handling code here:
        selecionada = 1;
        alternativaA.setBackground(Color.white);
        alternativaB.setBackground(Color.lightGray);
        alternativaD.setBackground(Color.lightGray);
        alternativaC.setBackground(Color.lightGray);
    }//GEN-LAST:event_alternativaAActionPerformed

    private void alternativaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaCActionPerformed
        // TODO add your handling code here:
        selecionada = 3;
        alternativaA.setBackground(Color.lightGray);
        alternativaB.setBackground(Color.lightGray);
        alternativaD.setBackground(Color.lightGray);
        alternativaC.setBackground(Color.white);
    }//GEN-LAST:event_alternativaCActionPerformed

    private void alternativaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaBActionPerformed
        // TODO add your handling code here:
        selecionada = 2;
        alternativaA.setBackground(Color.lightGray);
        alternativaB.setBackground(Color.white);
        alternativaD.setBackground(Color.lightGray);
        alternativaC.setBackground(Color.lightGray);
    }//GEN-LAST:event_alternativaBActionPerformed

    private void alternativaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaDActionPerformed
        // TODO add your handling code here:
        selecionada = 4;
        alternativaA.setBackground(Color.lightGray);
        alternativaB.setBackground(Color.lightGray);
        alternativaC.setBackground(Color.lightGray);
        alternativaD.setBackground(Color.white);
    }//GEN-LAST:event_alternativaDActionPerformed

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
            java.util.logging.Logger.getLogger(Categoria2Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Categoria2Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Categoria2Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Categoria2Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Categoria2Page(jogo, jogador).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Categoria2Fundo;
    private javax.swing.JButton SeguinteBotao;
    private javax.swing.JLabel TituloComplete;
    private javax.swing.JButton alternativaA;
    private javax.swing.JButton alternativaB;
    private javax.swing.JButton alternativaC;
    private javax.swing.JButton alternativaD;
    private javax.swing.JTextArea enunciado;
    // End of variables declaration//GEN-END:variables
}
