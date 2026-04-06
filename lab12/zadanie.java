import java.util.*;

public class zadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // 1. Длина строки
        System.out.println("Длина строки: " + input.length());

        // 2. Верхний и нижний регистр
        System.out.println("Верхний регистр: " + input.toUpperCase());
        System.out.println("Нижний регистр: " + input.toLowerCase());

        // 3. Подсчёт слов
        String[] words = input.trim().split("\\s+");
        System.out.println("Количество слов: " + words.length);

        // 4. Разворот каждого слова
        System.out.print("Разворот слов: ");
        for (String word : words) {
            System.out.print(new StringBuilder(word).reverse() + " ");
        }
        System.out.println();

        // 5. Поиск слова
        System.out.print("Введите слово для поиска: ");
        String search = scanner.nextLine();
        System.out.println("Содержит? " + input.contains(search));

        // 6. Замена слова
        System.out.print("Что заменить: ");
        String oldWord = scanner.nextLine();
        System.out.print("На что заменить: ");
        String newWord = scanner.nextLine();
        System.out.println("Результат: " + input.replace(oldWord, newWord));

        // 7. Палиндром
        String clean = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        System.out.println("Палиндром? " + clean.equals(reversed));

        // 8. Сравнение строк
        System.out.print("Введите строку для сравнения: ");
        String input2 = scanner.nextLine();
        System.out.println("Равны? " + input.equals(input2));

        // 9. Разделение строки
        System.out.print("Введите разделитель: ");
        String delimiter = scanner.nextLine();
        String[] parts = input.split(delimiter);
        System.out.println("Результат split:");
        for (String part : parts) {
            System.out.println(part);
        }

        // 10. Гласные и согласные
        int vowels = 0, consonants = 0;
        String vowelsStr = "aeiouаеёиоуыэюяAEIOUАЕЁИОУЫЭЮЯ";
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowelsStr.indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Гласные: " + vowels + ", согласные: " + consonants);

        // 11. Удаление пробелов
        System.out.println("Без пробелов: " + input.replaceAll("\\s+", ""));

        // 12. Самое длинное слово
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("Самое длинное слово: " + longest);

        // 13. Символы без пробелов
        System.out.println("Символов без пробелов: " + input.replaceAll("\\s+", "").length());

        // 14. startsWith
        System.out.print("Проверка startsWith (введите слово): ");
        String start = scanner.nextLine();
        System.out.println("Начинается? " + input.startsWith(start));

        // 15. endsWith
        System.out.print("Проверка endsWith (введите символ/строку): ");
        String end = scanner.nextLine();
        System.out.println("Заканчивается? " + input.endsWith(end));

        // 16. Полный разворот строки
        System.out.println("Перевёрнутая строка: " + new StringBuilder(input).reverse());

        // 17. Удалить цифры
        System.out.println("Без цифр: " + input.replaceAll("\\d", ""));

        // 18. Заменить гласные на *
        String replacedVowels = input.replaceAll("[aeiouаеёиоуыэюяAEIOUАЕЁИОУЫЭЮЯ]", "*");
        System.out.println("Гласные заменены: " + replacedVowels);

        // 19. Частота символов
        Map<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println("Частота символов:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 20. Только цифры?
        System.out.println("Только цифры? " + input.matches("\\d+"));

        scanner.close();
    }
}