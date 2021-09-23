package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private final String color = ColorSupplier.getRandomColor();

    public String getColor() {
        return color;
    }
}
