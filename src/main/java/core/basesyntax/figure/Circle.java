package core.basesyntax.figure;

import core.basesyntax.color.Color;
import core.basesyntax.constants.Messages;

public class Circle extends Figure {
    private static final String FIGURE_NAME = "circle";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_COLOR);
        }

        this.color = color;
        this.radius = radius;
    }

    public Circle(Color color, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        if (color == null) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_COLOR);
        }

        this.color = color.name().toLowerCase();
        this.radius = radius;
    }

    @Override
    public void draw() {
        String str = "Figure: " + FIGURE_NAME + ", area: " + getArea() + " sq.units, radius: "
                + radius + ", color: " + color;

        System.out.println(str);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        this.radius = radius;
    }
}
