/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.gui;

import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author lucia
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
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

        dialogCheatSheet = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taRetazec = new javax.swing.JTextArea();
        tfRegex = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnCheatSheet = new javax.swing.JButton();
        btnSwitchLowerUpper = new javax.swing.JButton();
        btnTrimClean = new javax.swing.JButton();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sk/stu/fiit/obrazky/regex-cheat-sheet2.png"))); // NOI18N

        javax.swing.GroupLayout dialogCheatSheetLayout = new javax.swing.GroupLayout(dialogCheatSheet.getContentPane());
        dialogCheatSheet.getContentPane().setLayout(dialogCheatSheetLayout);
        dialogCheatSheetLayout.setHorizontalGroup(
            dialogCheatSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4)
        );
        dialogCheatSheetLayout.setVerticalGroup(
            dialogCheatSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        taRetazec.setColumns(20);
        taRetazec.setLineWrap(true);
        taRetazec.setRows(5);
        taRetazec.setWrapStyleWord(true);
        jScrollPane1.setViewportView(taRetazec);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));
        jPanel1.add(tfRegex, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 220, -1));

        jLabel1.setText("Zadajte re??azec, ktor?? chcete overi??");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel2.setText("Zadajte regul??rny v??raz");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        btnCheck.setBackground(new java.awt.Color(43, 174, 87));
        btnCheck.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCheck.setForeground(new java.awt.Color(0, 0, 0));
        btnCheck.setText("Skontrolova??");
        btnCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCheckMouseClicked(evt);
            }
        });
        jPanel1.add(btnCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 220, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("String checker");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 460, -1));

        btnCheatSheet.setBackground(new java.awt.Color(0, 147, 204));
        btnCheatSheet.setText("Cheat Sheet");
        btnCheatSheet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCheatSheetMouseClicked(evt);
            }
        });
        jPanel1.add(btnCheatSheet, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 200, -1));

        btnSwitchLowerUpper.setBackground(new java.awt.Color(0, 147, 204));
        btnSwitchLowerUpper.setForeground(new java.awt.Color(0, 0, 0));
        btnSwitchLowerUpper.setText("Prepni mal??/ve??k?? p??smen??");
        btnSwitchLowerUpper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSwitchLowerUpperMouseClicked(evt);
            }
        });
        jPanel1.add(btnSwitchLowerUpper, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 200, -1));

        btnTrimClean.setBackground(new java.awt.Color(0, 147, 204));
        btnTrimClean.setText("Trim a Clean");
        btnTrimClean.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTrimCleanMouseClicked(evt);
            }
        });
        jPanel1.add(btnTrimClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckMouseClicked
        String retazec = taRetazec.getText();
        String regVyraz = tfRegex.getText();
        Pattern p = Pattern.compile(regVyraz);
        Matcher m = p.matcher(retazec);
        if (m.find()) {
            JOptionPane.showMessageDialog(null, "OK", "String checked", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "NG", "String checked", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCheckMouseClicked

    private void btnCheatSheetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheatSheetMouseClicked
        dialogCheatSheet.pack();
        //dialogCheatSheet.setLocationRelativeTo(this);
        dialogCheatSheet.setVisible(true);
    }//GEN-LAST:event_btnCheatSheetMouseClicked

    private void btnSwitchLowerUpperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSwitchLowerUpperMouseClicked
        String retazec = taRetazec.getText();
        StringBuilder newRetazec = new StringBuilder(retazec);
        for(int i = 0; i < retazec.length(); i++) {
            if (Character.isLowerCase(retazec.charAt(i))) {
                newRetazec.setCharAt(i, Character.toUpperCase(retazec.charAt(i)));
            }
            
            else if (Character.isUpperCase(retazec.charAt(i))) {
                newRetazec.setCharAt(i, Character.toLowerCase(retazec.charAt(i)));
            }
        }
        taRetazec.setText(newRetazec.toString());
    }//GEN-LAST:event_btnSwitchLowerUpperMouseClicked

    private void btnTrimCleanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrimCleanMouseClicked
        String retazec = taRetazec.getText();
        retazec = retazec.replaceAll("[\\n\\t ]", "");
        taRetazec.setText(retazec);
    }//GEN-LAST:event_btnTrimCleanMouseClicked

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheatSheet;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnSwitchLowerUpper;
    private javax.swing.JButton btnTrimClean;
    private javax.swing.JDialog dialogCheatSheet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taRetazec;
    private javax.swing.JTextField tfRegex;
    // End of variables declaration//GEN-END:variables
}
