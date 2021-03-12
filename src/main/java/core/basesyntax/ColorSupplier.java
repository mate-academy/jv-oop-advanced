package core.basesyntax;

public class ColorSupplier {
    private static final String[] COLORS = {
            "red", "blue", "green", "yellow",
            "purple", "pink", "orange", "brown",
            "black", "white", "gray", "gold", "silver",
            "navy", "blue", "sky blue", "lime",
            "green", "teal", "indigo", "magenta",
            "violet", "khaki", "salmon", "crimson",
            "lavender", "violet", "olive",
            "cyan", "maroon", "beige"
    };

    protected static String colorGenerator() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }
}
