package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int base1;
    private final int base2;
    private final int height;

    public IsoscelesTrapezoid(String color, int base1, int base2, int height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = 0.5 * (base1 + base2) * height;
        return Math.round(area * 10.0) / 10.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: " + getArea() + " units, base1: "
                + base1 + "base2: " + base2 + " height: " + height + " color: " + getColor());
    }
}
