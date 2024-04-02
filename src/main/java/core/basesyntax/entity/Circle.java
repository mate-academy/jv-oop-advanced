package core.basesyntax.entity;

import core.basesyntax.Figure;

public class Circle extends Figure {
    public static final String TEXT_RADIUS = "radius: ";
    public static final String TEXT_FIGURE = "Figure: circle, ";
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder(TEXT_FIGURE);
        stringBuilder.append(TEXT_AREA)
                .append(Math.round(getArea() * 10.0) / 10.0).append(TEXT_SQ_UNITS)
                .append(TEXT_RADIUS).append(radius).append(TEXT_UNITS)
                .append(TEXT_COLOR).append(getColor());
        System.out.println(stringBuilder.toString());
    }
}
