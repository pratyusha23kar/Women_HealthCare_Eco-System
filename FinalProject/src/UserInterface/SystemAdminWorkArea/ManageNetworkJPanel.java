/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Business.Constants;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount useraccount;
    Employee emp;
    /**
     *
     * Creates new form ManageNetworkJPanel
     */
    public ManageNetworkJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;
        
        populateLocation();
        //populateNetworkTable();
    }

    private void populateLocation(){
        DropDown_Location.removeAllItems();
        DropDown_Location.addItem("--Select--");
        ArrayList<String> duplocation = new ArrayList<>();
        for(Network network : system.getNetworkList()){
            if(!duplocation.contains(network.getLocation())){
                DropDown_Location.addItem(network.getLocation());
            }
            duplocation.add(network.getLocation());
        }
    }
    
    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) tbl_Network.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            if(!network.equals(null)){
                if(
                    (network.getLocation().equals(DropDown_Location.getSelectedItem().toString()))
                   ){
                    for(UserAccount useracount : network.getUserAccountDirectory().getUserAccountList()){
                        Object[] row = new Object[model.getColumnCount()];
                        row[0] = network;
                        row[1] = network.getLocation();
                        row[2] = useracount.getEmployee();
                        row[3] = useracount;
                        model.addRow(row);
                    }
                        if(network.getUserAccountDirectory().getUserAccountList().isEmpty()){
                            Object[] row = new Object[model.getColumnCount()];
                            row[0] = network;
                            row[1] = network.getLocation();
                            row[2] = "";
                            row[3] = "";
                            model.addRow(row);
                    }
                }
            }
            
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Network = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        DropDown_Location = new javax.swing.JComboBox();
        btn_update = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btn_Search = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(726, 422));

        tbl_Network.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Network Name", "Location", "Network User Name", "Network UserId"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_Network);

        jLabel2.setText("Location");

        DropDown_Location.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_update.setBackground(new java.awt.Color(255, 255, 255));
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/Save-as-icon.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_Delete.setBackground(new java.awt.Color(255, 255, 255));
        btn_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/Delete-icon.png"))); // NOI18N
        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/Go-back-icon.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btn_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/search-icon.png"))); // NOI18N
        btn_Search.setText("Search");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(DropDown_Location, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Search))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(158, 158, 158)
                        .addComponent(btn_Delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_update)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(DropDown_Location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Search))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btn_Delete)
                    .addComponent(btn_update))
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Manage Network");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel SystemAdminWorkArea = (SystemAdminWorkAreaJPanel) component;
        SystemAdminWorkArea.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
        populateNetworkTable();
    }//GEN-LAST:event_btn_SearchActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        int selectedRow = tbl_Network.getSelectedRow();
        
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, Constants.Selectrow_tblNetwork, "Error", JOptionPane.ERROR_MESSAGE);
        } else
        {
            Network network = (Network)tbl_Network.getValueAt(selectedRow, 0);
            if(tbl_Network.getValueAt(selectedRow, 3).equals("")){
                JOptionPane.showMessageDialog(null, "There is no Admin present for this Network to Update", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                UserAccount useraccount = (UserAccount)tbl_Network.getValueAt(selectedRow, 3);
                UpdateNetworkJPanel updatenetwork = new UpdateNetworkJPanel(userProcessContainer, network, useraccount);
                userProcessContainer.add("UpdateNetworkJPanel", updatenetwork);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
       
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        int selectedRow = tbl_Network.getSelectedRow();
        
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, Constants.Selectrow_tblNetwork, "Error", JOptionPane.ERROR_MESSAGE);
        } else
        {
            try{

                Network network = (Network)tbl_Network.getValueAt(selectedRow, 0);
                if(!tbl_Network.getValueAt(selectedRow, 3).equals("")){
                   useraccount = (UserAccount)tbl_Network.getValueAt(selectedRow, 3);
                }
                if(!tbl_Network.getValueAt(selectedRow, 2).equals("")){
                    emp = (Employee)tbl_Network.getValueAt(selectedRow, 2);
                }
                int selectionButton = JOptionPane.YES_NO_OPTION;
                int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete Network?? It will also delete Network Admin...","Warning",selectionButton);
                if(selectionResult == JOptionPane.YES_OPTION){
                    if(!tbl_Network.getValueAt(selectedRow, 3).equals("")){
                       network.getEmployeeDirectory().deleteEmployee(emp); 
                    }
                    if(!tbl_Network.getValueAt(selectedRow, 2).equals("")){
                        network.getUserAccountDirectory().deleteUserAccount(useraccount);
                    }
                    system.deleteNetwork(network);
                    populateNetworkTable();
                    populateLocation();
                }
            }
            catch(IndexOutOfBoundsException IO){
                JOptionPane.showMessageDialog(null, "Cannot Delete the Network", "Error", JOptionPane.ERROR_MESSAGE);
            }
            catch(NullPointerException n){
                JOptionPane.showMessageDialog(null, "Cannot Delete the Network", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox DropDown_Location;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Network;
    // End of variables declaration//GEN-END:variables
}
