package core.basesyntax.figure.figures;

import core.basesyntax.color.Color;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.Shape;

public class Square extends Figure {

    public static final Shape NAME = Shape.SQUARE;
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getSquare() {
        return getSide() * getSide();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return getColor() + " " + NAME + " with side "
                + getSide() + " and square " + getSquare();
    }
}
