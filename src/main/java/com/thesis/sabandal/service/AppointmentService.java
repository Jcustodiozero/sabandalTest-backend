package com.thesis.sabandal.service;

import com.thesis.sabandal.model.Appointment;
import com.thesis.sabandal.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    //get all appointment
    public List<Appointment> getAllAppointment(){
        return  appointmentRepository.findAll();
    }

    //get all appointment by status
    public List<Appointment> getByStatus(String status){
        List<Appointment> requestStatus = new ArrayList<>();
        List<Appointment> appointments = appointmentRepository.findAll();
        for (Appointment a: appointments){
            if (a.getStatus().equals(status)){
                requestStatus.add(a);
            }
        }
        return requestStatus;
    }

    public Appointment deleteAppointmentById(long id){
        Appointment app = appointmentRepository.findById(id);
        appointmentRepository.deleteById(id);
        return  app;
    }

}
