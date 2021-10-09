package core.basesyntax;

import java.util.Locale;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(String color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return (double)height * width;
    }

    @Override
    public void draw() {
        System.out.println(String.format(Locale.US, "Figure: rectangle, "
                        + "area: %.1f sq.units, height: %d units, width: %d color: %s",
                area(), this.height, this.width, this.getColor()));
    }
}
