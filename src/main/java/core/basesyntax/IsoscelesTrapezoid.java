package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
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
        System.out.printf("Figure: trapezoid, area: %.2f sq. units, base1: %.2f units,"
                + " base2: %.2f units, height: %.2f units,"
                + " color: %s%n", getArea(), base1, base2, height, getColor());
    }
}
