package com.GrashCode;

/**
 * Created by Eric on 01/03/2017.
 */
public class FordFiesta extends Car{

    private String radio;
    private int regNo;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public void features()
    {
        String radio = "";
        radio = "Full Fm/Am radio and speakers included";
        System.out.println("Features " + radio);
    }





    public FordFiesta() {
        super("Forward wheel drive", 145, 112, "Ford", "Fiesta" , 1 , 6);
        regNo = 1124456;



    }

    public void print()
    {
        System.out.println("Vehicle info:" + "\n" + "Drive: " + getDrive() + "\n" + "TopSpeed: "  +  getTopSpeed() +"\n" + "Horsepower: " + getHorsePower() +"\n" + "Make: " + getMake() +"\n" + "Model: " + getModel() +"\n") ;
    }

    public void regNo()
    {
        System.out.println("Current reg " + regNo);
    }

    public void showSpeed()
    {
        int i = 0;

        while(i == 0)
        {
            System.out.println("Current Speed is " + ((int) (Math.random() * getTopSpeed()))) ;
            i++;
        }
    }




}
