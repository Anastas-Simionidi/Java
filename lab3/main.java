package lab3;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // =========================
        // 1. Сумма и среднее двух чисел
        // =========================
        System.out.println("1. Сумма и среднее двух чисел");
        System.out.print("Введите a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите b: ");
        double b = scanner.nextDouble();

        double S1 = a + b;
        double M = (a + b) / 2;

        System.out.println("Сумма = " + S1);
        System.out.println("Среднее = " + M);
        System.out.println();


        // =========================
        // 2. Площадь и периметр прямоугольника
        // =========================
        System.out.println("2. Площадь и периметр прямоугольника");
        System.out.print("Введите сторону a: ");
        double sideA = scanner.nextDouble();
        System.out.print("Введите сторону b: ");
        double sideB = scanner.nextDouble();

        double S2 = sideA * sideB;
        double P = 2 * (sideA + sideB);

        System.out.println("Площадь = " + S2);
        System.out.println("Периметр = " + P);
        System.out.println();


        // =========================
        // 3. Площадь круга
        // =========================
        System.out.println("3. Площадь круга");
        System.out.print("Введите радиус r: ");
        double r = scanner.nextDouble();

        double pi = 3.14;
        double S3 = pi * r * r;

        System.out.println("Площадь круга = " + S3);
        System.out.println();


        // =========================
        // 4. Перевод Цельсия в Фаренгейт
        // =========================
        System.out.println("4. Перевод Цельсия в Фаренгейт");
        System.out.print("Введите температуру в °C: ");
        double C = scanner.nextDouble();

        double F = (9.0 / 5) * C + 32;

        System.out.println("Температура в °F = " + F);
        System.out.println();


        // =========================
        // 5. Расстояние при равномерном движении
        // =========================
        System.out.println("5. Расстояние при равномерном движении");
        System.out.print("Введите скорость v: ");
        double v = scanner.nextDouble();
        System.out.print("Введите время t: ");
        double t = scanner.nextDouble();

        double S4 = v * t;

        System.out.println("Расстояние = " + S4);
        System.out.println();


        // =========================
        // 6. Квадрат и куб числа
        // =========================
        System.out.println("6. Квадрат и куб числа");
        System.out.print("Введите число x: ");
        double x = scanner.nextDouble();

        double square = x * x;
        double cube = x * x * x;

        System.out.println("x^2 = " + square);
        System.out.println("x^3 = " + cube);

        scanner.close();
    }
}