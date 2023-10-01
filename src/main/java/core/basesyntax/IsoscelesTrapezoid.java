package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double base1;
    private final double base2;
    private final double height;

    public IsoscelesTrapezoid(Color color, double base1, double base2, double height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                +
                getArea() + " sq.units, upper base: " + base1
                +
                " units, lower base: " + base2
                +
                " units, height: " + height + " units, color: " + getColor());
    }
}
