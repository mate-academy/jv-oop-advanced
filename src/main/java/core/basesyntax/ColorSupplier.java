package core.basesyntax;

public class ColorSupplier {
    public static String getRandomColor() {
        String letters = "0123456789ABCDEF";
        final int HEX_RADIX = 16;
        StringBuilder color = new StringBuilder();
        int random;
        for (int i = 0; i < 6; i++) {
            random = (int) (Math.random() * HEX_RADIX);
            color.append(letters.charAt(random));
        }
        return color.toString();
    }
}
