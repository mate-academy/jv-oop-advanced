package core.basesyntax.models;

import core.basesyntax.models.painter.Color;

public class Circle extends Figure {
    private static final String FIGURE_NAME = "circle";
    private static final double DEFAULT_RADIUS = 10;
    private double radius;

    public Circle() {
        radius = DEFAULT_RADIUS;
    }

    public Circle(Color color) {
        this.color = color.name();
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area:%.2f, radius:%.2f, color:%s%n",
                FIGURE_NAME,
                get_area(),
                radius,
                color.toLowerCase()
        );
    }

    @Override
    public double get_area() {
        return radius * radius * Math.PI;
    }

    @Override
    public Circle setRandomProperties() {
        super.setRandomProperties();
        radius = random.nextDouble() * PROPERTY_MULTIPLIER;
        return this;
    }
}
