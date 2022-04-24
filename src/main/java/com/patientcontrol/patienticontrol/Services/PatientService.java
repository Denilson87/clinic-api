package com.patientcontrol.patienticontrol.Services;

import com.patientcontrol.patienticontrol.Repositories.PatientRepository;
import com.patientcontrol.patienticontrol.models.Patient;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
public class PatientService {

    final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }
    @Transactional
    public Patient save(Patient parkingSpotModel) {
        return patientRepository.save(parkingSpotModel);
    }


}
