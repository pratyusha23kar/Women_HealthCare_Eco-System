/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Enterprise.WomanEnterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author praty
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Claims.getValue())){
            organization = new ClaimsOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Ministry.getValue())){
            organization = new MinistryOfHealthOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.NGO.getValue())){
            organization = new NGOOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Nurse.getValue())){
            organization = new NurseOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Woman.getValue())){
            organization = new WomanOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.PolicyIssue.getValue())){
            organization = new PolicyIssueOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Receptionist.getValue())){
            organization = new ReceptionistOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
     public Organization deleteOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.remove(organization);
        }
        else if (type.getValue().equals(Type.Claims.getValue())){
            organization = new ClaimsOrganization();
            organizationList.remove(organization);
        }else if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.remove(organization);
        }else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.remove(organization);
        }else if (type.getValue().equals(Type.Ministry.getValue())){
            organization = new MinistryOfHealthOrganization();
            organizationList.remove(organization);
        }else if (type.getValue().equals(Type.NGO.getValue())){
            organization = new NGOOrganization();
            organizationList.remove(organization);
        }else if (type.getValue().equals(Type.Nurse.getValue())){
            organization = new NurseOrganization();
            organizationList.remove(organization);
        }else if (type.getValue().equals(Type.Woman.getValue())){
            organization = new WomanOrganization();
            organizationList.remove(organization);
        }else if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization();
            organizationList.remove(organization);
        }else if (type.getValue().equals(Type.PolicyIssue.getValue())){
            organization = new PolicyIssueOrganization();
            organizationList.remove(organization);
        }else if (type.getValue().equals(Type.Receptionist.getValue())){
            organization = new ReceptionistOrganization();
            organizationList.remove(organization);
        }
        return organization;
    }
    
     public boolean duplicateOrg(String name){
        
        boolean flag = false;
        for(Organization org : organizationList){
            
            if(name.equals(org.getName())){
               flag = true;  
            }
        }
        return flag;
    }
}