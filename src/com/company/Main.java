package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bicycle bicycle = new Bicycle(20, 10, 5);
        Bicycle mountainBike = new MountainBike(30, 20, 10, "Dual");
        Bicycle roadBike = new RoadBike(50, 89, 59, 232);

        System.out.println("///////////////////////////////////");
        bicycle.printDescription();
        System.out.println("///////////////////////////////////");
        mountainBike.printDescription();
        System.out.println("///////////////////////////////////");
        roadBike.printDescription();
        System.out.println("///////////////////////////////////");
    }
}
