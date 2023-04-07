package core.basesyntax;

/**
 * This class represents an isosceles trapezoid that extends the abstract class Figure
 * and implements the methods from the interfaces FigureDraw and AreaCalculator.
 */
public class IsoscelesTrapezoid extends Figure {
    /**
     * The length of first of the isosceles trapezoid's sides.
     */
    private int firstSide;

    /**
     * The length of second of the isosceles trapezoid's sides.
     */
    private int secondSide;

    /**
     * The length of the isosceles trapezoid's height.
     */
    private int heightIsoscelesTrapezoid;

    /**
     * Constructs an Isosceles Trapezoid object with a given color, sides length, and height length.
     * @param color the color of the isosceles trapezoid.
     * @param firstSide the first side of the isosceles trapezoid.
     * @param secondSide the second side of the isosceles trapezoid.
     * @param heightIsoscelesTrapezoid the height of the isosceles trapezoid.
     */
    public IsoscelesTrapezoid(String color, int firstSide, int secondSide,
                              int heightIsoscelesTrapezoid) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.heightIsoscelesTrapezoid = heightIsoscelesTrapezoid;
    }

    /**
     * Calculates the area of the isosceles trapezoid.
     * @return the area of the isosceles trapezoid.
     */
    @Override
    public double getArea() {
        return (double) (firstSide + secondSide) / 2 * heightIsoscelesTrapezoid;
    }

    /**
     * Prints isosceles trapezoid's area, sides length, height length, and color to the console.
     */
    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, first side: " + firstSide
                + " units second side: " + secondSide
                + " units, height isosceles trapezoid: " + heightIsoscelesTrapezoid
                + " units, color: " + getColor());
    }
}
