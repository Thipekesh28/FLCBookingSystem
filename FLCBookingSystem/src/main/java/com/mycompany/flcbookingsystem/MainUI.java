
package com.mycompany.flcbookingsystem;
import com.formdev.flatlaf.FlatLightLaf;

/**
 *
 * @author thipe
 */
public class MainUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainUI.class.getName());

        
    private void styleButton(javax.swing.JButton button) {

    button.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));
    button.setFocusPainted(false);
    button.setBackground(new java.awt.Color(52, 152, 219));
    button.setForeground(java.awt.Color.WHITE);
    button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }
    
    
    private void addHoverEffect(javax.swing.JButton button,
                            java.awt.Color normal,
                            java.awt.Color hover) {

    button.setBackground(normal);

    button.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            button.setBackground(hover);
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            button.setBackground(normal);
        }
    });
}


    
    private void improveUI() {

    setLocationRelativeTo(null);
    setTitle("FLC Booking System");
    setResizable(false);

    // Bigger Title
    jLabel1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setForeground(java.awt.Color.WHITE);

    // Make buttons bigger
    btnBookLesson.setPreferredSize(new java.awt.Dimension(200, 45));
    btnChangeOrCancel.setPreferredSize(new java.awt.Dimension(200, 45));
    btnAttendLesson.setPreferredSize(new java.awt.Dimension(200, 45));
    btnMonthlyLessonReport.setPreferredSize(new java.awt.Dimension(200, 45));
    BtnChamExeReport.setPreferredSize(new java.awt.Dimension(200, 45));
    btnExit.setPreferredSize(new java.awt.Dimension(120, 45));

    // Style Buttons
    styleButton(btnBookLesson);
    styleButton(btnChangeOrCancel);
    styleButton(btnAttendLesson);
    styleButton(btnMonthlyLessonReport);
    styleButton(BtnChamExeReport);
    styleButton(btnExit);

    // Hover Effects
    addHoverEffect(btnBookLesson,
            new java.awt.Color(52,152,219),
            new java.awt.Color(41,128,185));

    addHoverEffect(btnChangeOrCancel,
            new java.awt.Color(52,152,219),
            new java.awt.Color(41,128,185));

    addHoverEffect(btnAttendLesson,
            new java.awt.Color(52,152,219),
            new java.awt.Color(41,128,185));

    addHoverEffect(btnMonthlyLessonReport,
            new java.awt.Color(52,152,219),
            new java.awt.Color(41,128,185));

    addHoverEffect(BtnChamExeReport,
            new java.awt.Color(52,152,219),
            new java.awt.Color(41,128,185));

    addHoverEffect(btnExit,
            new java.awt.Color(231,76,60),
            new java.awt.Color(192,57,43));

    // Add padding
    ((javax.swing.JComponent)getContentPane()).setBorder(
            javax.swing.BorderFactory.createEmptyBorder(30, 30, 30, 30)
    );
}


    public MainUI() {
        setContentPane(new GradientPanel()); 
        initComponents();
        improveUI();
    }
    private FLCSystem system = new FLCSystem();
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBookLesson = new javax.swing.JButton();
        btnChangeOrCancel = new javax.swing.JButton();
        btnAttendLesson = new javax.swing.JButton();
        btnMonthlyLessonReport = new javax.swing.JButton();
        BtnChamExeReport = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("FLC Booking System ");

        btnBookLesson.setText("Book Lesson");
        btnBookLesson.addActionListener(this::btnBookLessonActionPerformed);

        btnChangeOrCancel.setText("Change/Cancel Booking");
        btnChangeOrCancel.addActionListener(this::btnChangeOrCancelActionPerformed);

        btnAttendLesson.setText("Attend Lesson");
        btnAttendLesson.addActionListener(this::btnAttendLessonActionPerformed);

        btnMonthlyLessonReport.setText("Monthly Lesson Report");
        btnMonthlyLessonReport.addActionListener(this::btnMonthlyLessonReportActionPerformed);

        BtnChamExeReport.setText("Champion Exercise Report");
        BtnChamExeReport.addActionListener(this::BtnChamExeReportActionPerformed);

        btnExit.setText("Exit");
        btnExit.addActionListener(this::btnExitActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnChamExeReport, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnBookLesson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAttendLesson, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMonthlyLessonReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnChangeOrCancel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBookLesson)
                    .addComponent(btnChangeOrCancel))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAttendLesson)
                    .addComponent(btnMonthlyLessonReport))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnChamExeReport)
                    .addComponent(btnExit))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookLessonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookLessonActionPerformed
        new BookLessonUI(system).setVisible(true);
    }//GEN-LAST:event_btnBookLessonActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnChangeOrCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeOrCancelActionPerformed
        new ChangeCancelUI(system).setVisible(true);
    }//GEN-LAST:event_btnChangeOrCancelActionPerformed

    private void btnAttendLessonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttendLessonActionPerformed
        new AttendLessonUI(system).setVisible(true);
    }//GEN-LAST:event_btnAttendLessonActionPerformed

    private void btnMonthlyLessonReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonthlyLessonReportActionPerformed
        new MonthlyReportUI(system).setVisible(true);
    }//GEN-LAST:event_btnMonthlyLessonReportActionPerformed

    private void BtnChamExeReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnChamExeReportActionPerformed
        new ChampionReportUI(system).setVisible(true);
    }//GEN-LAST:event_BtnChamExeReportActionPerformed

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {

    try {
        com.formdev.flatlaf.FlatLightLaf.setup();
    } catch (Exception ex) {
        ex.printStackTrace();
    }

    java.awt.EventQueue.invokeLater(() -> new MainUI().setVisible(true));
}
   
   class GradientPanel extends javax.swing.JPanel {
    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        java.awt.Graphics2D g2d = (java.awt.Graphics2D) g;

        int width = getWidth();
        int height = getHeight();

        java.awt.GradientPaint gp = new java.awt.GradientPaint(
                0, 0, new java.awt.Color(58, 123, 213),
                0, height, new java.awt.Color(0, 210, 255)
        );

        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnChamExeReport;
    private javax.swing.JButton btnAttendLesson;
    private javax.swing.JButton btnBookLesson;
    private javax.swing.JButton btnChangeOrCancel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMonthlyLessonReport;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
