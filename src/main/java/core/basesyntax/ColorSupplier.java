package core.basesyntax;

public class ColorSupplier {
    private static final String[] COLORS = {"red", "orange", "yellow", "green",
                                            "blue", "indigo", "violet"};

    public String getRandomColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }
}
