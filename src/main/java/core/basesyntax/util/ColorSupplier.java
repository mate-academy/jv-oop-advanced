package core.basesyntax.util;

public class ColorSupplier {

    public Color getRandomColor() {
        int index = (int)(Math.random() * Color.values().length);
        return Color.values()[index];
    }
}
