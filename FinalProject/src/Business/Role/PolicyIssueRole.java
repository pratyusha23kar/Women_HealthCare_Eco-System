/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;


import Business.Organization.PolicyIssueOrganization;
import Business.Organization.Organization;
import Business.Organization.ReceptionistOrganization;
import Business.Organization.WomanOrganization;

import Business.UserAccount.UserAccount;
import UserInterface.PolicyIssueRole.PolicyIssueWorkAreaJPanel;

import UserInterface.WomanRole.WomanWorkAreaJPanel;

import javax.swing.JPanel;

/**
 *
 * @author praty
 */
public class PolicyIssueRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new PolicyIssueWorkAreaJPanel(userProcessContainer, account,(PolicyIssueOrganization)organization, enterprise,network);
     }
    
    
}
