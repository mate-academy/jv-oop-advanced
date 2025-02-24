package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(Color color, double base1, double base2, double height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area =  %.1f sq. units, "
                + "first base = %.1f units, " + "second base = %.1f units, "
                + "height = %.1f units, color: %s%n",
                calculateArea(), base1, base2, height, getColor());
    }

    @Override
    public double calculateArea() {
        return 0.5 * (base1 + base2) * height;
    }
}
