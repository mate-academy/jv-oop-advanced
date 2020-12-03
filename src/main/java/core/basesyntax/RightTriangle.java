package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideOne;
    private double sideTwo;

    public RightTriangle(double sideOne, double sideTwo, Colour colour) {
        super(colour);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
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
        return String.format("RightTriangle: cathetus one: %.2f units, perimeter: %.2f units,"
                        + " area: %.2f units, color: %s, cathetus two: %.2f units,"
                        + " Hypotenuse: %.2f.",
                sideOne, getPerimeter(), getArea(),
                getColour(), sideTwo, getHypotenuse());
    }
}
