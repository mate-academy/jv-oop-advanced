package core.basesyntax;

import core.basesyntax.suppliers.ColorSupplier;

public abstract class Figure implements FigureInterface {
    protected String color;

    public Figure() {
        color = ColorSupplier.DEFAULT_COLOR;
    }

    public Figure(String color) {
        this.color = color;
    }

    protected String getName() {
        return getClass().getSimpleName().toLowerCase();
    }

    protected static String formatValue(double val) {
        return String.format("%,.1f", val);
    }

    public abstract void draw();

    protected abstract double getArea();
}
