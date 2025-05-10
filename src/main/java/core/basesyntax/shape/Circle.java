package core.basesyntax.shape;

import core.basesyntax.type.Color;

public class Circle extends Shape {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Shape: Circle");
        stringBuilder.append(", area: ").append(getArea()).append(" sq. units");
        stringBuilder.append(", radius: ").append(radius).append(" units");
        stringBuilder.append(", color: ").append(color.name());

        System.out.println(stringBuilder);
    }
}
