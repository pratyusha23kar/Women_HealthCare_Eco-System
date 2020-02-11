
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.WomanRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ClaimsOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.MinistryOfHealthOrganization;
import Business.Organization.NGOOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.Organization.PolicyIssueOrganization;
import Business.Organization.ReceptionistOrganization;
import Business.Organization.WomanOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.PatientAppointmentRequest;
import Business.WorkQueue.WomanClaimRequest;
import Business.WorkQueue.WomanComplaintRequest;

import Business.WorkQueue.WomanInsuranceRequest;
import Business.WorkQueue.WomanPrescriptionRequest;
import Business.WorkQueue.WomanSessionRegister;
import Business.WorkQueue.WorkRequest;

import UserInterface.DoctorRole.DoctorRequestLabTestJPanel;

import javax.swing.JPanel;
import java.awt.CardLayout;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prima
 */
public class WomanWorkAreaJPanel extends javax.swing.JPanel {
     private JPanel userProcessContainer;
    private WomanOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    
    private Network network;
    private EcoSystem business;
    /**
     * Creates new form PatientWorkAreaJPanel
     */
     public WomanWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = (WomanOrganization)organization;
        //this.organization = (MinistryOfHealthOrganization)organization;
       // this.enterprise = enterprise;
        this.userAccount = account;
        this.network=network;
        this.enterprise= enterprise;
        //valueLabel.setText(enterprise.getName());
       populateAppointmentRequestTable();
       populateInsuranceRequestTable();
       populateClaimsRequestTable();
       populateComplaintRequestTable();
      populatePrescriptionRequestTable();
      populateSessionRegisterTable();

    }
     
      public void populateAppointmentRequestTable(){
        DefaultTableModel model = (DefaultTableModel) AppointmentJTable.getModel();
        
        model.setRowCount(0); 
        Organization org = null;
        for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList())
        {
            for (Organization organization1 : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if (organization1 instanceof ReceptionistOrganization){                    
                    org = organization1; 
                    for (WorkRequest request : org.getWorkQueue().getWorkRequestList()){
                        if(request.getSender().getUsername().equals(userAccount.getUsername())){
                            Object[] row = new Object[4];
                            row[0] = request.getMessage();
                            row[1] = request.getReceiver();
                            row[2] = request.getStatus();
                            String result = ((PatientAppointmentRequest) request).getAppointmentStatus();
                            row[3] = result == null ? "Waiting" : result;
                            model.addRow(row);   
                        }
            
                    }
                    break;
                }
            }
        }
        
    }
      public void populateInsuranceRequestTable(){
          DefaultTableModel model = (DefaultTableModel) InsuranceJTable.getModel();
        
        model.setRowCount(0);      
        Organization org = null;

        for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList())
        {
        for (Organization organization1 : enterprise.getOrganizationDirectory().getOrganizationList())
        {
                if (organization1 instanceof PolicyIssueOrganization){                    
                    org = organization1;     
                   break;
            }
        }
        }
        
      for (WorkRequest request : org.getWorkQueue().getWorkRequestList()){
           
            Object[] row = new Object[4];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result1 = ((WomanInsuranceRequest) request).getInsuranceStatus();
            row[3] = result1 == null ? "Waiting" : result1;
            
            model.addRow(row);
      }
      }

        public void populateClaimsRequestTable(){
            DefaultTableModel model = (DefaultTableModel) claimJTable.getModel();
        
        model.setRowCount(0); 
        Organization org = null;
         for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList())
        {
        for (Organization organization1 : enterprise.getOrganizationDirectory().getOrganizationList())
        {
                if (organization1 instanceof ClaimsOrganization){                    
                    org = organization1;     
                   break;
            }
        }
        }
        for (WorkRequest request : org.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            if (request instanceof WomanClaimRequest) {
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((WomanClaimRequest) request).getClaimStatus();
            row[3] = result == null ? "Waiting" : result;
            
            model.addRow(row);
            }
        }
        }
        
        public void populateComplaintRequestTable(){
            DefaultTableModel model = (DefaultTableModel) grievancesJTable.getModel();

            model.setRowCount(0); 
            Organization org = null;
             for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList())
            {
            for (Organization organization1 : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                    if (organization1 instanceof MinistryOfHealthOrganization){                    
                        org = organization1;     
                       break;
                }
            }
            }
            for (WorkRequest request : org.getWorkQueue().getWorkRequestList()){
                Object[] row = new Object[4];
                row[0] = request.getMessage();
                row[1] = request.getReceiver();
                row[2] = request.getStatus();
                String result = ((WomanComplaintRequest) request).getComplaintStatus();
                row[3] = result == null ? "Waiting" : result;

                model.addRow(row);
            }
            
        }
        
        public void populatePrescriptionRequestTable(){
        DefaultTableModel model = (DefaultTableModel) prescriptionJTable.getModel();
        
        model.setRowCount(0); 
        Organization org = null;
         for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList())
        {
        for (Organization organization1 : enterprise.getOrganizationDirectory().getOrganizationList())
        {
                if (organization1 instanceof PharmacyOrganization){                    
                    org = organization1;     
                   break;
            }
        }
        }
         
        for (WorkRequest request : org.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            if (request instanceof WomanPrescriptionRequest) {
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((WomanPrescriptionRequest) request).getMedRequestStatus();
            row[3] = result == null ? "Waiting" : result;
            
            model.addRow(row);
        }
        }
    }
     
      public void populateSessionRegisterTable(){
            DefaultTableModel model = (DefaultTableModel) healthSessionJTable.getModel();

            model.setRowCount(0); 
            Organization org = null;
             for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList())
            {
            for (Organization organization1 : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                    if (organization1 instanceof NGOOrganization){                    
                        org = organization1;     
                       break;
                }
            }
            }
            for (WorkRequest request : org.getWorkQueue().getWorkRequestList()){
                Object[] row = new Object[4];
                //if (request instanceof WomanPrescriptionRequest) {
                row[0] = request.getMessage();
                row[1] = request.getReceiver();
                row[2] = request.getStatus();
                String result = ((WomanSessionRegister) request).getRegisterSession();
                row[3] = result == null ? "Waiting" : result;

                model.addRow(row);
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

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        bttn_requestAppointment = new javax.swing.JButton();
        bttn_requestPrescription = new javax.swing.JButton();
        bttn_SubmitClaim = new javax.swing.JButton();
        bttn_registerTraining = new javax.swing.JButton();
        bttn_applyInsurance = new javax.swing.JButton();
        panel3 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        prescriptionJTable = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        bttn_RegisterComplaint1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AppointmentJTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        claimJTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        InsuranceJTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        grievancesJTable = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        healthSessionJTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        panel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Receptionist Work Area");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(255, 255, 255));

        bttn_requestAppointment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/Save-as-icon.png"))); // NOI18N
        bttn_requestAppointment.setText("Request appointment ");
        bttn_requestAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_requestAppointmentActionPerformed(evt);
            }
        });

        bttn_requestPrescription.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/Save-as-icon.png"))); // NOI18N
        bttn_requestPrescription.setText("Request prescription");
        bttn_requestPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_requestPrescriptionActionPerformed(evt);
            }
        });

        bttn_SubmitClaim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/Save-as-icon.png"))); // NOI18N
        bttn_SubmitClaim.setText("Submit Medical Claim");
        bttn_SubmitClaim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_SubmitClaimActionPerformed(evt);
            }
        });

        bttn_registerTraining.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/Save-as-icon.png"))); // NOI18N
        bttn_registerTraining.setText("Register for Session");
        bttn_registerTraining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_registerTrainingActionPerformed(evt);
            }
        });

        bttn_applyInsurance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/Save-as-icon.png"))); // NOI18N
        bttn_applyInsurance.setText("Apply for Health Insurance");
        bttn_applyInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_applyInsuranceActionPerformed(evt);
            }
        });

        panel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Woman Dashboard");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        prescriptionJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Medicine Required", "Receiver", "Status", "Prescription Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        prescriptionJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prescriptionJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(prescriptionJTable);

        btnRefresh.setText("Refresh Tables");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Services");

        bttn_RegisterComplaint1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/Save-as-icon.png"))); // NOI18N
        bttn_RegisterComplaint1.setText("Register your Grievances");
        bttn_RegisterComplaint1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_RegisterComplaint1ActionPerformed(evt);
            }
        });

        AppointmentJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Reason for Appointment", "Receiver", "Status", "Appointment Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AppointmentJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AppointmentJTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(AppointmentJTable);

        claimJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Member ID", "Receiver", "Status", "Claim Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        claimJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                claimJTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(claimJTable);

        InsuranceJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Policy Name", "Receiver", "Status", "Policy Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        InsuranceJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsuranceJTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(InsuranceJTable);

        grievancesJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Complaint", "Receiver", "Status", "Complaint Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grievancesJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grievancesJTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(grievancesJTable);

        healthSessionJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Training Code", "Receiver", "Status", "Registration Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        healthSessionJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                healthSessionJTableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(healthSessionJTable);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setText("Register Health Session with NGO");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("Request Prescription from Pharmacy");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 153));
        jLabel14.setText("Request Appointment from Hospital");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setText("Register Grievances with Government");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 153));
        jLabel16.setText("Submit Medical Claim");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 153));
        jLabel17.setText("Apply for Health Insurance");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bttn_requestAppointment)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                                        .addComponent(bttn_registerTraining, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel14)
                                        .addComponent(jScrollPane3))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bttn_SubmitClaim)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bttn_RegisterComplaint1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bttn_requestPrescription, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bttn_applyInsurance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel17))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRefresh)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttn_requestAppointment)
                    .addComponent(bttn_requestPrescription))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttn_applyInsurance)
                    .addComponent(bttn_SubmitClaim))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel12))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttn_registerTraining)
                    .addComponent(bttn_RegisterComplaint1))
                .addGap(99, 99, 99))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttn_requestAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_requestAppointmentActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("WomanRequestAppointmentJPanel", new WomanRequestAppointmentJPanel(userProcessContainer, userAccount, enterprise, organization,network));
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_bttn_requestAppointmentActionPerformed

    private void bttn_registerTrainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_registerTrainingActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("WomanRegisterSessionJPanel", new WomanRegisterSessionJPanel(userProcessContainer, userAccount, enterprise, organization, network));
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_bttn_registerTrainingActionPerformed

    private void bttn_applyInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_applyInsuranceActionPerformed
        // TODO add your handling code here:
        
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("WomanRequestInsuranceJPanel", new WomanRequestInsuranceJPanel(userProcessContainer, userAccount, enterprise, organization, network));
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_bttn_applyInsuranceActionPerformed

    private void bttn_requestPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_requestPrescriptionActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("WomanRequestPrescriptionJPanel", new WomanRequestPrescriptionJPanel(userProcessContainer, userAccount, enterprise, organization,network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_bttn_requestPrescriptionActionPerformed

    private void prescriptionJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prescriptionJTableMouseClicked
       
    }//GEN-LAST:event_prescriptionJTableMouseClicked

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
          populatePrescriptionRequestTable();
          populateInsuranceRequestTable();
          populateClaimsRequestTable();
          populateComplaintRequestTable();
          populatePrescriptionRequestTable();
          populateSessionRegisterTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void AppointmentJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppointmentJTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AppointmentJTableMouseClicked

    private void claimJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_claimJTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_claimJTableMouseClicked

    private void InsuranceJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsuranceJTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_InsuranceJTableMouseClicked

    private void grievancesJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grievancesJTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_grievancesJTableMouseClicked

    private void healthSessionJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_healthSessionJTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_healthSessionJTableMouseClicked

    private void bttn_RegisterComplaint1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_RegisterComplaint1ActionPerformed
        // TODO add your handling code here:
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("WomanRegisterComplaintJPanel", new WomanRegisterComplaintJPanel(userProcessContainer, userAccount, enterprise, organization, network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_bttn_RegisterComplaint1ActionPerformed

    private void bttn_SubmitClaimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_SubmitClaimActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("WomanRequestClaimJPanel", new WomanRequestClaimJPanel(userProcessContainer, userAccount, enterprise, organization, network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_bttn_SubmitClaimActionPerformed


        
    // </editor-fold>                        

    /*private void bttn_FeedbackActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        
   // }                                             

    private void bttn_requestAppointmentActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
        
    }                                                       

    private void bttn_renewInsuranceActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
       
    }                                                   

    private void bttn_registerTrainingActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
        
    }                                                     

    private void bttn_applyInsuranceActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
        
    }    */                                               


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AppointmentJTable;
    private javax.swing.JTable InsuranceJTable;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton bttn_RegisterComplaint1;
    private javax.swing.JButton bttn_SubmitClaim;
    private javax.swing.JButton bttn_applyInsurance;
    private javax.swing.JButton bttn_registerTraining;
    private javax.swing.JButton bttn_requestAppointment;
    private javax.swing.JButton bttn_requestPrescription;
    private javax.swing.JTable claimJTable;
    private javax.swing.JTable grievancesJTable;
    private javax.swing.JTable healthSessionJTable;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private java.awt.Panel panel1;
    private java.awt.Panel panel3;
    private javax.swing.JTable prescriptionJTable;
    // End of variables declaration//GEN-END:variables
}