/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import jutil.conector;
import jutil.Jogador;

/**
 *
 * @author alexa
 */
public class Categoria1Page extends javax.swing.JFrame {

    public List<Integer> listID = new ArrayList<>();
    public List<Integer> listRemovidos = new ArrayList<>();
    int categoria = 1;
    static JogoPage jogo;
    static jutil.Jogador jogador;
    int selecionada = 0,peso = 0 , correta = 0;
    int vezes = 1;

    
    /**
     * Creates new form Categoria1
     * @param jogo
     * @param jogador
     */
    public Categoria1Page(JogoPage jogo, jutil.Jogador jogador) {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.jogo = jogo;
        this.jogador = jogador;
        int qte;
        
        try (Connection con = conector.getConnection();) {
            
            Statement stmt = con.createStatement();

            //  quantidade de linhas encontradas na categoria 1
            String SQLQuestion = "SELECT count(id) FROM `pythonsteps`.`questoes` WHERE `categoria` = " + categoria; //conta quantidade de linhas
            ResultSet quantidadeLinhas = stmt.executeQuery(SQLQuestion);
            if (quantidadeLinhas.next()){
                qte = quantidadeLinhas.getInt(1); 
            }
            
            
            //adicionar id das linhas na lista listID 
            // descendo nas linhas
        
            String SQLQuestionID = "SELECT `id` FROM `pythonsteps`.`questoes` WHERE `categoria` = " + categoria;
            ResultSet idLinha = stmt.executeQuery(SQLQuestionID);
            

            while (idLinha.next()){
                int id = idLinha.getInt(1);
                if (!jogador.getPerguntas1().contains(id)){
                    listID.add(id);
                }
            }
            
            Random rand = new Random();
            int elementId = listID.get(rand.nextInt(listID.size())); //gera um índice aleatorio
            jogador.AddPerguntas1(elementId);
            
            String SQLQuestion2 = "SELECT * FROM `pythonsteps`.`questoes` WHERE `id` = " + elementId;
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
            
            int elementIndex = listID.indexOf(elementId);
            listID.remove(elementIndex);
            
            
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

        seguinteBotao = new javax.swing.JButton();
        alternativaA = new javax.swing.JButton();
        alternativaB = new javax.swing.JButton();
        alternativaC = new javax.swing.JButton();
        alternativaD = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        enunciado = new javax.swing.JTextArea();
        Categoria1Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seguinteBotao.setBackground(new java.awt.Color(255, 153, 153));
        seguinteBotao.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        seguinteBotao.setForeground(new java.awt.Color(255, 102, 102));
        seguinteBotao.setText("Seguinte");
        seguinteBotao.setBorderPainted(false);
        seguinteBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seguinteBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(seguinteBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 610, 150, 50));

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

        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/saidaTitulo.jpg"))); // NOI18N
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, -1, -1));

        enunciado.setEditable(false);
        enunciado.setBackground(new java.awt.Color(248, 193, 186));
        enunciado.setColumns(20);
        enunciado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enunciado.setRows(5);
        enunciado.setAutoscrolls(false);
        enunciado.setBorder(null);
        getContentPane().add(enunciado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 1190, 140));

        Categoria1Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Categoria1Page.png"))); // NOI18N
        getContentPane().add(Categoria1Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void alternativaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaAActionPerformed
        // TODO add your handling code here:  
        selecionada = 1;
        alternativaA.setBackground(new Color(255, 204, 204));
        alternativaB.setBackground(Color.white);
        alternativaC.setBackground(Color.lightGray);
        alternativaD.setBackground(Color.lightGray);
    }//GEN-LAST:event_alternativaAActionPerformed

    private void alternativaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaBActionPerformed
        // TODO add your handling code here:
        selecionada = 2;
        alternativaA.setBackground(Color.lightGray);
        alternativaB.setBackground(new Color(255, 204, 204));
        alternativaC.setBackground(Color.lightGray);
        alternativaD.setBackground(Color.lightGray);
    }//GEN-LAST:event_alternativaBActionPerformed

    private void alternativaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaCActionPerformed
        // TODO add your handling code here:
        selecionada = 3;
        alternativaA.setBackground(Color.lightGray);
        alternativaB.setBackground(Color.lightGray);
        alternativaC.setBackground(new Color(255, 204, 204));
        alternativaD.setBackground(Color.lightGray);
    }//GEN-LAST:event_alternativaCActionPerformed

    private void alternativaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaDActionPerformed
        // TODO add your handling code here:
        selecionada = 4;
        alternativaA.setBackground(Color.lightGray);
        alternativaB.setBackground(Color.lightGray);
        alternativaC.setBackground(Color.lightGray);
        alternativaD.setBackground(new Color(255, 204, 204));
    }//GEN-LAST:event_alternativaDActionPerformed

    private void seguinteBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seguinteBotaoActionPerformed
        // TODO add your handling code here: 
        
        if (selecionada == 0){
            
            JOptionPane.showMessageDialog(null,"Selecione uma alternativa", "SELECIONE", JOptionPane.WARNING_MESSAGE);
        }
        else{
            if (selecionada == correta){
              jogador.AddPontuacao(peso);
              JOptionPane.showMessageDialog(null, "Resposta correta.");
              
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
    }//GEN-LAST:event_seguinteBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(Categoria1Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Categoria1Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Categoria1Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Categoria1Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Categoria1Page(jogo, jogador).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Categoria1Fundo;
    private javax.swing.JButton alternativaA;
    private javax.swing.JButton alternativaB;
    private javax.swing.JButton alternativaC;
    private javax.swing.JButton alternativaD;
    private javax.swing.JTextArea enunciado;
    private javax.swing.JButton seguinteBotao;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
