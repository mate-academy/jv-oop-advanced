package core.basesyntax.shape;

import core.basesyntax.Figure;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Shape: square; area: " + getArea() + "; side: " + side
                + "; color: " + getColor();
    }
}
