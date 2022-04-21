package com.patientcontrol.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="TB_CONSULT")
public class ConsultModel implements Serializable{
	  private static final long serialVersionUID =1L;
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private UUID id;
	  @Column (nullable=false, length=50)
	  private String ConsultType;
	  @Column (nullable=false, length=50 )
	  private String ConsultName;
	  @Column (nullable=false, length=50)
	  private String DoctorName;
	  @Column (nullable=false, length=50)
	  private String DateofConsult;
	  @Column (nullable=false, length=50)
	  private LocalDateTime registrationdate;
	  
	  @OneToMany
	  private PatientModel patient;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

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

	public PatientModel getPatient() {
		return patient;
	}

	public void setPatient(PatientModel patient) {
		this.patient = patient;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	  
	  
  
	  
}
