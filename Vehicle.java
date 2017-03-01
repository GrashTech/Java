package com.GrashCode;

/**
 * Created by Eric on 01/03/2017.
 */
public class Vehicle {
    private String drive;
    private int wheels;
    private int topSpeed;
    private int HorsePower;
    private String fuel;

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public void setHorsePower(int horsePower) {
        HorsePower = horsePower;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Vehicle(String drive, int wheels, int topSpeed, int horsePower, String fuel) {
        this.drive = drive;
        this.wheels = wheels;
        this.topSpeed = topSpeed;
        HorsePower = horsePower;
        this.fuel = fuel;
    }

    public void speed(int topSpeed)
    {
        System.out.println("Speed called");
        System.out.println("Top Speed of " + topSpeed);
    }


}
