package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    protected String getName() {
        return getClass().getSimpleName().toLowerCase();
    }

    protected static String formatValue(double val) {
        return String.format("%,.1f", val);
    }
}
