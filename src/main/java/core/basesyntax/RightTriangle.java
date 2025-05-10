package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideOne;
    private double sideTwo;

    public RightTriangle(String color, double sideOne, double sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    @Override
    public double calculateArea() {
        return (sideOne * sideTwo) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, "
                + "area: "
                + calculateArea()
                + " sq.units, side: "
                + sideOne
                + " units, side: "
                + sideTwo
                + " units, color: " + getColor());
    }
}
