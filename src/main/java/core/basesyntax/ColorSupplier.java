package core.basesyntax;

public class ColorSupplier {
    private static final String[] COLORS = {"red", "white", "blue", "orange", "purple", "green"};

    public String getRandomColor() {
        int index = (int) (Math.random() * COLORS.length);
        return COLORS[index];
    }
}
