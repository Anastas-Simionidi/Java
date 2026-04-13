import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {

    static class Student {
        String name;
        int age;
        double grade;

        Student(String name, int age, double grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        public String toString() {
            return name + " (" + age + ", " + grade + ")";
        }
    }

    public static void main(String[] args) {

        // Задание 1
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println("1: " + sum.apply(5, 3));

        // Задание 2
        Function<String, String> toUpper = s -> s.toUpperCase();
        System.out.println("2: " + toUpper.apply("hello"));

        // Задание 3
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> odd = numbers.stream()
                .filter(n -> n % 2 != 0)
                .toList();
        System.out.println("3: " + odd);

        // Задание 4
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .toList();
        System.out.println("4: " + squares);

        // Задание 5
        int max = numbers.stream()
                .max(Comparator.naturalOrder())
                .orElseThrow();
        System.out.println("5: " + max);

        // Задание 6
        List<String> words = Arrays.asList("apple", "kiwi", "banana");
        words.sort(Comparator.comparingInt(String::length));
        System.out.println("6: " + words);

        // Задание 7
        Function<String, String> capitalize = s ->
                s.substring(0,1).toUpperCase() + s.substring(1);
        System.out.println("7: " + capitalize.apply("java"));

        // Задание 8
        List<String> longWords = words.stream()
                .filter(w -> w.length() > 5)
                .toList();
        System.out.println("8: " + longWords);

        // Задание 9
        System.out.println("9:");
        numbers.forEach(System.out::println);

        // Задание 10
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        System.out.println("10: " + min.orElse(0));

        // Задание 11
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("11: Hello Consumer");

        // Задание 12
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("12: " + randomSupplier.get());

        // Задание 13
        List<Student> students = Arrays.asList(
                new Student("Alex", 20, 85),
                new Student("Bob", 22, 75),
                new Student("Charlie", 20, 90)
        );

        students.sort(Comparator.comparing(s -> s.age));
        System.out.println("13: " + students);

        // Задание 14
        List<Student> filteredStudents = students.stream()
                .filter(s -> s.grade > 80)
                .sorted(Comparator.comparing(s -> s.name))
                .toList();
        System.out.println("14: " + filteredStudents);

        // Задание 15
        System.out.println("15:");
        students.stream()
                .filter(s -> s.grade > 70)
                .map(s -> s.name)
                .sorted()
                .forEach(System.out::println);

        // Задание 16
        Map<Integer, List<Student>> grouped =
                students.stream()
                        .collect(Collectors.groupingBy(s -> s.age));
        System.out.println("16: " + grouped);

        // Задание 17
        int total = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("17: " + total);

        // Задание 18
        List<Integer> distinct = Arrays.asList(1,2,2,3,3,4,5)
                .stream()
                .distinct()
                .limit(3)
                .toList();
        System.out.println("18: " + distinct);

        // Задание 19
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4)
        );

        List<Integer> flat = listOfLists.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println("19: " + flat);

        // Задание 20
        List<Integer> orders = Arrays.asList(500, 1500, 700, 2000);

        System.out.println("20:");
        orders.stream()
                .filter(o -> o > 1000)
                .sorted()
                .forEach(System.out::println);
    }
}