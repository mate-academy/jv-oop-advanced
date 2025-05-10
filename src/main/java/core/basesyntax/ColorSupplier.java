package core.basesyntax;

public class ColorSupplier {
    public static String getRandomColor() {
        String letters = "0123456789ABCDEF";
        final int HexRadix = 16;
        StringBuilder color = new StringBuilder();
        int random;
        for (int i = 0; i < 6; i++) {
            random = (int) (Math.random() * HexRadix);
            color.append(letters.charAt(random));
        }
        return color.toString();
    }
}
