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
        String rectangleInfo = "Figure: "
                + FigureTypes.RECTANGLE
                + ", area: "
                + getArea()
                + " sq.units, length: "
                + length
                + " units, width: "
                + width
                + " units, color: "
                + getColor();
        System.out.println(rectangleInfo);
    }
}
