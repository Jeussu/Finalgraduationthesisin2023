/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalms;

/**
 *
 * @author afwadmin
 */
public class HomeForm extends javax.swing.JFrame {

    private String doctorName;
    private int doctorID;

    /**
     * Creates new form HomeForm
     */
    public HomeForm() {
        initComponents();
        if (Login.isAdmin){
            this.patientsTxtDoctor1.setVisible(false);
            this.diagnosisTxtDoctor.setVisible(false);
            
            //hide the label if the user is admin
        } else if (Login.isDoctor){
            this.doctorTxtAdmin.setVisible(false);
            this.txtNurseLabel.setVisible(false);
            this.adminTxtAdmin.setVisible(false);
            //hide the label if the user is doctor
        } else if (Login.isNurse) {
            this.doctorTxtAdmin.setVisible(false);
            this.txtNurseLabel.setVisible(false);
            this.adminTxtAdmin.setVisible(false);
            this.diagnosisTxtDoctor.setVisible(false);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        moduleDoctor = new javax.swing.JPanel();
        diagnosisTxtDoctor = new javax.swing.JLabel();
        txtNurseLabel = new javax.swing.JLabel();
        doctorTxtAdmin = new javax.swing.JLabel();
        adminTxtAdmin = new javax.swing.JLabel();
        patientsTxtDoctor1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HOSPITAL MANAGEMENT SYSTEM");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MainForm");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(203, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(164, 164, 164)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(325, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(300, 300, 300)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 69, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel2)
                    .addContainerGap(48, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(48, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(21, 21, 21)))
        );

        moduleDoctor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        diagnosisTxtDoctor.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        diagnosisTxtDoctor.setText("DIAGNOSIS");
        diagnosisTxtDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diagnosisTxtDoctorMouseClicked(evt);
            }
        });
        moduleDoctor.add(diagnosisTxtDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, -1, -1));

        txtNurseLabel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtNurseLabel.setText("NURSE");
        txtNurseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNurseLabelMouseClicked(evt);
            }
        });
        moduleDoctor.add(txtNurseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 100, -1));

        doctorTxtAdmin.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        doctorTxtAdmin.setText("DOCTORS");
        doctorTxtAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorTxtAdminMouseClicked(evt);
            }
        });
        moduleDoctor.add(doctorTxtAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        adminTxtAdmin.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        adminTxtAdmin.setText("ADMINS");
        adminTxtAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminTxtAdminMouseClicked(evt);
            }
        });
        moduleDoctor.add(adminTxtAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, -1));

        patientsTxtDoctor1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        patientsTxtDoctor1.setText("PATIENTS");
        patientsTxtDoctor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientsTxtDoctor1MouseClicked(evt);
            }
        });
        moduleDoctor.add(patientsTxtDoctor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Logout");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(331, 331, 331))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(moduleDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(moduleDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void txtNurseLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNurseLabelMouseClicked
        new Nurse().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtNurseLabelMouseClicked

    private void diagnosisTxtDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diagnosisTxtDoctorMouseClicked
        Diagnosis diagnosis = new Diagnosis();
        if (Login.isDoctor && doctorID > 0) {
            diagnosis.setDoctorID(this.doctorID);
        }
        if (Login.isDoctor && doctorName != null) {
            diagnosis.setDoctorName(doctorName);
        }
        diagnosis.setHomeForm(this);
        diagnosis.initData();
        diagnosis.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_diagnosisTxtDoctorMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void doctorTxtAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorTxtAdminMouseClicked
        new Doctor().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_doctorTxtAdminMouseClicked

    private void adminTxtAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminTxtAdminMouseClicked
        new Admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminTxtAdminMouseClicked

    private void patientsTxtDoctor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientsTxtDoctor1MouseClicked
        // TODO add your handling code here:
        Patient patient = new Patient();
        if (Login.isDoctor && doctorName != null) {
            patient.setDoctorName(doctorName);
        }
        patient.setHomeForm(this);
        patient.initData();
        patient.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_patientsTxtDoctor1MouseClicked

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HomeForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminTxtAdmin;
    private javax.swing.JLabel diagnosisTxtDoctor;
    private javax.swing.JLabel doctorTxtAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel moduleDoctor;
    private javax.swing.JLabel patientsTxtDoctor1;
    private javax.swing.JLabel txtNurseLabel;
    // End of variables declaration//GEN-END:variables

    void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }
}
