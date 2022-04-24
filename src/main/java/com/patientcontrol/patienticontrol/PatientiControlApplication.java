package com.patientcontrol.patienticontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping
@RestController
public class PatientiControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientiControlApplication.class, args);
	}

	@GetMapping("/clinic/api/v1/patients")
    public String index(){
	    return "List of patients";
    }
}
