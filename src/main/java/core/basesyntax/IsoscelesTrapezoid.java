package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private static final double HALF = 0.5;
    private final double base1;
    private final double base2;
    private final double height;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        super(color);
        double b1 = base1;
        double b2 = base2;
        double h = height;
        this.base1 = b1;
        this.base2 = b2;
        this.height = h;
    }

    @Override
    public double getArea() {
        return HALF * (base1 + base2) * height;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: isosceles trapezoid, area: %.2f sq. units, base1: %.2f units, base2: %.2f units, height: %.2f units, color: %s", getArea(), base1, base2, height, getColor()));
    }
}
