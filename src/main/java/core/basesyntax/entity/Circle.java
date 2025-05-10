package core.basesyntax.entity;

import core.basesyntax.Figure;

public class Circle extends Figure {
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
        StringBuilder stringBuilder = new StringBuilder("Figure: circle, ");
        stringBuilder.append("area: ")
                .append(Math.round(getArea() * 10.0) / 10.0).append(" sq. units, ")
                .append("radius: ").append(radius).append(" units, ")
                .append("color: ").append(getColor());
        System.out.println(stringBuilder.toString());
    }
}
