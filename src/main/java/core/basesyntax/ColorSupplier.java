package core.basesyntax;

public class ColorSupplier {
    public static String getRandomColor() {
        String lettersStr = "0123456789ABCDEF";
        char[] letters = lettersStr.toCharArray();
        StringBuilder color = new StringBuilder();
        int random;
        for (int i = 0; i < 6; i++) {
            random = (int) (Math.random() * 16);
            color.append(letters[random]);
        }
        return color.toString();
    }
}
