package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.FigureColor;

public class Rectangle extends Color {
    private int width;
    private int height;

    public Rectangle(int width, int height, FigureColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getDraw() {
        return "This is Rectangle. I have Area: " + getArea() + "; width: " + width + "; height: "
                + height + "; and have color: " + getColor();
    }
}
