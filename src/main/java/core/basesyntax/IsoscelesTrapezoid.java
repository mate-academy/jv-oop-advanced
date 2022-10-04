package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double sideA;
    private final double sideB;
    private final double height;

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2) * height;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, sideA: " + sideA + " units, sideB: "
                + sideB + " units, height: " + height + " units, color: " + color;
    }
}
