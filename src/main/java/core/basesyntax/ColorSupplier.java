package core.basesyntax;

public class ColorSupplier {

    private static String[] colors = {"RED", "ORANGE", "GREEN", "GRAY", "YELLOW"};

    public static String getRandomColor() {
        return colors[(int)(Math.random() * colors.length)];
    }
}
