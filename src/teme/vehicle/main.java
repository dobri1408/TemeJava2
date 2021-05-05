package teme.vehicle;

public class main {
    public static  void main(String [] args){
        Car myPersonalCar = new Car(4,"d",1,2,"2",2,2);
        Car newCar = new Car();
        myPersonalCar.honk();
        newCar.honk();
    }
}
