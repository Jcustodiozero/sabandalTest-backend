package com.thesis.sabandal.repository;

import com.thesis.sabandal.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    Appointment findById(long id);

}
