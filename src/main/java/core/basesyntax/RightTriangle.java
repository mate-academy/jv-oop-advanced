package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double height;
    private double base;

    public RightTriangle(String color, double firstLeg, double height, double base) {
        super(color);
        this.firstLeg = firstLeg;
        this.height = height;
        this.base = base;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, firstLeg: " + firstLeg
                + ", height: " + height
                + ", base: " + base
                + ", color: " + super.getColor());
    }
}
