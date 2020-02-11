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
public class InsuranceEnterprise extends Enterprise {
    
    public InsuranceEnterprise(String name){
        super(name,EnterpriseType.Insurance);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    @Override
    public ArrayList<Type> getSupportedOrganizationType() {
        ArrayList<Type> types = new ArrayList<>();
        
        types.add(Type.Claims);
        types.add(Type.PolicyIssue);
        
        return types;
    }
}

