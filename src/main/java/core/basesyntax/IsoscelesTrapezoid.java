package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final String NAME = "trapezoid";
    private final int height;
    private final int bottom;
    private final int top;

    public IsoscelesTrapezoid(Colors color, int height, int bottom, int top) {
        super(color);
        this.height = height;
        this.bottom = bottom;
        this.top = top;
    }

    @Override
    public double calculateArea() {
        return height * (bottom + top) / 2.0;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, height: %d units, "
                        + "top: %d units, bottom: %d units,  color: %s\n",
                NAME, calculateArea(), height, top, bottom, getColor().toString());

    }
}
