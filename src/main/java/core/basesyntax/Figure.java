package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private static ColorSupplier supplier = new ColorSupplier();
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
