package core.basesyntax;

import java.util.Locale;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println(String.format(Locale.US,
                "Figure: rectangle, area: %.2f sq. units, width: %.1f units, height: %.1f units, color: %s",
                getArea(), width, height, getColor()));
    }
}
