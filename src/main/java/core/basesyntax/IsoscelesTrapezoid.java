package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double trapezoidH;

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double trapezoidH) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.trapezoidH = trapezoidH;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) / 2 * trapezoidH;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB
                + " units, trapezoid height: " + trapezoidH
                + ", color: " + getColor();
    }
}
