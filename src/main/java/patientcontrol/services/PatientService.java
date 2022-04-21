package patientcontrol.services;
import org.springframework.stereotype.Service;

import patientcontrol.repositories.PatientRepository;

@Service
public class PatientService {

private final PatientRepository patientRepository;

public PatientService(PatientRepository patientRepository) {
	this.patientRepository = patientRepository;
}
	
}
