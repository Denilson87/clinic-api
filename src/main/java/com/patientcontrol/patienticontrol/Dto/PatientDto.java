package com.patientcontrol.patienticontrol.Dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class PatientDto {
    @NotBlank
    @Size (max = 26)
    private String ConsultType;
    @NotBlank
    private String ConsultName;
    @NotBlank
    private String DoctorName;
    @NotBlank
    private String DateofConsult;
    @NotBlank
    private LocalDateTime registrationdate;

    public String getConsultType() {
        return ConsultType;
    }

    public void setConsultType(String consultType) {
        ConsultType = consultType;
    }

    public String getConsultName() {
        return ConsultName;
    }

    public void setConsultName(String consultName) {
        ConsultName = consultName;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }

    public String getDateofConsult() {
        return DateofConsult;
    }

    public void setDateofConsult(String dateofConsult) {
        DateofConsult = dateofConsult;
    }

    public LocalDateTime getRegistrationdate() {
        return registrationdate;
    }

    public void setRegistrationdate(LocalDateTime registrationdate) {
        this.registrationdate = registrationdate;
    }
}
