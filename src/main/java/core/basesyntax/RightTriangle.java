package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideOne;
    private double sideTwo;

    public RightTriangle(double sideOne, double sideTwo, Colour colour) {
        super(colour);
        this.sideOne = parsingValue(sideOne);
        this.sideTwo = parsingValue(sideTwo);
    }

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public double getHypotenuse() {
        return Math.sqrt(sideOne * sideOne + sideTwo * sideTwo);
    }

    @Override
    public double getArea() {
        return (sideOne * sideTwo) / 2;
    }

    @Override
    public double getPerimeter() {
        return sideOne + sideTwo + getHypotenuse();
    }

    @Override
    public String draw() {
        return "RightTriangle: " +
                " colour: " + getColour() +
                ", area: " + parsingValue(getArea()) +
                ", cathetus one: " + parsingValue(sideOne) +
                ", cathetus two: " + parsingValue(sideTwo) +
                ", Hypotenuse: " + parsingValue(getHypotenuse()) + " units" +
                ", perimeter: " + parsingValue(getPerimeter()) + " units";
    }

}
