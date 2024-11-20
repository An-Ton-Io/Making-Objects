public class Main {
    public static void main(String[] args) {
        Car car = new Car(120, 50.5, 4);
        car.start();
        car.displayFuel();
        car.honk();

        Bicycle bicycle = new Bicycle(20, 0, true);
        bicycle.start();
        bicycle.displayFuel();
        bicycle.ringBell();
    }
}
public class Vehicle {
    protected int speed;
    private double fuel;

    public Vehicle(int speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    public void start() {
        System.out.println("Vehicle has started.");
    }

    public void stop() {
        System.out.println("Vehicle has stopped.");
    }

    public final void displayFuel() {
        System.out.println("Fuel level: " + fuel);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(int speed, double fuel, int numberOfDoors) {
        super(speed, fuel);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start() {
        System.out.println("Car has started.");
    }

    public void honk() {
        System.out.println("Beep Beep!");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
public class Bicycle extends Vehicle {
    private boolean hasBell;

    public Bicycle(int speed, double fuel, boolean hasBell) {
        super(speed, fuel);
        this.hasBell = hasBell;
    }

    @Override
    public void start() {
        System.out.println("Pedal away!");
    }

    public void ringBell() {
        if (hasBell) {
            System.out.println("Ring Ring!");
        } else {
            System.out.println("No bell to ring.");
        }
    }

    public boolean isHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }
}