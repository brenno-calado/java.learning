package chapter4;
public class Vehicle {
    int passengers, fuelcap, mpg;

    Vehicle(int passengers, int fuelcap, int mpg) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }

    Vehicle () {}

    int range() {
        return fuelcap * mpg;
    }

    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}