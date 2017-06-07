package com.company;

import javax.swing.plaf.synth.SynthEditorPaneUI;

/**
 * Created by OT on 07/06/2017.
 */
public class RoadBike extends Bicycle {

    private int tireWidth;

    public RoadBike(int cadence, int speed, int gear, int tireWidth) {
        super(cadence, speed, gear);
        this.tireWidth = tireWidth;
    }

    public int getTireWidth() {
        return tireWidth;
    }

    public void setTireWidth(int tireWidth) {
        this.tireWidth = tireWidth;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("The Road Bike has " + getTireWidth() + " MM tires.");
    }
}
