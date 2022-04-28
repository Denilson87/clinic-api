package com.patientcontrol.patienticontrol.Controllers;

import com.patientcontrol.patienticontrol.Dto.PatientDto;
import com.patientcontrol.patienticontrol.Services.PatientService;
import com.patientcontrol.patienticontrol.models.Patient;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@RequestMapping("clinic/api/patients")
@CrossOrigin (origins = "*", maxAge = 3600)

public class PatientController {

    final PatientService patientService;

    private PatientController(PatientService patientService){
        this.patientService = patientService;
    }
    @PostMapping
    public ResponseEntity<Object> savePatient(@RequestBody @Valid PatientDto patientDto){

        var patient = new Patient();
        BeanUtils.copyProperties(patientDto, patient);
        patient.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(PatientService.save(patient));
    }
}
