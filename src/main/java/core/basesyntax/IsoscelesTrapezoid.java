package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base1;
    private int base2;
    private int height;

    public IsoscelesTrapezoid(int base1, int base2, int height, String color) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double area() {
        double area = 0.5 * (base1 + base2) * height;
        return area;
    }

    @Override
    public String toString() {
        return "Figure: isoscelesTrapezoid, area: " + area() + " color is ";
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + area() + " sq.units, "
                + "base1: " + base1 + " base2: " + base2 + " height: " + height
                + ", color: " + getColor());
    }
}
