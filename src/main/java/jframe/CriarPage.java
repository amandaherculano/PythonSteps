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
public class CriarPage extends javax.swing.JFrame {

    /**
     * Creates new form CriarPage
     */
    public CriarPage() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        categorias = new javax.swing.ButtonGroup();
        pesos = new javax.swing.ButtonGroup();
        corretas = new javax.swing.ButtonGroup();
        voltar = new javax.swing.JButton();
        textoEnunciado = new javax.swing.JLabel();
        textoA = new javax.swing.JLabel();
        textoB = new javax.swing.JLabel();
        textoC = new javax.swing.JLabel();
        textoD = new javax.swing.JLabel();
        textoC1 = new javax.swing.JLabel();
        textoCategoria = new javax.swing.JLabel();
        textoPeso = new javax.swing.JLabel();
        logOut = new javax.swing.JButton();
        enunciado = new javax.swing.JTextArea();
        alternativaA = new javax.swing.JTextArea();
        categoria1 = new javax.swing.JCheckBox();
        categoria2 = new javax.swing.JCheckBox();
        categoria3 = new javax.swing.JCheckBox();
        categoria4 = new javax.swing.JCheckBox();
        peso1 = new javax.swing.JCheckBox();
        peso2 = new javax.swing.JCheckBox();
        peso3 = new javax.swing.JCheckBox();
        corretaA = new javax.swing.JRadioButton();
        corretaB = new javax.swing.JRadioButton();
        corretaC = new javax.swing.JRadioButton();
        corretaD = new javax.swing.JRadioButton();
        alternativaB = new javax.swing.JTextArea();
        alternativaC = new javax.swing.JTextArea();
        alternativaD = new javax.swing.JTextArea();
        feedback = new javax.swing.JTextArea();
        criar = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        CriarFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/setaEscuro.png"))); // NOI18N
        voltar.setBorder(null);
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, -1, -1));

        textoEnunciado.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        textoEnunciado.setForeground(new java.awt.Color(255, 255, 255));
        textoEnunciado.setText("Enunciado:");
        getContentPane().add(textoEnunciado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        textoA.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        textoA.setForeground(new java.awt.Color(255, 255, 255));
        textoA.setText("Alternativa A:");
        getContentPane().add(textoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        textoB.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        textoB.setForeground(new java.awt.Color(255, 255, 255));
        textoB.setText("Alternativa B:");
        getContentPane().add(textoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        textoC.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        textoC.setForeground(new java.awt.Color(255, 255, 255));
        textoC.setText("Alternativa C:");
        getContentPane().add(textoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        textoD.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        textoD.setForeground(new java.awt.Color(255, 255, 255));
        textoD.setText("Breve explicação:");
        getContentPane().add(textoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, -1, -1));

        textoC1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        textoC1.setForeground(new java.awt.Color(255, 255, 255));
        textoC1.setText("Alternativa D:");
        getContentPane().add(textoC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        textoCategoria.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        textoCategoria.setForeground(new java.awt.Color(255, 255, 255));
        textoCategoria.setText("Categoria:");
        getContentPane().add(textoCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 60, -1, -1));

        textoPeso.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        textoPeso.setForeground(new java.awt.Color(255, 255, 255));
        textoPeso.setText("Nível de dificuldade:");
        getContentPane().add(textoPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 290, -1, -1));

        logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logOut.icon.jpg"))); // NOI18N
        logOut.setBorder(null);
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        getContentPane().add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 600, -1, -1));

        enunciado.setBackground(new java.awt.Color(232, 232, 235));
        enunciado.setColumns(20);
        enunciado.setRows(5);
        getContentPane().add(enunciado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 1020, 120));

        alternativaA.setBackground(new java.awt.Color(232, 232, 235));
        alternativaA.setColumns(20);
        alternativaA.setRows(5);
        getContentPane().add(alternativaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 1020, 50));

        categoria1.setBackground(new java.awt.Color(48, 131, 182));
        categorias.add(categoria1);
        categoria1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        categoria1.setForeground(new java.awt.Color(255, 204, 204));
        categoria1.setText("selecione a saída");
        categoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoria1ActionPerformed(evt);
            }
        });
        getContentPane().add(categoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 110, -1, -1));

        categoria2.setBackground(new java.awt.Color(48, 131, 182));
        categorias.add(categoria2);
        categoria2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        categoria2.setForeground(new java.awt.Color(102, 255, 102));
        categoria2.setText("complete o código");
        getContentPane().add(categoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 150, -1, -1));

        categoria3.setBackground(new java.awt.Color(48, 131, 182));
        categorias.add(categoria3);
        categoria3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        categoria3.setForeground(new java.awt.Color(204, 153, 255));
        categoria3.setText("função do comando");
        getContentPane().add(categoria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 190, -1, -1));

        categoria4.setBackground(new java.awt.Color(48, 131, 182));
        categorias.add(categoria4);
        categoria4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        categoria4.setForeground(new java.awt.Color(255, 255, 102));
        categoria4.setText("erro no código");
        getContentPane().add(categoria4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 230, -1, -1));

        peso1.setBackground(new java.awt.Color(48, 131, 182));
        pesos.add(peso1);
        peso1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        peso1.setForeground(new java.awt.Color(255, 255, 255));
        peso1.setText("fácil");
        getContentPane().add(peso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 330, -1, -1));

        peso2.setBackground(new java.awt.Color(48, 131, 182));
        pesos.add(peso2);
        peso2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        peso2.setForeground(new java.awt.Color(255, 255, 255));
        peso2.setText("médio");
        peso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peso2ActionPerformed(evt);
            }
        });
        getContentPane().add(peso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 370, -1, -1));

        peso3.setBackground(new java.awt.Color(48, 131, 182));
        pesos.add(peso3);
        peso3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        peso3.setForeground(new java.awt.Color(255, 255, 255));
        peso3.setText("difícil");
        peso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peso3ActionPerformed(evt);
            }
        });
        getContentPane().add(peso3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 410, -1, -1));

        corretaA.setBackground(new java.awt.Color(48, 131, 182));
        corretas.add(corretaA);
        getContentPane().add(corretaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 20, 20));

        corretaB.setBackground(new java.awt.Color(48, 131, 182));
        corretas.add(corretaB);
        getContentPane().add(corretaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 20, 20));

        corretaC.setBackground(new java.awt.Color(48, 131, 182));
        corretas.add(corretaC);
        getContentPane().add(corretaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 20, 20));

        corretaD.setBackground(new java.awt.Color(48, 131, 182));
        corretas.add(corretaD);
        getContentPane().add(corretaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 20, 20));

        alternativaB.setBackground(new java.awt.Color(232, 232, 235));
        alternativaB.setColumns(20);
        alternativaB.setRows(5);
        getContentPane().add(alternativaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 1020, 50));

        alternativaC.setBackground(new java.awt.Color(232, 232, 235));
        alternativaC.setColumns(20);
        alternativaC.setRows(5);
        getContentPane().add(alternativaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 1020, 50));

        alternativaD.setBackground(new java.awt.Color(232, 232, 235));
        alternativaD.setColumns(20);
        alternativaD.setRows(5);
        getContentPane().add(alternativaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 1020, 50));

        feedback.setBackground(new java.awt.Color(232, 232, 235));
        feedback.setColumns(20);
        feedback.setRows(5);
        getContentPane().add(feedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 1020, 50));

        criar.setBackground(new java.awt.Color(223, 181, 27));
        criar.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        criar.setForeground(new java.awt.Color(0, 51, 102));
        criar.setText("Criar");
        criar.setToolTipText("");
        criar.setBorder(null);
        criar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarActionPerformed(evt);
            }
        });
        getContentPane().add(criar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 190, 50));

        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CriarTiulo.jpg"))); // NOI18N
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        CriarFundo.setBackground(new java.awt.Color(255, 102, 102));
        CriarFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginPage.png"))); // NOI18N
        getContentPane().add(CriarFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void criarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarActionPerformed
        // TODO add your handling code here:
        try (Connection con = conector.getConnection();) {
            Statement stmt = con.createStatement();
        
            String SQLEnunciado = "SELECT count(id) FROM `pythonsteps`.`questoes` WHERE enunciado='" + enunciado.getText() + "'";
            ResultSet existeQuestao = stmt.executeQuery(SQLEnunciado);
            existeQuestao.next();
            int existe = existeQuestao.getInt(1);
            int categoria = 0;
            int peso = 0;
            int correta = 0;
         
            //se questao ainda nao existir
            if (existe != 1){
                System.out.println("não existe");
                
                //categoria da questao
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
                if (peso1.isSelected()){
                    peso = 1;
                }
                else if (peso2.isSelected()){
                    peso = 2;
                }
                else if(peso3.isSelected()){
                    peso = 3;
                }
                
                //se não selecionar inserir algum campo ou nao selecionar 
                String semEnunciado = enunciado.getText().trim();
                String semA = alternativaA.getText().trim();
                String semB = alternativaB.getText().trim();
                String semC = alternativaC.getText().trim();
                String semD = alternativaD.getText().trim();
                String semFeedback = feedback.getText().trim();
                
                if (categoria == 0){
                    JOptionPane.showMessageDialog(null,"Selecione uma categoria.", "SEM CATEGORIA", JOptionPane.WARNING_MESSAGE); 
                }
                
                else if (peso == 0){
                    JOptionPane.showMessageDialog(null,"Selecione um nível de dificuldade.", "SEM DIFICULDADE", JOptionPane.WARNING_MESSAGE);
                }
                
                else if (correta == 0){
                    JOptionPane.showMessageDialog(null,"Selecione a alternativa correta.", "ALTERNATIVA CORRETA INCOMPLETA", JOptionPane.WARNING_MESSAGE);
                }
                
                else if (semEnunciado.equals("")){
                    JOptionPane.showMessageDialog(null,"Digite um enunciado.", "SEM ENUNCIADO", JOptionPane.WARNING_MESSAGE);
                }
                
                else if (semFeedback.equals("")){
                    JOptionPane.showMessageDialog(null,"Digite uma breve explicação.", "EXPLICAÇÃO INCOMPLETA", JOptionPane.WARNING_MESSAGE);
                }
                
                else if (semA.equals("") || semB.equals("") || semC.equals("") || semD.equals("")){
                    JOptionPane.showMessageDialog(null,"Complete todos os campos das alternativas.", "ALTERANTIVAS INCOMPLETAS", JOptionPane.WARNING_MESSAGE);
                
                }
                else {
                    
                    PreparedStatement inserirQuestao = con.prepareStatement("INSERT INTO `pythonsteps`.`questoes` (`enunciado`, `alternativaA`, `alternativaB`, `alternativaC`, `alternativaD`, `correta`, `categoria`, `feedback`, `peso` ) VALUES ('" + enunciado.getText() + "', '" +  alternativaA.getText() + "', '" + alternativaB.getText() + "', '"+ alternativaC.getText() +  "', '" + alternativaD.getText() + "', " + correta + ", " + categoria + ", '" + feedback.getText() + "', " + peso + ")");
                    inserirQuestao.execute();
                    JOptionPane.showMessageDialog(null, "Questão criada com sucesso!");
                    enunciado.setText("");
                    alternativaA.setText("");
                    alternativaB.setText("");
                    alternativaC.setText("");
                    alternativaD.setText("");
                    feedback.setText("");
                    categorias.clearSelection();
                    pesos.clearSelection();
                    corretas.clearSelection();
                    
                    stmt.close();
                    existeQuestao.close();
                    inserirQuestao.close();
                }
            }    
            else{
                System.out.println("já existe");
                JOptionPane.showMessageDialog(null,"Já existe uma questão com esse enunciado", "QUESTÃO JÁ EXISTENTE", JOptionPane.WARNING_MESSAGE);
                
                
                stmt.close();
                existeQuestao.close();
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_criarActionPerformed

    private void peso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peso2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peso2ActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        QuestoesPage frame = new QuestoesPage();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        LoginPage1 frame = new LoginPage1();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutActionPerformed

    private void peso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peso3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_peso3ActionPerformed

    private void categoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoria1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_categoria1ActionPerformed

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
            java.util.logging.Logger.getLogger(CriarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CriarFundo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextArea alternativaA;
    private javax.swing.JTextArea alternativaB;
    private javax.swing.JTextArea alternativaC;
    private javax.swing.JTextArea alternativaD;
    private javax.swing.JCheckBox categoria1;
    private javax.swing.JCheckBox categoria2;
    private javax.swing.JCheckBox categoria3;
    private javax.swing.JCheckBox categoria4;
    private javax.swing.ButtonGroup categorias;
    private javax.swing.JRadioButton corretaA;
    private javax.swing.JRadioButton corretaB;
    private javax.swing.JRadioButton corretaC;
    private javax.swing.JRadioButton corretaD;
    private javax.swing.ButtonGroup corretas;
    private javax.swing.JButton criar;
    private javax.swing.JTextArea enunciado;
    private javax.swing.JTextArea feedback;
    private javax.swing.JButton logOut;
    private javax.swing.JCheckBox peso1;
    private javax.swing.JCheckBox peso2;
    private javax.swing.JCheckBox peso3;
    private javax.swing.ButtonGroup pesos;
    private javax.swing.JLabel textoA;
    private javax.swing.JLabel textoB;
    private javax.swing.JLabel textoC;
    private javax.swing.JLabel textoC1;
    private javax.swing.JLabel textoCategoria;
    private javax.swing.JLabel textoD;
    private javax.swing.JLabel textoEnunciado;
    private javax.swing.JLabel textoPeso;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
