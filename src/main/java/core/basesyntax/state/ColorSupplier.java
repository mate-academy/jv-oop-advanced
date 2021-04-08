package core.basesyntax.state;

public class ColorSupplier {
    private static String[] colors = {"blue", "red", "pink",
            "yellow", "brown", "gray",
            "orange", "white", "purple"};

    public static String getRandomColor() {
        return colors[(int)(Math.random() * colors.length)];
    }
}
