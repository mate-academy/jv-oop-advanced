package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final int base1;
    private final int base2;

    public IsoscelesTrapezoid(String color, int height, int base1, int base2) {
        super(color);
        this.height = height;
        this.base1 = base1;
        this.base2 = base2;
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %s sq.units, "
                + "height: %s units, base1: %s units, base2: %s units, color: %s%n",
                getArea(), height, base1, base2, getColor());
    }
}
