package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double height;
    private final double baseA;
    private final double baseB;

    public IsoscelesTrapezoid(String color, double height, double baseA, double baseB) {
        super(color);
        this.height = height;
        this.baseA = baseA;
        this.baseB = baseB;
    }

    @Override
    public double getArea() {
        return (baseA + baseB) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + getArea() + " sq.units, baseA: " + baseA
                + " units, baseB: " + baseB
                + " units, height: "
                + height + " units,  color: " + color);
    }
}
