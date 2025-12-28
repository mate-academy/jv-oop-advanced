package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private static final double DIVISOR = 2;
    private double baseA;
    private double baseB;
    private double height;

    public IsoscelesTrapezoid(double baseA, double baseB, double height, String color) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (baseA + baseB) / DIVISOR * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, baseA: " + baseA + " units, baseB: " + baseB + " units, height: "
                + height + " units, color: " + color);
    }
}
