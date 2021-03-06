/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.WomanRole;

import Business.Constants;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ClaimsOrganization;
import Business.Organization.MinistryOfHealthOrganization;
import Business.Organization.Organization;
import Business.Organization.WomanOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WomanClaimRequest;
import Business.WorkQueue.WomanComplaintRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ina
 */
public class WomanRegisterComplaintJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private WomanOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    JPanel CardSequenceJPanel;
    private Network network;
    /**
     * Creates new form PatientComplaintJPanel
     */
   

    WomanRegisterComplaintJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise,Organization organization, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.organization = (WomanOrganization)organization;
        this.network = network;
    }

    
    private boolean Validate(){
         
       
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher = pattern.matcher(txt_email.getText());

        
        boolean b = matcher.find();
        if(b==true){
            return false;
        }
        else{
            return true;
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        txt_lastname = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jCombo_Org = new javax.swing.JComboBox();
        btn_back = new javax.swing.JButton();
        btn_Register = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        jLabel9 = new javax.swing.JLabel();
        btn_Reset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_desc = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Email");

        jLabel5.setText("Organization");

        jLabel6.setText("Description");

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        jCombo_Org.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Government", "Hospital", "Pharmacy", "Insurance", " " }));
        jCombo_Org.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombo_OrgActionPerformed(evt);
            }
        });

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/Go-back-icon.png"))); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        btn_Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/Save-as-icon.png"))); // NOI18N
        btn_Register.setText("Register");
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Woman Register Complaint");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(27, 27, 27))
        );

        btn_Reset.setText("Reset");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        jTextArea_desc.setColumns(20);
        jTextArea_desc.setRows(5);
        jScrollPane2.setViewportView(jTextArea_desc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_back)
                                .addGap(101, 101, 101)
                                .addComponent(btn_Reset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Register))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(jCombo_Org, 0, 231, Short.MAX_VALUE)
                            .addComponent(txt_email)
                            .addComponent(txt_lastname)
                            .addComponent(txt_firstname))))
                .addGap(186, 233, Short.MAX_VALUE))
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jCombo_Org, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(181, 181, 181))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Register)
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Reset)
                            .addComponent(btn_back))
                        .addGap(75, 75, 75))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCombo_OrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombo_OrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombo_OrgActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
       
 
            
        
         if(Validate()){
            JOptionPane.showMessageDialog(this,"Enter Email Address in Correct Format ");
            return;
        }
        
        
        
        
        String firstname = txt_firstname.getText();
       String lastname = txt_lastname.getText();
       String email = txt_email.getText(); 
       String description = jTextArea_desc.getText();
       String forOrganization = jCombo_Org.getSelectedItem().toString();
       
         if(Validate()){
            JOptionPane.showMessageDialog(this,"Enter Email Address in Correct Format ");
            return;
        }
        
     
       if (firstname.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter FirstName", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
   
        if (lastname.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter LasttName", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Email Id", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (description.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill Complaint Description", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            WomanComplaintRequest request = new WomanComplaintRequest();
            request.setMessage(description);
            request.setFirstName(firstname);
            request.setLastName(lastname);
            //request.setComplaintStatus(result);
            request.setEmailId(email);
            request.setDescription(description);
            request.setForOrganization(forOrganization);
            request.setSender(userAccount);
            request.setStatus("Received");
            
            
            Organization org = null;

            for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList())
            {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
                {
                    if (organization instanceof MinistryOfHealthOrganization)
                    {
                        org = organization;
                        break;
                    }
                }
            }
            if (org!=null){
                org.getWorkQueue().getWorkRequestList().add(request);
                organization.getWorkQueue().getWorkRequestList().add(request);
            }
            JOptionPane.showMessageDialog(null, "Compalint Registered Succesfully", "Information", JOptionPane.INFORMATION_MESSAGE);
            FieldReset();
        }catch(NullPointerException NP){
            JOptionPane.showMessageDialog(null, "Not able to registere the Compalint", "Error", JOptionPane.ERROR_MESSAGE);
            
        }catch(RuntimeException RE){
            JOptionPane.showMessageDialog(null, "Not able to registere the Compalint", "Error", JOptionPane.ERROR_MESSAGE);
            
        }
       
       
        
                        
    }//GEN-LAST:event_btn_RegisterActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        WomanWorkAreaJPanel wwjp = (WomanWorkAreaJPanel) component;
        wwjp.populateComplaintRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        // TODO add your handling code here:
        FieldReset();
    }//GEN-LAST:event_btn_ResetActionPerformed

    public void FieldReset(){
        txt_firstname.setText("");
        txt_lastname.setText("");
        jTextArea_desc.setText("");
        txt_email.setText("");
    }
        
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Register;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_back;
    private javax.swing.JComboBox jCombo_Org;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_desc;
    private java.awt.Panel panel1;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_lastname;
    // End of variables declaration//GEN-END:variables
}
