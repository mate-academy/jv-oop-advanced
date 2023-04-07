package core.basesyntax;

/**
 * This class represents a circle that extends the abstract class Figure
 * and implements the methods from the interfaces FigureDraw and AreaCalculator.
 */
public class Circle extends Figure {
    /**
     * The length of radius of the circle.
     */
    private int radius;

    /**
     * Constructor a Circle object with a given color and radius.
     * @param color the color of the circle.
     * @param radius the radius of rhe circle.
     */
    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     * @return the area of the circle.
     */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Prints circle's area, radius, and color to the console.
     */
    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, radius: " + radius + ", color: " + getColor());
    }
}
