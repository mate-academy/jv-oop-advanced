package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double baseA;
    private final double baseB;
    private final double height;

    public IsoscelesTrapezoid(double baseA, double baseB, double height, String color) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((baseA + baseB) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq. units, base1: "
                + baseA + " units, base2: " + baseB + " units, height: " + height
                + " units, color: " + color);
    }
}
