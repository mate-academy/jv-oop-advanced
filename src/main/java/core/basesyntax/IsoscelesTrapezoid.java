package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double base1;
    private final double base2;
    private final double height;

    public IsoscelesTrapezoid(String color, int base1, int base2, int height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base1 + base2) / 2 * height;
    }

    @Override
    public void draw() {
        String name = "isosceles trapezoid";
        System.out.println("Figure: " + name + ", area: "
                + getArea() + " sq. units, base1: " + base1 + " units, base2: "
                + base2 + " units, height: " + height + " units, color: " + getColor());
    }
}
