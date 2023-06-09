/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JFrame;
import jutil.conector;
import jutil.Jogador;
/**
 *
 * @author alexa
 */
public class FeedbackPage extends javax.swing.JFrame {
    
    jutil.Jogador jogador;
    ArrayList listaPerguntas = new ArrayList<>();
    int passo = 0;
    
    /**
     * Creates new form FeedbackPage
     */
    
    public FeedbackPage() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public void setJogador(jutil.Jogador jogador){
        this.jogador = jogador;
        setPerguntas();
        ExibirPontuacao();
        InserirPontuacao();
    }
    //criar uma lista com todas os IDs das questões sorteadas
    public void setPerguntas(){
        for (int i = 0; i < 5; i++){
            if (i < jogador.getPerguntas1().size()){
                listaPerguntas.add(jogador.getPerguntas1().get(i));
            }
            if (i < jogador.getPerguntas2().size()){
                listaPerguntas.add(jogador.getPerguntas2().get(i));
            }
            if (i < jogador.getPerguntas3().size()){
                listaPerguntas.add(jogador.getPerguntas3().get(i));
            }
            if (i < jogador.getPerguntas4().size()){
                listaPerguntas.add(jogador.getPerguntas4().get(i));
            }
        }
        //0, 1, 2, 3, 4 (passo deve ir até 4)
        ExibirPerguntas((int)listaPerguntas.get(passo));
    }
    
    public void InserirPontuacao(){
        try (Connection con = conector.getConnection();) {
            Statement stmt = con.createStatement();
            PreparedStatement inserirResultado = con.prepareStatement("INSERT INTO `pythonsteps`.`resultados` (`ra`, `nome`, `nota`) VALUES ('" + jogador.getRA() + "', '" + jogador.getNome() + "', " + jogador.getPontuacao() + ")");
            inserirResultado.execute();
            
        } catch (Exception e) {
            System.err.println(e); }}
    
    
    public void ExibirPontuacao(){
        pontuacao.setText(Integer.toString(jogador.getPontuacao()));
    }
    
    public void ExibirPerguntas(int id){
        
        
        try (Connection con = conector.getConnection();) {
            
            Statement stmt = con.createStatement();
            String SQLQuestion = "SELECT * FROM `pythonsteps`.`questoes` WHERE `id` = " + id;
            ResultSet pergunta = stmt.executeQuery(SQLQuestion);
            
            //pegar primeira linha
            if (pergunta.next()){
                enunciado.setText(pergunta.getNString("enunciado"));
                alternativaA.setText(pergunta.getNString("alternativaA"));
                alternativaB.setText(pergunta.getNString("alternativaB"));
                alternativaC.setText(pergunta.getNString("alternativaC"));
                alternativaD.setText(pergunta.getNString("alternativaD"));
                feedback.setText(pergunta.getNString("feedback"));
                int valorpeso = pergunta.getInt("peso");
                peso.setText(Integer.toString(valorpeso));
                int correta = pergunta.getInt("correta");
                alternativaA.setBackground(Color.white);
                alternativaB.setBackground(Color.white);
                alternativaC.setBackground(Color.white);
                alternativaD.setBackground(Color.white);
                
                
                
                //sinalizar alternativa correta
                switch (correta){
                    case 1 -> {
                       alternativaA.setBackground(new Color(153, 255, 102));
                       break;
                    }
                    case 2 -> {
                       alternativaB.setBackground(new Color(153, 255, 102));
                       break;
                    }
                    case 3 -> {
                       alternativaC.setBackground(new Color(153, 255, 102)); 
                       break;
                    }
                    case 4 -> {
                       alternativaD.setBackground(new Color(153, 255, 102));
                       break;
                    }
                    default -> {
                       break;
                    }
                        
                }
            }
            passo ++;
            
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

        enunciado = new javax.swing.JTextArea();
        alternativaA = new javax.swing.JTextArea();
        alternativaB = new javax.swing.JTextArea();
        alternativaC = new javax.swing.JTextArea();
        alternativaD = new javax.swing.JTextArea();
        feedback = new javax.swing.JTextArea();
        textoPeso = new javax.swing.JLabel();
        peso = new javax.swing.JLabel();
        pontuacao = new javax.swing.JLabel();
        textoPontuacao = new javax.swing.JLabel();
        tituloFeedBack = new javax.swing.JLabel();
        seguinte = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        FeedBackFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enunciado.setEditable(false);
        enunciado.setBackground(new java.awt.Color(48, 131, 182));
        enunciado.setColumns(20);
        enunciado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enunciado.setRows(5);
        enunciado.setText("\n\n");
        enunciado.setBorder(null);
        getContentPane().add(enunciado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 1190, 140));

        alternativaA.setEditable(false);
        alternativaA.setBackground(new java.awt.Color(255, 255, 255));
        alternativaA.setColumns(20);
        alternativaA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        alternativaA.setRows(5);
        alternativaA.setBorder(null);
        alternativaA.setMaximumSize(new java.awt.Dimension(72, 7));
        alternativaA.setMinimumSize(new java.awt.Dimension(72, 7));
        getContentPane().add(alternativaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 1190, 70));

