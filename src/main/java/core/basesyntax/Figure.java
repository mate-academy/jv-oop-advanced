package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {

    protected ColorSupplier.Color color;

    public Figure(ColorSupplier.Color color) {
        this.color = color;
    }

    public ColorSupplier.Color getColor() {
        return color;
    }
}
