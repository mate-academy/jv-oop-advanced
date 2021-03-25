package core.basesyntax;

public class ColorSupplier {
    private static final String[] COLORS = new String[] {"red", "orange",
            "yellow", "green", "blue", "violet", "pink", "black"};

    public static String randomColor() {
        return COLORS[(int)(Math.random() * COLORS.length)];
    }
}
