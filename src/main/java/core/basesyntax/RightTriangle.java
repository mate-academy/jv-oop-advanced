package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideOne;
    private double sideTwo;

    public RightTriangle(String color, double sideOne, double sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double getArea() {
        return sideOne * sideTwo / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: " + getArea()
                + " sq.units, sideOne: " + sideOne
                + " units, sideTwo: " + sideTwo
                + " units, color: " + color);
    }
}
