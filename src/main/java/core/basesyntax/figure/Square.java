package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Square extends Figure {
    private double side;

    public Square(double side, Color color) {
        super.setColor(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: square, area: " + getArea()
                        + " sq. units, side: " + this.side
                        + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
