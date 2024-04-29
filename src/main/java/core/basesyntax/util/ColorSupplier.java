package core.basesyntax.util;

public class ColorSupplier {

    public static Colors getRandomColor() {
        int index = (int)(Math.random() * Colors.values().length);
        return Colors.values()[index];
    }
}
