package core.basesyntax.shape;

import core.basesyntax.type.Color;

public class Square extends Shape {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Shape: Square");
        stringBuilder.append(", area: ").append(getArea()).append(" sq. units");
        stringBuilder.append(", side: ").append(side).append(" units");
        stringBuilder.append(", color: ").append(color.name());

        System.out.println(stringBuilder);
    }
}
