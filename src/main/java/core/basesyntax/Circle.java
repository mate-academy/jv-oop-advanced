package core.basesyntax;

import java.util.Locale;

class Circle implements Figure {
    private final double radius;
    private final String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format(Locale.US,
                "Figure: circle, area: %.2f sq. units, radius: %.1f units, color: %s",
                getArea(), radius, color));
    }
}
