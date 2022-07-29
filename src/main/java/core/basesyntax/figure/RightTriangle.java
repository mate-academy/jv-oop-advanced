package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private int side;
    private int height;

    public RightTriangle(int side, int height, Color color) {
        this.side = side;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (side * height) / 2;
    }

    @Override
    public String getDraw() {
        return "This is Right Triangle. I have Area: " + getArea() + "; side: " + side
                + "; height: " + height + "; and have color: " + getColor();
    }
}
