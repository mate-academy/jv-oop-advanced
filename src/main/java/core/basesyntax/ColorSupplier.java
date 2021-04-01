package core.basesyntax;

public class ColorSupplier {
    private String[] colors = {"RED", "ORANGE", "GREEN", "GRAY", "YELLOW"};

    public String getRandomColor() {
        return colors[(int)(Math.random() * colors.length)];
    }
}
