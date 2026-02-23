package lab6;
import java.util.Scanner;

public class Main {

    // Задание 1
    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    // Задание 2
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Задание 3 (перегрузка метода max)
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    // Задание 4 (рекурсивный факториал)
    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("Ошибка: факториал отрицательного числа не определён.");
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Задание 5 (рекурсивная степень)
    public static long power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ===== Задание 1 =====
        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();

        System.out.print("Введите высоту прямоугольника: ");
        double height = scanner.nextDouble();

        double area = rectangleArea(width, height);
        System.out.println("Площадь прямоугольника: " + area);

        // ===== Задание 2 =====
        System.out.print("\nВведите целое число для проверки чётности: ");
        int number = scanner.nextInt();

        if (isEven(number)) {
            System.out.println("Число " + number + " является чётным.");
        } else {
            System.out.println("Число " + number + " является нечётным.");
        }

        // ===== Задание 3 =====
        System.out.println("\nПерегрузка метода max:");
        System.out.println("max(10, 20) = " + max(10, 20));
        System.out.println("max(5.5, 2.3) = " + max(5.5, 2.3));

        // ===== Задание 4 =====
        System.out.print("\nВведите число для вычисления факториала: ");
        int n = scanner.nextInt();
        long fact = factorial(n);
        if (fact != -1) {
            System.out.println("Факториал числа " + n + " = " + fact);
        }

        // ===== Задание 5 =====
        System.out.print("\nВведите основание степени: ");
        int base = scanner.nextInt();
        System.out.print("Введите показатель степени: ");
        int exponent = scanner.nextInt();

        long result = power(base, exponent);
        System.out.println(base + " в степени " + exponent + " = " + result);

        scanner.close();
    }
}