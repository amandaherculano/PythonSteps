/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import jutil.conector;
import jutil.Jogador;


/**
 *
 * @author alexa
 */
public class QuestaoSelecionada extends javax.swing.JFrame {
    
    
    /**
     * Creates new form QuestaoSelecionada
     */
    
    public QuestaoSelecionada() {
        initComponents();
        
        
        
        try (Connection con = conector.getConnection();) {
            //mudar para guardar o id da questão de acordo com a RowSelected e exibir baseado no id
            //jogador.getSelecionadaID()
            Statement stmt = con.createStatement();
            String SQLExibir = "WITH `OrdemLinhas` AS (SELECT `id`, `enunciado`, `alternativaA`, `alternativaB`, `alternativaC`, `alternativaD`, `correta`, `categoria`, `feedback`, `peso`,  ROW_NUMBER() OVER (ORDER BY `categoria`) AS `RowNumbers` FROM `pythonsteps`.`questoes` ) SELECT * FROM `OrdemLinhas` WHERE `RowNumbers` = " + 1     ; //retorna linha selecionada
            ResultSet linhaSelecionada = stmt.executeQuery(SQLExibir);
            
            while (linhaSelecionada.next()){
                enunciado.setText(linhaSelecionada.getNString("enunciado"));
                A.setText(linhaSelecionada.getNString("alternativaA"));
                B.setText(linhaSelecionada.getNString("alternativaB"));
                C.setText(linhaSelecionada.getNString("alternativaC"));
                D.setText(linhaSelecionada.getNString("alternativaD"));
                feedback.setText(linhaSelecionada.getNString("feedback"));
                int selecionadaCategoria = (linhaSelecionada.getInt("categoria"));
                int selecionadaPeso = (linhaSelecionada.getInt("peso"));
                int selecionadaCorreta = (linhaSelecionada.getInt("correta"));
                int id = (linhaSelecionada.getInt("id"));
                
                
                switch (selecionadaCategoria){
                 
                    case 1 ->{
                        categoria1.doClick();
                        categoria1.isSelected();
                        break;
                    }
                    case 2->{
                        categoria2.doClick();
                        categoria2.isSelected();
                        break;
                    }
                    case 3->{
                        categoria3.doClick();
                        categoria3.isSelected();
                        break;
                    }
                    case 4->{
                        categoria4.doClick();
                        categoria4.isSelected();
                        
                        break;
                    }
                }        
                switch (selecionadaPeso){
                 
                    case 1 ->{
                        facil.doClick();
                        facil.isSelected();
                        break;
                    }
                    case 2->{
                        medio.doClick();
                        medio.isSelected();
                        break;
                    }
                    case 3->{
                        dificil.doClick();
                        dificil.isSelected();
                        break;
                    }
                }
                switch (selecionadaCategoria){
                 
                    case 1 ->{
                        categoria1.doClick();
                        categoria1.isSelected();
                        break;
                    }
                    case 2->{
                        categoria2.doClick();
                        categoria2.isSelected();
                        break;
                    }
                    case 3->{
                        categoria3.doClick();
                        categoria3.isSelected();
                        break;
                    }
                    case 4->{
                        categoria4.doClick();
                        categoria4.isSelected();
                        
                        break;
                    }
                }switch (selecionadaCategoria){
                 
                    case 1 ->{
                        categoria1.doClick();
                        categoria1.isSelected();
                        break;
                    }
                    case 2->{
                        categoria2.doClick();
                        categoria2.isSelected();
                        break;
                    }
                    case 3->{
                        categoria3.doClick();
                        categoria3.isSelected();
                        break;
                    }
                    case 4->{
                        categoria4.doClick();
                        categoria4.isSelected();
                        
                        break;
                    } 
                }switch (selecionadaCorreta){
                 
                    case 1 ->{
                        corretaA.doClick();
                        corretaA.isSelected();
                        break;
                    }
                    case 2->{
                        corretaB.doClick();
                        corretaB.isSelected();
                        break;
                    }
                    case 3->{
                        corretaC.doClick();
                        corretaC.isSelected();
                        break;
                    }
                    case 4->{
                        corretaC.doClick();
                        corretaC.isSelected();
                        break;
                    }    
                }
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

        dificuldade = new javax.swing.ButtonGroup();
        categorias = new javax.swing.ButtonGroup();
        corretas = new javax.swing.ButtonGroup();
        enunciado = new javax.swing.JTextArea();
        A = new javax.swing.JTextArea();
        B = new javax.swing.JTextArea();
        C = new javax.swing.JTextArea();
        D = new javax.swing.JTextArea();
        feedback = new javax.swing.JTextArea();
        TextoCategoria = new javax.swing.JLabel();
        TextoPeso = new javax.swing.JLabel();
        alterar = new javax.swing.JButton();
        facil = new javax.swing.JCheckBox();
        medio = new javax.swing.JCheckBox();
        dificil = new javax.swing.JCheckBox();
        categoria1 = new javax.swing.JCheckBox();
        categoria2 = new javax.swing.JCheckBox();
        categoria3 = new javax.swing.JCheckBox();
        categoria4 = new javax.swing.JCheckBox();
        corretaA = new javax.swing.JRadioButton();
        corretaB = new javax.swing.JRadioButton();
        corretaC = new javax.swing.JRadioButton();
        corretaD = new javax.swing.JRadioButton();
        close = new javax.swing.JButton();
        deletar = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enunciado.setColumns(20);
        enunciado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        enunciado.setRows(5);
        getContentPane().add(enunciado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 850, 110));

        A.setColumns(20);
        A.setRows(5);
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 850, 40));

