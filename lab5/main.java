package lab5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // =======================
        // Задание 1
        // =======================
        System.out.print("Задание 1. Введите N: ");
        int n1 = scanner.nextInt();

        System.out.println("Числа от 1 до N:");
        for (int i = 1; i <= n1; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // =======================
        // Задание 2
        // =======================
        System.out.print("Задание 2. Введите N: ");
        int n2 = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n2) {
            sum += i;
            i++;
        }

        System.out.println("Сумма от 1 до N: " + sum);
        System.out.println();

        // =======================
        // Задание 3
        // =======================
        System.out.print("Задание 3. Введите N: ");
        int n3 = scanner.nextInt();

        long factorial = 1;
        for (int j = 1; j <= n3; j++) {
            factorial *= j;
        }

        System.out.println("Факториал: " + factorial);
        System.out.println();

        // =======================
        // Задание 4
        // =======================
        System.out.println("Задание 4. Чётные числа от 1 до 100:");

        int k = 1;
        while (k <= 100) {
            if (k % 2 != 0) {
                k++;
                continue;
            }
            System.out.print(k + " ");
            k++;
        }
        System.out.println("\n");

        // =======================
        // Задание 5
        // =======================
        System.out.println("Задание 5. Вводите числа (0 для выхода):");

        int number;
        int total = 0;

        do {
            number = scanner.nextInt();
            total += number;
        } while (number != 0);

        System.out.println("Сумма введённых чисел: " + total);
        System.out.println();

        // =======================
        // Дополнительное задание
        // =======================
        System.out.println("Таблица умножения от 1 до 5:");

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print((row * col) + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}