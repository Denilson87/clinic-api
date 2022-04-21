package patientcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patientcontrol.models.PatientModel;

public interface PatientRepository extends JpaRepository<PatientModel, UUID>{

}
