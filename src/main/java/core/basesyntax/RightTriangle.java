package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    public RightTriangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + getArea()
                + " sq. units, first leg: " + base + " units, second leg: "
                + height + " units, color: " + getColor());
    }
}
