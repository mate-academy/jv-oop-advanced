package core.basesyntax;

public class RightTriangle extends Figure {

    private double sideOne;
    private double sideTwo;

    public RightTriangle(String color, double sideOne, double sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public double getArea() {
        return getSideOne() * getSideTwo() * 0.5;
    }

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public String draw() {
        String returnLine = "Figure: right triangle, " + "area: " + getArea() + " sq. units, side one length: " +
                getSideOne() + " units, side two length: " + getSideTwo() + ", color: " + getColor();
        return returnLine;
    }
}
