package chapter4;

public class CompFuel {
    public static void main(String[] args) {
        int distMiles = 252;

        Vehicle minivan = new Vehicle();
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        minivan.passengers = 7;

        Vehicle sportscar = new Vehicle();
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;
        sportscar.passengers = 2;

        System.out.println("To go " + distMiles + " miles, a minivan needs " + minivan.fuelNeeded(distMiles) + " gallons of fuel.");
        System.out.println("To go " + distMiles + " miles, a sportscar needs " + sportscar.fuelNeeded(distMiles) + " gallons of fuel.");
    }
}
