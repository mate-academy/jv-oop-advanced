package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double trapezoidHeight) {
        super(color);
    }

    @Override
    public double getAreaCalculator() {
        return getSideA() + getSideB() / 2 * getTrapezoidHeight();
    }

    @Override
    public String getDrawable() {
        return "Figure : isoscelesTrapezoid, area:" + getAreaCalculator() + " sq.units, firstLeg: "
                + getSideA() + " units, secondLeg " + getSideB() + " units, trapezoidHeight: "
                + getTrapezoidHeight() + " color " + getColor();

    }
}
