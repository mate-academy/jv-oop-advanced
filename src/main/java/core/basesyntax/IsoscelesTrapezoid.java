package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
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
        return (baseA + baseB) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, base a: " + baseA
                + " units, base b: " + baseB + " units, height: "
                + height + " units, area: " + getArea() + " sq. units, color: " + this.getColor());
    }
}
