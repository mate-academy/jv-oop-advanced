package core.basesyntax;

public class ColorSupplier {
    public static final int RANGE = 6;
    private static final String[] colors = {"violet", "blue", "green", "yellow", "orange", "red"};

    public static String assignColor() {
        return colors[(int) (Math.random() * RANGE)];
    }
}
