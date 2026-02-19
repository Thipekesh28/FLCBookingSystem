/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.flcbookingsystem;

/**
 *
 * @author thipe
 */
public class ChangeCancelUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ChangeCancelUI.class.getName());

    private FLCSystem system;

    public ChangeCancelUI(FLCSystem system) {
        initComponents();     
        this.system = system; 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBookingId = new javax.swing.JTextField();
        btnShowLessons = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLessons = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtNewLessonId = new javax.swing.JTextField();
        btnChange = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter Booking ID");

        txtBookingId.addActionListener(this::txtBookingIdActionPerformed);

        btnShowLessons.setText("Show Lessons");
        btnShowLessons.addActionListener(this::btnShowLessonsActionPerformed);

        txtLessons.setColumns(20);
        txtLessons.setRows(5);
        jScrollPane1.setViewportView(txtLessons);

        jLabel2.setText("Enter New Lesson ID");

        txtNewLessonId.addActionListener(this::txtNewLessonIdActionPerformed);

        btnChange.setText("Change");
        btnChange.addActionListener(this::btnChangeActionPerformed);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(this::btnCancelActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(txtBookingId, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnShowLessons))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNewLessonId, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBookingId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowLessons))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNewLessonId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChange)
                    .addComponent(btnCancel))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBookingIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookingIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookingIdActionPerformed

    private void btnShowLessonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowLessonsActionPerformed
        StringBuilder sb = new StringBuilder();

    for (Lesson l : system.getAllLessons()) {
        sb.append("ID: ").append(l.getLessonId())
          .append(" | ").append(l.getExerciseType())
          .append(" | ").append(l.getDay())
          .append(" | ").append(l.getTime())
          .append(" | Month: ").append(l.getMonth())
          .append(" | £").append(l.getPrice())
          .append("\n");
    }

    txtLessons.setText(sb.toString());

    }//GEN-LAST:event_btnShowLessonsActionPerformed

    private void txtNewLessonIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewLessonIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewLessonIdActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        int bookingId = Integer.parseInt(txtBookingId.getText());
        int newLessonId = Integer.parseInt(txtNewLessonId.getText());
        String result = system.changeOrCancelBookingGUI(bookingId, newLessonId, false);
        javax.swing.JOptionPane.showMessageDialog(this, result);
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        int bookingId = Integer.parseInt(txtBookingId.getText());
        String result = system.changeOrCancelBookingGUI(bookingId, 0, true);
        javax.swing.JOptionPane.showMessageDialog(this, result);
    }//GEN-LAST:event_btnCancelActionPerformed

    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnShowLessons;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBookingId;
    private javax.swing.JTextArea txtLessons;
    private javax.swing.JTextField txtNewLessonId;
    // End of variables declaration//GEN-END:variables
}
