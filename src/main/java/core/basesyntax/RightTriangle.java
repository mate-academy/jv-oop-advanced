package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double sideA, double sideB) {
        this.firstLeg = sideA;
        this.secondLeg = sideB;
    }

    public RightTriangle(double sideA, double sideB, String color) {
        super(color);
        this.firstLeg = sideA;
        this.secondLeg = sideB;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        toString();
    }

    @Override
    public String toString() {
        return "Figure: rightTriangle, area: " + getArea() + " sq.units, sideA: "
                + firstLeg + " units, sideB: " + secondLeg + " units, color: " + getColor();
    }
}
