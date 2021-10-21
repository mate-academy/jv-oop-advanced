package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int leg;

    public IsoscelesTrapezoid(String color, int baseA, int baseB, int leg) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.leg = leg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, base a: "
                + baseA + " units, base b: " + baseB + " units, leg: " + leg + " units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return (baseA + baseB) / 2 + Math.sqrt(leg * leg - Math.pow((baseA - baseB), 2) / 4);
    }
}
