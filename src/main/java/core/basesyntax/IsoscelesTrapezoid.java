package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double leg;
    private double base1;
    private double base2;

    public IsoscelesTrapezoid(double leg, double base1, double base2, String color) {
        super("Isosceles trapezoid", color);
        this.leg = leg;
        this.base1 = base1;
        this.base2 = base2;
    }

    @Override
    public double getArea() {
        return ((base1 + base2) / 4) * Math.sqrt((4 * (leg * leg))
                - ((base1 - base2) * (base1 - base2)));
    }

    @Override
    public String draw() {
        return "Figure: " + getFigureName() + ", area: " + getArea() + " sq. units, base 1 length: "
                + base1 + " units, base 2 length: " + base2 + " units, leg length: "
                + leg + " units, color: " + getFigureColor();
    }
}
