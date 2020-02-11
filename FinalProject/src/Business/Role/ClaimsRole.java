/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;


import Business.Organization.Organization;
import Business.Organization.ClaimsOrganization;
import Business.UserAccount.UserAccount;


import UserInterface.ClaimsRole.ClaimsWorkAreaJPanel;

import javax.swing.JPanel;

/**
 *
 * @author praty
 */
public class ClaimsRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new ClaimsWorkAreaJPanel(userProcessContainer, account, (ClaimsOrganization)organization, enterprise,network);
     }
    
    
}
