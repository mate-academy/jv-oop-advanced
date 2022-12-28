package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int high;
    private final int base1;
    private final int base2;

    public IsoscelesTrapezoid(Color color, int high, int base1, int base2) {
        super(color);
        this.high = high;
        this.base1 = base1;
        this.base2 = base2;
    }

    @Override
    public double getArea() {
        return ((base1 + base2) >> 1) * high;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: isosceles trapezoid, area:  "
                + getArea() + " sq.units, high: "
                + high + " ,units, base1: " + base1
                + " ,units, base2: " + base2
                + " units, color: " + getColor());
    }
}
