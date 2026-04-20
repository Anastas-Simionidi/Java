package lab14;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== МЕНЮ ===");
            System.out.println("1 - Сумма от 1 до N");
            System.out.println("2 - Количество цифр");
            System.out.println("3 - Таблица умножения");
            System.out.println("4 - Максимальная цифра");
            System.out.println("5 - Палиндром");
            System.out.println("6 - Чётные цифры");
            System.out.println("7 - Случайные числа до 0");
            System.out.println("8 - Сумма до 0");
            System.out.println("9 - Проверка пароля");
            System.out.println("10 - Минимальное число");
            System.out.println("0 - Выход");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: sumToN(scanner); break;
                case 2: countDigits(scanner); break;
                case 3: multiplicationTable(scanner); break;
                case 4: maxDigit(scanner); break;
                case 5: palindrome(scanner); break;
                case 6: evenDigits(scanner); break;
                case 7: randomUntilZero(); break;
                case 8: sumUntilZero(scanner); break;
                case 9: passwordCheck(scanner); break;
                case 10: minNumber(scanner); break;
                case 0: System.out.println("Выход..."); break;
                default: System.out.println("Неверный выбор");
            }

        } while (choice != 0);
    }

    static void sumToN(Scanner scanner) {
        System.out.print("Введите N: ");
        int n = scanner.nextInt();
        int sum = 0, i = 1;

        do {
            sum += i;
            i++;
        } while (i <= n);

        System.out.println("Сумма: " + sum);
    }

    static void countDigits(Scanner scanner) {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int count = 0;

        do {
            number /= 10;
            count++;
        } while (number != 0);

        System.out.println("Цифр: " + count);
    }

    static void multiplicationTable(Scanner scanner) {
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int i = 1;

        do {
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;
        } while (i <= 10);
    }

    static void maxDigit(Scanner scanner) {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int max = 0;

        do {
            int digit = number % 10;
            if (digit > max) max = digit;
            number /= 10;
        } while (number > 0);

        System.out.println("Макс цифра: " + max);
    }

    static void palindrome(Scanner scanner) {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int original = number, reversed = 0;

        do {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        } while (number > 0);

        System.out.println(original == reversed ? "Палиндром" : "Не палиндром");
    }

    static void evenDigits(Scanner scanner) {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int count = 0;

        do {
            int digit = number % 10;
            if (digit % 2 == 0) count++;
            number /= 10;
        } while (number > 0);

        System.out.println("Чётных цифр: " + count);
    }

    static void randomUntilZero() {
        Random random = new Random();
        int number;

        do {
            number = random.nextInt(10);
            System.out.println(number);
        } while (number != 0);

        System.out.println("Стоп (0)");
    }

    static void sumUntilZero(Scanner scanner) {
        int number, sum = 0;

        do {
            System.out.print("Введите число (0 — выход): ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Сумма: " + sum);
    }

    static void passwordCheck(Scanner scanner) {
        String password;

        do {
            System.out.print("Введите пароль (>=6 символов): ");
            password = scanner.nextLine();
        } while (password.length() < 6);

        System.out.println("Пароль принят");
    }

    static void minNumber(Scanner scanner) {
        int number;
        int min = Integer.MAX_VALUE;

        do {
            System.out.print("Введите число (0 — выход): ");
            number = scanner.nextInt();

            if (number != 0 && number < min) {
                min = number;
            }
        } while (number != 0);

        System.out.println("Минимум: " + min);
    }
}