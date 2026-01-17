package core.basesyntax.figure;

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
        return (baseA + baseB) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: Isosceles Trapezoid, area: " + getArea() + " sq. units, "
                        + "height: " + height + " units,"
                        + " baseA: " + baseA + " units,"
                        + " baseB: " + baseB + " units,"
                        + " color: " + getColor());
    }
}
