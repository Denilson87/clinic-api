package com.patientcontrol.patienticontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages ="com.patientcontrol.models")
public class PatientiControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientiControlApplication.class, args);
	}

}
