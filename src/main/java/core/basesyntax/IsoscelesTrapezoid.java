package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final String NAME = "trapezoid";
    private final int height;
    private final int bottom;
    private final int top;

    public IsoscelesTrapezoid(Colors color, int height, int bottom, int top) {
        super(color);
        this.height = height;
        //if random bottom is smaller than top
        if (bottom >= top) {
            this.bottom = bottom;
            this.top = top;
        } else {
            this.bottom = top;
            this.top = bottom;
        }
    }

    @Override
    public double areaCalculator() {
        return height * (bottom + top) / 2.0;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, height: %d units, "
                        + "top: %d units, bottom: %d units,  color: %s\n",
                NAME, areaCalculator(), height, top, bottom, getColor().toString());

    }
}
