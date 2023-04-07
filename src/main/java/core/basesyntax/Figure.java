package core.basesyntax;

/**
 * Represents a figure that can be drawn and has a color and area.
 */
public abstract class Figure implements FigureDraw, AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void draw();

    public abstract double getArea();
}
