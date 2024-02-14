package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Square extends Figure {
    private double side;
    private final Color color;

    public Square(double side, Color color) {
        this.side = side;
        this.color = color;
    }

    public void draw() {
        System.out.println(
                "Figure: square, area: " + getArea()
                        + " sq. units, side: " + this.side
                        + " units, color: " + this.color);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
