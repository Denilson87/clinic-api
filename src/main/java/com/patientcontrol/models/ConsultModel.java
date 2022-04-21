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
  
	  
}
