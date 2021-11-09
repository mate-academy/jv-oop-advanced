package main.java.core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseA;
    private double baseB;
    private double height;

    public IsoscelesTrapezoid(String color, double baseA, double baseB, double height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (baseA + baseB) * height;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: " + getArea() + " sq.units, base a: "
                + baseA + " units, " + "base b: " + baseB + " units, height: " + height
                + " units, color: " + getColor();
    }
}
