package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private double base1;
    private double base2;
    private double heigth;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.heigth = height;
    }

    public double getArea() {
        return 0.5 * (base1 + base2) * heigth;
    }

    @Override
    public String describe() {
        return "IsoscelesTrapezoid " + getColor() + " base1: " + base1 + " base2: " + base2
                + " height: " + heigth + " area: " + getArea();
    }
}
