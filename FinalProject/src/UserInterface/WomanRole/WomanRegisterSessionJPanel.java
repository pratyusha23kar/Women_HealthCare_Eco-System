/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.WomanRole;

import Business.Common.SendEmail;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.MinistryOfHealthOrganization;
import Business.Organization.NGOOrganization;
import Business.Organization.Organization;
import Business.Organization.WomanOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WomanComplaintRequest;
import Business.WorkQueue.WomanSessionRegister;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ina
 */
public class WomanRegisterSessionJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private WomanOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    JPanel CardSequenceJPanel;
    private Network network;
    /**
     * Creates new form PatientViewComplaintJPanel
     */
    public WomanRegisterSessionJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise,Organization organization, Network network) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.organization = (WomanOrganization)organization;
        this.network = network;
    
    }
    
     private boolean Validate(){
         
       
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher = pattern.matcher(txt_EmailId.getText());

        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_RegisterSession = new javax.swing.JTable();
        btn_Register = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbl_trainingCode = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_TrainingCode = new javax.swing.JTextField();
        txt_EmailId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_LastName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_FirstName = new javax.swing.JTextField();
        txt_Location = new javax.swing.JTextField();
        panel1 = new java.awt.Panel();
        jLabel9 = new javax.swing.JLabel();
        lbl_lastname = new javax.swing.JLabel();
        lbl_FirstName = new javax.swing.JLabel();
        txt_Startdate = new javax.swing.JTextField();
        txt_EndDate = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        tbl_RegisterSession.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        tbl_RegisterSession.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", "Health Awareness", "Delhi", "31/12/2018", "01/01/2019", "01/02/2019"},
                {"02", "Mental Awareness", "Delhi", "25/12/2018", "01/01/2019", "01/02/2019"},
                {"03", "Social Awareness", "Delhi", "30/12/2018", "05/01/2019", "15/02/2019"}
            },
            new String [] {
                "Training Code", "Title", "Location", "Last Day to register", "Start Date ", "End Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_RegisterSession.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_RegisterSessionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_RegisterSession);

        btn_Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/Save-as-icon.png"))); // NOI18N
        btn_Register.setText("Register");
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/Go-back-icon.png"))); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel4.setText("Location");

        lbl_trainingCode.setText("Training Code");

        jLabel3.setText("Email Id");

        txt_TrainingCode.setEditable(false);

        txt_EmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailIdActionPerformed(evt);
            }
        });

        jLabel7.setText("Start Date");

        txt_LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LastNameActionPerformed(evt);
            }
        });

        jLabel1.setText("End date");

        txt_FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FirstNameActionPerformed(evt);
            }
        });

        txt_Location.setEditable(false);
        txt_Location.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        panel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Woman Register Session");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(412, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        lbl_lastname.setText("Last Name");

        lbl_FirstName.setText("First Name");

        txt_Startdate.setEditable(false);

        txt_EndDate.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_trainingCode, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(lbl_lastname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_LastName, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(txt_FirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(txt_TrainingCode, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(txt_EmailId, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(txt_Location, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(txt_Startdate)
                                    .addComponent(txt_EndDate)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                                .addComponent(btn_Register)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_trainingCode, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TrainingCode, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_EmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Startdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_EndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Register)
                    .addComponent(Back))
                .addContainerGap(122, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
        // TODO add your handling code here:
        
        
        
       
        
        
        SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy");
        String FirstName = txt_FirstName.getText();
        String LastName = txt_LastName.getText();
        String EmailId = txt_EmailId.getText();
        String message = txt_TrainingCode.getText();
        String Location = txt_Location.getText();
          //String StratDate = jDateChooser_StartDate.getDateFormatString().toString();
          //String LastDate = jDateChooser_LastDate.getDateFormatString().toString();
        String StratDate = txt_Startdate.getText();
        String LastDate = txt_EndDate.getText();
        String SubjectLine = "Registration Confirmation Email";
        String BodyMessage = "<html>Hi "+userAccount.getUsername()+"<br>"+"You have successfully registered for the session ID"+message+" </html>";

          if(Validate()){
            JOptionPane.showMessageDialog(this,"Enter Email Address in Correct Format ");
            return;
        }
          
        WomanSessionRegister WomanSession = null;
        for(WorkRequest WQ : organization.getWorkQueue().getWorkRequestList()){
            if( WQ instanceof WomanSessionRegister){
                WomanSession = (WomanSessionRegister)WQ;
                if(
                    (WomanSession.getFirstName().equals(FirstName)) &&
                    (WomanSession.getLastName().equals(LastName))  &&
                    (WomanSession.getEmailId().equals(EmailId))  &&
                    (WomanSession.getTrainingCode().equals(message))
                   ){
                     JOptionPane.showMessageDialog(null, "This Woman is already registered for this session", "Error", JOptionPane.ERROR_MESSAGE);
                     return;
                }
            }
        }
        if (FirstName.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter FirstName", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (LastName.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter LastName", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (EmailId.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Email Id", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{

            WomanSessionRegister register = new WomanSessionRegister();
            register.setMessage(message);
            register.setSender(userAccount);
            register.setStatus("Received");
            register.setTrainingCode(message);
            register.setFirstName(FirstName);
            register.setLastName(LastName);
            register.setEmailId(EmailId);
            register.setLocation(Location);
            try {
                register.setLastDate(dateformat.parse(LastDate));
            } catch (ParseException ex) {
                Logger.getLogger(WomanRegisterSessionJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            try {
                register.setStartDate(dateformat.parse(StratDate));
            } catch (ParseException ex) {
                    Logger.getLogger(WomanRegisterSessionJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            //register.setBodyMessage(BodyMessage);
            //register.setSubjectLine(SubjectLine);


            Organization org = null;

            for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                    if (organization instanceof NGOOrganization)
                    {
                        org = organization;
                        break;
                    }
                }
            }
            if (org!=null){
                org.getWorkQueue().getWorkRequestList().add(register);
                organization.getWorkQueue().getWorkRequestList().add(register);
            }
            JOptionPane.showMessageDialog(null, "Session Registered Succesfully", "Information", JOptionPane.INFORMATION_MESSAGE);
             
            txt_FirstName.setText("");
            txt_LastName.setText("");
            txt_EmailId.setText("");
            txt_Location.setText("");
            txt_TrainingCode.setText("");
            txt_Startdate.setText("");
            txt_EndDate.setText("");
            
        }catch(NullPointerException NP){
            JOptionPane.showMessageDialog(null, "Not able to Registere for the Session", "Error", JOptionPane.ERROR_MESSAGE);
            
        }catch(RuntimeException RE){
            JOptionPane.showMessageDialog(null, "Not able to Registere for the Session", "Error", JOptionPane.ERROR_MESSAGE);
            
        }

        try{
             SendEmail email = new SendEmail();
             email.SendEmail(EmailId,SubjectLine,BodyMessage) ; 
             JOptionPane.showMessageDialog(null, "Successfully email registation confirmation", "Information", JOptionPane.INFORMATION_MESSAGE);
           
        }catch(RuntimeException RE){
             JOptionPane.showMessageDialog(null, "Not able to send registation confirmation.. Email server Down...", "Error", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_btn_RegisterActionPerformed

    private void txt_EmailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmailIdActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        WomanWorkAreaJPanel wwjp = (WomanWorkAreaJPanel) component;
        wwjp.populateSessionRegisterTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
       
    }//GEN-LAST:event_BackActionPerformed

    private void txt_FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FirstNameActionPerformed

    private void txt_LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LastNameActionPerformed

    private void tbl_RegisterSessionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_RegisterSessionMouseClicked
        txt_TrainingCode.setEnabled(false);
        txt_Location.setEnabled(false);
        txt_Startdate.setEnabled(false);
        txt_EndDate.setEnabled(false);
        DefaultTableModel model1= (DefaultTableModel) tbl_RegisterSession.getModel();
        int SelectedRowIndex= tbl_RegisterSession.getSelectedRow();
        
        txt_TrainingCode.setText(model1.getValueAt(SelectedRowIndex,0).toString());
        txt_Location.setText(model1.getValueAt(SelectedRowIndex, 2).toString());
        //jDateChooser_StartDate.setDateFormatString(model1.getValueAt(SelectedRowIndex, 4).toString());
        //jDateChooser_LastDate.setDateFormatString(model1.getValueAt(SelectedRowIndex, 4).toString());
        txt_Startdate.setText(model1.getValueAt(SelectedRowIndex, 4).toString());
        txt_EndDate.setText(model1.getValueAt(SelectedRowIndex, 5).toString());
    }//GEN-LAST:event_tbl_RegisterSessionMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton btn_Register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_FirstName;
    private javax.swing.JLabel lbl_lastname;
    private javax.swing.JLabel lbl_trainingCode;
    private java.awt.Panel panel1;
    private javax.swing.JTable tbl_RegisterSession;
    private javax.swing.JTextField txt_EmailId;
    private javax.swing.JTextField txt_EndDate;
    private javax.swing.JTextField txt_FirstName;
    private javax.swing.JTextField txt_LastName;
    private javax.swing.JTextField txt_Location;
    private javax.swing.JTextField txt_Startdate;
    private javax.swing.JTextField txt_TrainingCode;
    // End of variables declaration//GEN-END:variables
}
