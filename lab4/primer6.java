package lab4;
import java.util.Scanner;

public class primer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Доступ разрешён");
        } else {
            System.out.println("Доступ запрещён");
        }
    }
}
