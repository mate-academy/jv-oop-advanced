package core.basesyntax;

/**
 * This class represents a right triangle that extends the abstract class Figure
 * and implements the methods from the interfaces FigureDraw and AreaCalculator.
 */
public class RightTriangle extends Figure {
    /**
     * The length of one of the triangle's first leg.
     */
    private int firstLeg;

    /**
     * The length of one of the triangle's second leg.
     */
    private int secondLeg;

    /**
     * Constructs a Right Triangle object with a given color and legs.
     * @param color the color of the right triangle
     * @param firstLeg  the length of one of the triangle's legs.
     * @param secondLeg the length of one of the triangle's legs.
     */
    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    /**
     * Calculates the area of the triangle.
     * @return the area of the triangle.
     */
    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    /**
     * Prints square's area, legs length, and color to the console.
     */
    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, first leg: "
                + firstLeg + ", second leg: " + secondLeg + ", color: " + getColor());
    }
}
