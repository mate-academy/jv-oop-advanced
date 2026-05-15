package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int heightC;

    public IsoscelesTrapezoid(int baseA, int baseB, int heightC, String color) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.heightC = heightC;
    }

    @Override
    public double getArea() {
        return heightC * (baseA + baseB) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, base A:  " + baseA + " units, base B: "
                + baseB + " units, height: " + heightC + " units, area: "
                + getArea() + " sq. units, color: " + getColor());
    }
}
