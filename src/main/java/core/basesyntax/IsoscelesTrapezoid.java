package core.basesyntax;

import java.util.Locale;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int top;
    private int bottom;

    public IsoscelesTrapezoid(String color, int height, int top, int bottom) {
        super(color);
        this.height = height;
        this.top = top;
        this.bottom = bottom;
    }

    @Override
    public double area() {
        return height * ((double)top + bottom) / 2;
    }

    @Override
    public void draw() {
        System.out.println(String.format(Locale.US, "Figure: isosceles trapezoid, "
                        + "area: %.1f sq.units, height: %d units, "
                        + "top: %d, bottom: %d color: %s",
                area(), this.height, this.top, this.bottom, this.getColor()));
    }
}
