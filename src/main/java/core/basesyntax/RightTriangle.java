package core.basesyntax;

public class RightTriangle extends Figure {
    private int height;
    private int base;

    public RightTriangle(int height, int base, String color) {
        super(color);
        if (height <= 0 || base <= 0) {
            System.out.println("Sides must be bigger than 0");
            return;
        }
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return height * base / 2.0;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, height = " + height + " units;"
                + " base = " + base + " units;"
                + " area = " + String.format("%.2f", getArea()) + " sq.units;"
                + " color = " + super.color;
    }
}
