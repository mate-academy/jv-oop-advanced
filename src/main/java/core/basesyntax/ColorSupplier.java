package core.basesyntax;

public class ColorSupplier {
    public enum Colors {
        white,
        black,
        blue,
        green,
        red
    }

    public static String getRandomColor() {
        Colors[] colors = Colors.values();
        return colors[(int) (Math.random() * colors.length)].name();
    }
}
