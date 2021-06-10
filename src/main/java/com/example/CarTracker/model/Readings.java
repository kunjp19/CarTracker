package com.example.CarTracker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "readings")
public class Readings {
    private String vin;
    private float latitude;
    private float longitude;
    private Timestamp timestamp;
    private float fuelVolume;
    private int speed;
    private int engineHp;
    private boolean checkEngineLightOn;
    private boolean engineCoolantLow;
    private boolean cruiseControlOn;
    private int engineRpm;

    public  Readings(){
    }

    public Readings(String vin, float latitude, float longitude, Timestamp timestamp, float fuelVolume, int speed, int engineHp, boolean checkEngineLightOn, boolean engineCoolantLow, boolean cruiseControlOn, int engineRpm) {
        this.vin = vin;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timestamp = timestamp;
        this.fuelVolume = fuelVolume;
        this.speed = speed;
        this.engineHp = engineHp;
        this.checkEngineLightOn = checkEngineLightOn;
        this.engineCoolantLow = engineCoolantLow;
        this.cruiseControlOn = cruiseControlOn;
        this.engineRpm = engineRpm;
    }

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Column(name = "latitude", nullable = false)
    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    @Column(name = "longitude", nullable = false)
    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    @Column(name = "timestamp", nullable = false)
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Column(name = "fuel_volume", nullable = false)
    public float getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(float fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    @Column(name = "speed", nullable = false)
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Column(name = "enginehp", nullable = false)
    public int getEngineHp() {
        return engineHp;
    }

    public void setEngineHp(int engineHp) {
        this.engineHp = engineHp;
    }

    @Column(name = "engine_light", nullable = false)
    public boolean isCheckEngineLightOn() {
        return checkEngineLightOn;
    }


    public void setCheckEngineLightOn(boolean checkEngineLightOn) {
        this.checkEngineLightOn = checkEngineLightOn;
    }

    @Column(name = "engine_coolant", nullable = false)
    public boolean isEngineCoolantLow() {
        return engineCoolantLow;
    }

    public void setEngineCoolantLow(boolean engineCoolantLow) {
        this.engineCoolantLow = engineCoolantLow;
    }

    @Column(name = "cruise_control", nullable = false)
    public boolean isCruiseControlOn() {
        return cruiseControlOn;
    }

    public void setCruiseControlOn(boolean cruiseControlOn) {
        this.cruiseControlOn = cruiseControlOn;
    }

    @Column(name = "engine_rpm", nullable = false)
    public int getEngineRpm() {
        return engineRpm;
    }

    public void setEngineRpm(int engineRpm) {
        this.engineRpm = engineRpm;
    }
}



//        "tires": {
//        "frontLeft": 34,
//        "frontRight": 36,
//        "rearLeft": 29,
//        "rearRight": 34