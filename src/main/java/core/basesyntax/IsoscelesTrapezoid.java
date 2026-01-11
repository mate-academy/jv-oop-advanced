package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        super(color);
        if (base1 < 0) {
            this.base1 = 0;
        } else {
            this.base1 = base1;
        }
        if (base2 < 0) {
            this.base2 = 0;
        } else {
            this.base2 = base2;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    @Override
    public double getArea() {
        return (base1 + base2) / 2 * height;
    }

    @Override
    public String getFigureName() {
        return "isosceles trapezoid";
    }

    @Override
    public String getDetails() {
        return "base1: " + base1 + " units, "
                + "base2: " + base2 + " units,"
                + " height: " + height + " units";
    }
}
