/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author praty
 */
public class WomanSessionRegister extends WorkRequest{
    private String RegisterSession;
    private String FirstName;
    private String LastName;
    private String EmailId;
    private String TrainingCode;
    private String Location;
    //private String LastDay;
    private Date StartDate;
    private Date LastDate;
    //private String SubjectLine;
    //private String BodyMessage;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String EmailId) {
        this.EmailId = EmailId;
    }

    public String getTrainingCode() {
        return TrainingCode;
    }

    public void setTrainingCode(String TrainingCode) {
        this.TrainingCode = TrainingCode;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

   /* public String getLastDay() {
        return LastDay;
    }

    public void setLastDay(String LastDay) {
        this.LastDay = LastDay;
    }*/

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public Date getLastDate() {
        return LastDate;
    }

    public void setLastDate(Date LastDate) {
        this.LastDate = LastDate;
    }

   /* public String getSubjectLine() {
        return SubjectLine;
    }

    public void setSubjectLine(String SubjectLine) {
        this.SubjectLine = SubjectLine;
    }

    public String getBodyMessage() {
        return BodyMessage;
    }

    public void setBodyMessage(String BodyMessage) {
        this.BodyMessage = BodyMessage;
    }*/
    
    

    public String getRegisterSession() {
        return RegisterSession;
    }

    public void setRegisterSession(String RegisterSession) {
        this.RegisterSession = RegisterSession;
    }
    
    
    
}
