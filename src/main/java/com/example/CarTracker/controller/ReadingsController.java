package com.example.CarTracker.controller;

import javax.validation.Valid;
import com.example.CarTracker.model.Readings;
import com.example.CarTracker.repository.ReadingsRepository;
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
public class ReadingsController {

    @Autowired
    public ReadingsRepository readingsRepository;

    @GetMapping("/readings")
    public List<Readings> getAllReadings(){
        return readingsRepository.findAll();
    }

    @PostMapping("/readings")
    public Readings createReadings(@Valid @RequestBody Readings readings) {
        return readingsRepository.save(readings);
    }
}

