package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private final String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void drawFigure();

    public abstract double getArea();
}
