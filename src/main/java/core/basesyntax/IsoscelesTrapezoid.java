package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int top;
    private final int base;
    private final int height;

    public IsoscelesTrapezoid(String color, int top, int base, int height) {
        super(color);
        this.top = top;
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = (double) ((top + base) * height) / 2;
        return (double) (Math.round(area * 10) / 10);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq. units,"
                + " top: " + top + " units," + " base: " + base + " units,"
                + " height: " + height + " units," + " color: " + getColor());
    }
}
