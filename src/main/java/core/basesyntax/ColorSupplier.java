package core.basesyntax;

public class ColorSupplier {
    private static final String[] COLORS = {"white", "black", "green", "red", "blue", "pink",
            "yellow", "orange", "lime", "brown"};

    public String getRandomColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }
}
