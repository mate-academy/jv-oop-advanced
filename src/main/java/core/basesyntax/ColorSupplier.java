package core.basesyntax;

public class ColorSupplier {
    private static final String[] COLORS = {"red", "blue", "green", "brown", "orange",
                                            "black", "orange", "pink", "yellow"};

    public String getRandomColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }
}
