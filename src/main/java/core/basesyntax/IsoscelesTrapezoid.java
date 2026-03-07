package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double base1;
    private final double base2;
    private final double height;

    public IsoscelesTrapezoid(Color color, double base1, double base2, double height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((base1 + base2) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, "
                + "area: %.1f sq. units, "
                + "base1: %.1f units, "
                + "base2: %.1f units, "
                + "height: %.1f units, "
                + "color: %s%n",
                getArea(), base1, base2, height, color);
    }
}
