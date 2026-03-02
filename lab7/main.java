package lab7;

import java.util.Arrays;
import java.util.Random;

public class main {

    static Random rand = new Random();

    public static void main(String[] args) {

        // 1. Сумма отрицательных A[20]
        int[] A1 = randomIntArray(20);
        int sumNegA1 = 0;
        for (int x : A1)
            if (x < 0) sumNegA1 += x;
        System.out.println("1) Сумма отрицательных A[20]: " + sumNegA1);

        // 2. Сумма положительных B[15]
        int[] B1 = randomIntArray(15);
        int sumPosB1 = 0;
        for (int x : B1)
            if (x > 0) sumPosB1 += x;
        System.out.println("2) Сумма положительных B[15]: " + sumPosB1);

        // 3. Произведение отрицательных A[12] (double)
        double[] A2 = randomDoubleArray(12);
        double prodNegA2 = 1;
        for (double x : A2)
            if (x < 0) prodNegA2 *= x;
        System.out.println("3) Произведение отрицательных A[12]: " + prodNegA2);

        // 4. Произведение положительных C[25]
        int[] C1 = randomIntArray(25);
        long prodPosC1 = 1;
        for (int x : C1)
            if (x > 0) prodPosC1 *= x;
        System.out.println("4) Произведение положительных C[25]: " + prodPosC1);

        // 5. Среднее D[17]
        int[] D1 = randomIntArray(17);
        double avgD1 = Arrays.stream(D1).average().orElse(0);
        System.out.println("5) Среднее D[17]: " + avgD1);

        // 6. A[10][10] → сумма отрицательных по строкам в B[10]
        int[][] A3 = randomMatrix(10, 10);
        int[] B2 = new int[10];
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                if (A3[i][j] < 0) B2[i] += A3[i][j];
        System.out.println("6) Суммы по строкам: " + Arrays.toString(B2));

        // 7. B[5][5] → сумма положительных по строкам в A[5]
        int[][] B3 = randomMatrix(5, 5);
        int[] A4 = new int[5];
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                if (B3[i][j] > 0) A4[i] += B3[i][j];
        System.out.println("7) Суммы по строкам: " + Arrays.toString(A4));

        // 8. A[12][6] → произведение отрицательных по столбцам
        int[][] A5 = randomMatrix(12, 6);
        for (int j = 0; j < 6; j++) {
            long prod = 1;
            for (int i = 0; i < 12; i++)
                if (A5[i][j] < 0) prod *= A5[i][j];
            System.out.println("8) Столбец " + j + ": " + prod);
        }

        // 9. C[5][5] → произведение положительных главной диагонали
        int[][] C2 = randomMatrix(5, 5);
        long prodDiag = 1;
        for (int i = 0; i < 5; i++)
            if (C2[i][i] > 0) prodDiag *= C2[i][i];
        System.out.println("9) Произведение диагонали: " + prodDiag);

        // 10. D[7][7] → среднее главной диагонали
        int[][] D2 = randomMatrix(7, 7);
        double sumDiag = 0;
        for (int i = 0; i < 7; i++)
            sumDiag += D2[i][i];
        System.out.println("10) Среднее диагонали: " + sumDiag / 7);

        // 11. A[25] → поменять max и min
        int[] A6 = randomIntArray(25);
        int min = Arrays.stream(A6).min().getAsInt();
        int max = Arrays.stream(A6).max().getAsInt();
        for (int i = 0; i < A6.length; i++) {
            if (A6[i] == min) A6[i] = max;
            else if (A6[i] == max) A6[i] = min;
        }
        System.out.println("11) После замены: " + Arrays.toString(A6));

        // 12. B[25] → сортировка
        int[] B4 = randomIntArray(25);
        Arrays.sort(B4);
        System.out.println("12) Отсортировано: " + Arrays.toString(B4));

        // 13. C[20] → среднее
        int[] C3 = randomIntArray(20);
        double avgC3 = Arrays.stream(C3).average().orElse(0);
        System.out.println("13) Среднее C[20]: " + avgC3);

        // 14. D[30] → сумма чётных и нечётных
        int[] D3 = randomIntArray(30);
        int even = 0, odd = 0;
        for (int x : D3)
            if (x % 2 == 0) even += x;
            else odd += x;
        System.out.println("14) Чётные: " + even + ", Нечётные: " + odd);

        // 15. Таблица 3x5 случайных < 10
        System.out.println("15) Таблица 3x5:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(rand.nextInt(10) + " ");
            System.out.println();
        }

        // 16. Метод maxX()
        int[] test = randomIntArray(10);
        System.out.println("16) Максимальный элемент: " + maxX(test));

        // 17. Строки
        String s1 = "Hello ";
        String s2 = "World";
        String s3 = "Java";
        String s4 = "test";
        String s5 = "test";

        if (s4.equals(s5))
            System.out.println("17) " + s1 + s2);
        else
            System.out.println("17) " + s1 + s3);
    }

    // ===== Методы =====

    static int[] randomIntArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = rand.nextInt(21) - 10;
        return arr;
    }

    static double[] randomDoubleArray(int n) {
        double[] arr = new double[n];
        for (int i = 0; i < n; i++)
            arr[i] = rand.nextDouble() * 20 - 10;
        return arr;
    }

    static int[][] randomMatrix(int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = rand.nextInt(21) - 10;
        return m;
    }

    static int maxX(int[] arr) {
        int max = arr[0];
        for (int x : arr)
            if (x > max) max = x;
        return max;
    }
}