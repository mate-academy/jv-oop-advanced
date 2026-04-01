package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    protected static final double HALF = 0.5;

    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
