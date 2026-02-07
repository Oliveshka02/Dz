package Dz3.Task2;

class ACipher implements ICipher {

    @Override
    public String encode(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'А' : 'а';
                // Сдвигаем на 1 вверх (с учетом цикла)
                char newChar = (char) (base + (c - base + 1) % 32);
                result.append(newChar);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    @Override
    public String decode(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'А' : 'а';
                // Сдвигаем на 1 вниз
                char newChar = (char) (base + (c - base - 1 + 32) % 32);
                result.append(newChar);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
