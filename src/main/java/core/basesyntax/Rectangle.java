package core.basesyntax;

public class Rectangle extends Figure {
    private double rectangularLength;
    private double rectangularWidth;

    public Rectangle(double firstSide, double secondSide, Colour colour) {
        if (firstSide > secondSide) {
            this.rectangularLength = firstSide;
            this.rectangularWidth = secondSide;
        } else {
            this.rectangularLength = secondSide;
            this.rectangularWidth = firstSide;
        }
        this.colour = colour;
        area = firstSide * secondSide;
    }

    public double getRectangularLength() {
        return rectangularLength;
    }

    public double getRectangularWidth() {
        return rectangularWidth;
    }

    public double getDiagonal() {
        return parsingValue(Math.sqrt(rectangularLength * rectangularWidth));
    }

    public double getPerimeter() {
        return parsingValue(Math.sqrt(2 * (rectangularLength + rectangularWidth)));
    }

    @Override
    public double getArea() {
        return parsingValue(area);
    }

    @Override
    public String toString() {
        return "Rectangle:" +
                " colour: " + colour +
                ", area: " + area +
                ", Length: " + rectangularLength +
                ", Width: " + rectangularWidth +
                ", diagonal: " + this.getDiagonal() + " units" +
                ", perimeter: " + this.getPerimeter() + " units";


    }
}
