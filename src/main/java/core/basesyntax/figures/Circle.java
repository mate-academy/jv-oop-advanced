package core.basesyntax.figures;

import core.basesyntax.Color;

public class Circle extends Figure {

    private static final String OUTPUT_CIRCLE = "Figure: circle, "
            + "area: %.2f sq. units, "
            + "radius: %.2f units, "
            + "color: %s";

    private double radius;

    public Circle() {

    }

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format(OUTPUT_CIRCLE, this.area, this.radius, this.color));
    }

    @Override
    public double calculateArea() {
        this.area = radius * radius * Math.PI;
        return area;
    }
}
