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
        return (0.5 * (sideA + sideB)) * height;
    }

    @Override
    public void draw() {
        System.out.format("Figure: %s, area: %.1f sq.units, base1: %.1f units, "
                        + "base2: %.1f units, height: %.1f units, color: %s\n",
                "isosceles trapezoid", getArea(), sideA, sideB, height, getColor());
    }
}
