package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double leg;

    public IsoscelesTrapezoid(String color, double base1, double base2, double leg) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.leg = leg;
    }

    @Override
    public double getArea() {
        double height = Math.sqrt(leg * leg - Math.pow((base2 - base1) / 2, 2));
        return ((base1 + base2) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: isosceles trapezoid, area: %.2f sq. units, base1: %.2f units, "
                        + "base2: %.2f units, leg: %.2f units, color: %s%n",
                getArea(), base1, base2, leg, color);
    }
}



