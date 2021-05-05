package teme.vehicle;

public class Car extends Vehicle{
    private String model; // Model S
    private int speed;
    private int fuel;

    public Car(int number_of_wheels, String brand, int type, int speed, String model, int speed1, int fuel) {
        super(number_of_wheels, brand, type, speed);
        this.model = model;
        this.speed = speed1;
        this.fuel = fuel;
    }
    public Car(){
        super(0,"",0,0);
    }
}
