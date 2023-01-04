package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;
    private double leg;

    public IsoscelesTrapezoid(double base1, double base2, double height, Color color) {
        super(color);
        this.base1 = base1 < base1 ? base1 : base2;
        this.base2 = base2 > base1 ? base2 : base1;
        this.height = height;
        leg = Math.sqrt(height * height + Math.pow((base2 - base1) / 2, 2));
    }

    @Override
    public double getArea() {
        return height * (base1 + base2) / 2;
    }

    @Override
    public String toString() {
        return String.format("Figure: isosceles trapezoid, "
                + "area: %.1f sq.units, base1: %.1f units, base2: %.1f units,"
                + " height: %.1f units, leg: %.1f units, color: %s",
                getArea(), base1, base2, height, leg, getColor().name().toLowerCase());
    }

}
