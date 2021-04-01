package core.basesyntax;

public class ColorSupplier {
    private static final String[] COLORS = {"RED", "PINK", "BLACK", "GREEN"};

    public String getNewColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }
}
