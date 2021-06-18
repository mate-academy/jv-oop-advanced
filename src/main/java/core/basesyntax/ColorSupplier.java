package core.basesyntax;

public class ColorSupplier {

    private static String [] colors = { "orange", "green", "black", "yellow", "red"};

    public static String getRandomColor() {
        return colors[(int)(Math.random() * colors.length)];
    }
}

