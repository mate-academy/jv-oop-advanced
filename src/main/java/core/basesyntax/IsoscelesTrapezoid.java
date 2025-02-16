package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int height;

    public IsoscelesTrapezoid(String color, int baseA, int baseB, int height) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
        setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea() + " sq. units, baseA: "
                + baseA + ", baseB: " + baseB + ", height: "
                + height + ", color: " + getColor() + ".");
    }

    @Override
    public double getArea() {
        return (baseA + baseB) * height / 2;
    }
}
