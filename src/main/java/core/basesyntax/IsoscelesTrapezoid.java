package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double base1;
    private final double base2;
    private final double height;

    public IsoscelesTrapezoid(String color, double height, double base2, double base1) {
        super(color);
        this.height = height;
        this.base2 = base2;
        this.base1 = base1;
    }

    @Override
    public double getArea() {
        return (base1 + base2) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, height: " + height + " units, base1: " + base1
                + " units, base2: " + base2 + " units, color: " + getColor());

    }
}
