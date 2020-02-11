/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ReportAnalysis;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author praty
 */
public class AnalysisViewJPanel extends javax.swing.JPanel {

    public JPanel userProcessContainer;
    //public EcoSystem system;
    public Network network;
    public Enterprise enterprise;
    
    public AnalysisViewJPanel(JPanel userProcessContainer, Network network, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        //this.system = system;
        this.network = network;
        this.enterprise = enterprise;
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
        jLabel3 = new javax.swing.JLabel();
        btn_Click_R1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_Click_R2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_Click_R3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_Click_R4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Report Analysis");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btn_Click_R1.setText("Click");
        btn_Click_R1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Click_R1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Patient By Age");

        jLabel2.setText("Patient by Disease");

        btn_Click_R2.setText("Click");
        btn_Click_R2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Click_R2ActionPerformed(evt);
            }
        });

        jLabel4.setText("No of Hospital Visit per Age Group ");

        btn_Click_R3.setText("Click");
        btn_Click_R3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Click_R3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Percentage of Woman grouped by diseases");

        btn_Click_R4.setText("Click");
        btn_Click_R4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Click_R4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Click_R2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Click_R1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Click_R3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Click_R4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Click_R1)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btn_Click_R2))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btn_Click_R3))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btn_Click_R4))
                .addGap(0, 44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Click_R1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Click_R1ActionPerformed
        PatientAgeReportJPanel patientReport = new PatientAgeReportJPanel(userProcessContainer, network, enterprise);
        userProcessContainer.add("PatientAgeReportJPanel", patientReport);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btn_Click_R1ActionPerformed

    private void btn_Click_R2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Click_R2ActionPerformed
        // TODO add your handling code here:
        PatientDiseaseReportJPanel patientReport2 = new PatientDiseaseReportJPanel(userProcessContainer, network, enterprise);
        userProcessContainer.add("PatientDiseaseReportJPanel", patientReport2);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btn_Click_R2ActionPerformed

    private void btn_Click_R3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Click_R3ActionPerformed
        // TODO add your handling code here:
        HospitalAgeReportJPanel HospitalAgeReport = new HospitalAgeReportJPanel(userProcessContainer, network, enterprise);
        userProcessContainer.add("HospitalAgeReportJPanel", HospitalAgeReport);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btn_Click_R3ActionPerformed

    private void btn_Click_R4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Click_R4ActionPerformed
        // TODO add your handling code here:
        PercentagePatientDiseaseJpanel PercentagePatientDisease = new PercentagePatientDiseaseJpanel(userProcessContainer, network, enterprise);
        userProcessContainer.add("PercentagePatientDiseaseJpanel", PercentagePatientDisease);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btn_Click_R4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Click_R1;
    private javax.swing.JButton btn_Click_R2;
    private javax.swing.JButton btn_Click_R3;
    private javax.swing.JButton btn_Click_R4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
