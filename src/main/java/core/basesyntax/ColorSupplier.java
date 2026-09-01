package core.basesyntax;

public class ColorSupplier {
    public Color getRandomColor() {
        Color[] colors = Color.values();
        return colors[(int) (Math.random() * colors.length)];
    }
}

