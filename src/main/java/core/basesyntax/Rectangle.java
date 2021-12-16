package core.basesyntax;

import java.util.Locale;

public class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        String drawRectangle = String.format("Figure: rectangle, area: %.1f sq.units, "
                               + "length: %d units, width: %d units, color: %s.",
                               getArea(), length, width, getColor().toLowerCase(Locale.ROOT));
        System.out.println(drawRectangle);
    }
}
