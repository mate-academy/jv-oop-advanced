package core.basesyntax.shape;

import core.basesyntax.type.Color;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Shape: Rectangle");
        stringBuilder.append(", area: ").append(this.getArea()).append(" sq. units");
        stringBuilder.append(", width: ").append(this.width).append(" units");
        stringBuilder.append(", height: ").append(this.height).append(" units");
        stringBuilder.append(", color: ").append(this.color.name());

        System.out.println(stringBuilder);
    }
}
