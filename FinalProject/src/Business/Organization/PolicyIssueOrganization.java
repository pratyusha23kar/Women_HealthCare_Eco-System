/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PolicyIssueRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author prima
 */
public class PolicyIssueOrganization extends Organization{

    public PolicyIssueOrganization() {
        super(Organization.Type.PolicyIssue.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PolicyIssueRole());
        return roles;
    }
     
}
