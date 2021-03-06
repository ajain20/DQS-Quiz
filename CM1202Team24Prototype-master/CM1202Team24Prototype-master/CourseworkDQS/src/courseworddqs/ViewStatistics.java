/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseworddqs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author andrewbolton
 */
public class ViewStatistics extends javax.swing.JFrame {

    /**
     * Creates new form ViewStatistics
     */
    public ViewStatistics() {
        initComponents();
        loadComboBoxes();
    }
    
    private static DecimalFormat df2 = new DecimalFormat(".##");

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmb_School = new javax.swing.JComboBox<>();
        cmb_Year = new javax.swing.JComboBox<>();
        lbl_School = new javax.swing.JLabel();
        lbl_Year = new javax.swing.JLabel();
        btn_Show = new javax.swing.JButton();
        lbl_MostCorrect_text = new javax.swing.JLabel();
        lbl_MostIncorrect_text = new javax.swing.JLabel();
        lbl_MostUnanswered_text = new javax.swing.JLabel();
        lbl_AverageScore_text = new javax.swing.JLabel();
        lbl_MostIncorrect = new javax.swing.JLabel();
        lbl_MostCorrect = new javax.swing.JLabel();
        lbl_MostUnanswered = new javax.swing.JLabel();
        lbl_AverageScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Statistics");

        cmb_School.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmb_Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7", "8", "9" }));

        lbl_School.setText("Select School:");

        lbl_Year.setText("Select Year Group:");

