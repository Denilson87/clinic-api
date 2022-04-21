package patientcontrol.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patientcontrol.models.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, UUID>{

}
