/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseworddqs;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author andrewbolton
 */
public class EditQuestions extends javax.swing.JFrame {
    
    int biggestID = 0;

    /**
     * Creates new form EditQuestions
     */
    public EditQuestions() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable() {
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Questions");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 38, 901, 373));

        jLabel1.setText("Question List:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, -1, -1));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 417, -1, -1));

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 417, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int count = model.getRowCount() - 1;
        Object valueTemp = model.getValueAt(count, 0);
        int value = Integer.valueOf(valueTemp.toString());
        isBiggest(value);
        
        String question = JOptionPane.showInputDialog("Enter Question:");
        String optionA = JOptionPane.showInputDialog("Option A:");
        String optionB = JOptionPane.showInputDialog("Option B: ");
        String optionC = JOptionPane.showInputDialog("Option C: ");
        String optionD = JOptionPane.showInputDialog("Option D: ");

        String[] optionsArray = new String[4];

        optionsArray[0] = optionA;
        optionsArray[1] = optionB;
        optionsArray[2] = optionC;
        optionsArray[3] = optionD;

        Object[] options = new Object[]{};
        JComboBox answer = new JComboBox(options);
        answer.setEditable(true);
        JFrame frame = new JFrame("Input Dialog Example 3");

        String rightAnswer = (String) JOptionPane.showInputDialog(frame,
                "What one of these is the right answer?",
                "Right Answer",
                JOptionPane.QUESTION_MESSAGE,
                null,
                optionsArray,
                optionsArray[0]);

        String topic = JOptionPane.showInputDialog("Topic: ");

        //For Extra now - done right answer and topic
        String[] optionsArray2 = new String[2];

        optionsArray2[0] = "None";
        optionsArray2[1] = "Bonus";

        Object[] options2 = new Object[]{};
        JComboBox answer2 = new JComboBox(options2);
        answer.setEditable(true);
        JFrame frame2 = new JFrame("Topic");

        String extra = (String) JOptionPane.showInputDialog(frame,
                "Type of Question?",
                "Topic",
                JOptionPane.QUESTION_MESSAGE,
                null,
                optionsArray2,
                optionsArray2[0]);

        Object[] input = new Object[9];
        input[0] = biggestID + 1;
        input[1] = question;
        input[2] = optionA;
        input[3] = optionB;
        input[4] = optionC;
        input[5] = optionD;
        input[6] = rightAnswer;
        input[7] = topic;
        input[8] = extra;

        model.addRow(input);

        try {
            JtabletoCSV();
        } catch (IOException ex) {
            Logger.getLogger(EditQuestions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        if (evt.getClickCount() == 2) {

            try {
                int selection = jTable1.getSelectedRow();

                String ORquestion = model.getValueAt(selection, 1).toString();
                String ORoptionA = model.getValueAt(selection, 2).toString();
                String ORoptionB = model.getValueAt(selection, 3).toString();
                String ORoptionC = model.getValueAt(selection, 4).toString();
                String ORoptionD = model.getValueAt(selection, 5).toString();

                String question = JOptionPane.showInputDialog(null, "Edit Question?", ORquestion);
                String optionA = JOptionPane.showInputDialog(null, "Edit Option A?", ORoptionA);
                String optionB = JOptionPane.showInputDialog(null, "Edit Option B?", ORoptionB);
                String optionC = JOptionPane.showInputDialog(null, "Edit Option C?", ORoptionC);
                String optionD = JOptionPane.showInputDialog(null, "Edit Option D?", ORoptionD);

                if (!(question.equals("") || optionA.equals(""))) {

                    model.setValueAt(question, selection, 1);
                    model.setValueAt(optionA, selection, 2);
                    model.setValueAt(optionB, selection, 3);
                    model.setValueAt(optionC, selection, 4);
                    model.setValueAt(optionD, selection, 5);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, No Row: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jTable1MousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            JtabletoCSV();
        } catch (IOException ex) {
            Logger.getLogger(EditQuestions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int row = jTable1.getSelectedRow();
        if(model.getRowCount() == row) {
            model.removeRow(row);
        } else {
            model.removeRow(row);
            
        }
        
        
    }//GEN-LAST:event_btnRemoveActionPerformed

/**
 * @param args the command line arguments
 */
public static void main(String args[]) throws FileNotFoundException, IOException {
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
            java.util.logging.Logger.getLogger(EditQuestions.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditQuestions.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditQuestions.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditQuestions.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditQuestions().setVisible(true);
            }
        });
    }

    public void inputQuestions() {

        String filepath = "Questions.csv";

        File file = new File(filepath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstline = br.readLine().trim();
            String[] columns = firstline.split(",");
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            model.setColumnIdentifiers(columns);

            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String line = lines[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
    
    public void isBiggest(int inID) {
        if (inID >= biggestID) {
            biggestID = inID;
        } else {
            biggestID = biggestID + 1;
        }
    }

    public void JtabletoCSV() throws IOException {

        try {
            TableModel model = jTable1.getModel();
            FileWriter csv = new FileWriter(new File("Questions.csv"));

            for (int i = 0; i < model.getColumnCount(); i++) {
                csv.write(model.getColumnName(i) + ",");
            }

            csv.write("\n");

            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    csv.write(model.getValueAt(i, j).toString() + ",");
                }
                csv.write("\n");
            }

            csv.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
