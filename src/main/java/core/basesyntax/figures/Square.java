package core.basesyntax.figures;

import core.basesyntax.abstracts.Figure;

public class Square extends Figure {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String drawInfo() {
        return "Square:"
                + " side = " + getSide()
                + "; color = " + getColor()
                + "; area = " + getArea();
    }
}
