package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(double base1, double base2, double height, String color) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((base1 + base2) / 2) * height;
    }
}