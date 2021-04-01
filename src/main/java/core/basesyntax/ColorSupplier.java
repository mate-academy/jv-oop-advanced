package core.basesyntax;

public class ColorSupplier {
    private static final String[] colors = {"violet", "blue", "green", "yellow", "orange", "red"};

    public String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}
