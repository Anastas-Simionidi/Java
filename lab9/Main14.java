class Appliance {

    void operate() {
        System.out.println("Appliance working");
    }
}

class Refrigerator extends Appliance {}
class WashingMachine extends Appliance {}
class Microwave extends Appliance {}

public class Main14 {

    public static void main(String[] args) {

        Microwave m = new Microwave();
        m.operate();
    }
}