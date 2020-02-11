/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ReportAnalysis;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.WorkQueue.PatientAppointmentRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author praty
 */
public class PercentagePatientDiseaseJpanel extends javax.swing.JPanel {

    /**
     * Creates new form PercentagePatientDisease
     */
    public JPanel userProcessContainer;
    //public EcoSystem system;
    public Network network;
    public Enterprise enterprise;
    public int TotalCount = 0;
    
    public PercentagePatientDiseaseJpanel(JPanel userProcessContainer, Network network, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        //this.system = system;
        this.network = network;
        this.enterprise = enterprise;
        //createChart();
        populateDisease();
    }

    public void populateDisease(){
        jComboBoxDisease.removeAllItems();
        jComboBoxDisease.addItem("--Select--");
        jComboBoxDisease.addItem("Breast Cancer");
        jComboBoxDisease.addItem("Cervical Cancer");
        jComboBoxDisease.addItem("Depression and Anxiety");
        jComboBoxDisease.addItem("Heart Problem");
    }
    
    private void createChart(String disease) {
        //DefaultPieDataset Piechartdata = new DefaultPieDataset();
        try{
          DefaultCategoryDataset barchartdata = new DefaultCategoryDataset();
        Map<Integer, Integer> WomenByAge = new HashMap<Integer, Integer>();
        
            for(Enterprise ent: network.getEnterpriseDirectory().getEnterpriseList()){
                if(ent.getEnterpriseType().getValue().equals("Woman")){
                    for(Organization org: ent.getOrganizationDirectory().getOrganizationList() ){
                        if(org.getName().equals("Woman Organization")){
                            for(WorkRequest request: org.getWorkQueue().getWorkRequestList()){
                                PatientAppointmentRequest patient = (PatientAppointmentRequest) request;
                                if(patient.getMessage().equals(disease)){
                                    int count = 0;
                                    if(patient.getAge().equals("")){
                                             patient.setAge("0");
                                    }
                                    if(WomenByAge.containsKey(Integer.parseInt((patient.getAge())))){
                                        count = WomenByAge.get(Integer.parseInt((patient.getAge())));
                                    }
                                    count = count + 1;
                                    WomenByAge.put(Integer.parseInt(patient.getAge()), count);
                                }
                                
                            }
                        }
                    }    
                }
            }
        for(Map.Entry<Integer, Integer> h : WomenByAge.entrySet()){
            TotalCount = TotalCount + h.getValue();
        } 
        for(Map.Entry<Integer, Integer> h : WomenByAge.entrySet()){
            //Piechartdata.setValue(h.getKey(),new Double((h.getValue()/TotalCount)*100));
            barchartdata.setValue(new Double((h.getValue()/TotalCount)*100),h.getKey(),h.getKey());
        } 
        
        //JFreeChart chart = ChartFactory.createPieChart("% Patient count per Disease", Piechartdata, true, true, false);
        //JFreeChart chart = ChartFactory.createPieChart3D(disease, Piechartdata)
        //PiePlot plot = (PiePlot) chart.getPlot();
        //ChartPanel piePanel = new ChartPanel(chart);
       
        JFreeChart barChart = ChartFactory.createBarChart("% Patient count per Disease","Woman Age","Percentage",barchartdata);
        ChartPanel barPanel = new ChartPanel(barChart);
        
        Dashboard_Panel.removeAll();
        Dashboard_Panel.setLayout(new java.awt.BorderLayout());
        Dashboard_Panel.add(barPanel, BorderLayout.CENTER);
        Dashboard_Panel.validate();  
        }catch(NullPointerException ne){
            
        }catch(NumberFormatException ne){
            
        }catch(RuntimeException re){
            
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

        btnReport = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxDisease = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Dashboard_Panel = new javax.swing.JPanel();
        btn_Back = new javax.swing.JButton();

        btnReport.setText("Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        jLabel1.setText("Disese");

        jComboBoxDisease.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patient Disease Report ( Percentage )");

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

        javax.swing.GroupLayout Dashboard_PanelLayout = new javax.swing.GroupLayout(Dashboard_Panel);
        Dashboard_Panel.setLayout(Dashboard_PanelLayout);
        Dashboard_PanelLayout.setHorizontalGroup(
            Dashboard_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Dashboard_PanelLayout.setVerticalGroup(
            Dashboard_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );

        btn_Back.setText("Back");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReport))
                    .addComponent(btn_Back))
                .addContainerGap(309, Short.MAX_VALUE))
            .addComponent(Dashboard_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxDisease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Dashboard_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(btn_Back))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        createChart(jComboBoxDisease.getSelectedItem().toString());
    }//GEN-LAST:event_btnReportActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btn_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dashboard_Panel;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btn_Back;
    private javax.swing.JComboBox jComboBoxDisease;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
