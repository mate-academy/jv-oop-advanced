package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
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
    public String toString() {
        return "Figure: isosceles trapezoid, area: " + calculateArea() + " sq. units, "
                + "base 1: " + base1 + " units, "
                + "base 2: " + base2 + " units, "
                + "height: " + height + " units, "
                + "color: " + getColor();
    }

    @Override
    public double calculateArea() {
        return 0.5 * (base1 + base2) * height;
    }

}
