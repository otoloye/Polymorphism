package com.company;

/**
 * Created by OT on 07/06/2017.
 */
public class Bicycle {

    private int cadence;
    private int speed;
    private int gear;

    public Bicycle(int cadence, int speed, int gear) {
        this.cadence = cadence;
        this.speed = speed;
        this.gear = gear;
    }

    public int getCadence() {
        return cadence;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void printDescription(){
        System.out.println("Bike is in gear " + getGear() + " and travelling at a speed of " + getSpeed());
    }
}
