package finaltestjava;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, Set<String>> phoneBook = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа Телефонная книга");

        while (true) {
            System.out.println("Введите имя и номер телефона в формате 'Имя Номер', или введите 'exit' для завершения:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length != 2) {
                System.out.println("Неверный формат ввода. Попробуйте снова.");
                continue;
            }

            String name = parts[0];
            String phoneNumber = parts[1];

            Set<String> numbers = phoneBook.getOrDefault(name, new HashSet<>());
            numbers.add(phoneNumber);
            phoneBook.put(name, numbers);
        }

        System.out.println("Результат:");

        // Сортируем записи по убыванию числа телефонов
        phoneBook.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
