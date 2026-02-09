package lab4;
import java.util.Scanner;

public class primer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number >= 10 && number <= 50) {
            System.out.println("Число в диапазоне");
        } else {
            System.out.println("Число вне диапазона");
        }
    }
}
