package core.basesyntax;

public class ColorSupplier {
    private static final String[] COLORS = new String[]{"Red", "Yellow", "Green"};

    public String getRandomColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }

}
