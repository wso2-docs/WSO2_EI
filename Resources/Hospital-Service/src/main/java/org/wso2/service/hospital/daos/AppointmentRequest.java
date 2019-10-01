package org.wso2.service.hospital.daos;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by nadeeshaan on 7/20/16.
 */

@XmlRootElement
public class AppointmentRequest {
    private Patient patient;
    private String doctor;
    private String hospital;
    private String appointment_date;

    public AppointmentRequest(Patient patient, String doctor, String hospital, String appointment_date) {
        this.patient = patient;
        this.doctor = doctor;
        this.hospital = hospital;
        this.appointment_date = appointment_date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(String appointment_date) {
        this.appointment_date = appointment_date;
    }
}
