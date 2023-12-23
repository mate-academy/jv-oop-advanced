package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int baseA;
    private final int baseB;
    private final int height;

    public IsoscelesTrapezoid(String color, int baseA, int baseB, int height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (baseA + baseB) / 2.0 * height;
    }

    @Override
    public String toString() {
        return "Figure: isoscelesTrapezoid, area: "
                + getArea() + " sq. units, baseA: "
                + baseA + " units, baseB: "
                + baseB + " units, height: " + height
                + " units, color: " + getColor();
    }
}
