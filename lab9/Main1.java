class Shape {

    double area() {
        return 0;
    }
}

class Circle extends Shape {

    double r;

    Circle(double r) {
        this.r = r;
    }

    double area() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {

    double w, h;

    Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    double area() {
        return w * h;
    }
}

class Triangle extends Shape {

    double b, h;

    Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    double area() {
        return 0.5 * b * h;
    }
}

public class Main1 {

    public static void main(String[] args) {

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);
        Triangle t = new Triangle(5, 3);

        System.out.println("Circle area: " + c.area());
        System.out.println("Rectangle area: " + r.area());
        System.out.println("Triangle area: " + t.area());
    }
}