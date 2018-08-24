/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseworddqs;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author ondrejromancov
 */
public class TakeQuiz extends javax.swing.JFrame {

    /**
     * Creates new form TakeQuiz
     */
    
    private static ArrayList<String[]> questions;
    private Random generator = new Random();
    private boolean no_answer_warning_shown = false;
    private boolean bonus_shown = false;
    private String right_answer;
    public ArrayList<String[]> stats = new ArrayList<String[]>();
    public String current_id;
    public String school = new String();
    public String year = new String();
    public ArrayList bonus = new ArrayList();
    
    

        
    public TakeQuiz(ArrayList<String[]> q) {
        initComponents();
        
        questions = q;
        loadQuestion();
        
    }
    
    private void loadQuestion(){
        int  n = generator.nextInt(questions.size());
        
        QuestionText_textfield.setText(questions.get(n)[1]);
        jRadioButton_A.setText(questions.get(n)[2]);
        jRadioButton_B.setText(questions.get(n)[3]);
        jRadioButton_C.setText(questions.get(n)[4]);
        jRadioButton_D.setText(questions.get(n)[5]);
        
        right_answer = questions.get(n)[6];
        current_id = questions.get(n)[0];
        
        questions.remove(n);
    }
    
    private String checkAnswer(){
        String text = "";
        if(jRadioButton_A.isSelected()){
            text = jRadioButton_A.getText();
        }
        if(jRadioButton_B.isSelected()){
            text = jRadioButton_B.getText();
        }
        if(jRadioButton_C.isSelected()){
            text = jRadioButton_C.getText();
        }
        if(jRadioButton_D.isSelected()){
            text = jRadioButton_D.getText();
        }

        if(right_answer.equals(text)){     
            return "True";
        }
        if(text.equals("")){
            return "Empty";
        }
        else{
            return "False";
        }
    }
    
    private void questionAnswered(String answer){
        String[] current_answer = new String[4];
        current_answer[0] = current_id;
        current_answer[1] = school; 
        current_answer[2] = year; 
        System.out.print(answer);
        current_answer[3] = answer;
        stats.add(current_answer);
    }
    
    private void saveResults(){
        try {
            FileWriter csv = new FileWriter("statistics.csv",true);

            for (int i = 0; i < stats.size(); i++) {
                for (int j = 0; j < stats.get(i).length; j++) {
                    csv.write(stats.get(i)[j].toString() + ",");
                }
                csv.write("\n");
            }

            csv.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        QuestionText_textfield = new javax.swing.JTextField();
        Next_button = new javax.swing.JButton();
        jRadioButton_A = new javax.swing.JRadioButton();
        jRadioButton_B = new javax.swing.JRadioButton();
        jRadioButton_C = new javax.swing.JRadioButton();
        jRadioButton_D = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        QuestionText_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        QuestionText_textfield.setToolTipText("");
        QuestionText_textfield.setEnabled(false);
        QuestionText_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionText_textfieldActionPerformed(evt);
            }
        });
        getContentPane().add(QuestionText_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 561, 36));

        Next_button.setBackground(new java.awt.Color(255, 255, 255));
        Next_button.setText("Next Question");
        Next_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Next_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 102, 39));

        buttonGroup1.add(jRadioButton_A);
        getContentPane().add(jRadioButton_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 96, 220, -1));

        buttonGroup1.add(jRadioButton_B);
        getContentPane().add(jRadioButton_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 96, 237, -1));

        buttonGroup1.add(jRadioButton_C);
        jRadioButton_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_CActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 153, 220, -1));

        buttonGroup1.add(jRadioButton_D);
        getContentPane().add(jRadioButton_D, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 153, 194, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courseworddqs/4.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 570, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuestionText_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionText_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuestionText_textfieldActionPerformed

    private void jRadioButton_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_CActionPerformed

    private void Next_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_buttonActionPerformed
        if(!jRadioButton_A.isSelected() && !jRadioButton_B.isSelected() && !jRadioButton_C.isSelected() && !jRadioButton_D.isSelected() && no_answer_warning_shown==false){
            JOptionPane.showMessageDialog(this, "You have not answered this question. You can answer now or skip this question.","Warning", JOptionPane.WARNING_MESSAGE);
            no_answer_warning_shown = true;
        }
        else{
            if(checkAnswer()=="True"){
                JOptionPane.showMessageDialog(this, "Correct answer");
                questionAnswered("Correct");
            }
            if(checkAnswer()=="False"){
                JOptionPane.showMessageDialog(this,"Wrong answer","Inane error", JOptionPane.ERROR_MESSAGE);
                questionAnswered("Wrong");
            }
            if(checkAnswer()=="Empty"){
                questionAnswered("Skipped");
            }
            else{
               
            }
            
            if(questions.isEmpty() && bonus_shown==false){
                TakeQuiz quiz = new TakeQuiz(bonus);
                quiz.stats = this.stats;
                quiz.school = this.school;
                quiz.year = this.year;
                quiz.bonus_shown = true;
                quiz.setVisible(true);
                quiz.setLocationRelativeTo(null);
                this.dispose();
            }
            else if(questions.isEmpty() && bonus_shown==true){
                saveResults();
                
                String[] answers = new String[stats.size()];
                for(int i = 0; i<stats.size();i++){
                    answers[i] = stats.get(i)[3];
                }
                
                DisplayResults results = new DisplayResults(answers);
                results.setVisible(true);
                results.setLocationRelativeTo(null);
                this.dispose();
            }
            else{
                TakeQuiz quiz = new TakeQuiz(questions);
                quiz.stats = this.stats;
                quiz.school = this.school;
                quiz.year = this.year;
                quiz.bonus = this.bonus;
                quiz.setVisible(true);
                quiz.setLocationRelativeTo(null);
                this.dispose();
            }  
        }
               
    }//GEN-LAST:event_Next_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(TakeQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeQuiz(questions).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Next_button;
    private javax.swing.JTextField QuestionText_textfield;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton_A;
    private javax.swing.JRadioButton jRadioButton_B;
    private javax.swing.JRadioButton jRadioButton_C;
    private javax.swing.JRadioButton jRadioButton_D;
    // End of variables declaration//GEN-END:variables
}