package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double baseA;
    private final double baseB;
    private final double height;

    public IsoscelesTrapezoid(String color, double baseA, double baseB, double height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double area() {
        return HALF * (baseA + baseB) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid,"
                + " area: " + area()
                + ", color: " + getColor()
                + ", baseA: " + baseA
                + ", baseB: " + baseB
                + ", height: " + height);
    }
}