        btn_Show.setText("Show");
        btn_Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ShowActionPerformed(evt);
            }
        });

        lbl_MostCorrect_text.setText("The question answered most correctly was:");

        lbl_MostIncorrect_text.setText("The question answered most incorrectly was:");

        lbl_MostUnanswered_text.setText("The most unanswered question was:");

        lbl_AverageScore_text.setText("The average score was:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_School)
                            .addComponent(cmb_School, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Year)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cmb_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Show)
                                .addGap(22, 22, 22))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbl_AverageScore_text)
                                .addGap(157, 157, 157)
                                .addComponent(lbl_AverageScore, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbl_MostUnanswered_text)
                                .addGap(73, 73, 73)
                                .addComponent(lbl_MostUnanswered, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_MostIncorrect_text)
                                    .addComponent(lbl_MostCorrect_text))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_MostCorrect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_MostIncorrect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_School)
                    .addComponent(lbl_Year))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_School, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Show))
                        .addGap(38, 38, 38)
                        .addComponent(lbl_MostCorrect_text))
                    .addComponent(lbl_MostCorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_MostIncorrect_text, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_MostIncorrect, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_MostUnanswered_text)
                    .addComponent(lbl_MostUnanswered, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_AverageScore_text)
                    .addComponent(lbl_AverageScore, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ShowActionPerformed
        try {
            calculateStats(getRelevantAnswers(cmb_School, cmb_Year));
        } catch (IOException ex) {
            Logger.getLogger(ViewStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_ShowActionPerformed

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
            java.util.logging.Logger.getLogger(ViewStatistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStatistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStatistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStatistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStatistics().setVisible(true);
            }
        });
    }
    
    public void loadComboBoxes(){
        String filepath = "Schools.csv";

        File file = new File(filepath);
        ArrayList<String> schools = new ArrayList();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            br.readLine();

            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String line = lines[i].toString().trim();
                line = line.substring(0, line.length() - 1);
                schools.add(line);
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }

        cmb_School.setModel(new DefaultComboBoxModel<>(schools.toArray(new String[schools.size()])));
    }

    public void doStats() {
        File File = new File("StatisticsQuestions.csv");
        if (File.exists()) {
            //READING IN THE CSV FILE
            ArrayList<ArrayList<String>> StatisticsQuestionsArray = new ArrayList<ArrayList<String>>();
            try {
                FileReader Reader = new FileReader("StatisticsQuestions.csv");
                Scanner Scanner = new Scanner(File);
                while (Scanner.hasNextLine()) {
                    String QuestionRecord = Scanner.nextLine();
                    String[] QuestionRecordStripped = QuestionRecord.split(",");
                    ArrayList<String> Question = new ArrayList<String>(Arrays.asList(QuestionRecordStripped));
                    StatisticsQuestionsArray.add(Question);
                }
            } catch (Exception e) {
                System.out.println("\n\nERROR READING FILE\n\n");
            }
            //CALCULATING THE RESULTS(PERCENTAGES)
            ArrayList<Double> Percentages = new ArrayList<Double>();
            for (int i = 0; i < StatisticsQuestionsArray.size(); i++) {
                int True = 0;
                int False = 0;
                for (int j = 1; j < StatisticsQuestionsArray.get(i).size(); j++) {
                    if ((StatisticsQuestionsArray.get(i).get(j)).contains("TRUE")) {
                        True = True + 1;
                    } else if ((StatisticsQuestionsArray.get(i).get(j)).contains("FALSE")) {
                        False = False + 1;
                    }
                }
                double Percentage = (True * 100 / (True + False));
                Percentages.add(Percentage);
            }
            //FINDING THE LOWEST
            double Lowest = 100;
            for (int i = 0; i < Percentages.size(); i++) {
                if (Percentages.get(i) < Lowest) {
                    Lowest = Percentages.get(i);
                } else {

                }
            }
            System.out.println("Worst answered question is " + (Percentages.indexOf(Lowest) + 1) + " with a percentage of " + Lowest + " people getting it correct");
            //FINDING THE HIGHEST
            double Highest = 0;
            for (int i = 0; i < Percentages.size(); i++) {
                if (Percentages.get(i) > Highest) {
                    Highest = Percentages.get(i);
                } else {

                }
            }
            System.out.println("Best answered question is " + (Percentages.indexOf(Highest) + 1) + " with a percentage of " + Highest + " people getting it correct");
        } else {
            System.out.println("\n\nERROR FILE MISSING OR DOES NOT EXIST\n\n");
        }
    }
    
    public ArrayList<String[]> getRelevantAnswers(JComboBox school, JComboBox year) throws FileNotFoundException, IOException{
        String selected_school = school.getSelectedItem().toString();
        String selected_year = year.getSelectedItem().toString();
        String filepath = "statistics.csv";
        
        ArrayList<String[]> relevant_answers = new ArrayList<String[]>();
        
        File file = new File(filepath);
        String line = "";
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            while((line = br.readLine())!= null){
                String[] data = line.split(",");
                if(data[1].equals(selected_school) && data[2].equals(selected_year)){
                    relevant_answers.add(data);
                }
            } 
            
        }catch(FileNotFoundException ex){
            System.out.print("There are no statistics to load");
        }
                        
        return relevant_answers;
        
    }
    
    public void calculateStats(ArrayList<String[]> answers){
        String most_correct;
        ArrayList<String> most_correct_ans = new ArrayList<String>();
        String max_id_correct = "";
        int count_correct = 0;
        String most_incorrect;
        ArrayList<String> most_incorrect_ans = new ArrayList<String>();
        String max_id_incorrect = "";
        int count_incorrect = 0;
        String most_skipped;
        ArrayList<String> most_skipped_ans = new ArrayList<String>();
        String max_id_skipped = "";
        int count_skipped = 0;
        
        double average_score;
        
        for(int i = 0; i<answers.size(); i++){
            if (answers.get(i)[3].equals("Correct")){
                most_correct_ans.add(answers.get(i)[0]);
            }
            if (answers.get(i)[3].equals("Wrong")){
                most_incorrect_ans.add(answers.get(i)[0]);
            }
            if (answers.get(i)[3].equals("Skipped")){
                most_skipped_ans.add(answers.get(i)[0]);
            } 
        }
        
        Set<String> unique = new HashSet<String>(most_correct_ans);
        for(String key:unique){
            if(Collections.frequency(most_correct_ans,key)> count_correct){
                count_correct = Collections.frequency(most_correct_ans,key);
                max_id_correct = key.toString();
            }
        }
        
        Set<String> unique2 = new HashSet<String>(most_incorrect_ans);
        for(String key:unique2){
            if(Collections.frequency(most_incorrect_ans,key)> count_incorrect){
                count_incorrect = Collections.frequency(most_incorrect_ans,key);
                max_id_incorrect = key.toString();
            }
        }
        
        Set<String> unique3 = new HashSet<String>(most_skipped_ans);
        for(String key:unique3){
            if(Collections.frequency(most_skipped_ans,key)> count_skipped){
                count_skipped = Collections.frequency(most_skipped_ans,key);
                max_id_skipped = key.toString();
            }
        }
        System.out.println(most_correct_ans.size());
        System.out.println(answers.size());
        
        average_score = ((double)most_correct_ans.size()/(double)answers.size())*100;
        
        System.out.println(average_score);
        
        lbl_MostCorrect.setText(max_id_correct);
        lbl_MostIncorrect.setText(max_id_incorrect);
        lbl_MostUnanswered.setText(max_id_skipped);
        
        lbl_AverageScore.setText(df2.format(average_score)+"%");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Show;
    private javax.swing.JComboBox<String> cmb_School;
    private javax.swing.JComboBox<String> cmb_Year;
    private javax.swing.JLabel lbl_AverageScore;
    private javax.swing.JLabel lbl_AverageScore_text;
    private javax.swing.JLabel lbl_MostCorrect;
    private javax.swing.JLabel lbl_MostCorrect_text;
    private javax.swing.JLabel lbl_MostIncorrect;
    private javax.swing.JLabel lbl_MostIncorrect_text;
    private javax.swing.JLabel lbl_MostUnanswered;
    private javax.swing.JLabel lbl_MostUnanswered_text;
    private javax.swing.JLabel lbl_School;
    private javax.swing.JLabel lbl_Year;
    // End of variables declaration//GEN-END:variables
}
