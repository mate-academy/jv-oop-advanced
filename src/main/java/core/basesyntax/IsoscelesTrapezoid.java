package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base;
    private int top;
    private int height;

    public IsoscelesTrapezoid(String color, int base, int top, int height) {
        super(color);
        this.base = base;
        this.top = top;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base + top) * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: isosceles trapezoid, area: %.1f sq.units,"
                + " base: %d units, top: %d units, height: %d units, color: %s",
                getArea(), base, top, height, getColor()));
    }
}
