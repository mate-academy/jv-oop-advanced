package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double base1;
    private final double base2;
    private final double leg;

    public IsoscelesTrapezoid(double base1, double base2, double leg, String color) {
        super(color);
        if (base1 <= 0 || base2 <= 0 || leg <= 0) {
            throw new IllegalArgumentException("Base and legs must be greater than 0");
        }
        this.base1 = base1;
        this.base2 = base2;
        this.leg = leg;
    }

    @Override
    public double getArea() {
        double height = Math.sqrt(Math.pow(leg, 2)
                - Math.pow(Math.abs((base1 - base2) / 2), 2));
        return ((base1 + base2) / 2) * height;
    }

    @Override
    public String getTypeFigure() {
        return "Isosceles Trapezoid";
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: " + getArea() + " sq. units"
                + " with base 1: " + getBase1() + " units, base 2: " + getBase2()
                + " units, and leg: " + getLeg() + " units, color: " + getColor();
    }

    public double getBase1() {
        return base1;
    }

    public double getBase2() {
        return base2;
    }

    public double getLeg() {
        return leg;
    }
}
