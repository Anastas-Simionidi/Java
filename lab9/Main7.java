package lab9;

class Vehicle {

    void startEngine() {
        System.out.println("Engine started");
    }
}

class Bike extends Vehicle {}
class Bus extends Vehicle {}
class Taxi extends Vehicle {}

public class Main7 {

    public static void main(String[] args) {

        Taxi taxi = new Taxi();
        taxi.startEngine();
    }
}