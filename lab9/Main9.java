package lab9;

class Product {

    double price;

    Product(double price) {
        this.price = price;
    }

    void showPrice() {
        System.out.println("Price: " + price);
    }
}

class Food extends Product {
    Food(double price) { super(price); }
}

class Electronics extends Product {
    Electronics(double price) { super(price); }
}

class Clothes extends Product {
    Clothes(double price) { super(price); }
}

public class Main9 {

    public static void main(String[] args) {

        Food food = new Food(10);
        food.showPrice();
    }
}