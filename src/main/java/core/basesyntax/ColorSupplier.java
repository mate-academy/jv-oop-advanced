package core.basesyntax;

public class ColorSupplier {
    public Color getRandomColor() {
        return Color.values()[(int)(Math.random() * Color.values().length - 1)];
    }
}
