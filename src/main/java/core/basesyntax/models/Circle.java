package core.basesyntax.models;

import core.basesyntax.models.painter.Color;

public class Circle extends Figure {
    public static final double DEFAULT_RADIUS = 10;
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
        System.out.printf("Circle{color:%s, area:%.2f, radius:%.2f}%n", color, get_area(), radius);
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
