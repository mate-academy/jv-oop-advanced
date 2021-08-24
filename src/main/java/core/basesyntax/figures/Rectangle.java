package core.basesyntax.figures;

import core.basesyntax.Area;
import core.basesyntax.Figure;

public class Rectangle extends Figure implements Area {
    double length;
    double width;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public double obtainArea() {
        return length * width;

    }

    @Override
    public void draw() {
        System.out.println("rectangle area: " + obtainArea() + " length: " + length + " width " + width + " color: " + color);
    }
}
