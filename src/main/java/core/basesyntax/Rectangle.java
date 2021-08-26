package core.basesyntax;

import java.awt.Color;

public class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(int length, int width, Color color, FigureTypes name) {
        this.length = length;
        this.width = width;
        super.setColor(color);
        super.setName(name);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        StringBuilder rectangleBuilder = new StringBuilder();
        rectangleBuilder
                .append("Figure: ")
                .append(FigureTypes.RECTANGLE)
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, length: ")
                .append(length)
                .append(" units, width: ")
                .append(width)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(rectangleBuilder);
    }
}
