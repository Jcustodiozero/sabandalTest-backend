package com.thesis.sabandal.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long appointmentid;

    private long patientid;
    private long dentistid;
    private long purposeid;
    private String session;
    private Date appointmentdate;
    private String status;
    private String purpose;
    private String firstname;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getAppointmentid() {
        return appointmentid;
    }

    public void setAppointmentid(long appointmentid) {
        this.appointmentid = appointmentid;
    }

    public long getPatientid() {
        return patientid;
    }

    public void setPatientid(long patientid) {
        this.patientid = patientid;
    }

    public long getDentistid() {
        return dentistid;
    }

    public void setDentistid(long dentistid) {
        this.dentistid = dentistid;
    }

    public long getPurposeid() {
        return purposeid;
    }

    public void setPurposeid(long purposeid) {
        this.purposeid = purposeid;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public Date getAppointmentdate() {
        return appointmentdate;
    }

    public void setAppointmentdate(Date appointmentdate) {
        this.appointmentdate = appointmentdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
