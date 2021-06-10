package com.example.CarTracker.controller;

import javax.validation.Valid;
import com.example.CarTracker.model.Vehicle;
import com.example.CarTracker.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class VehicleController {

    @Autowired
    public VehicleRepository vehicleRepository;

    @GetMapping("/vehicles")
    public List<Vehicle> getAllVehicles(){
        return vehicleRepository.findAll();
    }

    @PostMapping("/vehicles")
    public Vehicle createVehicle(@Valid @RequestBody Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }
}
