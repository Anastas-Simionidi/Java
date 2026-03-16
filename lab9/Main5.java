package lab9;

class Device {

    String brand;
    int power;

    Device(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    void turnOn() {
        System.out.println(brand + " device is turned on.");
    }
}

class Laptop extends Device {

    Laptop(String brand, int power) {
        super(brand, power);
    }
}

class Smartphone extends Device {

    Smartphone(String brand, int power) {
        super(brand, power);
    }
}

class Tablet extends Device {

    Tablet(String brand, int power) {
        super(brand, power);
    }
}

public class Main5 {

    public static void main(String[] args) {

        Laptop l = new Laptop("HP", 65);
        l.turnOn();
    }
}