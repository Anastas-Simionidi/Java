package lab4;
import java.util.Scanner;

public class primer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("Оценка: 5");
        } else if (score >= 75) {
            System.out.println("Оценка: 4");
        } else if (score >= 60) {
            System.out.println("Оценка: 3");
        } else {
            System.out.println("Оценка: 2");
        }
    }
}
