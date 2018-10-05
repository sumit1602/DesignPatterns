package com.company;

// the bridge pattern uses encapsulation, aggregation and can use inheritance to separate responsibilities
// decouples an abstraction from its implementation
// hides implementations details from clients
// two layers of abstraction
// useful when we want to avoid the permanent binding between abstraction and its implementation


//Implementor
interface Workshop{
    String WorkshopType();
}


//Concrete Implementor
class Produce implements Workshop{
    @Override
    public String WorkshopType() {
        return "Produce";
    }
}
//Concrete Implementor
class Assemble implements Workshop{
    @Override
    public String WorkshopType() {
        return "Assemble";
    }
}

//Abstraction
abstract class Vehicle{
    String type;
    Workshop workshop;

    public Vehicle(String type, Workshop workshop) {
        this.type = type;
        this.workshop = workshop;
    }
}
// Refined Abstraction
class Bike extends Vehicle{
    String specification;

    public Bike(Workshop workshop, String specification) {
        super("2 wheeler", workshop);
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "type='" + type + '\'' +
                ", workshop=" + workshop.WorkshopType() +
                ", specification='" + specification + '\'' +
                '}';
    }
}
class Bus extends Vehicle{
    int seats;

    public Bus(Workshop workshop, int seats) {
        super("4 Wheeler" ,workshop);
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "type='" + type + '\'' +
                ", workshop=" + workshop.WorkshopType() +
                ", seats=" + seats +
                '}';
    }
}


public class Q5BridgePattern {
    public static void main(String[] args) {

        Bike normal = new Bike(new Assemble(), "Regular");
        Bike avenger = new Bike(new Assemble(), "rangerover");
        System.out.println(avenger);
        System.out.println(normal);
        Bus bus = new Bus(new Produce(),44);
        System.out.println(bus);
    }

}
