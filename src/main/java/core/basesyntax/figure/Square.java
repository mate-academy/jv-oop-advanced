package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getDraw() {
        return "This is Square. I have Area: " + getArea() + "; side: " + side
                + "; and have color: " + getColor();
    }
}
