package core.basesyntax.models;

import core.basesyntax.Figure;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: square, area: %.1f sq. units, side: %.1f units, color: %s\n",
                this.getArea(),
                this.side,
                this.getColor()
        );
    }
}
