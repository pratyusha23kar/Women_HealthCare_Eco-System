/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

public abstract class Role {
    private RoleType roletype;
    
    public enum RoleType{
        NGO("NGO"),
        MinistryofHealthCare("ministryofHealthCare"),
        Doctor("Doctor"),
        Nurse("Nurse"),
        Receptionist("Receptionist"),
        LabAssistant("LabAssistant"),
        Patient("Patient"),
        Pharmacist("Pharmacist"),
        Insurance("Insurance"),
        PolicyIssue("PolicyIssue"),
        Claim("Claim"),
        SystemAdminRole("SystemAdminRole"),
        NetworkAdminRole("NetworkAdminRole"),
        EnterpriseAdminRole("EnterpriseAdminRole"),
        OrganizationAdminRole("OrganizationAdminRole");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem business,
            Network network);

    public RoleType getRoletype() {
        return roletype;
    }

    public void setRoletype(RoleType roletype) {
        this.roletype = roletype;
    }

    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}