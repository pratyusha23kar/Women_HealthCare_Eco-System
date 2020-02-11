/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author prima
 */
public class WomanEnterprise extends Enterprise {
    
    public WomanEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Woman);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    @Override
    public ArrayList<Type> getSupportedOrganizationType() {
        ArrayList<Type> types = new ArrayList<>();
        
        types.add(Type.Woman);
       
        
        return types;
    }
}