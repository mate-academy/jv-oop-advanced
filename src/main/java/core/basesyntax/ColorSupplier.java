package core.basesyntax;

public class ColorSupplier {
    private final String[] colors
        = new String[]{"blue", "yellow", "green", "grey", "pink", "orange"};
    private final double countNumber = colors.length;

    public String assignColor() {
        return colors[(int) (Math.random() * countNumber)];
    }
}
