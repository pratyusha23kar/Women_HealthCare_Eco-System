/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.UserAccount.UserAccountDirectory;
/**
 *
 * @author praty
 */
public class Network {
    private String name;
    private String location;
    private String headQuarters;
    private EnterpriseDirectory enterpriseDirectory;
    private UserAccountDirectory userAccountDirectory;
    public EmployeeDirectory employeeDirectory;
    private int iD;
    private static int count = 1;
    
    
    
    public Network(){
        this.enterpriseDirectory = new EnterpriseDirectory();
        this.employeeDirectory = new EmployeeDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
        this.iD = count;
        count++;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHeadQuarters() {
        return headQuarters;
    }

    public void setHeadQuarters(String headQuarters) {
        this.headQuarters = headQuarters;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    public boolean checkIfEnterpriseIsUnique(String EnterpriseName, String EnterpriseType){
        for (Enterprise enterprise : this.enterpriseDirectory.getEnterpriseList()){
            if (
                 (enterprise.getName().equals(EnterpriseName)) && (enterprise.getEnterpriseType().getValue().equals(EnterpriseType))
                )
                return false;
        }
        return true;
    }
    
    public void deleteEnterprise(Enterprise enterprise){
        this.getEnterpriseDirectory().getEnterpriseList().remove(enterprise);
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}