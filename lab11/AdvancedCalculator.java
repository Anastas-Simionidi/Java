import java.util.Scanner;
import java.util.ArrayList;

public class AdvancedCalculator {

    // История вычислений
    private static ArrayList<String> history = new ArrayList<>();

    // Основные арифметические операции
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль");
            return 0;
        }
        return a / b;
    }

    // Операции с дополнительными функциями
    public static double power(double a, double b) { return Math.pow(a, b); }
    public static double sqrt(double a) { return Math.sqrt(a); }
    public static double percent(double a, double b) { return (a / 100) * b; }

    // Инженерные функции
    public static double sin(double a) { return Math.sin(Math.toRadians(a)); }
    public static double cos(double a) { return Math.cos(Math.toRadians(a)); }
    public static double tan(double a) { return Math.tan(Math.toRadians(a)); }

    // Операции с историей
    public static void addToHistory(String operation) {
        history.add(operation);
    }

    public static void showHistory() {
        if (history.isEmpty()) {
            System.out.println("История пуста.");
        } else {
            System.out.println("История вычислений:");
            for (String entry : history) {
                System.out.println(entry);
            }
        }
    }

    // Очистка экрана (имитация)
    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "yes";  // Инициализируем переменную choice, чтобы цикл выполнялся хотя бы один раз.

        do {
            clearScreen();
            System.out.println("Выберите операцию:");
            System.out.println("1 - Сложение");
            System.out.println("2 - Вычитание");
            System.out.println("3 - Умножение");
            System.out.println("4 - Деление");
            System.out.println("5 - Возведение в степень");
            System.out.println("6 - Квадратный корень");
            System.out.println("7 - Проценты");
            System.out.println("8 - Инженерные функции (sin, cos, tan)");
            System.out.println("9 - История вычислений");
            System.out.println("0 - Выход");

            int operationChoice = getIntInput("Введите номер операции: ", scanner);

            double num1, num2, result = 0;
            String operation = "";

            switch (operationChoice) {
                case 1:
                    num1 = getDoubleInput("Введите первое число: ", scanner);
                    num2 = getDoubleInput("Введите второе число: ", scanner);
                    result = add(num1, num2);
                    operation = num1 + " + " + num2 + " = " + result;
                    break;
                case 2:
                    num1 = getDoubleInput("Введите первое число: ", scanner);
                    num2 = getDoubleInput("Введите второе число: ", scanner);
                    result = subtract(num1, num2);
                    operation = num1 + " - " + num2 + " = " + result;
                    break;
                case 3:
                    num1 = getDoubleInput("Введите первое число: ", scanner);
                    num2 = getDoubleInput("Введите второе число: ", scanner);
                    result = multiply(num1, num2);
                    operation = num1 + " * " + num2 + " = " + result;
                    break;
                case 4:
                    num1 = getDoubleInput("Введите первое число: ", scanner);
                    num2 = getDoubleInput("Введите второе число: ", scanner);
                    result = divide(num1, num2);
                    operation = num1 + " / " + num2 + " = " + result;
                    break;
                case 5:
                    num1 = getDoubleInput("Введите основание: ", scanner);
                    num2 = getDoubleInput("Введите степень: ", scanner);
                    result = power(num1, num2);
                    operation = num1 + " ^ " + num2 + " = " + result;
                    break;
                case 6:
                    num1 = getDoubleInput("Введите число для извлечения квадратного корня: ", scanner);
                    result = sqrt(num1);
                    operation = "√" + num1 + " = " + result;
                    break;
                case 7:
                    num1 = getDoubleInput("Введите первое число: ", scanner);
                    num2 = getDoubleInput("Введите второе число: ", scanner);
                    result = percent(num1, num2);
                    operation = num1 + " % от " + num2 + " = " + result;
                    break;
                case 8:
                    System.out.println("Выберите функцию:");
                    System.out.println("1 - sin");
                    System.out.println("2 - cos");
                    System.out.println("3 - tan");
                    int trigChoice = getIntInput("Введите номер функции: ", scanner);

                    num1 = getDoubleInput("Введите угол (в градусах): ", scanner);

                    if (trigChoice == 1) {
                        result = sin(num1);
                        operation = "sin(" + num1 + ") = " + result;
                    } else if (trigChoice == 2) {
                        result = cos(num1);
                        operation = "cos(" + num1 + ") = " + result;
                    } else if (trigChoice == 3) {
                        result = tan(num1);
                        operation = "tan(" + num1 + ") = " + result;
                    }
                    break;
                case 9:
                    showHistory();
                    continue;
                case 0:
                    System.out.println("Выход из калькулятора.");
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
                    continue;
            }

            System.out.println("Результат: " + result);
            addToHistory(operation);

            System.out.println("Хотите выполнить еще одну операцию? (yes/no)");
            choice = scanner.next();

        } while (choice.equalsIgnoreCase("yes"));
    }

    public static int getIntInput(String prompt, Scanner scanner) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введено не целое число.");
            System.out.print(prompt);
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static double getDoubleInput(String prompt, Scanner scanner) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: введено не число.");
            System.out.print(prompt);
            scanner.next();
        }
        return scanner.nextDouble();
    }
}