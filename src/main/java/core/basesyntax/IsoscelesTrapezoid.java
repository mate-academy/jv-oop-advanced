package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        this.color = color;
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, side1: " + base1 + " units, side2: "
                + base2 + " units, height: " + height + " units, color: " + color);
    }


    @Override
    public double getArea() {
        return (base1 + base2) / 2 * height;
    }
}
