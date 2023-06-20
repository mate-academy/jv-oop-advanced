package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private double base1;
    private double base2;
    private double height;
    private String color;

    public IsoscelesTrapezoid(double base1, double base2, double height, String color) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 * base2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, base1: " + base1
                + " units, base2: " + base2 + " units, height: " + height + " units, color: " + color);
    }
}
