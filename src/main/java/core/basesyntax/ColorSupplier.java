package core.basesyntax;

public class ColorSupplier {
    public static Color getRandomColor() {
        return Color.values()[(int) (Math.random() * Color.values().length)];
    }
}
