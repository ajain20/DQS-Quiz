/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseworddqs;

/**
 *
 * @author andrewbolton
 */
public class AdminMenu extends javax.swing.JFrame {

    /**
     * Creates new form AdminMenu
     */
    public AdminMenu() {
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

        btnQuestions = new javax.swing.JButton();
        btnSchools = new javax.swing.JButton();
        btnStats = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Admin");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnQuestions.setText("Edit Questions");
        btnQuestions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuestionsActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuestions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        btnSchools.setText("Edit Schools");
        btnSchools.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchoolsActionPerformed(evt);
            }
        });
        getContentPane().add(btnSchools, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 41, -1, -1));

        btnStats.setText("View Statistics");
        btnStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatsActionPerformed(evt);
            }
        });
        getContentPane().add(btnStats, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 76, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courseworddqs/4.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuestionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuestionsActionPerformed
        EditQuestions questionEditor = new EditQuestions();
        questionEditor.inputQuestions();
        questionEditor.setLocationRelativeTo(null);
        questionEditor.setVisible(true);
    }//GEN-LAST:event_btnQuestionsActionPerformed

    private void btnSchoolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSchoolsActionPerformed
        EditSchools schoolEditor = new EditSchools();
        schoolEditor.inputSchools();
        schoolEditor.setLocationRelativeTo(null);
        schoolEditor.setVisible(true);
    }//GEN-LAST:event_btnSchoolsActionPerformed

    private void btnStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatsActionPerformed
        ViewStatistics statistics = new ViewStatistics();
        statistics.setVisible(true);
        statistics.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnStatsActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Home main = new Home();
        main.setLocationRelativeTo(null);
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_formWindowClosing
    
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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuestions;
    private javax.swing.JButton btnSchools;
    private javax.swing.JButton btnStats;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}