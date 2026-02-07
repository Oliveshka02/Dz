package Dz3.Task2;

public class Main {
    public static void main(String[] args) {
        String text = "АБВГД";

        System.out.println("Исходный текст: " + text);
        System.out.println();

        // Тест шифра А
        System.out.println("=== ШИФР А (сдвиг на 1) ===");
        ACipher aCipher = new ACipher();
        String encodedA = aCipher.encode(text);
        System.out.println("Зашифровано: " + encodedA);
        System.out.println("Расшифровано: " + aCipher.decode(encodedA));

        System.out.println();

        // Тест шифра Б
        System.out.println("=== ШИФР Б (симметрия) ===");
        BCipher bCipher = new BCipher();
        String encodedB = bCipher.encode(text);
        System.out.println("Зашифровано: " + encodedB);
        System.out.println("Расшифровано: " + bCipher.decode(encodedB));
    }
}