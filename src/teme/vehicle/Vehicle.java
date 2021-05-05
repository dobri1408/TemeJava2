package teme.vehicle;

public class Vehicle {
    private int number_of_wheels;
    private String brand;
    private int type; //personal, for wor

    public void honk(){
        System.out.println("tit tit");
    }

    public Vehicle(int number_of_wheels, String brand, int type, int speed) {
        this.number_of_wheels = number_of_wheels;
        this.brand = brand;
        this.type = type;
    }

    public int getNumber_of_wheels() {
        return number_of_wheels;
    }

    public String getBrand() {
        return brand;
    }

    public int getType() {
        return type;
    }


    public void setNumber_of_wheels(int number_of_wheels) {
        this.number_of_wheels = number_of_wheels;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(int type) {
        this.type = type;
    }

}
