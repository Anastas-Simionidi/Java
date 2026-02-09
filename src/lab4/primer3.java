package lab4;
import java.util.Scanner;

public class primer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Первое число больше");
        } else if (a < b) {
            System.out.println("Второе число больше");
        } else {
            System.out.println("Числа равны");
        }
    }
}
