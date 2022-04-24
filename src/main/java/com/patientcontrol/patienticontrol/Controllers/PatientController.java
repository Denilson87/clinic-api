package com.patientcontrol.patienticontrol.Controllers;

import com.patientcontrol.patienticontrol.Dto.PatientDto;
import com.patientcontrol.patienticontrol.Services.PatientService;
import com.patientcontrol.patienticontrol.models.Patient;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class PatientController {
    @PostMapping
    public ResponseEntity<Object> savePatient(@RequestBody @Valid PatientDto patientDto){

        var patient = new Patient();
        BeanUtils.copyProperties(patientDto, patient);
        patient.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(PatientService.save(patient));
    }
}
