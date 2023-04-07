package core.basesyntax;

/**
 * This class represents a square that extends the abstract class Figure
 * and implements the methods from the interfaces FigureDraw and AreaCalculator.
 */
public class Square extends Figure {
    /**
     * The length of one of the square's sides.
     */
    private double sideLength;

    /**
     * Constructs a Square object with a given color and side length.
     * @param color the color of the square
     * @param sideLength the length of one of the square's sides
     */
    public Square(String color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    /**
     * Calculates the area of the square.
     * @return the area of the square.
     */
    @Override
    public double getArea() {
        return Math.pow(sideLength, 2);
    }

    /**
     * Prints square's area, side length, and color to the console.
     */
    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: "
                + sideLength + " units, color: " + getColor());
    }
}
