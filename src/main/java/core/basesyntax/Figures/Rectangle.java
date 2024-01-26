package core.basesyntax.Figures;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Rectangle extends Color {

    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super.setColor(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {

        System.out.println("Type: rectangle, color: "
                + getColor()
                + " area: "
                + getArea()
                + " length: "
                + length
                + " width: "
                + width);
    }
}
