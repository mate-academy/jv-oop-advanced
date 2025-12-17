package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    protected double base1;
    protected double base2;
    protected double height;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base1 + base2) / 2 * height;
    }

    @Override
    public String getParameters() {
        return "base1: " + String.format("%.2f", base1) + " units, "
                + "base2: " + String.format("%.2f", base2) + " units, "
                + "height: " + String.format("%.2f", height) + " units";
    }
}
