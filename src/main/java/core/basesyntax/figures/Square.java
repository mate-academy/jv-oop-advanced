package core.basesyntax.figures;

import core.basesyntax.abstracts.Figure;
import core.basesyntax.colosuply.Color;

public class Square extends Figure {
    private final int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.round((double) (side * side));
    }

    @Override
    public void drawInfo() {
        System.out.println("Square:"
                + " side = " + getSide()
                + "; color = " + getColor()
                + "; area = " + getArea());
    }
}
