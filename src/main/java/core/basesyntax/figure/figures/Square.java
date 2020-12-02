package core.basesyntax.figure.figures;

import core.basesyntax.color.Color;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.Shape;

public class Square extends Figure {

    public static final Shape NAME = Shape.SQUARE;
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("######");
        System.out.println("######");
        System.out.println("######");
        System.out.println("######");
    }

    @Override
    public double getSquare() {
        return getSide() * getSide();
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return getColor() + " " + NAME + " with side "
                + getSide() + " units and square " + getSquare() + " sq. units.";
    }
}