        B.setColumns(20);
        B.setRows(5);
        getContentPane().add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 850, 40));

        C.setColumns(20);
        C.setRows(5);
        getContentPane().add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 850, 40));

        D.setColumns(20);
        D.setRows(5);
        getContentPane().add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 850, 40));

        feedback.setColumns(20);
        feedback.setRows(5);
        getContentPane().add(feedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 850, 40));

        TextoCategoria.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TextoCategoria.setText("Categoria:");
        getContentPane().add(TextoCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 90, -1, -1));

        TextoPeso.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TextoPeso.setText("Nível de dificuldade:");
        getContentPane().add(TextoPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 260, -1, -1));

        alterar.setBackground(new java.awt.Color(102, 102, 255));
        alterar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        alterar.setForeground(new java.awt.Color(255, 204, 0));
        alterar.setText("ALTERAR QUESTÃO");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });
        getContentPane().add(alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 220, 50));

        dificuldade.add(facil);
        facil.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        facil.setForeground(new java.awt.Color(102, 102, 102));
        facil.setText("fácil");
        facil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facilActionPerformed(evt);
            }
        });
        getContentPane().add(facil, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 280, -1, 20));

        dificuldade.add(medio);
        medio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        medio.setForeground(new java.awt.Color(102, 102, 102));
        medio.setText("médio");
        medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medioActionPerformed(evt);
            }
        });
        getContentPane().add(medio, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 310, -1, -1));

        dificuldade.add(dificil);
        dificil.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dificil.setForeground(new java.awt.Color(102, 102, 102));
        dificil.setText("difícil");
        getContentPane().add(dificil, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 340, -1, -1));

        categorias.add(categoria1);
        categoria1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        categoria1.setForeground(new java.awt.Color(255, 102, 102));
        categoria1.setText("selecione a saída");
        categoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoria1ActionPerformed(evt);
            }
        });
        getContentPane().add(categoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 110, -1, -1));

        categorias.add(categoria2);
        categoria2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        categoria2.setForeground(new java.awt.Color(0, 204, 0));
        categoria2.setText("complete o código");
        getContentPane().add(categoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, -1, -1));

        categorias.add(categoria3);
        categoria3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        categoria3.setForeground(new java.awt.Color(204, 51, 255));
        categoria3.setText("função do comando");
        categoria3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoria3ActionPerformed(evt);
            }
        });
        getContentPane().add(categoria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, -1, -1));

        categorias.add(categoria4);
        categoria4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        categoria4.setForeground(new java.awt.Color(255, 153, 0));
        categoria4.setText("erro no código");
        getContentPane().add(categoria4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, -1, -1));

        corretas.add(corretaA);
        corretaA.setText("jRadioButton1");
        getContentPane().add(corretaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        corretas.add(corretaB);
        corretaB.setText("jRadioButton1");
        getContentPane().add(corretaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        corretas.add(corretaC);
        corretaC.setText("jRadioButton1");
        getContentPane().add(corretaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        corretas.add(corretaD);
        corretaD.setText("jRadioButton1");
        getContentPane().add(corretaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        close.setBackground(new java.awt.Color(0, 102, 153));
        close.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        close.setForeground(new java.awt.Color(204, 204, 255));
        close.setText("FECHAR");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 480, -1, -1));

        deletar.setBackground(new java.awt.Color(255, 204, 0));
        deletar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        deletar.setForeground(new java.awt.Color(0, 153, 255));
        deletar.setText("DELETAR QUESTÃO");
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });
        getContentPane().add(deletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 220, 50));

        fundo.setBackground(new java.awt.Color(160, 207, 209));
        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SelecionadaPage.png"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_closeActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        // TODO add your handling code here:
        int categoria = 0;
        int peso = 0;
        int correta = 0;
        try (Connection con = conector.getConnection();){
           
            if (categoria1.isSelected()){
                    categoria = 1;
                }
                
                else if (categoria2.isSelected()){
                    categoria = 2;
                }
                
                else if (categoria3.isSelected()){
                    categoria = 3;
                }
                else if (categoria4.isSelected()){
                    categoria = 4;
                }
                
                //alternativa correta
                if (corretaA.isSelected()){
                    correta = 1;
                }
                
                else if (corretaB.isSelected()){
                    correta = 2;
                }
                
                else if (corretaC.isSelected()){
                    correta = 3;
                }
                else if (corretaD.isSelected()){
                    correta = 4;
                }
                
                //peso da questao
                if (facil.isSelected()){
                    peso = 1;
                }
                else if (medio.isSelected()){
                    peso = 2;
                }
                else if(dificil.isSelected()){
                    peso = 3;
                }
            //trocar para get.SelecionadaID
            PreparedStatement SQLAlterar = con.prepareStatement( "UPDATE `pythonsteps`.`questoes` SET enunciado = '" + enunciado.getText() + "', alternativaA = '" + A.getText() + "', alternativaB = '" + B.getText() + "', alternativaC = '" + C.getText() + "', alternativaD = '" + D.getText() + "', correta = " + correta + ", categoria = " + categoria + ", feedback = '" + feedback.getText() + "', peso = " + peso + " WHERE id = " + 1 );
            SQLAlterar.execute();
            
            SQLAlterar.close();
            
            } catch (Exception e) {
                System.err.println(e); 
            }
    }//GEN-LAST:event_alterarActionPerformed

    private void categoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoria1ActionPerformed

    private void facilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facilActionPerformed

    private void medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medioActionPerformed

    private void categoria3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoria3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoria3ActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
        // TODO add your handling code here:
        try (Connection con = conector.getConnection();){
            //jogador.getSelecionadaID()
            PreparedStatement SQLDeletar = con.prepareStatement( "DELETE FROM `pythonsteps`.`questoes` WHERE id = " + 1);
            SQLDeletar.execute();
            
        } catch (Exception e) {
                System.err.println(e); 
        }
    }//GEN-LAST:event_deletarActionPerformed

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
            java.util.logging.Logger.getLogger(QuestaoSelecionada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestaoSelecionada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestaoSelecionada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestaoSelecionada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestaoSelecionada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea A;
    private javax.swing.JTextArea B;
    private javax.swing.JTextArea C;
    private javax.swing.JTextArea D;
    private javax.swing.JLabel TextoCategoria;
    private javax.swing.JLabel TextoPeso;
    private javax.swing.JButton alterar;
    private javax.swing.JCheckBox categoria1;
    private javax.swing.JCheckBox categoria2;
    private javax.swing.JCheckBox categoria3;
    private javax.swing.JCheckBox categoria4;
    private javax.swing.ButtonGroup categorias;
    private javax.swing.JButton close;
    private javax.swing.JRadioButton corretaA;
    private javax.swing.JRadioButton corretaB;
    private javax.swing.JRadioButton corretaC;
    private javax.swing.JRadioButton corretaD;
    private javax.swing.ButtonGroup corretas;
    private javax.swing.JButton deletar;
    private javax.swing.JCheckBox dificil;
    private javax.swing.ButtonGroup dificuldade;
    private javax.swing.JTextArea enunciado;
    private javax.swing.JCheckBox facil;
    private javax.swing.JTextArea feedback;
    private javax.swing.JLabel fundo;
    private javax.swing.JCheckBox medio;
    // End of variables declaration//GEN-END:variables
}
