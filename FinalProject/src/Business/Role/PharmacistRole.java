/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.PharmacyOrganization;


import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.UserAccount.UserAccount;


import UserInterface.PharmacyRole.PharmacyWorkAreaJPanel;

import javax.swing.JPanel;

/**
 *
 * @author praty
 */
public class PharmacistRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new PharmacyWorkAreaJPanel(userProcessContainer, account, (PharmacyOrganization)organization, enterprise, network);
     }
    
    
    
}
