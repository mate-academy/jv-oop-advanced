package core.basesyntax.figures;

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
        return (top + base) * height * 0.5;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %1$.2f sq.units, "
                        + "top: %2$d units, base: %3$d units, height: %4$d units, color: %5$s%n",
                this.getArea(), top, base, height, this.getColor());
    }
}
