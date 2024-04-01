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
        double area = Math.PI * radius * radius;
        return Math.round(area * 10.0) / 10.0;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder("Figure: circle, ");
        stringBuilder.append("area: ").append(getArea()).append(" sq. units, ")
                .append("radius: ").append(radius).append(" units, ")
                .append("color: ").append(getColor());
        System.out.println(stringBuilder.toString());
    }
}
