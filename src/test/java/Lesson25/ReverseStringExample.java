package Lesson25;

public class ReverseStringExample {
    public static void main(String[] args) {
        // Початковий рядок
        String originalString = "Hello, World!";

        // Перетворюємо рядок на масив символів
        char[] charArray = originalString.toCharArray();

        // Реверсуємо масив символів
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        // Створюємо новий рядок з масиву символів
        String reversedString = new String(charArray);

        // Виводимо результат
        System.out.println("Початковий рядок: " + originalString);
        System.out.println("Реверсований рядок: " + reversedString);
    }
}
