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
public class PharmacyMedicineDoctorWorkRequest extends WorkRequest {
    
    
    private String medicineRequest;
    private String firstName;
    private String lastName;
    private String medRequired;
    private String Diagnosis;

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

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String Diagnosis) {
        this.Diagnosis = Diagnosis;
    }
    

    public String getMedicineRequest() {
        return medicineRequest;
    }

    public void setMedicineRequest(String medicineRequest) {
        this.medicineRequest = medicineRequest;
    }

    
}
