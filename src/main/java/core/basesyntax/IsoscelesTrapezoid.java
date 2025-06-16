package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double base1 = 12.0;
    private final double base2 = 8.0;
    private final double height = 5.0;

    @Override
    public double calculateArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public String toString() {
        return "Figure: IsoscelesTrapezoid, area: "
                + calculateArea() + " sq. units, base1: "
                + base1 + " units, base2: " + base2 + " units, height: "
                + height + " units, color: " + color;
    }
}
