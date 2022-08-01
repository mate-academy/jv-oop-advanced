package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void getDraw() {
        System.out.println("This is Rectangle. I have Area: " + getArea() + "; width: "
                + width + "; height: " + height + "; and have color: " + getColor());
    }
}
