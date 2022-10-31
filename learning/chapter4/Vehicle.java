package chapter4;
public class Vehicle {
    int passengers, fuelcap, mpg;

    int range() {
        return fuelcap * mpg;
    }

    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}