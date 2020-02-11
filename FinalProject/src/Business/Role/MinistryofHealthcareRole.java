/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;

import Business.Organization.MinistryOfHealthOrganization;
import Business.Organization.NGOOrganization;
import Business.Organization.Organization;
import Business.Organization.ReceptionistOrganization;
import Business.UserAccount.UserAccount;

import UserInterface.MinistryofHealthRole.MinistryOfHealthWorkAreaJPanel;
import UserInterface.NGORole.NGOWorkAreaJPanel;
import UserInterface.ReceptionistRole.ReceptionistWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author praty
 */
public class MinistryofHealthcareRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new MinistryOfHealthWorkAreaJPanel(userProcessContainer, account, (MinistryOfHealthOrganization)organization, enterprise, network);
     }
    
}
