package com.GrashCode;

/**
 * Created by Eric on 01/03/2017.
 */
public class Car extends Vehicle {

    private String make;
    private String model;
    private int handSteering;
    private int gears;
    private int currentGear;

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGean(int currentGears) {
        this.currentGear = currentGears;

    }

    public int getHandSteering() {
        return handSteering;
    }

    public void setHandSteering(int handSteering) {
        this.handSteering = handSteering;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String drive , int topSpeed, int horsePower, String make , String model , int handSteering , int gears) {
        super(drive,4, topSpeed, horsePower, "petrol");
        this.model = model;
        this.make = make;
    }



    public void shiftUp()
    {
        System.out.println("Gear shifted up");
        getCurrentGear();
        currentGear++;
    }

    public void shiftDown()
    {
        System.out.println("Gear shifted up");
        getCurrentGear();
        currentGear--;
    }

    public void showGear()
    {
        getCurrentGear();
        System.out.println("Car is in gear " + currentGear);
    }




}
