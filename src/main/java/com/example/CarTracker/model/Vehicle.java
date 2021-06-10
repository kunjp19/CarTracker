package com.example.CarTracker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "vehicles")
public class Vehicle {
    private String vin;
    private String make;
    private String model;
    private int year;
    private int redlineRpm;
    private int maxFuelVolume;
    private Timestamp lastServiceData;

    public Vehicle(){

    }
    public Vehicle(String vin, String make, String model, int year, int redlineRpm, int maxFuelVolume, Timestamp lastServiceData) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
        this.redlineRpm = redlineRpm;
        this.maxFuelVolume = maxFuelVolume;
        this.lastServiceData = lastServiceData;
    }

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    public String getVin() {
        return vin;
    }

    @Column(name = "make", nullable = false)
    public String getMake() {
        return make;
    }

    @Column(name = "model_name", nullable = false)
    public String getModel() {
        return model;
    }

    @Column(name = "model_year", nullable = false)
    public int getYear() {
        return year;
    }

    @Column(name = "read", nullable = false)
    public int getRedlineRpm() {
        return redlineRpm;
    }

    @Column(name = "maxfuel_volume", nullable = false)
    public int getMaxFuelVolume() {
        return maxFuelVolume;
    }

    @Column(name = "last_service", nullable = false)
    public Timestamp getLastServiceData() {
        return lastServiceData;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRedlineRpm(int redlineRpm) {
        this.redlineRpm = redlineRpm;
    }

    public void setMaxFuelVolume(int maxFuelVolume) {
        this.maxFuelVolume = maxFuelVolume;
    }

    public void setLastServiceData(Timestamp lastServiceData) {
        this.lastServiceData = lastServiceData;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vin=" + vin +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", redlineRpm=" + redlineRpm +
                ", maxFuelVolume=" + maxFuelVolume +
                ", lastServiceData=" + lastServiceData +
                '}';
    }
}
