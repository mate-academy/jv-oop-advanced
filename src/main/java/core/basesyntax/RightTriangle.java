package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double sideA, double sideB, String color) {
        super(color);
        this.firstLeg = sideA;
        this.secondLeg = sideB;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    public void draw() {
        System.out.println("Figure: rightTriangle, area: " + getArea() + " sq.units, sideA: "
                + firstLeg + " units, sideB: " + secondLeg + " units, color: " + getColor());
    }
}