        alternativaB.setEditable(false);
        alternativaB.setBackground(new java.awt.Color(255, 255, 255));
        alternativaB.setColumns(20);
        alternativaB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        alternativaB.setRows(5);
        alternativaB.setBorder(null);
        getContentPane().add(alternativaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 1190, 70));

        alternativaC.setEditable(false);
        alternativaC.setBackground(new java.awt.Color(255, 255, 255));
        alternativaC.setColumns(20);
        alternativaC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        alternativaC.setRows(5);
        alternativaC.setBorder(null);
        getContentPane().add(alternativaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 1190, 80));

        alternativaD.setEditable(false);
        alternativaD.setBackground(new java.awt.Color(255, 255, 255));
        alternativaD.setColumns(20);
        alternativaD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        alternativaD.setRows(5);
        alternativaD.setBorder(null);
        alternativaD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(alternativaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 1190, 80));

        feedback.setEditable(false);
        feedback.setBackground(new java.awt.Color(253, 217, 108));
        feedback.setColumns(20);
        feedback.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        feedback.setRows(5);
        feedback.setToolTipText("");
        feedback.setBorder(null);
        feedback.setCaretColor(new java.awt.Color(255, 204, 0));
        getContentPane().add(feedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 1190, 70));

        textoPeso.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        textoPeso.setForeground(new java.awt.Color(255, 255, 255));
        textoPeso.setText("peso questão:");
        getContentPane().add(textoPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        peso.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        peso.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 50, 30));

        pontuacao.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        pontuacao.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(pontuacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, 60, 30));

        textoPontuacao.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        textoPontuacao.setForeground(new java.awt.Color(255, 255, 255));
        textoPontuacao.setText("pontuação total:");
        getContentPane().add(textoPontuacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, -1, -1));

        tituloFeedBack.setFont(new java.awt.Font("Book Antiqua", 0, 36)); // NOI18N
        tituloFeedBack.setForeground(new java.awt.Color(0, 51, 153));
        tituloFeedBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FeedBackTitulo.jpg"))); // NOI18N
        getContentPane().add(tituloFeedBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 120, -1));

        seguinte.setBackground(new java.awt.Color(223, 181, 27));
        seguinte.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        seguinte.setForeground(new java.awt.Color(255, 255, 255));
        seguinte.setText("Seguinte");
        seguinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seguinteActionPerformed(evt);
            }
        });
        getContentPane().add(seguinte, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 610, 180, 50));

        logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logOut.icon.jpg"))); // NOI18N
        logOut.setBorder(null);
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        getContentPane().add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 620, -1, -1));

        FeedBackFundo.setBackground(new java.awt.Color(217, 217, 217));
        FeedBackFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FeedBackPage.png"))); // NOI18N
        FeedBackFundo.setMaximumSize(new java.awt.Dimension(1366, 682));
        FeedBackFundo.setMinimumSize(new java.awt.Dimension(1366, 682));
        FeedBackFundo.setPreferredSize(new java.awt.Dimension(1366, 682));
        getContentPane().add(FeedBackFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 682));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seguinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seguinteActionPerformed
        // TODO add your handling code here:
        //lsitaPerguntas.size() = 5
        //a questão que está é menor do que o tamannho da lista , 0, 1, 2, 3, 4
        if ( passo < listaPerguntas.size()){
            
            //se for 4 ÚLTIMO
            if (passo == listaPerguntas.size() - 1){ 
                ExibirPerguntas((int)listaPerguntas.get(passo));
                seguinte.setText("Finalizar");
            }
            else{ // se for 0, 1, 2 ou 3 PRIMEIROS 
               ExibirPerguntas((int)listaPerguntas.get(passo));
            }
        //5 no caso
        } else {
            if (jogador.getIsAdmin() == 1){
                HomeAdminPage frame = new HomeAdminPage();
                frame.setVisible(true);
                frame.setJogador(jogador);
                this.dispose();
                passo = 0;
                jogador.LimparPontuacao();
                jogador.LimparVezes();
                jogador.getPerguntas1().clear();
                jogador.getPerguntas2().clear();
                jogador.getPerguntas3().clear();
                jogador.getPerguntas4().clear();
                      
            }else if (jogador.getIsAdmin() ==0){
                HomePage frame = new HomePage();
                frame.setVisible(true);
                frame.setJogador(jogador);
                this.dispose();
                passo = 0;
                jogador.LimparPontuacao();
                jogador.LimparVezes();
                jogador.getPerguntas1().clear();
                jogador.getPerguntas2().clear();
                jogador.getPerguntas3().clear();
                jogador.getPerguntas4().clear();
            }
        }
    }//GEN-LAST:event_seguinteActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        LoginPage1 frame = new LoginPage1();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutActionPerformed

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
            java.util.logging.Logger.getLogger(FeedbackPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeedbackPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeedbackPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeedbackPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeedbackPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FeedBackFundo;
    private javax.swing.JTextArea alternativaA;
    private javax.swing.JTextArea alternativaB;
    private javax.swing.JTextArea alternativaC;
    private javax.swing.JTextArea alternativaD;
    private javax.swing.JTextArea enunciado;
    private javax.swing.JTextArea feedback;
    private javax.swing.JButton logOut;
    private javax.swing.JLabel peso;
    private javax.swing.JLabel pontuacao;
    private javax.swing.JButton seguinte;
    private javax.swing.JLabel textoPeso;
    private javax.swing.JLabel textoPontuacao;
    private javax.swing.JLabel tituloFeedBack;
    // End of variables declaration//GEN-END:variables
}
