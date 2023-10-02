package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double trapezoidHeight;

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double trapezoidHeight) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.trapezoidHeight = trapezoidHeight;
    }

    @Override
    public double getArea() {
        return sideA + sideB / 2 * trapezoidHeight;
    }

    @Override
    public void draw() {
        System.out.println("Figure : isoscelesTrapezoid, area:"
                + getArea() + " sq.units, firstLeg: "
                + sideA + " units, secondLeg " + sideB
                + " units, trapezoidHeight: "
                + trapezoidHeight + " color " + getColor());
    }
}
