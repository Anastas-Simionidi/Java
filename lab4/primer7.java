package lab4;
import java.util.Scanner;

public class primer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 день");
            case 4, 6, 9, 11 -> System.out.println("30 дней");
            case 2 -> System.out.println("28 дней");
            default -> System.out.println("Неверный номер месяца");
        }
    }
}
