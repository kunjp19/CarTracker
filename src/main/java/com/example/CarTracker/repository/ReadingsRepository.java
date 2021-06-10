package com.example.CarTracker.repository;

import com.example.CarTracker.model.Readings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ReadingsRepository extends JpaRepository<Readings, Long> {
}
