/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.NGOOrganization;

import Business.Organization.WomanOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Woman;
import Business.Organization.WomanOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.NGORole.NGOWorkAreaJPanel;

import UserInterface.WomanRole.WomanWorkAreaJPanel;

import javax.swing.JPanel;

/**
 *
 * @author praty
 */
public class WomanRole extends Role {
    
    
   
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
       return new WomanWorkAreaJPanel(userProcessContainer,account,organization,enterprise,network);
  }

}
    

