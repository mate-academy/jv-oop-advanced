package core.basesyntax;

/**
 * Represents a figure that can be drawn and has a color and area.
 */
public abstract class Figure implements FigureDraw, AreaCalculator {
    private String color;

    /**
     * Creates a new Figure with the given color.
     * @param color the color of the figure
     */
    public Figure(String color) {
        this.color = color;
    }

    /**
     * Getter method for the color of the figure.
     * @return the color of the figure
     */
    public String getColor() {
        return color;
    }

    /**
     * Draws the figure.
     */
    public abstract void draw();

    /**
     * Calculates the area of the figure.
     * @return the area of the figure
     */
    public abstract double getArea();
}
