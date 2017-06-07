package com.company;

/**
 * Created by OT on 07/06/2017.
 */
public class MountainBike extends Bicycle {

    private String suspension;

    public MountainBike(int cadence, int speed, int gear, String suspension) {
        super(cadence, speed, gear);
        this.suspension = suspension;
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("The MountainBike has a " + getSuspension() + "suspension.");
    }
}
