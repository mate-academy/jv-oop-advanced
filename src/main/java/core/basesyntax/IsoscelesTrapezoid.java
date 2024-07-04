package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;
    private double area;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public void getArea() {
        area = 0.5 * (base1 + base2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + area + " sq. units, base1: "
                + base1 + " units, base2: "
                + base2 + " units, height: "
                + height + " units, color: "
                + getColor());
    }
}
