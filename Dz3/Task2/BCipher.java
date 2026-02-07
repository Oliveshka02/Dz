package Dz3.Task2;

class BCipher implements ICipher {

    @Override
    public String encode(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                boolean isUpper = Character.isUpperCase(c);
                char base = isUpper ? 'А' : 'а';
                int position = c - base;           // позиция в алфавите (0-31)
                int newPosition = 31 - position;   // симметричная позиция
                char newChar = (char) (base + newPosition);
                result.append(newChar);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    @Override
    public String decode(String text) {
        // Шифр симметричен: encode = decode
        return encode(text);
    }
}