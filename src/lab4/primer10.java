package lab4;girt
import java.util.Scanner;

public class primer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char op = sc.next().charAt(0);

        switch (op) {
            case '+' -> System.out.println(a + b);
            case '-' -> System.out.println(a - b);
            case '*' -> System.out.println(a * b);
            case '/' -> {
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Деление на ноль невозможно");
                }
            }
            default -> System.out.println("Неверная операция");
        }
    }
}
