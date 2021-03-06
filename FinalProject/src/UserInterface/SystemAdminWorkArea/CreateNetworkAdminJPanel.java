/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Business.Constants;
import Business.Employee.Employee;
import Business.Network.Network;
import Business.Role.NetworkAdminRole;
import static Business.Role.Role.RoleType.NetworkAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author praty
 */
public class CreateNetworkAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNetworkAdminJPanel
     */
    JPanel userProcessContainer;
    Network network;
    
    public CreateNetworkAdminJPanel() {
        initComponents();
    }

    CreateNetworkAdminJPanel(JPanel userProcessContainer, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
    }
    
     private boolean Validate(){
          
        char[] passwordCharArray = passwordField1.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9+_$]");
        Matcher matcher =pattern.matcher(password);

        
        boolean b= matcher.find();
        if(b==true){
            return false;
        }
        else{
            return true;
        }
    }
      
      private boolean Validate2(){
          
        char[] passwordCharArray2 = passwordField2.getPassword();
        String password2 = String.valueOf(passwordCharArray2);
        
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9+_$]");
        Matcher matcher =pattern.matcher(password2);

        
        boolean b= matcher.find();
        if(b==true){
            return false;
        }
        else{
            return true;
        }
    }
      
       private boolean uValidate(){
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9+_$]");
        Matcher matcher =pattern.matcher(txtUserId.getText());

        
        boolean b= matcher.find();
        if(b==true){
            return false;
        }
        else{
            return true;
        }
    }
       
           private boolean u2Validate(){
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9+_$]");
        Matcher matcher =pattern.matcher(txtName.getText());

        
        boolean b= matcher.find();
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

        panel1 = new java.awt.Panel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        passwordField1 = new javax.swing.JPasswordField();
        passwordField2 = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));

        panel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Create Network Admin");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Admin Name");

        jLabel4.setText("Username");

        jLabel5.setText("Password");

        txtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIdActionPerformed(evt);
            }
        });

        jLabel6.setText("Re-enter Password");

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/Go-back-icon.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/Save-as-icon.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        passwordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserId)
                            .addComponent(passwordField1)
                            .addComponent(passwordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnBack))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        char[] passwordCharArray = passwordField1.getPassword();
        String password1 = String.valueOf(passwordCharArray);
        
         char[] passwordCharArray2 = passwordField2.getPassword();
        String password2 = String.valueOf(passwordCharArray2);
        
        
        if(!u2Validate()){
            JOptionPane.showMessageDialog(this,"Admin Name must contain alphanumeric character and values +,_,$ only ");
            return;
        }

        if(!uValidate()){
            JOptionPane.showMessageDialog(this,"Username must contain alphanumeric character and values +,_,$ only ");
            return;
        }

        if(!Validate()){
            JOptionPane.showMessageDialog(this,"Password must contain alphanumeric character and values +,_,$ only ");
            return;
        }
        
         if(!Validate2()){
            JOptionPane.showMessageDialog(this,"Password must contain alphanumeric character and values +,_,$ only ");
            return;
        }

        if(!password1.equals(password2))
        {
            JOptionPane.showMessageDialog(this,"Passwords must match");
            return;
        }
        

        if (txtName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, Constants.Name_valmsg, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtUserId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, Constants.UserId_valmsg, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (password1.equals("")) {
            JOptionPane.showMessageDialog(null, Constants.Password_valmsg, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
         if (password2.equals("")) {
            JOptionPane.showMessageDialog(null, Constants.Password_valmsg, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!network.getUserAccountDirectory().checkIfUsernameIsUnique(txtUserId.getText())) {
            JOptionPane.showMessageDialog(null, Constants.ExistingUserId_msg, "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Employee emp = network.getEmployeeDirectory().createEmployee();
        emp.setName(txtName.getText());

        UserAccount ua = network.getUserAccountDirectory().createUserAccount();
        ua.setEmployee(network.getEmployeeDirectory().getEmployeeList().get(0));
        ua.setPassword(password1);
        ua.setUsername(txtUserId.getText());
        ua.setRole(new NetworkAdminRole());

        JOptionPane.showMessageDialog(null, Constants.Networkadmin_Create, "Information", JOptionPane.INFORMATION_MESSAGE);

        txtName.setEditable(false);
        passwordField1.setEditable(false);
        txtUserId.setEditable(false);
        passwordField2.setEditable(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CreateNetworkJPanel createnetwork = (CreateNetworkJPanel) component;
        createnetwork.populateNetworkTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIdActionPerformed

    private void passwordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private java.awt.Panel panel1;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
