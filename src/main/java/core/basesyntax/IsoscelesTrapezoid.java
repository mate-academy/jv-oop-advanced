package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base1;
    private int base2;
    private int leg;

    public IsoscelesTrapezoid(int base1, int base2, int leg, Color color) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return ((base1 + base2) / 2) * leg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, color: " + getColor());
    }
}
