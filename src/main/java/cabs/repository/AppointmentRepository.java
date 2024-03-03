package cabs.repository;

import cabs.domain.Appointment;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Appointment entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {}
