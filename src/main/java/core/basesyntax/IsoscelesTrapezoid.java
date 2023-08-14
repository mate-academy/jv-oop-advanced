package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public IsoscelesTrapezoid(double sideA, double sideB, double sideC, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) / 2 * Math.sqrt(Math.pow(sideC, 2)
                - Math.pow((sideA - sideB), 2) / 4);
    }

    public String draw() {
        return "Figure: isoscelesTrapezoid, area: " + getArea() + " sq.units, sideA: "
                + sideA + " units, sideB: " + sideB + " units, sideC: " + sideC
                + " units, color: " + getColor();
    }
}
