package core.basesyntax;

/**
 * This class represents a rectangle that extends the abstract class Figure
 * and implements the methods from the interfaces FigureDraw and AreaCalculator.
 */
public class Rectangle extends Figure {
    /**
     * The length of first of the rectangle's sides.
     */
    private double firstSide;

    /**
     * The length of second of the rectangle's sides.
     */
    private double secondSide;

    /**
     * Constructor a Rectangle object with a given color and sides length.
     * @param color the color of the rectangle.
     * @param firstSide the length of first side rectangle
     * @param secondSide the length of second side rectangle.
     */
    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    /**
     * Calculates the area of the rectangle.
     * @return the area of the rectangle.
     */
    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    /**
     * Prints rectangle's area, sides length, and color to the console.
     */
    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, first side: "
                + firstSide + " units, second side: " + " color: " + getColor());
    }
}
