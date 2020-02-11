/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author prima
 */
public class WomanPrescriptionRequest extends WorkRequest {
     private String medRequestStatus;
      private String firstName;
    private String lastName;
    private String medRequired;
    private String dateOfBirth;
    private String phone;
    
    private String insurance;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMedRequired() {
        return medRequired;
    }

    public void setMedRequired(String medRequired) {
        this.medRequired = medRequired;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setOnsurance(String Insurance) {
        this.insurance = Insurance;
    }

    public String getMedRequestStatus() {
        return medRequestStatus;
    }

    public void setMedRequestStatus(String medRequestStatus) {
        this.medRequestStatus = medRequestStatus;
    }

   
    
}
