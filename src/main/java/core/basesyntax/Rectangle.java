package core.basesyntax;

public class Rectangle extends Figure {
    private double rectangularLength;
    private double rectangularWidth;

    public Rectangle(double firstSide, double secondSide, Colour colour) {
        super(colour);
        if (firstSide > secondSide) {
            this.rectangularLength = firstSide;
            this.rectangularWidth = secondSide;
        } else {
            this.rectangularLength = secondSide;
            this.rectangularWidth = firstSide;
        }
    }

    public double getRectangularLength() {
        return rectangularLength;
    }

    public double getRectangularWidth() {
        return rectangularWidth;
    }

    public double getDiagonal() {
        return Math.sqrt(rectangularLength * rectangularWidth);
    }

    public double getPerimeter() {
        return Math.sqrt(2 * (rectangularLength + rectangularWidth));
    }

    @Override
    public double getArea() {
        return rectangularLength * rectangularWidth;
    }

    @Override
    public String draw() {
        return String.format("Rectangle: Length: %.2f units, perimeter: %.2f units,"
                        + " area: %.2f units, color: %s, width: %.2f units, diagonal: %.2f.",
                rectangularLength, getPerimeter(), getArea(),
                getColour(), rectangularWidth, getDiagonal());
    }
}
