package core.basesyntax;

public abstract class ColorSupplier {
    private static String [] colors = new String[] {"yellow",
            "black", "white", "blue", "green", "red", "orange", "cyan", "violet"};

    public static String colorGen() {
        return colors[(int)(Math.random() * 9)];
    }
}
