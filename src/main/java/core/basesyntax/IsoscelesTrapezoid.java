package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int baseA;
    private final int baseB;
    private final int height;

    public IsoscelesTrapezoid(String color, int baseA, int baseB, int height) {
        super(color);
        super.setType("isosceles trapezoid");
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (baseA * baseB) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getType() + ", area: " + this.getArea()
                + " sq.units, baseA: " + this.baseA + " units, baseB: " + this.baseB
                + " units, height: " + this.height + " units, color: " + super.getColor());
    }
}
