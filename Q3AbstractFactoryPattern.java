package com.company;
// Q3. Implement Abstract Factory Pattern to create cars of different categories from different countries.



enum CarType{
    MINI,MICRO,LUXURY,PRIME;
}
enum Location{
    INDIA,USA,JAPAN,SINGAPORE;
}

abstract class Car{
    CarType carType;
    Location location;

    public Car(CarType carType, Location location) {
        this.carType = carType;
        this.location = location;
    }
    abstract void construct();

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", location=" + location +
                '}';
    }
}

class LuxuryCar extends Car{
    public LuxuryCar(Location location) {
        super(CarType.LUXURY, location);
    }

    @Override
    void construct() {
        System.out.println("Constructing Luxury Cars");
    }
}
class PrimeCar extends Car{
    public PrimeCar(Location location) {
        super(CarType.PRIME, location);
    }

    @Override
    void construct() {
        System.out.println("Constructing Prime Cars");
    }
}

class MiniCar extends Car{
    public MiniCar( Location location) {
        super(CarType.MINI, location);
    }

    @Override
    void construct() {
        System.out.println("Constructing Mini Cars");
    }
}

class MicroCar extends Car{
    public MicroCar(Location location) {
        super(CarType.MICRO, location);
    }

    @Override
    void construct() {
        System.out.println("Constructing Micro Cars");
    }
}

class IndianCarFactory{
   static Car carBuilder(CarType carType){
        Car car=null;
        switch (carType){
            case MINI:
                car = new MiniCar(Location.INDIA);
                break;
            case MICRO:
                car = new MicroCar(Location.INDIA);
                break;
            case PRIME:
                car = new PrimeCar(Location.INDIA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.INDIA);
                break;
        }
        return car;
    }
}

class UsaCarFactory{
   static Car carBuilder(CarType carType){
        Car car=null;
        switch (carType){
            case MINI:
                car = new MiniCar(Location.USA);
                break;
            case MICRO:
                car = new MicroCar(Location.USA);
                break;
            case PRIME:
                car = new PrimeCar(Location.USA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.USA);
                break;
        }
        return car;
    }
}

class JapanCarFactory{
    static Car carBuilder(CarType carType){
        Car car=null;
        switch (carType){
            case MINI:
                car = new MiniCar(Location.JAPAN);
                break;
            case MICRO:
                car = new MicroCar(Location.JAPAN);
            case PRIME:
                car = new PrimeCar(Location.JAPAN);
            case LUXURY:
                car = new LuxuryCar(Location.JAPAN);
        }
        return car;
    }
}

class SingaporeCarFactory{
   static Car carBuilder(CarType carType){
        Car car=null;
        switch (carType){
            case MINI:
                car = new MiniCar(Location.SINGAPORE);
                break;
            case MICRO:
                car = new MicroCar(Location.SINGAPORE);
                break;
            case PRIME:
                car = new PrimeCar(Location.SINGAPORE);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.SINGAPORE);
                break;
        }
        return car;
    }
}

class CarFactory{
    Car car;
    static Car carBuilder(CarType carType, Location location){
        Car car=null;
        switch (location){
            case INDIA:
                car = IndianCarFactory.carBuilder(carType);
                break;
            case USA:
                car = UsaCarFactory.carBuilder(carType);
                break;
            case JAPAN:
                car = JapanCarFactory.carBuilder(carType);
                break;
            case SINGAPORE:
                car = SingaporeCarFactory.carBuilder(carType);
                break;
        }
        return car;
    }
}
public class Q3AbstractFactoryPattern {
    public static void main(String[] args) {

        System.out.println(CarFactory.carBuilder(CarType.MICRO, Location.SINGAPORE));

    }
}
