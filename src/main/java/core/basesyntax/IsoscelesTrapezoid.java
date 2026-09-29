package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int height;

    public IsoscelesTrapezoid(String color, int baseA, int baseB,int height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;

    }

    @Override
    public double getAreaCalculator() {
        return (baseA + baseB) * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getAreaCalculator()
                + " sq. units, baseA: " + baseA + " units, baseB: "
                + baseB + " units, height: " + height + " units, color: "
                + getColor());
    }
}
