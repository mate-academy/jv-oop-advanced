package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base1;
    private int base2;
    private int height;

    public IsoscelesTrapezoid(String color, int base1, int base2, int height) {
        if (base1 < 0 || base2 < 0 || height < 0) {
            throw new IllegalArgumentException("The parameter values must be positive");
        }
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, base1: " + base1
                + " units, base2: " + base2
                + " units, height: " + height
                + " units, color: " + color);
    }

    @Override
    public double getArea() {
        return (base1 + base2) / 2 * height;
    }
}
