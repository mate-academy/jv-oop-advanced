package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double baseA;
    private final double baseB;
    private final double height;

    public IsoscelesTrapezoid(String color, int baseA, int baseB, int height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (baseA + baseB) / 2 * height;
    }

    @Override
    public void draw() {
        String name = "isosceles trapezoid";
        System.out.println("Figure: " + name + ", area: "
                + getArea() + " sq. units, baseA: " + baseA + " units, baseB: "
                + baseB + " units, height: " + height + " units, color: " + getColor());
    }
}
