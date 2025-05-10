package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int baseA;
    private final int baseB;
    private final int height;

    public IsoscelesTrapezoid(int baseA, int baseB, int height, String color) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (baseA * baseB / 2.0) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea() + ", baseA: " + baseA
                + ", baseB: " + baseB + ", height: " + height + ", color: " + getColor());
    }
}
