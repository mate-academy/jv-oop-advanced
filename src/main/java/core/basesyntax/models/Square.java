package core.basesyntax.models;

import core.basesyntax.enums.Color;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getSquare() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: Square, Area: %s, Side: %d, Color: %s",
                getSquare(), getSide(), getColor()));
    }
}
