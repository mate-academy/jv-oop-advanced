package core.basesyntax;

import java.util.Locale;

public class RightTriangle extends Figure {
    private final int base;
    private final int height;

    public RightTriangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public void draw() {
        String drawRightTriangle = String.format("Figure: right triangle, "
                                   + "area: %.1f sq.units, base: %d units, "
                                   + "height: %d units, color: %s.",
                                   getArea(), base, height,
                                   getColor().toLowerCase(Locale.ROOT));
        System.out.println(drawRightTriangle);
    }
}
