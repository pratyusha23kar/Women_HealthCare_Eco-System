/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MinistryofHealthcareRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author prima
 */
public class MinistryOfHealthOrganization extends Organization{

    public MinistryOfHealthOrganization() {
        super(Organization.Type.Ministry.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MinistryofHealthcareRole());
        return roles;
    }
     
}
