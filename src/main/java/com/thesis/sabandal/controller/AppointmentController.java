package com.thesis.sabandal.controller;

import com.thesis.sabandal.model.Appointment;
import com.thesis.sabandal.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/appointments")
@CrossOrigin(origins = {"http://localhost:4200"})
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping
    public List<Appointment> getAllAppointment(){
        return  appointmentService.getAllAppointment();
    }

    @GetMapping(value = "/{status}")
    public List<Appointment> getAppointmnetByStatus(@PathVariable String status){
        return appointmentService.getByStatus(status);
    }

    @DeleteMapping(value =  "/{id}")
    public Appointment deletAppointmentById(@PathVariable long id){
        return appointmentService.deleteAppointmentById(id);
    }

}
