package core.basesyntax;

public class RightTriangle extends Figure {

    private double base;
    private double height;

    public RightTriangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) 1 / 2 * base * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, firstLeg: " + base
                + " units, secondLeg: " + height
                + " units, color: " + getColor());
    }
}
