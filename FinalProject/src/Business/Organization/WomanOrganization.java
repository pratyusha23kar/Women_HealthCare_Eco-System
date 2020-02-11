/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import Business.Role.WomanRole;
import Business.Role.WomanRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author prima
 */
public class WomanOrganization extends Organization{

    public WomanOrganization() {
        super(Organization.Type.Woman.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
      roles.add(new WomanRole());
        return roles;
    }
     
}