package core.basesyntax;

public class ColorSupplier {
    private static final String[] colors = {"violet", "blue", "green", "yellow", "orange", "red"};

    public static String assignColor() {
        return colors[(int) (Math.random() * 6)];
    }
}
