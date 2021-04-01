package core.basesyntax;

public class ColorSupplier {
    private static final String[] COLORS = {"RED", "ORANGE", "GREEN", "GRAY", "YELLOW"};

    public static String getRandomColor() {
        return COLORS[(int)(Math.random() * COLORS.length)];
    }
}
