package com.patientcontrol.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="TB_Patient")
public class PatientModel implements Serializable {
	  private static final long serialVersionUID =1L;	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private UUID id;
	    @Column(nullable = false, unique = true, length = 10)
	    private String name;
	    @Column(nullable = false, unique = true, length = 7)
	    private String surname;
	    @Column(nullable = true,  unique = true, length = 70)
	    private String email;
	    @Column(nullable = false, length = 70)
	    private String date_birth;
	    @Column(nullable = false, length = 70)
	    private String phone;
	    @Column(nullable = false, length =70)
	    private String addres;
	    @Column(nullable = false)	    
	    private LocalDateTime registrationDate;
		public UUID getId() {
			return id;
		}
		public void setId(UUID id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getDate_birth() {
			return date_birth;
		}
		public void setDate_birth(String date_birth) {
			this.date_birth = date_birth;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAddres() {
			return addres;
		}
		public void setAddres(String addres) {
			this.addres = addres;
		}
		public LocalDateTime getRegistrationDate() {
			return registrationDate;
		}
		public void setRegistrationDate(LocalDateTime registrationDate) {
			this.registrationDate = registrationDate;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		    	    
	
}
