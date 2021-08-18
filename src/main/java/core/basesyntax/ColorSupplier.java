package core.basesyntax;

public class ColorSupplier {
    private static String[] colors = new String[]{"yellow", "red", "blue", "green", "white"};

    public static String getRandomColor() {
        return colors[(int)(Math.random() * 5)];
    }
}
