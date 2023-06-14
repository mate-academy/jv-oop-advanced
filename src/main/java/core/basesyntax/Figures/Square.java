package core.basesyntax.Figures;

import core.basesyntax.AbstractClasses.Figure;

public class Square extends Figure {
    private final int side;

    public int getSide() {
        return side;
    }

    public Square(int side) {
        this.side = side;
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
