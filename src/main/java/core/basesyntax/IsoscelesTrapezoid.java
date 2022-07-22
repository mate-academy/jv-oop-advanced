package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double base1;
    private final double base2;
    private final double height;
    private final String color;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        this.color = color;
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (0.5 * (base2 + base1)) * height;
    }

    @Override
    public void draw() {
        System.out.format("Figure: %s, area: %.1f sq.units, base1: %.1f units, "
                        + "base2: %.1f units, height: %.1f units, color: %s\n",
                "isosceles trapezoid", getArea(), base1, base2, height, color);
    }
}
