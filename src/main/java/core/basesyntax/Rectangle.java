package core.basesyntax;

import java.util.Locale;

public class Rectangle implements Figure {
    private final double width;
    private final double height;
    private final String color;

    public Rectangle( double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
    @Override
    public double gatArea() {
        return width * height;
    }
    @Override
    public void draw() {
        System.out.println(String.format(Locale.US, "Figure: rectangle, area: %.2f sq. units, " +
                "width: %.1f units, height; %.1f units, color %s", gatArea(), width, height, color));
    }
}
