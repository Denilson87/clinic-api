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
		
	    	    
	
}
